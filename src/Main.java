import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pokedex pokedex = new Pokedex();
        pokedex.csv();

        String x="no";
        while (x.equals("no")){
            System.out.println("Elija la opcion que desee: ");
            System.out.println("1. Pokedex");
            System.out.println("2. Todos los pokemon");
            System.out.println("3. Volver al juego");
            int Main_op = scanner.nextInt();

            switch (Main_op){
                case 1:
                    String r = "si";
                    while (r.equals("si")){
                        System.out.println("-----Pokedex-----");
                        System.out.println("Elija la opcion que desee");
                        System.out.println("1. Agregar pokemon a la coleccion");
                        System.out.println("2. Ver tu coleccion");
                        System.out.println("3. Mostrar coleccion por tipo 1");
                        System.out.println("4. Salir al menu principal");
                        int Pokedex_op = scanner.nextInt();

                        if (Pokedex_op == 1){
                            System.out.println("Ingrese el nombre del pokemon que desea agregar");
                            String Pokemon = scanner.next();
                            pokedex.agregar_coleccionUser(Pokemon);
                            System.out.println("Desea regresar a la interfaz de la pokedex? ");
                            r = scanner.next();

                        } else if (Pokedex_op == 2){
                            pokedex.Mostrar_coleccion();
                            System.out.println("Desea regresar a la interfaz de la pokedex? ");
                            r = scanner.next();

                        } else if (Pokedex_op == 3){
                            pokedex.Coleccion_tipo1();
                            System.out.println("Desea regresar a la interfaz de la pokedex? ");
                            r = scanner.next();

                        } else if (Pokedex_op == 4){
                            r="no";
                        } else {
                            System.out.println("Opcion invalida");
                        }
                    }
                    break;

                case 2:
                    String t = "si";
                    while (t.equals("si")){
                        System.out.println("-----Todos los pokemon-----");
                        System.out.println("Elija la opcion que desee");
                        System.out.println("1. Ver todos los pokemon por tipo 1");
                        System.out.println("2. Buscar pokemon con una habilidad determinada");
                        System.out.println("3. Salir al menu principal");
                        int Todos_op = scanner.nextInt();

                        if (Todos_op == 1) {
                            pokedex.all_tipo1();
                            System.out.println("Desea regresar al menu principal? ");
                            t = scanner.next();

                        } else if (Todos_op == 2) {
                            System.out.println("Ingrese la habilidad que desea buscar: ");
                            String Habilidad = scanner.next();
                            pokedex.Buscar_habilidad(Habilidad);
                            System.out.println("Desea regresar al menu principal? ");
                            t = scanner.next();

                        } else if (Todos_op == 3) {
                            t="no";
                        } else {
                            System.out.println("Opcion invalida");
                        }
    
                    }
                    break;

                case 3:
                    x="si";
                    break;

                default:
                    System.out.println("Opcion invalida");
            }

        }
    }
}
