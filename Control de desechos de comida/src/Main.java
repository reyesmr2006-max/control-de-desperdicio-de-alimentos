import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        int opcion;
        double totalKilosDesperdiciados = 0.0;
        double kilosIngresados;

        System.out.println("==================================================");
        System.out.println("   APP DE CONTROL DE DESPERDICIO DE ALIMENTOS     ");
        System.out.println("==================================================");
        do {
            System.out.println("\nMenú Principal:");
            System.out.println("1. Registrar comida desperdiciada");
            System.out.println("2. Ver reporte de desperdicio");
            System.out.println("3. Ver consejo para no desperdiciar");
            System.out.println("4. Salir");
            System.out.print("Por favor, elige una opción: ");

            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("¿Cuántos kilos de comida se van a botar?: ");
                    kilosIngresados = teclado.nextDouble();


                    if (kilosIngresados > 0) {

                        totalKilosDesperdiciados = totalKilosDesperdiciados + kilosIngresados;
                        System.out.println("¡Registro guardado con éxito!");
                    } else {
                        System.out.println("Error: No puedes ingresar cantidades negativas o cero.");
                    }
                    break;

                case 2:
                    System.out.println("\n--- REPORTE ACTUAL ---");
                    System.out.println("Total desperdiciado hasta ahora: " + totalKilosDesperdiciados + " kilos.");


                    if (totalKilosDesperdiciados == 0) {
                        System.out.println("¡Excelente! No hay desperdicio registrado.");
                    } else if (totalKilosDesperdiciados > 15.0) {
                        System.out.println("¡ALERTA ROJA! El desperdicio es demasiado alto. Hay que mejorar las porciones.");
                    } else {
                        System.out.println("Aún estamos en un límite aceptable, pero hay que intentar reducirlo.");
                    }
                    break;

                case 3:
                    System.out.println("\n--- CONSEJO DEL DÍA ---");
                    System.out.println("Haz una lista de compras antes de ir al supermercado y revisa las fechas de caducidad.");
                    break;

                case 4:
                    System.out.println("Saliendo de la aplicación... ¡Cuidemos el planeta!");
                    break;

                default:
                    System.out.println("Opción incorrecta. Por favor, elige un número del 1 al 4.");
            }

        } while (opcion != 4); // El ciclo se rompe cuando la opción es 4

        teclado.close();
    }
}