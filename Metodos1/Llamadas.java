import java.util.*;

class Llamadas{

    Scanner entrada = new Scanner(System.in);
    double NumCred = 10;
    int opcion = 0;
    private int Num_Telefono;
    private int Num_Telefono2;


    public void DatosDellamada(){
        tipo_llamada();

    }
    public void Num_Telefonos(int Num_Telefono, int Num_Telefono2){
        this.Num_Telefono = Num_Telefono;  
    }
    
    public int getNum_Telefono(){
        System.out.println("Escribe tu numero de telefono");
        Num_Telefono = entrada.nextInt();
        return Num_Telefono;
    }

    public void setNum_Telefono(int Num_Telefono){
        this.Num_Telefono = Num_Telefono;
    }
    public int getNum_Telefono2(){
        System.out.println("Escribe tu numero de telefono");
        Num_Telefono2 = entrada.nextInt();
        return Num_Telefono2;
    }

    public void setNum_Telefono2(int Num_Telefono2){
        this.Num_Telefono2 = Num_Telefono2;
    }
   
    public void tipo_llamada(){

        System.out.println("Selecciona el tipo de llamada que deseas hacer");
        System.out.println("1. Nacional");
        System.out.println("2. Local-internacional");
        System.out.println("3. Celular");
        System.out.println("Su saldo incial es de 10.");
        opcion = entrada.nextInt();
        System.out.println("");

        switch (opcion) {
            case 1:
            Nacional();
            break;
            case 2:
            Local_internacional();
            break;
            case 3:
            Celular();   
            break;
            default:
            break;
        }

    }
    public void Nacional(){

        System.out.println("Tu llamada tipo Nacional desde el numero: " + getNum_Telefono() 
                        + "\n Al numero : " + getNum_Telefono2() + " Se ha ejecutado correctamente");


    }
    public void Local_internacional(){

        System.out.println("Tu llamada tipo Local-internacional desde el numero: " + getNum_Telefono() 
                        + "\n Al numero : " + getNum_Telefono2() + " Se ha ejecutado correctamente" );

    }
    public void Celular(){

        System.out.println("Tu llamada tipo Celular desde el numero: " + getNum_Telefono() 
        + "\n Al numero : " + getNum_Telefono2() + " Se ha ejecutado correctamente");
    
    }

}