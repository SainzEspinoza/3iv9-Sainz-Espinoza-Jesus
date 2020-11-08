import java.util.*;

public class Ejercicios{

    Scanner entrada = new Scanner(System.in);

    public void menu(){

        int opcion;
        char letra = 'a';

        do{

            System.out.println("--------3IV9-Sainz-Espinoza-Jesus-Jair--------");
            System.out.println("1.- Promedio de valores positivos y negativos");
            System.out.println("2.- Promedio de numeros en posiciones pares");
            System.out.println("3.- Datos de calificaciones");
            System.out.println("4.- Suma de matrices");
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
                        PromedioDePosNeg();
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
                        PromedioDePares();
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
                        Calificaciones();
                        //NO BORRAR LO DE ABAJO
                        System.out.println("Presiona cualquier tecla para repetir");
                        System.out.println("Si deseas volver al menu principal Pulsa M");
                        letra = entrada.next().charAt(0);
                    }
                break;

                case 4:
                    //Suma de matrices
                    while (true) {
                        if (letra == 'm'){
                            break;
                        }
                        //AQUI VA EL PROGRAMA
                        Matrices();
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
                System.out.println("----------------------Muchas--Gracias----------------------");

    }

    //Promedio de valores positivos y negativos  
    //COMPLETO
    public void PromedioDePosNeg(){

       //VARIABLES
       Scanner entrada = new Scanner(System.in);
       double[] numeros = new double[10];
       double positivos = 0, negativos = 0;
       int i;
       double PromedioPositivos = 0, PromedioNegativos = 0;                                      
       
       //CODIGO
       System.out.println("Ingrese 10 numeros enteros ya sea positivos o negativos: ");

       for (i = 0; i < numeros.length; i++) {
           numeros[i]=entrada.nextDouble();
       }
 
           for (i = 0; i < numeros.length; i++) {
               if (numeros[i] > 0){ 
                   PromedioPositivos += numeros[i];
                   positivos++;
               }   else if (numeros[i] < 0){
                       PromedioNegativos += numeros[i];
                       negativos++;
                   }
           }
               System.out.println("--------Promedio-de-numeros--------");
               if (positivos != 0) {
                   System.out.println("---Positivos: " + PromedioPositivos / positivos);
               }   else {
                       System.out.println("No ha introducido numeros positivos");
                   }
               if (negativos != 0) {
                   System.out.println("---Negativos: " + PromedioNegativos / negativos);                               
               }   else {
                       System.out.println("No ha introducido numeros negativos");
                   }
                System.out.println("-----------------------------------");
    }

    //Promedio de numeros en pocisiones pares
    //COMPLETO
    public void PromedioDePares(){

        //VARIABLES
       Scanner entrada = new Scanner(System.in);
       double[] numeros = new double[10];
       int positivos = 0, negativos = 0;
       int i;
       double PromedioPositivos = 0, PromedioNegativos = 0;                                      
       
       //CODIGO
       System.out.println("Ingrese 10 numeros enteros ya sea positivos o negativos: ");

       for (i = 0; i < numeros.length; i++) {
           numeros[i]=entrada.nextDouble();
       }
 
           for (i = 0; i < numeros.length; i += 2) {
               if (numeros[i] > 0){ 
                   PromedioPositivos += numeros[i];
                   positivos++;
               }   else if (numeros[i] < 0){
                       PromedioNegativos += numeros[i];
                       negativos++;
                   }
           }
               System.out.println("--------Promedio-de-numeros--------");
               if (positivos != 0) {
                   System.out.println("---Positivos: " + PromedioPositivos / positivos);
               }   else {
                       System.out.println("No ha introducido numeros positivos");
                   }
               if (negativos != 0) {
                   System.out.println("---Negativos: " + PromedioNegativos / negativos);                               
               }   else {
                       System.out.println("No ha introducido numeros negativos");
                   }
                System.out.println("-----------------------------------");
    }

    //Datos de calificaciones
    //COMPLETO
    public void Calificaciones(){

        //VARIABLES
        Scanner entrada = new Scanner(System.in);
        double[] numeros = new double[10];
        int positivos = 0;
        int i;
        double calificaciones = 0;
        double promedio = 0;
        double califmayor = 0; 
        double califmenor = 10;
        double superiores = 0; 
        double aprobados = 0; 
        double reprobados = 0;                                     
        
        //CODIGO
        System.out.println("-----Programacion Orientada a Objetos----");
        System.out.println("Ingrese las calificaciones de sus alumnos");

        for (i = 0; i < numeros.length; i++) {
            do{
                numeros[i] = entrada.nextDouble();
                if(!(numeros[i] >= 0 && numeros[i] <= 10)){
                    System.out.println("Las calificaciones solo tienen un rango de 0 a 10");
                }
            }while(!(numeros[i] >= 0 && numeros[i] <= 10));
        }
  
            for (i = 0; i < numeros.length; i++) {
                if (numeros[i] > 0){ 
                    calificaciones += numeros[i];
                    positivos++;

                    promedio = calificaciones / positivos;
                }

            }
                System.out.println("--------Promedio-de-Calificaciones--------");
                if (positivos != 0) {
                    System.out.println("                 " + promedio);
                } else if (positivos == 0){
                    System.out.println(" 0.00 ");
                }
        
        //CALIFICACION MAS ALTA Y MAS BAJA
        for (int j = 0; j < numeros.length; j++) {
            if(numeros [j] > califmayor) {
                califmayor = numeros[j];
            }
            if(numeros[j]<califmenor) {
                califmenor = numeros[j];
            }
        }
        System.out.println("----------Calificacion-mas-alta-----------");
        System.out.println("                 " + califmayor);
        System.out.println("----------Calificacion-mas-baja-----------");
        System.out.println("                 " + califmenor);

        //NUMERO DE CALIFICACIONES SUPERIORES AL PROMEDIO
        for (i = 0; i < numeros.length; i++) {
            if (numeros[i] > promedio){ 
                calificaciones += numeros[i];
                superiores++;
            }
        }

        System.out.println("--Calificaciones-superiores-al-promedio---");
        System.out.println("                 " + superiores);

        //CANTIDAD DE ALMUNMOS APROBADOS Y REPROBADOS

        for (int j = 0; j < numeros.length; j++) {
            if(numeros [j] >= 6) {
                calificaciones = numeros[j];
                aprobados++;
            }
            if(numeros[j]<6) {
                calificaciones = numeros[j];
                reprobados++;
            }
        }
        System.out.println("------------Alumnos-aprobados-------------");
        System.out.println("                 " + aprobados);
        System.out.println("------------Alumnos-reprobados------------");
        System.out.println("                 " + reprobados);

    }

    //Suma de matrices
    //COMPLETO
    public void Matrices(){

        //VARIABLES
        Scanner entrada = new Scanner (System.in);
        int[][] matrizA = new int[3][3];
        int[][] matrizB = new int[3][3];
        int[][] matrizS = new int[3][3];
        int i, j;
         
        //CODIGO
        System.out.println("-----------Suma-de-matrices-----------");
        System.out.println("");  
        System.out.println("---------Datos-de-la-Matriz-A:--------");
        System.out.println("");
            
        for (i=0; i<=2; i++){
            for (j=0; j<=2; j++){
                System.out.print("     Escribe el valor de: " + i + " , " + j + " : ");
                matrizA [i][j]= entrada.nextInt();
            }
        }
        

        System.out.println("");
        System.out.println("---------Datos-de-la-Matriz-B:---------");
               
        for (i=0; i<=2; i++){
            for (j=0; j<=2; j++){
                System.out.print("     Escribe el valor de: " + i + " , " + j + " : ");
                matrizB [i][j]= entrada.nextInt();
            }
        }

        System.out.println("");
        System.out.println("-----El valor de la matriz 'A' es:-----");
        System.out.println("");
        for (i=0;i<=2;i++){
            for (j=0;j<=2;j++) {
                System.out.print("         " + matrizA[i][j] + " ");
            }
            System.out.println("");
               
        }

        System.out.println("");
        System.out.println("-----El valor de la matriz 'B' es:-----");
        System.out.println("");

        for (i=0;i<=2;i++){
            for (j=0;j<=2;j++) {
                System.out.print("         " + matrizB[i][j] + " ");
            }
            System.out.println("");
               
        }
               
        for (i=0; i<=2; i++){
            for (j=0; j<=2; j++){
                matrizS [i][j]= matrizA[i][j]+matrizB[i][j];
            }
        }
        
        System.out.println("");
        System.out.println("------El resultado de la suma es:------");
       for (i=0;i<=2;i++){
            for (j=0;j<=2;j++) {
                System.out.print("         " + matrizS[i][j] + " ");
            }
            System.out.println("");
               
        }
       
    }
}