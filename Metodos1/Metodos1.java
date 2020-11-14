import java.util.*;

class Metodos1{

    Scanner entrada = new Scanner(System.in);

    public void Menu(){

        int opcion;
        char letra = 'a';

        do{

            System.out.println("--------3IV9-Sainz-Espinoza-Jesus-Jair--------");
            System.out.println("1.- Calcular Edad");
            System.out.println("2.- Areas y Perimetros");
            System.out.println("3.- Costo de Llamadas telefonicas");
            System.out.println("-------Elige el caso que desees ejecutar------");
            
            opcion = entrada.nextInt();
            switch(opcion){

                case 1:
                    //Promedio de valores positivos y negativos
                    while (true) {
                        if (letra == 'm'){
                            break;
                        }
                        //AQUI VA EL PROGRAMA
                        CalcularEdad obj = new CalcularEdad();
                        obj.Datos();
                        //NO BORRAR LO DE ABAJO
                        System.out.println("Presiona cualquier tecla para repetir");
                        System.out.println("Si deseas volver al menu principal Pulsa M");
                        letra = entrada.next().charAt(0);
                    }
                break;

                case 2:
                    //Promedio de numeros en pocisiones pares
                    while (true) {
                        if (letra == 'm'){
                            break;
                        }
                        //AQUI VA EL PROGRAMA
                        AreasYPerimetros obj = new AreasYPerimetros();
                        obj.MenuDeFiguras();
                        //NO BORRAR LO DE ABAJO
                        System.out.println("Presiona cualquier tecla para repetir");
                        System.out.println("Si deseas volver al menu principal Pulsa M");
                        letra = entrada.next().charAt(0);
                    }
                break;

                case 3:
                    //Datos de calificaciones
                    while (true) {
                        if (letra == 'm'){
                            break;
                        }
                        //AQUI VA EL PROGRAMA
                        Llamadas obj = new Llamadas();
                        obj.DatosDellamada();   
                        //NO BORRAR LO DE ABAJO
                        System.out.println("Presiona cualquier tecla para repetir");
                        System.out.println("Si deseas volver al menu principal Pulsa M");
                        letra = entrada.next().charAt(0);
                    }
                break;

            }

                System.out.println("Escribe A para confimar que deseas volver al menu principal");
                System.out.println("Escribe cualquier otra tecla para Salir");
                letra = entrada.next().charAt(0);

        }while(letra == 'a');
        System.out.println("Muchas Gracias");

    }

}