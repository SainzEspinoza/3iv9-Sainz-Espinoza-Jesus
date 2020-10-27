import java.util.*;

class POKEDEX {

    public static void main(String [] args){
//fuerza, defensa vida, ataque principal, ataque secundario
        //VARIABLES
        Scanner entrada = new  Scanner(System.in);
        int num = 0;
        char letra = 'a';
        int opcion = 0;
        int fuerza = 0;
        int defensa = 0;
        int vida = 0;
        int atqprincipal = 0;
        int atqsecundario = 0;
        //PROGRAMA
        System.out.println("------------------------------------");
        System.out.println("---3IV9-Sainz-Espinoza-Jesus-Jair---");
        System.out.println("------------------------------------");
        System.out.println("-------------Bienvenido-------------");
        System.out.println("------------------------------------");
        
                do{
                System.out.println("Elige la opcion que desees realizar");
                System.out.println("1. Informacion sobre Charmander");
                System.out.println("2. Informacion sobre Bulbasaor");
                System.out.println("3. Informacion sobre Squartle");
                System.out.println("4. Batalla Pokemon");

                    opcion = entrada.nextInt();
                    switch (opcion) {
                        case 1:
                            while (true) {
                                if (letra == 'm'){
                                    break;
                                }

                            System.out.println("------------------------");
                            System.out.println("-------Charmander-------");
                            System.out.println("------------------------");
                            System.out.println("-----Fuerza------20-----");
                            System.out.println("-----Defensa-----15-----");
                            System.out.println("-----Vida--------50-----");
                            System.out.println("----ATAQUE-PRINCIPAL----");
                            System.out.println("--LLAMA-DEL-INFRAMUNDO--");
                            System.out.println("-----PODER--------20-----");
                            System.out.println("----ATAQUE-SECUNDARIO---");
                            System.out.println("-----BOLA--DE--FUEGO----");
                            System.out.println("-----PODER-------10-----");

                            
                            System.out.println("Si deseas volver al menu principal Pulsa M");
                            letra = entrada.next().charAt(0);
                            }  
                            
                        break;
                        case 2:
                            while (true) {
                                if (letra == 'm'){
                                    break;
                                }
                            //AQUI VA EL PROGRAMA
                            System.out.println("------------------------");
                            System.out.println("-------BULBASAOR--------");
                            System.out.println("------------------------");
                            System.out.println("-----Fuerza------18-----");
                            System.out.println("-----Defensa-----12-----");
                            System.out.println("-----Vida--------60-----");
                            System.out.println("----ATAQUE-PRINCIPAL----");
                            System.out.println("------HOJA-AFILADA------");
                            System.out.println("-----PODER--------24----");
                            System.out.println("----ATAQUE-SECUNDARIO---");
                            System.out.println("-----MAR---DE---AGUA----");
                            System.out.println("-----PODER-------8------");
                                //NO BORRAR LO DE ABAJO
                                System.out.println("Si deseas volver al menu principal Pulsa M");
                                letra = entrada.next().charAt(0);
                            }  
                            
                        break;
                        case 3:
                            while (true) {
                                if (letra == 'm'){
                                    break;
                                }
                            //AQUI VA EL PROGRAMA
                            System.out.println("------------------------");
                            System.out.println("--------SQUARTLE--------");
                            System.out.println("------------------------");
                            System.out.println("-----Fuerza------16-----");
                            System.out.println("-----Defensa-----16-----");
                            System.out.println("-----Vida--------40-----");
                            System.out.println("----ATAQUE-PRINCIPAL----");
                            System.out.println("-----CHORRO-DE-AGUA-----");
                            System.out.println("-----PODER-------24-----");
                            System.out.println("----ATAQUE-SECUNDARIO---");
                            System.out.println("----PODER--DEL--AGUA----");
                            System.out.println("-----PODER-------8------");
                                //NO BORRAR LO DE ABAJO
                                    System.out.println("Si deseas volver al menu principal Pulsa M");
                                    letra = entrada.next().charAt(0);
                            }     
                            
                        break;
                        case 4:
                            while (true) {
                                if (letra == 'm'){
                                    break;
                                }
                                System.out.println("ELIGE A TU PELEADOR");
                                System.out.println("1. CHARMANDER");
                                System.out.println("2. BULBASAOR");
                                System.out.println("3. SQUARTLE");
                                num = entrada.nextInt();
                                switch (num) {
                                    case 1:
                                        System.out.println("Elige a tu Contrincante");
                                        System.out.println("1. BULBASAOR");
                                        System.out.println("2. SQUARTLE");
                                            opcion = entrada.nextInt();
                                            switch (opcion) {
                                                case 1:
                                                    System.out.println("CHARMANDER-VS-BULBASAUR");
                                                break;
                                                case 2:
                                                    System.out.println("CHARMANDER-VS-SQUARTLE");

                                                break;

                                            
                                            
                                                default:
                                                    break;
                                            }

                                        
                                    break;
                                    case 2:
                                        System.out.println("Elige a tu Contrincante");
                                        System.out.println("1. CHARMANDER");
                                        System.out.println("2. SQUARTLE");
                                        opcion = entrada.nextInt();
                                            switch (opcion) {
                                                case 1:
                                                    System.out.println("BULBASAOR-VS-CHARMANDER");
                                                break;
                                                case 2:
                                                    System.out.println("BULBASAOR-VS-SQUARTLE");
                                                break;

                                            
                                            
                                                default:
                                                    break;
                                            }
                                    break;
                                    case 3:
                                        System.out.println("Elige a tu Contrincante");
                                        System.out.println("1. CHARMANDER");
                                        System.out.println("2. BULBASAOR");
                                        opcion = entrada.nextInt();
                                            switch (opcion) {
                                                case 1:
                                                    System.out.println("SQUARTLE-VS-CHARMANDER");
                                                break;
                                                case 2:
                                                    System.out.println("SQUARTLE-VS-BULBASAOR");

                                                break;

                                        
                                        
                                                default:
                                                    break;
                                            }
                                    break;
                            
                                    default:
                                        break;
                                }
                            
                            
                                System.out.println("Pulsa Cualquier Tecla si deseas otra pelea");
                                    System.out.println("Si deseas volver al menu principal Pulsa M");
                                    letra = entrada.next().charAt(0);
                            }  
                            
                        break;
                    
                        default:
                        break;
                    }

                
                    System.out.println("Escribe A para confirmar que quieres volver al menu del POKEDEX");
                    System.out.println("Escribe cualquier otra tecla para Salir");
                    letra = entrada.next().charAt(0);
            
            }while( letra == 'a');
            System.out.println("Gracias por participar");

    }

}