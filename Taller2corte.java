/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller2corte;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class Taller2corte {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Empleado> listaempleados = new ArrayList<>();

        int option;

        do {
            System.out.println("SELECCIONAR UNA OPCION");
            System.out.println("1. INGRESAR GEERENTE");
            System.out.println("2. INGRESAR DESARROLLADOR");
            System.out.println("3. MOSTRAR LISTA DE EMPLEADOS");

            option = entrada.nextInt();
            entrada.nextLine();

            switch (option) {
                case 1:
                    System.out.println("INGRESE NOMBRE COMPLETO");
                    String nombreA = entrada.nextLine();

                    System.out.println("INGRESE ID");
                    int idA = entrada.nextInt();

                    System.out.println("INGRESE SALARIO");
                    double salarioA = entrada.nextDouble();

                    if (salarioA <= 0) {
                        System.out.println("EL SALARIO NO PUEDE SER MENOR O IGUAL A O");
                    } else {
                        System.out.println("EMPLEADO" +  "" + nombreA + "" +  "INGRESADO CON EXITO");

                        listaempleados.add(new Gerente(nombreA, idA, (int) salarioA));
                        System.out.println("GERENTE GUARDADO CORRECTAMENTE");
                    }
                    break;
                case 2:
                    System.out.println("INGRESE NOMBRE COMPLETO");
                    String nombreB = entrada.nextLine();

                    System.out.println("INGRESE ID");
                    int idB = entrada.nextInt();

                    System.out.println("INGRESE SALARIO");
                    double salarioB = entrada.nextDouble();

                    if (salarioB <= 0) {
                        System.out.println("EL SALARIO NO PUEDE SER MENOR O IGUAL A O");
                    } else {
                        System.out.println("EMPLEADO" + nombreB + "INGRESADO CON EXITO");

                        listaempleados.add(new Desarrollador(nombreB, idB, (int) salarioB));
                        System.out.println("DESAROLLADOR GUARDADO CORRECTAMENTE");
                    }
                    break;
                case 3:
                    System.out.println("EMPLEADOS GUARDADOS");
                    if (listaempleados.isEmpty()) {
                        System.out.println("AUN NO HAY EMPLEADOS");
                    } else {
                        for (Empleado emp : listaempleados) {
                            System.out.println(emp.toString());
                        }
                    }
                    break;
                default:
                    System.out.println("INTENTE DE NUEVO, opcion invalida");
                    

            }

        }while(option !=3);
    }

}
