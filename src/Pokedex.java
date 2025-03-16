import java.io.*;
import java.util.*;

public class Pokedex {

    //Atributos
    private Map<String, Pokemon> Pokemones;
    private List<Pokemon> Poke_coleccion;

    //Constructor
    public Pokedex() {
        this.Pokemones = new LinkedHashMap<>();
        this.Poke_coleccion = new ArrayList<>();
    }

    //Métodos

    //Metodo de lectura el .csv
    public void csv() {
        //Archivo .csv que va leer
        String Datos = "data.csv";
        try (BufferedReader br = new BufferedReader(new FileReader(Datos))){
            String linea;
            //No toma en cuenta la linea de los titulos.
            br.readLine();
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                if (datos.length >= 4) {
                    //Extrae los datos de las columnas que son: name, type1, type2 y ability del .csv
                    Pokemon pokemon = new Pokemon(datos[0].trim(), datos[2].trim(), datos[3].trim(), datos[7].trim());
                    registrar_pokemon(pokemon);
                }
            }
            System.out.println("Datos leidos correctamente");
        } catch (IOException e) {
            System.out.println("No fue posible leer los datos");
        }
    }

    //Metodos para el manejo de los pokemon del usuario.
    //Metodo para registrar un pokemon.
    public void registrar_pokemon (Pokemon pokemon) {
        Pokemones.put(pokemon.getNombre(), pokemon);
    }

    //Metodo para agregar un pokemon a la coleccion del usuario.
    public void agregar_coleccionUser (String Nombre) {
        Pokemon pokemon = Pokemones.get(Nombre);

        //if-else para comprobar que si exista el pokemon para agregarlo a la coleccion.
        if (pokemon == null) {
            System.out.println(" No se ha encontrado el pokemon");
        }
        if (Poke_coleccion.contains(pokemon)) {
            System.out.println(" Ya agregaste a este pokemon");
        } else {
            Poke_coleccion.add(pokemon);
            System.out.println(Nombre + " agregado a tu coleccion");

        }
    }

    //Metodo para mostrar los pokemones en la coleccion del usuario.
    public void Mostrar_coleccion() {
        if (Poke_coleccion.isEmpty()) {
            System.out.println("No hay pokemones en tu coleccion");
        } else {
            System.out.println("Tus pokemones en la coleccion son:");
            for (Pokemon pokemon : Poke_coleccion) {
                System.out.println(pokemon);
            }
        }
    }

    //Metodo para mostrar los pokemon por su primer tipo
    public void Coleccion_tipo1() {
        Poke_coleccion.stream().sorted(Comparator.comparing(Pokemon::getTipo1)).forEach(p -> System.out.println("Nombre: " + p.getNombre() + ", Tipo 1: " + p.getTipo1()));
    }

    //Metodos para manejar los pokemon en general.

    //Metodo para mostrar los pokemones por su tipo 1.
    public void all_tipo1() {
        Pokemones.values().stream().sorted(Comparator.comparing(Pokemon::getTipo1)).forEach(p -> System.out.println("Nombre: " + p.getNombre() + ", Tipo 1: " + p.getTipo1()));
    }

    //Metodo para buscar pokemon con una habilidad especifica.
    public void Buscar_habilidad(String Habilidad) {
        boolean habilidad = false;
        System.out.println("Pokemones con la habilidad " + Habilidad);
        //Ciclo for para ir iterando por cada pokemon hasta buscar la habilidad del usuario que quiere.
        for (Pokemon pokemon : Pokemones.values()) {
            if(pokemon.getHabilidad().equalsIgnoreCase(Habilidad)){
                habilidad = true;
                System.out.println(pokemon);
            }
        }
        if (!habilidad) {
            System.out.println("No se han encontrado pokemones con esa habilidad");
        }
    }

}
