import java.util.Scanner;

class MenuFigurasMejorado{
  

    public static void main(String[] args){

//VARIABLES
    Scanner entrada = new  Scanner(System.in);
    char opcion;
    char letra = 'r';
    int decision = -7;
    double altura, apotema, base, dmayor, dmenor, lado, radio;
    double resultado;
    //int siempre se inicializa con numeros
    //char siempre se inicializa iniciando con ' el dato '
    //double siempre inicializa con un numero,un punto, otro numero
    //boolean siempre se inicializa con verdadero o falso
    //String es como char pero con mas caracteres


//PRESENTACION DEL MENU
        System.out.println("Bienvenido al sistema de menu de figuras mejorado");
        System.out.println("Elije la opcion que decidas");
//OPCIONES DEL MENU
    while (true){
        if (letra == 's' ||  letra == 'S' ){
            break;
        } 
        //do{
        System.out.println("Presiona A para calcular Areas");
        System.out.println("Presiona P para calcular Perimetros");
        System.out.println("Presiona cualquier otra tecla para salir");

        //}while(int!=a)

        //System.out.println("Debes introducir solo una de las letras");
        //a = entrada.next().charAt(0);
        //p = entrada.next().charAt(0);
        
        opcion = entrada.next().charAt(0);
        switch (opcion) {
            //char letra = 'e'
            case 'a': 
            System.out.println("Has elegido calcular AREAS");
            System.out.println("Escribe el numero de la figura a la que quieras calcular su area");
            System.out.println("1. Circulo");
            System.out.println("2. Cuadrado");
            System.out.println("3. Hexagono");
            System.out.println("4. Rombo");
            System.out.println("5. Rectangulo");
            System.out.println("6. Triangulo");

            decision = entrada.nextInt();
                switch (decision) {
                    case 1:
                        System.out.println("Ingresa la longitud del radio de tu Circulo");
                        radio = entrada.nextDouble();
                        resultado = 3.1416*(radio*radio);
                        System.out.println("El area es de: "+ resultado);
                    break;
                    case 2:
                        System.out.println("Ingresa la longitud de uno de los lados de tu Cuadrado");
                        lado = entrada.nextDouble();
                        resultado = lado*lado;
                        System.out.println("El area es de: "+ resultado);
                    break; 
                    case 3:
                        System.out.println("Ingresa el valor de un lado del Hexagono");
                        lado = entrada.nextDouble();
                        System.out.println("Ingresa el valor del apotema de tu Hexagono");
                        apotema = entrada.nextDouble();
                        resultado = ((lado*6)*apotema)/2;
                        System.out.println("El area es de: "+ resultado);
                    break;
                    case 4:
                        System.out.println("Ingresa el valor de la diagonal mayor de tu Rombo");
                        dmayor = entrada.nextDouble();
                        System.out.println("Ingresa el valor de la diagonal menor de tu Rombo");
                        dmenor = entrada.nextDouble();
                        resultado = (dmayor*dmenor)/2;
                        System.out.println("El area es de: "+ resultado);
                    break;
                    case 5:
                        System.out.println("Ingresa la longitud de la base de tu Rectangulo");
                        base = entrada.nextDouble();
                        System.out.println("Ingresa la longitud de la altura de tu Rectangulo");
                        altura = entrada.nextDouble();
                        resultado = base*altura;
                        System.out.println("El area es de: "+ resultado);
                    break;
                    case 6:
                        System.out.println("Ingresa el valor de la base de tu Triangulo");
                        base = entrada.nextDouble();
                        System.out.println("Ingresa el valor de la altura de tu Triangulo");
                        altura = entrada.nextDouble();
                        resultado = (base*altura)/2;
                        System.out.println("El area es de: "+ resultado);
                    break;

                }
            
                break;
        //Break de case A   
            case 'p':
      
            System.out.println("Has elegido calcular Perimetros");
            System.out.println("Escribe el numero de la figura a la que quieras calcular su Perimetro");
            System.out.println("1. Circulo");
            System.out.println("2. Cuadrado");
            System.out.println("3. Hexagono");
            System.out.println("4. Rombo");
            System.out.println("5. Rectangulo");
            System.out.println("6. Triangulo");

            decision = entrada.nextInt(); 
                switch (decision) {
                    case 1:
                        System.out.println("Ingresa la longitud del radio de tu Circulo");
                        radio = entrada.nextDouble();
                        resultado = 2*3.1416*radio;
                        System.out.println("El Perimetro es de: "+ resultado);
                    break;
                    case 2:
                        System.out.println("Ingresa la longitud de uno de los lados de tu Cuadrado");
                        lado = entrada.nextDouble();
                        resultado = lado*4;
                        System.out.println("El Perimetro es de: "+ resultado);
                        break;
                    case 3:
                        System.out.println("Ingresa el valor de un lado del Hexagono");
                        lado = entrada.nextDouble();
                        resultado = lado*6;
                        System.out.println("El Perimetro es de: "+ resultado);
                    break;
                    case 4:
                        System.out.println("Ingresa el valor de uno de los lados de tu Rombo");
                        lado = entrada.nextDouble();
                        resultado = lado*4;
                        System.out.println("El Perimetro es de: "+ resultado);
                    break;
                    case 5:
                        System.out.println("Ingresa la longitud de la base de tu Rectangulo");
                        base = entrada.nextDouble();
                        System.out.println("Ingresa la longitud de la altura de tu Rectangulo");
                        altura = entrada.nextDouble();
                        resultado = (2*base)+(2*altura);
                        System.out.println("El Perimetro es de: "+ resultado);
                    break;
                    case 6:
                        System.out.println("Ingresa el valor de uno de los lados de tu Triangulo Equilatero");
                        lado = entrada.nextDouble();
                        resultado = 3*lado;
                        System.out.println("El Perimetro es de: "+ resultado);
                    break;
            
            }
           break; 
        }
        System.out.println("si deseas salir presiona S, para repetir presione cualquier otra tecla");
        
        letra = entrada.next().charAt(0);

    }
        System.out.println("gracias por participar, no vuelva xD");
    }

}


   
