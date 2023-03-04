/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.colas;

/**
 *
 * @author Dell Latitude 3190
 */
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Colas {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Bienvenido al programa de Colas");
        System.out.println("¿Qué tipo de Cola desea utilizar?");
        System.out.println("1. Basada en Arrays");
        System.out.println("2. Basada en Listas");
        int opcion = sc.nextInt();
        sc.nextLine();

        if (opcion == 1) {
            System.out.println("Ha elegido una Cola basada en Arrays");

            ArrayQueue queue = new ArrayQueue(5);

            int choice = 0;
            while (choice != 5) {
                System.out.println("¿Qué acción desea realizar?");
                System.out.println("1. Encolar");
                System.out.println("2. Desencolar");
                System.out.println("3. Consultar la cima");
                System.out.println("4. Consultar el tamaño");
                System.out.println("5. Salir");
                choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {
                    case 1:
                        System.out.println("Ingrese el elemento a encolar:");
                        int element = sc.nextInt();
                        sc.nextLine();
                        queue.enqueue(element);
                        break;
                    case 2:
                        queue.dequeue();
                        break;
                    case 3:
                        System.out.println("La cima de la Cola es: " + queue.peek());
                        break;
                    case 4:
                        System.out.println("El tamaño de la Cola es: " + queue.size());
                        break;
                    case 5:
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Opción inválida, por favor seleccione una opción válida.");
                }
            }
        } else if (opcion == 2) {
            System.out.println("Ha elegido una Cola basada en Listas");

 
        Queue<Integer> cola = new LinkedList<>();
        
        int choice = 0;
        
        do {
            System.out.println("\nColas");
            System.out.println("1. Tamaño");
            System.out.println("2. Encolar");
            System.out.println("3. Desencolar");
            System.out.println("4. Cima");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            
            opcion = sc.nextInt();
            
            switch(opcion) {
                case 1:
                    System.out.println("El tamaño de la cola es: " + cola.size());
                    break;
                case 2:
                    System.out.println("La cola actual es: " + cola);
                    break;
                case 3:
                    System.out.print("Ingrese el número a encolar: ");
                    int numero = sc.nextInt();
                    cola.add(numero);
                    System.out.println("El número " + numero + " ha sido encolado.");
                    break;
                case 4:
                    if (cola.isEmpty()) {
                        System.out.println("La cola está vacía.");
                    } else {
                        int eliminado = cola.remove();
                        System.out.println("El número " + eliminado + " ha sido desencolado.");
                    }
                    break;
                case 5:
                    if (cola.isEmpty()) {
                        System.out.println("La cola está vacía.");
                    } else {
                        System.out.println("La cima de la cola es: " + cola.peek());
                    }
                    break;
                case 6:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        } while (opcion != 6);
        
        sc.close();
    }
    }
}