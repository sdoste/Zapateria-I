import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Casual zapato1 = new Casual("Nike", "Air Max", 9.5, 129.99, true);
        Casual zapato2 = new Casual("Adidas", "Ultraboost", 10.0, 149.99, false);
        Casual zapato3 = new Casual("Puma", "RS-X", 8.0, 79.99, false);

        Deporte zapato4 = new Deporte("New Balance", "Fresh Foam", 9.0, 109.99);
        Deporte zapato5 = new Deporte("Reebok", "Nano X", 9.5, 119.99);
        Deporte zapato6 = new Deporte("Under Armour", "HOVR Sonic", 10.5, 89.99);

        Elegante zapato7 = new Elegante("Asics", "Gel Nimbus", 9.0, 159.99);
        Elegante zapato8 = new Elegante("Brooks", "Ghost", 8.5, 129.99);
        Elegante zapato9 = new Elegante("Saucony", "Kinvara", 9.5, 109.99);
        Elegante zapato10 = new Elegante("Mizuno", "Wave Rider", 9.0, 139.99);
        ArrayList<Zapato> zapateria = new ArrayList<>();
        Collections.addAll(zapateria, zapato1, zapato2, zapato3, zapato4, zapato5, zapato6, zapato7, zapato8, zapato9, zapato10);
   
    Scanner teclado = new Scanner(System.in);
    String answer = "";
    double gastoTotal = 0;
    while (!answer.equals("salir")){
        System.out.println("Que tipo de zapatos quieres comprar?" + "\n" + "1-CASUAL" + "\n" + "2-DEPORTIVOS" + "\n" + "3-ELEGANTES" + "\n" + "(escribe salir para salir)");
        answer = teclado.nextLine().toLowerCase();
        switch(answer){
            case "casual":
            case "casuales":
                System.out.println("Qué modelo casual quieres comprar?");
                for (int i = 0; i < zapateria.size(); i++){
                    if (zapateria.get(i) instanceof Casual){
                        System.out.println(zapateria.get(i).getModelo());
                    };
                }
                gastoTotal = añadirModeloCarrito(teclado, zapateria, gastoTotal);
                break;
            case "deporte":
            case "deportivo":
            case "deportivos":
                System.out.println("Qué modelo deportivo quieres comprar?");
                for (int i = 0; i < zapateria.size(); i++){
                    if (zapateria.get(i) instanceof Deporte){
                        System.out.println(zapateria.get(i).getModelo());
                    };
                }
                gastoTotal = añadirModeloCarrito(teclado, zapateria, gastoTotal);
                break;    
            case "elegante":
            case "elegantes":
                System.out.println("Qué modelo elegante quieres comprar?");
                for (int i = 0; i < zapateria.size(); i++){
                    if (zapateria.get(i) instanceof Deporte){
                        System.out.println(zapateria.get(i).getModelo());
                    };
                }
                gastoTotal = añadirModeloCarrito(teclado, zapateria, gastoTotal);
            case "salir":
                break;        
            default:
            System.out.println("Respuesta no reconocida.");
        } 
        System.out.println("/////////");
        System.out.println("Carrito: " + gastoTotal + " EUR");
        System.out.println("/////////");
    }
    System.out.println("El precio total de tu carrito es de " + gastoTotal + " EUROS.");
    teclado.close();
    }
    private static double añadirModeloCarrito(Scanner teclado, ArrayList<Zapato> zapatos, double gastoTotal){
        String userModel = teclado.nextLine();
        boolean casualNotFound = true;
        for (int i = 0; i < zapatos.size(); i++){
            if (zapatos.get(i).getModelo().equalsIgnoreCase(userModel)){
                gastoTotal += zapatos.get(i).getPrecio();
                casualNotFound = false;
                System.out.println("Modelo " + zapatos.get(i).getModelo() + " añadido al carrito.");
            }
        }
        if (casualNotFound){
            System.out.println("No se ha encontrado ese modelo.");
        }
        return gastoTotal;
    }

}
