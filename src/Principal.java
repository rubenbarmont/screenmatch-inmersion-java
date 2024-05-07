import modelo.Pelicula;

import java.util.Scanner;

public class Principal {
    public void muestraElMenu() {
        int opcion = 0;
        Scanner teclado = new Scanner(System.in);
        while (opcion != 9) {
            String menu = """
                    Bienvenido a Screenmathc
                    1) Registrar nueva película
                    2) Registrar nueva serie
                    
                    9) Salir
                    """;
            System.out.println(menu);
            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion ) {
                case 1:
                    System.out.print("Ingrese el nombre de la pelicula: ");
                    String nombre = teclado.nextLine();
                    System.out.print("Ingrese el año de lanzamiento de la pelicula: ");
                    int fechaDeLanzamiento = teclado.nextInt();
                    teclado.nextLine();
                    System.out.print("Ingrese la duracion en minutos de la pelicula: ");
                    int duracionEnMinutos = teclado.nextInt();
                    teclado.nextLine();
                    Pelicula peliculaUsuario = new Pelicula();
                    peliculaUsuario.setNombre(nombre);
                    peliculaUsuario.setFechaDeLanzamiento(fechaDeLanzamiento);
                    peliculaUsuario.setTiempoDeDuracionEnMinutos(duracionEnMinutos);
                    peliculaUsuario.muestraFichaTecnica();
                    break;
                case 9:
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }

        }
    }
}
