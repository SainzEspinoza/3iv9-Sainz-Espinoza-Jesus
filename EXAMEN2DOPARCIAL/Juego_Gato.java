import java.io.*;

public class Juego_Gato{

    public char [][] tablero;
    public char jugadorUno;
    public char jugadorDos;
    public boolean turno;
    int contador;

    public Juego_Gato(){

        tablero      = new char[3][3];               
        jugadorUno   = 'X';
        jugadorDos   = 'O';
        turno        = true;  
        int contador = 0;     
        inicializarTablero();

    }

    public void inicializarTablero(){
       
        int posicion = 1;
       
        for(int i=0;i<3;i++){
               
            for(int j=0; j<3;j++){
                       
                tablero[i][j] = Integer.toString(posicion).charAt(0);
                posicion++;
            } 

        }
        
    }

    public void imprimirTablero(){
               
        for(int i=0;i<3;i++){      
            for(int j=0;j<3;j++){
                       
                if(j<2){    
                    System.out.print(" " + tablero[i][j] + " |");       
                }else                
                    System.out.print(" " + tablero[i][j] + " ");                                             
            }     
            if(i<2){       
                 System.out.println("\n-----------"); 
            }

        }
        
        System.out.println();
        System.out.println();
        System.out.println();
    }

    public void indicarPosicionArreglo(int a, int b, char c){
        tablero [a][b]=c;
    }

    public void setTurno(boolean d){
        turno=d;
    }

    public void setContador(int e){
        contador=e;
    }

    public char getPosicionArreglo(int a, int b){
        return tablero[a][b];
    }

    public char getJugadorUno(){
        return jugadorUno;
    }

    public char getJugadorDos(){
        return jugadorDos;
    }

    public boolean getTurno(){
        return turno;
    }

    public int getContador(){
        return contador;
    }

    public void indicarTurno(){

        if(getTurno()==true){
            System.out.println("JUGADOR 1: Elija Una Casilla Ingresando El Numero Correspondiente.");
        }else{
            System.out.println("JUGADOR 2: Elija Una Casilla Ingresando El Numero Correspondiente.");
        }

    }

    public char obtenerFigura(){
       
        if(getTurno()==true){     
            return jugadorUno;           
        }else     
            return jugadorDos;     
        }

    public void cambiarTurno(){        
        if(obtenerFigura()=='X'){       
            setTurno(false);
        }else    
                setTurno(true);
        }
    
    public void comprobarEspacio(char espacio, int posicionUno, int posicionDos){

        if(espacio!=getJugadorUno()&&espacio!=getJugadorDos()){
               
            indicarPosicionArreglo(posicionUno, posicionDos,obtenerFigura());
            cambiarTurno();                                                   
            contador++;                                                                    
        }else{                     
            System.out.println("La Casilla Esta Ocupada, Elija Otra Por Favor");  
        } 

    }

    public void elegirPosicion(int posicion){
                           
        switch(posicion){
           
                    case 1:
                        comprobarEspacio(getPosicionArreglo(0,0),0,0);
                    break;
                    case 2:
                        comprobarEspacio(getPosicionArreglo(0,1),0,1);
                    break;
                    case 3:
                        comprobarEspacio(getPosicionArreglo(0,2),0,2);
                    break;
                    case 4:
                        comprobarEspacio(getPosicionArreglo(1,0),1,0);
                    break;
                    case 5:
                        comprobarEspacio(getPosicionArreglo(1,1),1,1);
                    break;
                    case 6:
                        comprobarEspacio(getPosicionArreglo(1,2),1,2);
                    break;
                    case 7:
                        comprobarEspacio(getPosicionArreglo(2,0),2,0);
                    break;
                    case 8:
                        comprobarEspacio(getPosicionArreglo(2,1),2,1);
                    break;
                    case 9:
                        comprobarEspacio(getPosicionArreglo(2,2),2,2);
                    break;
                    default:

                    System.out.println("Por Favor, Ingrese Solo Un Digito Del 1 al 9.");break;                             
        }          
    }

    public void decirGanador(char a){
       
        if(a=='X'){                  
            System.out.println("FIN DEL JUEGO: Gana el jugador 1.");       
        }else if(a=='O'){              
            System.out.println("FIN DEL JUEGO: gana el jugador 2.");                      
        }    
                               
    }

    public void buscarGanador(){
               
        for(int i=0;i<3;i++){
            for(int j=1;j<2;j++){
                    if(tablero[i][j]==tablero[i][j-1]&&tablero[i][j]==tablero[i][j+1]){                              
                        decirGanador(tablero[i][j]);
                        imprimirTablero();
                        setContador(10);
                    }                              
            }                      
        }
        for(int i=0;i<3;i++){
               
            for(int j=1;j<2;j++){
                   
                    if(tablero[j][i]==tablero[j-1][i]&&tablero[j][i]==tablero[j+1][i]){
                   
                       decirGanador(tablero[j][i]);
                       imprimirTablero();
                       setContador(10);
                    }                              
            }
        }
    
        if(tablero[1][1]==tablero[0][0]&&tablero[1][1]==tablero[2][2]){
            decirGanador(tablero[1][1]);
            imprimirTablero();
            setContador(10);
        }  
        if(tablero[1][1]==tablero[0][2]&&tablero[1][1]==tablero[2][0]){
            decirGanador(tablero[1][1]);
            imprimirTablero();                  
            setContador(10);
        }

    }

    public void jugarGato(){
       
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
       
        System.out.println("3IV9-Sainz-Espinoza-Jesus-Jair-Programacion-Orientada-a-Objetos");      
               
        do{

                indicarTurno();                
                imprimirTablero();     
            try{
                elegirPosicion(Integer.parseInt(entrada.readLine()));
            }catch(IOException e){

            }catch(NumberFormatException e){
                if(getTurno()==true){ 
                    System.out.println("ERROR!: Ingreso Un Caracter No Valido, Por Favor, Intente Nuevamente JUGADOR 1.");
                }else{
                               
                System.out.println("ERROR!: Ingreso Un Caracter No Valido, Por Favor, Intente Nuevamente JUGADOR 2.");
                }      
            }          
                buscarGanador();

        }while(getContador()<9);
       
            if(getContador()==9){
                System.out.println("Empate, no hay ganador :c");                                        
                    imprimirTablero();
                System.out.println("Gracias");             
            }
         
        System.out.println("Gracias");

    }

}