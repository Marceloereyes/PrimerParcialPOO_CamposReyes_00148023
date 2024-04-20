import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
   static List<Articulo> articulos = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int op;

        do {
            System.out.println("\n\t--- Menu ---");
            System.out.println("Seleccione la opcion que desea");
            System.out.println("1- Agregar articulo");
            System.out.println("2- Modificar articulo");
            System.out.println("3- Listado de todos los articulos");
            System.out.println("4- Salir");
            System.out.print("Su opcion es: ");
            op= sc.nextInt();
            switch (op) {
                case 1:
                    /*AgregarArticulo(); */
                    break;
                    case 2:
                    modificarArticulo();
                    break;
                    case 3:
                    mostrarListaArticulos();
                    break;
                    case 4:
                    System.out.println("\nGracias por utilizar nuestro programa. Vuelve pronto :)");
                    System.exit(0);
                    break;
            
                default:
                System.out.println("\nOpcion no valida. Regresando al menu...");
                    break;
            }
            
        } while (op!=4);
  
        
        
    }
/* No se porque me da error :(((
private static void AgregarArticulo(){
        Scanner sc= new Scanner(System.in);
        String nombre;
        String modelo;
        String descripcion;
        double precio;
       System.out.println("\n\t----Ingrese los datos del nuevo articulo ----");
       System.out.print("Nombre: ");
       nombre=sc.nextLine();
       System.out.print("Modelo: ");
       modelo=sc.nextLine();
       System.out.print("Descripcion: ");
       descripcion=sc.nextLine();
       System.out.print("Precio: ");
       precio=sc.nextDouble();
       articulos.add(new Articulo(nombre, modelo, descripcion, precio));
       int tipoArticulo = obtenerTipoArticulo();
       Articulo articulo2 = null;

       switch (tipoArticulo) {
           case 1:
               articulo2 = new Telefono(null, sistemaoperativo, color);
               break;
           case 2:
               System.out.println("Ingrese la cantidad de impuesto:");
               double preciolap = sc.nextInt();
               articulo2 = new Lapto(null, ram,tarjetagrafica , preciolap);
               break;
       }

       System.out.println("\nEmpleado agregado exitosamente...\n");

    }
    private static int obtenerTipoArticulo() {
        Scanner sc = new Scanner(System.in);
        int op;
        do {
            System.out.println("Seleccione una opcion:\n" + "\t1. Telefono\n"
                    + "\t2. Laptop\n");

            System.out.print("Opcion: ");
            op = sc.nextInt();
        } while (op < 3);
        return op;
    } */
    
    private static void mostrarListaArticulos() {
        System.out.println("\n#\t|Nombre:\t|Modelo:\t|Descripcion: \t|Precio: $\t|Precio Neto: $");
        for(int i=0;i< articulos.size(); i++){
            Articulo ar= articulos.get(i);
            System.out.println((i+1)+"\t|"+ar.getnombre()+"\t|"+ar.getModelo()+"\t|"+ar.getDescripcion()+"\t|"+ ar.getPrecio()+"\t|"+ar.obtenerprecio());
        }
        
    }
    private static void modificarArticulo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del articulo a modificar:");
        String nombre = sc.nextLine();

        // Recorriendo la lista de empleados hasta encontrar el empleado que buscamos
        for (int i = 0; i <articulos.size(); i++) {
            // Evaluando si el empleado actual coincide con el carnet
            if (articulos.get(i).getnombre().equals(nombre)) {
                System.out.print("\nIngrese el nuevo Modelo de " + articulos.get(i).getnombre() + ": ");
                String nuevoModelo= sc.nextLine();
                articulos.get(i).setModelo(nuevoModelo);

                System.out.println("\nModelo de " + articulos.get(i).getnombre() + " actualizado exitosamente...\n");
                return;
            }
        }
    }

}
