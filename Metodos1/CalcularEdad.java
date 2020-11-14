import java.util.*;

class CalcularEdad{

    Scanner entrada = new Scanner(System.in);
    int nacimiento = 0;
    int edad = 0;
    public void Datos(){

        

        System.out.println("");
        System.out.println("Ingresa tu anio de nacimiento");
        System.out.println("");
        nacimiento = entrada.nextInt();

        calculo();
    }
    public void calculo(){

        edad = 2020 - nacimiento;
        System.out.println("Tu edad es: " + edad + " Anios" );

    }

}
