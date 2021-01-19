import java.util.Scanner;
import java.text.*;
 
public class Operacioones{

	public static void main(String[] args){
        
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
    
            for (i = 0; i < numeros.length; i++) {
                if (numeros[i] > promedio){ 
                    calificaciones += numeros[i];
                    superiores++;
                }
            }
    
            System.out.println("--Calificaciones-superiores-al-promedio---");
            System.out.println("                 " + superiores);
    
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
}