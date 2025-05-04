import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escriba el límite de la tarjeta de crédito:");
        double limite = leerDouble(scanner);

        TarjetaDeCredito tarjeta = new TarjetaDeCredito(limite);
        tarjeta.saldo = limite;
        tarjeta.listaDeCompras = new ArrayList<>();

        int opcion = 1;

        while (opcion != 0) {
            System.out.println("\nEscriba la descripción de la compra:");
            String descripcion = scanner.nextLine();

            System.out.println("Escriba el valor de la compra:");
            double valor = leerDouble(scanner);

            Compra nuevaCompra = new Compra(valor, descripcion);

            if (tarjeta.lanzarCompra(nuevaCompra)) {
                System.out.println("Compra realizada!");
            } else {
                System.out.println("Saldo Insuficiente!");
            }

            // Ordenar y mostrar compras
            if (!tarjeta.getListaDeCompras().isEmpty()) {
                System.out.println("COMPRAS REALIZADAS: (ordenadas por valor):\n");

                List<Compra> comprasOrdenadas = new ArrayList<>(tarjeta.getListaDeCompras());
                comprasOrdenadas.sort(Comparator.comparingDouble(Compra::getValor).reversed());

                for (Compra compra : comprasOrdenadas) {
                    System.out.println(compra);
                }
            }

            System.out.println("\n***************************");
            // Mostrar resumen
            System.out.println("Saldo de la tarjeta: " + tarjeta.getSaldo());
            System.out.println("Límite restante: " + (tarjeta.getLimite() - tarjeta.getSaldo()));


            opcion = leerOpcion(scanner);
        }

        System.out.println("\nPrograma terminado. Resumen final:");
        System.out.println("Saldo final: " + tarjeta.getSaldo());
        System.out.println("Límite restante: " + (tarjeta.getLimite() - tarjeta.getSaldo()));

        if (!tarjeta.getListaDeCompras().isEmpty()) {
            System.out.println("\nCompras realizadas (ordenadas por valor):");
            List<Compra> comprasOrdenadas = new ArrayList<>(tarjeta.getListaDeCompras());
            comprasOrdenadas.sort(Comparator.comparingDouble(Compra::getValor).reversed());

            for (Compra compra : comprasOrdenadas) {
                System.out.println(compra);
            }
        }

        scanner.close();
    }

    private static double leerDouble(Scanner scanner) {
        while (true) {
            try {
                double valor = scanner.nextDouble();
                scanner.nextLine(); // Limpiar el buffer
                return valor;
            } catch (java.util.InputMismatchException e) {
                System.out.println("Error: Por favor ingrese un valor numérico válido.");
                scanner.nextLine(); // Limpiar el input incorrecto
            }
        }
    }

    private static int leerOpcion(Scanner scanner) {
        while (true) {
            System.out.println("\nEscriba 0 para salir o 1 para continuar:");
            try {
                int opcion = scanner.nextInt();
                scanner.nextLine(); // Limpiar el buffer
                if (opcion == 0 || opcion == 1) {
                    return opcion;
                } else {
                    System.out.println("Error: Por favor ingrese 0 o 1.");
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Error: Por favor ingrese un número (0 para salir, 1 para continuar).");
                scanner.nextLine(); // Limpiar el input incorrecto
            }
        }
    }
}

