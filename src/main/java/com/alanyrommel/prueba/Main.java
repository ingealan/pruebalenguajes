package com.alanyrommel.prueba;
//Nombres:Alan Solano, Rommel Juarez
//Fecha:11/11/2024
//Detalle:Prueba Primer Parcial
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Saldo cuenta ahorros: ");
        float saldo = scanner.nextFloat();
        System.out.print("Tasa Anual cuenta ahorros: ");
        float tasaAnual = scanner.nextFloat();
        //
        System.out.print("Saldo cuenta corriente: ");
        float saldocorri = scanner.nextFloat();
        System.out.print("Tasa Anual cuenta corriente: ");
        float tasaAnualcorri = scanner.nextFloat();


        CuentaAhorros cuentaah = new CuentaAhorros(saldo, tasaAnual);
        CuentaCorriente cuentaco = new CuentaCorriente(saldocorri, tasaAnualcorri);
        int opcion;
        do {
            System.out.println("\n--- Menú de Cuenta ---");
            System.out.println("1. Cuenta Corriente");
            System.out.println("2. Cuenta Ahorros");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    int opcionmrn;

                    do {
                        System.out.println("\n--- Menú de Cuenta Corriente ---");
                        System.out.println("1. Depositar");
                        System.out.println("2. Retirar");
                        System.out.println("3. Imprimir");
                        System.out.println("0. Salir");
                        System.out.print("Seleccione una opción: ");
                        opcionmrn = scanner.nextInt();
                        switch (opcionmrn) {
                            case 1:
                                System.out.println("Ingrese el saldo a depositar: ");
                                saldo = scanner.nextFloat();
                                cuentaco.Depositar(saldo);
                                break;
                            case 2:
                                System.out.println("Ingrese el saldo a retirar: ");
                                saldo = scanner.nextFloat();
                                cuentaco.Retirar(saldo);
                                break;
                            case 3:
                                cuentaco.Imprimir();
                                break;
                            case 0:
                                break;
                            default:
                                System.out.println("Opción no válida. Por favor, elija una opción válida.");
                                break;
                        }
                    } while (opcionmrn != 0);
                case 2:
                    int opcionmrna;

                    do {
                        System.out.println("\n--- Menú de Cuenta Ahorros ---");
                        System.out.println("1. Depositar");
                        System.out.println("2. Retirar");
                        System.out.println("3. Imprimir");
                        System.out.println("0. Salir");
                        System.out.print("Seleccione una opción: ");
                        opcionmrna = scanner.nextInt();
                        switch (opcionmrna) {
                            case 1:
                                System.out.println("Ingrese el saldo a depositar: ");
                                saldo = scanner.nextFloat();
                                cuentaah.Depositar(saldo);
                                break;
                            case 2:
                                System.out.println("Ingrese el saldo a retirar: ");
                                saldo = scanner.nextFloat();
                                cuentaah.Retirar(saldo);
                                break;
                            case 3:
                                cuentaah.Imprimir();
                                break;
                            case 0:
                                break;
                            default:
                                System.out.println("Opción no válida. Por favor, elija una opción válida.");
                                break;
                        }
                    } while (opcionmrna != 0);
                case 0:
                    System.out.println("Saliendo de la simulación. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elija una opción válida.");
                    break;
            }
        } while (opcion != 0);

        scanner.close();

    }
}
