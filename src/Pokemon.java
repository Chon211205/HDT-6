public class Pokemon {
    //Atributos de los pokemon
    private String Nombre;
    private String Tipo1;
    private String Tipo2;
    private String Habilidad;

    //Constructor
    public Pokemon (String Nombre, String Tipo1, String Tipo2, String Habilidad){
        this.Nombre = Nombre;
        this.Tipo1 = Tipo1;
        this.Tipo2 = Tipo2;
        this.Habilidad = Habilidad;
    }

    //Getters

    public String getNombre() {
        return Nombre;
    }

    public String getTipo1() {
        return Tipo1;
    }

    public String getTipo2() {
        return Tipo2;
    }

    public String getHabilidad() {
        return Habilidad;
    }

    //Output de los datos.
    public String toString() {
        return "Nombre: " + Nombre + "\nTipo1: " + Tipo1 + "\nTipo2: " + Tipo2 + "\nHabilidad: " + Habilidad;
    }
}
