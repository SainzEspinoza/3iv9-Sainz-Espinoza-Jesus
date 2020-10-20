import java.util.Scanner;

class EntradaMenu{

    public static void main(String[] args){
   

        //variables  y objetos
        Scanner entrada = new Scanner(System.in);
        int opcion;
        int altura, base;
        double resultado;

        System.out.println("Bienvenido al programa de calculo de areas y perimetros");
        System.out.println("Elija una de las siguientes opciones o muere:");
        System.out.println("1.- Calcular area de un cuadrado");
        System.out.println("2.- Calcular area de un triangulo");
        System.out.println("3.- Calcular area de un circulo");
        System.out.println("Gracias uwu, ahora muere");
        System.out.println("4.- Morir");

        opcion = entrada.nextInt();

        switch(opcion){
            case 1:
                System.out.println("Ingresa el valor de un lado");
                base = entrada.nextInt();
                resultado = base*base;
                System.out.println("El area es de: "+resultado);
                //cerrar los casos
                break;

            case 2:
                System.out.println("Ingresa el valor de la base");
                base = entrada.nextInt();
                System.out.println("Ingresa el valor de la altura");
                altura = entrada.nextInt();
                resultado = (base*altura)/2;
                System.out.println("El area es de: "+resultado);
                break;

            case 3:
                System.out.println("Ingresa el valor del radio");
                base = entrada.nextInt();
                resultado = 3.1416*(base*base);
                System.out.println("El area es de: "+resultado);
                break;

            case 4:
                System.out.println("Elegiste el camino de la muerte");
                break;

            default:
                System.out.println("Gracias por venir. nwn/");
        }
    }
}