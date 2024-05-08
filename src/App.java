import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        ZapatoCasual zapato1 = new ZapatoCasual("Nike", "Air Max", 9.5, 129.99);
        ZapatoCasual zapato2 = new ZapatoCasual("Adidas", "Ultraboost", 10.0, 149.99);
        ZapatoCasual zapato3 = new ZapatoCasual("Puma", "RS-X", 8.0, 79.99);
        ArrayList<ZapatoCasual> ZapatosCasuales = new ArrayList<>();
        Collections.addAll(ZapatosCasuales, zapato1, zapato2, zapato3);

        ZapatoDeporte zapato4 = new ZapatoDeporte("New Balance", "Fresh Foam", 9.0, 109.99);
        ZapatoDeporte zapato5 = new ZapatoDeporte("Reebok", "Nano X", 9.5, 119.99);
        ZapatoDeporte zapato6 = new ZapatoDeporte("Under Armour", "HOVR Sonic", 10.5, 89.99);
        ArrayList<ZapatoDeporte> ZapatosDeportivos = new ArrayList<>();
        Collections.addAll(ZapatosDeportivos, zapato4, zapato5, zapato6);

        ZapatoElegante zapato7 = new ZapatoElegante("Asics", "Gel Nimbus", 9.0, 159.99);
        ZapatoElegante zapato8 = new ZapatoElegante("Brooks", "Ghost", 8.5, 129.99);
        ZapatoElegante zapato9 = new ZapatoElegante("Saucony", "Kinvara", 9.5, 109.99);
        ZapatoElegante zapato10 = new ZapatoElegante("Mizuno", "Wave Rider", 9.0, 139.99);
        ArrayList<ZapatoElegante> ZapatosElegantes = new ArrayList<>();
        Collections.addAll(ZapatosElegantes, zapato7, zapato8, zapato9, zapato10);

        ArrayList<Object> zapateria = new ArrayList<>();
        Collections.addAll(zapateria, ZapatosCasuales, ZapatosDeportivos, ZapatosElegantes);
   
    Scanner teclado = new Scanner(System.in);
    String answer = "";
    double gastoTotal = 0;
    while (!answer.equals("salir")){
        System.out.println("Que tipo de zapatos quieres comprar?" + "\n" + "1-CASUAL" + "\n" + "2-DEPORTIVOS" + "\n" + "3-ELEGANTES" + "\n" + "(escribe salir para salir)");
        answer = teclado.nextLine().toLowerCase();
        switch(answer){
            case "casual":
            case "casuales":
                System.out.println("Qué modelo quieres comprar?");
                @SuppressWarnings("unchecked") ArrayList<ZapatoCasual> casuales =  (ArrayList<ZapatoCasual>) zapateria.get(0);
                for (int i = 0; i < casuales.size(); i++){
                        System.out.println(casuales.get(i).getModelo());
                }
                String casualesAnswer = teclado.nextLine();
                boolean casualNotFound = true;
                for (int i = 0; i < casuales.size(); i++){
                    if (casuales.get(i).getModelo().equalsIgnoreCase(casualesAnswer)){
                        gastoTotal += casuales.get(i).getPrecio();
                        casualNotFound = false;
                        System.out.println("Modelo " + casuales.get(i).getModelo() + " añadido al carrito.");
                    }
                }
                if (casualNotFound){
                    System.out.println("No se ha encontrado ese modelo.");
                }
                break;
            case "deportivo":
            case "deportivos":
                System.out.println("Qué modelo quieres comprar?");
                @SuppressWarnings("unchecked") ArrayList<ZapatoDeporte> deportivos =  (ArrayList<ZapatoDeporte>) zapateria.get(1);
                for (int i = 0; i < deportivos.size(); i++){
                        System.out.println(deportivos.get(i).getModelo());
                }
                String deportivoAnswer = teclado.nextLine();
                boolean deportivoNotFound = true;
                for (int i = 0; i < deportivos.size(); i++){
                    if (deportivos.get(i).getModelo().equalsIgnoreCase(deportivoAnswer)){
                        gastoTotal += deportivos.get(i).getPrecio();
                        deportivoNotFound = false;
                        System.out.println("Modelo " + deportivos.get(i).getModelo() + " añadido al carrito.");
                    }
                }
                if (deportivoNotFound){
                    System.out.println("No se ha encontrado ese modelo.");
                }
                break;    
            case "elegante":
            case "elegantes":
                System.out.println("Qué modelo quieres comprar?");
                @SuppressWarnings("unchecked") ArrayList<ZapatoElegante> elegantes =  (ArrayList<ZapatoElegante>) zapateria.get(2);
                for (int i = 0; i < elegantes.size(); i++){
                        System.out.println(elegantes.get(i).getModelo());
                }
                String eleganteAnswer = teclado.nextLine();
                boolean eleganteNotfound = true;
                for (int i = 0; i < elegantes.size(); i++){
                    if (elegantes.get(i).getModelo().equalsIgnoreCase(eleganteAnswer)){
                        gastoTotal += elegantes.get(i).getPrecio();
                        eleganteNotfound = false;
                        System.out.println("Modelo " + elegantes.get(i).getModelo() + " añadido al carrito.");
                    }
                }
                if (eleganteNotfound){
                    System.out.println("No se ha encontrado ese modelo.");
                }
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
}
