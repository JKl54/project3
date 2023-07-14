package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Declarando los datos de entrada del problema
        String ubicacionUsuario;
        String destino;
        String nombreUsuario;
        String telefonoUsuario;


        //Declarar un DATO ESPECIAL para captutar informacion
        Scanner teclado=new Scanner(System.in);

        //Para inicializar las VARIABLES
        System.out.println( "\u001B[35m Pa Onde Vas \u001B[0m");

        System.out.print("Digite su ubicación:");
        ubicacionUsuario=teclado.nextLine();

        System.out.print("Digite su destino:");
        destino=teclado.nextLine();

        System.out.print("Digite su nombre:");
        nombreUsuario=teclado.nextLine();

        System.out.print("Digite su telefono:");
        telefonoUsuario=teclado.nextLine();

        //PROCESO DEl PROBLEMA
        String distancia="20"; //ESTO ES UN TEXTO
        // DEBO HACER PARSEO DE LA VARIABLE distancia
        // PARSEO= CAMBIAR O MIDIFICAR EL TIPO DE DATO DE UNA VARIABLE
        Integer distanciaEnEntero= Integer.parseInt(distancia);
        Integer costoPOrKilometros=6800;
        Integer cobroTotal=distanciaEnEntero*costoPOrKilometros;

        //Salidas del problema
        System.out.println("\u001B[36m Señor Usuario: "+nombreUsuario +" \u001B[0m");
        System.out.println("\u001B[36m El costo de viaje es:"+cobroTotal+" pesos \u001B[0m");




    }
}