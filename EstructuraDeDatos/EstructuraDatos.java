import java.util.*;

class EstructuraDatos{

    public static void main(String [] args){

        //VARIABLES
        Scanner entrada = new  Scanner(System.in);
        int opcion = 0;
        int resul = 0;
        char letra = 'a';
        int num = 0;
        int num2 = 0;
        int factorial = 1;
        int nume;
        int positivos = 0;
        int negativos = 0;
        int edad = 0;
        int grados = 0;
        String producto;
        String binario = "";
        double resultado;
        double base, altura, radio;
        double lado, lado1, lado2, lado3;

        System.out.println("3IV9-Sainz-Espinoza-Jesus-Jair");
        System.out.println("Bienvenido");
        //while (true){
          // if (opcion == 14){
            //    break;
            //}
                do{
        System.out.println("Elige la opcion que desees realizar");
        //MENU
        System.out.println("1. Descuento");
        System.out.println("2. Numero Decimal a Binario");
        System.out.println("3. Conversor de Temperatura");
        System.out.println("4. Numeros Positivos y Negativos");
        System.out.println("5. Productos y factura");
        System.out.println("6. Figuras");
        System.out.println("7. Tabla de Multiplos");
        System.out.println("8. Numero Factorial");
        System.out.println("9. Cuadrado con Asteriscos");
        System.out.println("10. Cuadrado Hueco con Asteriscos");
        System.out.println("11. Asteriscos Formados con un Patron Peculiar");
        System.out.println("12. Diamante de Asteriscos");
        System.out.println("13. Calculadora");

            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                while (true) {
                    if (letra == 'm'){
                        break;
                    }
                    System.out.println("Ingresa tu Edad");
                    edad = entrada.nextInt();
                    if(edad > 65){
                        System.out.println("El precio de tu abono tiene 40% de Descuento");
                    }if (edad < 65){
                        System.out.println("El precio de tu abono tiene 25% de Descuento");
                        }if(edad <21){
                            System.out.println("¿Tus padres son Socios?");
                            System.out.println("Escribe 1 en caso de que si y 2 en caso que no");
                            num = entrada.nextInt();
                            if(num == 1){
                                System.out.println("El precio de tu abono tiene un 45% de Descuento");
                            }else{
                                System.out.println("El precio de tu abono tiene un 25% de Descuento");
                            }

                            
                        }
                        System.out.println("Si deseas repetir el programa Pulsa Cualquier Tecla");
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
                    System.out.println("Escribe tu numero decimal");
                    num = entrada.nextInt();
                    int digito;
                    while(num != 0){
                        digito = num % 2;
                        binario += digito;
                        num = num / 2;
                        binario = new StringBuilder(binario).reverse().toString();
                    }
                    System.out.println("Tu numero en binario es: " + binario);
                        //NO MOVER LO DE ABAJO
                    System.out.println("Si deseas repetir el programa Pulsa Cualquier Tecla");
                    System.out.println("Si deseas volver al menu principal Pulsa M");
                    letra = entrada.next().charAt(0);   
                }  
                break;
                case 3:
                while (true) {
                    if (letra == 'm'){
                        break;
                    }

                    System.out.println("Elige los grados que quieras convertir");
                    System.out.println("1. FAHRENHEIT");
                    System.out.println("2. CELSIUS");
                    System.out.println("3. KELVINE");
                    System.out.println("4. RANKINE");

                    opcion = entrada.nextInt();
                        switch (opcion) {
                            case 1:
                                System.out.println("Elige la conversion que quieras");
                                System.out.println("1. FAHRENHEIT a CELSIUS");
                                System.out.println("2. FAHERNHEIT a KELVINE");
                                System.out.println("3. FAHRENHEIT a RANKINE");
                                opcion = entrada.nextInt();
                                    switch (opcion) {
                                        case 1:
                                            System.out.println("Ingresa la cantidad de Grados FAHRENHEIT");
                                            grados = entrada.nextInt();
                                            resultado = 5 * ( grados - 32 ) / 9;
                                            System.out.println("El resultado es " + resultado + "° CELSIUS" );
                                        break;
                                        case 2:
                                            System.out.println("Ingresa la cantidad de Grados FAHRENHEIT");
                                            grados = entrada.nextInt();
                                            resultado = ( 5 * ( grados - 32 ) / 9) + 273.15;
                                            System.out.println("El resultado es " + resultado + "° KELVINE" );
                                        break;
                                        case 3:
                                            System.out.println("Ingresa la cantidad de Grados FAHRENHEIT");
                                            grados = entrada.nextInt();
                                            resultado = grados + 459.67 ;
                                            System.out.println("El resultado es " + resultado + "° RANKINE" );
                                        break;
                                        default:
                                            break;
                                    }
                            break;
                            case 2:
                                System.out.println("Elige la conversion que quieras");
                                System.out.println("1. CELSIUS a FAHRENHEIT");
                                System.out.println("2. CELSIUS a KELVINE");
                                System.out.println("3. CELSIUS a RANKINE");
                                opcion = entrada.nextInt();
                                    switch (opcion) {
                                        case 1:
                                            System.out.println("Ingresa la cantidad de Grados CELSIUS");
                                            grados = entrada.nextInt();
                                            resultado = ( ( 9 * grados ) / 5 ) + 32;
                                            System.out.println("El resultado es " + resultado + "° FAHRENHEIT" );
                                        break;
                                        case 2:
                                            System.out.println("Ingresa la cantidad de Grados CELSIUS");
                                            grados = entrada.nextInt();
                                            resultado = grados + 273.15;
                                            System.out.println("El resultado es " + resultado + "° KELVINE" );
                                        break;
                                        case 3:
                                            System.out.println("Ingresa la cantidad de Grados CELSIUS");
                                            grados = entrada.nextInt();
                                            resultado = ( ( 9 * grados ) / 5 ) + 491.67;
                                            System.out.println("El resultado es " + resultado + "° RANKINE" );
                                        break;
                                        default:
                                        break;
                                    }
                            break;
                            case 3:
                                System.out.println("Elige la conversion que quieras");
                                System.out.println("1. KELVINE a FAHRENHEIT");
                                System.out.println("2. KELVINE a CELSIUS");
                                System.out.println("3. KELVINE a RANKINE");
                                opcion = entrada.nextInt();
                                    switch (opcion) {
                                        case 1:
                                            System.out.println("Ingresa la cantidad de Grados KELVINE");
                                            grados = entrada.nextInt();
                                            resultado = ( ( 9 * ( grados - 273.15 ) ) / 5 ) + 32;
                                            System.out.println("El resultado es " + resultado + "° FAHRENHEIT" );
                                        break;
                                        case 2:
                                            System.out.println("Ingresa la cantidad de Grados KELVINE");
                                            grados = entrada.nextInt();
                                            resultado = grados - 273.15;
                                            System.out.println("El resultado es " + resultado + "° CELSIUS" );
                                        break;
                                        case 3:
                                            System.out.println("Ingresa la cantidad de Grados KELVINE");
                                            grados = entrada.nextInt();
                                            resultado = ( ( 9 * ( grados - 273.15 ) ) / 5 ) + 491.67;
                                            System.out.println("El resultado es " + resultado + "° RANKINE" );
                                        break;
                                        default:
                                        break;
                                    }
                            break;
                            case 4:
                                System.out.println("Elige la conversion que quieras");
                                System.out.println("1. RANKINE a FAHRENHEIT");
                                System.out.println("2. RANKINE a CELSIUS");
                                System.out.println("3. RANKINE a KELVINE");
                                opcion = entrada.nextInt();
                                    switch (opcion) {
                                        case 1:
                                            System.out.println("Ingresa la cantidad de Grados RANKINE");
                                            grados = entrada.nextInt();
                                            resultado = grados - 459.67;
                                            System.out.println("El resultado es " + resultado + "° FAHRENHEIT" );
                                        break;
                                        case 2:
                                            System.out.println("Ingresa la cantidad de Grados RANKINE");
                                            grados = entrada.nextInt();
                                            resultado = ( 5 * ( grados - 491.67 ) ) / 9;
                                            System.out.println("El resultado es " + resultado + "° CELSIUS" );
                                        break;
                                        case 3:
                                            System.out.println("Ingresa la cantidad de Grados RANKINE");
                                            grados = entrada.nextInt();
                                            resultado = ( ( 5 * ( grados - 491.67 ) ) / 9 ) + 273.15;
                                            System.out.println("El resultado es " + resultado + "° KELVINE" );
                                    break;
                                    default:
                                    break;
                                    }
                                break;
                        }
                    //NO BORRAR LO DE ABAJO
                    System.out.println("Si deseas repetir el programa Pulsa Cualquier Tecla");
                        System.out.println("Si deseas volver al menu principal Pulsa M");
                        letra = entrada.next().charAt(0);
                }  
                    
                break;
                case 4:
                while (true) {
                    if (letra == 'm'){
                        break;
                    }

                    //AQUI VA EL PROGRAMA
                    for(int i=1; i<10; i++){
                        System.out.println("Escribe un numero positivo o negativo");
                        nume = entrada.nextInt();
                        if (nume > 0){
                            positivos = positivos + 1;
                        }else if (nume < 0){
                            negativos = negativos + 1;
                        }
                    }
                    System.out.println("El numero total de numeros es 10");
                    System.out.println("El total de numeros positivos es: " + positivos);
                    System.out.println("El total de numeros negativos es: " + negativos);
                        //NO BORRAR LO DE ABAJO
                        System.out.println("Si deseas repetir el programa Pulsa Cualquier Tecla");
                        System.out.println("Si deseas volver al menu principal Pulsa M");
                        letra = entrada.next().charAt(0);
                }  
                    
                break;
                case 5:
                while (true) {
                    if (letra == 'm'){
                        break;
                    }

                    //AQUI VA EL PROGRAMA
                    System.out.println("|   Producto  |Precio|");
                    System.out.println("|1. Cuaderno  |  24  |\n|2. Lapicera  |  60  |\n|3. Pluma     |  12  |\n|4. Mochila   | 120  | \n|5. Libro     |  40  |");
                    System.out.println("Pulsa cualquier numero para saber cuantos prductos puedes elegir");
                    num = entrada.nextInt();
                    System.out.println("Puedes elegir 3 productos");
                   // switch (num) {
                   //     case 1:
                    //        System.out.println("Solo puedes ingresar 3 cantidades");
                     //       for(int i=1; i<=3; i++){
                      //          System.out.println("Escribe el numero del producto que vas a comprar");
                       //         num = entrada.nextInt();
                         //           if(num == 1){
                           //             producto = 0 +"|Cuaderno|| 24 |";  
                             //       }if(num == 2){
                               //         producto = 0 +"|Lapicera|| 60 |";
                             //       }if(num == 3){
                           //             producto = 0 +"| Pluma  || 12 |";
                         //           }if(num == 4){
                       //                 producto = 0 +"|Mochila || 120|";
                      //              }if(num == 5){
                     //                   producto = 0 +"| Libro  || 40 |";
                    //                }
                    boolean cuaderno = false;
                    boolean lapicera = false;
                    boolean pluma = false;
                    boolean mochila = false;
                    boolean libro = false;
                    ///////////////////////////
                    //int num = 0;
                    int precioc = 0;
                    int preciol = 0;
                    int preciop = 0;
                    int preciom = 0;
                    int preciolib = 0;
                    for(int i=1; i<=3; i++){
                    System.out.println("Escribe el numero del producto que quieres");
                        num = entrada.nextInt();
                        if(num == 1){
                            cuaderno = true;
                        }   if(num == 2){
                            lapicera = true;
                            }   if(num == 3){
                                pluma = true;
                                }   if(num == 4){
                                    mochila = true;
                                    }   if(num == 5){
                                        libro = true;
                                        }                
                    }
                    System.out.println("------Nota de Compra------");
                    System.out.println("---|Producto|| Precio |---");
                    if(cuaderno){
                    System.out.println("---|Cuaderno||   24   |---");
                    }   if(lapicera){
                        System.out.println("---|Lapicera||   60   |--- ");
                        }   if(pluma){
                            System.out.println("---| Pluma  ||   12   |---");
                            }   if(mochila){
                                System.out.println("---|Mochila ||   120  |---");
                                }   if(libro){
                                    System.out.println("-- | Libro  ||   40   |---");
                                    }
                   //         }
                    //        producto = System.console().readLine();
                    //        System.out.println("---Nota de Compra---");
                    //        System.out.println("---|Producto|| Precio |---");
                    //        System.out.println(" "+ producto);
                    //        System.out.println(" "+ producto);
                    //        System.out.println(" "+ producto);
                    //    break;
                    //}
                    //NO BORRAR LO DE ABAJO
                    System.out.println("Si deseas repetir el programa Pulsa Cualquier Tecla");
                        System.out.println("Si deseas volver al menu principal Pulsa M");
                        letra = entrada.next().charAt(0);
                }  
                    
                break;
                case 6:
                while (true) {
                    if (letra == 'm'){
                        break;
                    }
                    //AQUI VA EL PROGRAMA
                    System.out.println("Escribe la opcion que desees calcular");
                    System.out.println("A. Area o Perimetro de un Rectangulo");
                    System.out.println("B. Area o Perimetro de un Triangulo");
                    System.out.println("C. Volumen de Esfera o Cilindro");

                        letra = entrada.next().charAt(0);
                        switch (letra) {
                            case 'a':
                                System.out.println("Elige el calculo que quieres hacer a tu Rectangulo");
                                System.out.println("1. Calcular Area");
                                System.out.println("2. Calcular Perimetro");
                                    num = entrada.nextInt();
                                    switch (num) {
                                        case 1:
                                            System.out.println("Ingresa la longitud de la BASE de tu Rectangulo");
                                            base = entrada.nextDouble();
                                            System.out.println("Ingresa la longitud de la ALTURA de tu Rectangulo");
                                            altura = entrada.nextDouble();
                                            resultado = base*altura;
                                            System.out.println("El area es de: "+ resultado);                                            
                                        break;
                                        case 2:
                                            System.out.println("Ingresa la longitud de la base de tu Rectangulo");
                                            base = entrada.nextDouble();
                                            System.out.println("Ingresa la longitud de la altura de tu Rectangulo");
                                            altura = entrada.nextDouble();
                                            resultado = (2*base)+(2*altura);
                                            System.out.println("El Perimetro es de: "+ resultado);                    
                                        break;
                                        default:
                                            break;
                                    }
                            break;
                            case 'b':
                                System.out.println("Elige el calculo que quieres hacer a tu Triangulo");
                                System.out.println("1. Calcular Area");
                                System.out.println("2. Calcular Perimetro");
                                    num = entrada.nextInt();
                                    switch (num) {
                                        case 1:
                                            System.out.println("Ingresa la longitud de la BASE de tu Triangulo");
                                            base = entrada.nextDouble();
                                            System.out.println("Ingresa la longitud de la ALTURA de tu Triangulo");
                                            altura = entrada.nextDouble();
                                            resultado = ( base * altura ) / 2;
                                            System.out.println("El area es de: "+ resultado);                                            
                                        break;
                                        case 2:
                                            System.out.println("Elige el tipo de triangulo al que quieres calcular su perimetro");
                                            System.out.println("1. Equilatero");
                                            System.out.println("2. Rectangulo");
                                            System.out.println("3. Isosceles");
                                                num = entrada.nextInt();
                                                switch (num) {
                                                    case 1:
                                                        System.out.println("Ingresa la longitud de uno de los lados de tu triangulo Equilatero");
                                                        lado = entrada.nextDouble();
                                                        resultado = 3 * lado;
                                                        System.out.println("El Perimetro de tu triangulo es " + resultado );    
                                                    break;
                                                    case 2:
                                                        System.out.println("Escribe la longitud del primer lado de tu triangulo");
                                                        lado1 = entrada.nextDouble();
                                                        System.out.println("Escribe la longitud del segundo lado de tu rectangulo");
                                                        lado2 = entrada.nextDouble();
                                                        System.out.println("Escribe la longitud del tercer lado de tu rectangulo");
                                                        lado3 = entrada.nextDouble();
                                                        resultado = lado1 + lado2 + lado3;
                                                        System.out.println("El Perimetro de tu traingulo es " + resultado);
                                                    break;
                                                    default:
                                                    break;
                                                }                    
                                        break;
                                        default:
                                        break;
                                    }
                            break;
                            case 'c':
                                System.out.println("Elige a que figura calcular su Volumen");
                                System.out.println("1. Esfera");
                                System.out.println("2. Cilindro");
                                num = entrada.nextInt();
                                    switch(num) {
                                        case 1:
                                        System.out.println("Escribe el radio de tu Esfera");
                                        radio = entrada.nextDouble();
                                        resultado = ( 4 * 3.1416 * ( radio * radio * radio )) / 3;
                                        System.out.println("El volumen es " + resultado);
                                        break;
                                        case 2:
                                        System.out.println("Escribe el radio de la base de tu Cilindro");
                                        radio =  entrada.nextDouble();
                                        System.out.println("Escribe la altura de tu Cilindro");
                                        altura = entrada.nextDouble();
                                        resultado = ( 3.1416 * ( radio * radio ) ) * altura;
                                        System.out.println("El volumen es " + resultado);
                                        break;
                                    }
                            break;
                            default:
                            break;
                        }

                    //NO BORRAR LO DE ABAJO
                    System.out.println("Si deseas repetir el programa Pulsa Cualquier Tecla");
                        System.out.println("Si deseas volver al menu principal Pulsa M");
                        letra = entrada.next().charAt(0);
                }  
                    
                break;
                case 7:
                while (true) {
                    if (letra == 'm'){
                        break;
                    }
                    //AQUI VA EL PROGRAMA
                    System.out.println("Tabla de multiplos\nEscribe un numero");
                    num = entrada.nextInt();
                        for(int i=1; i<=num; i++){
                        System.out.println("---------------");
                        System.out.println(""+"|"+i*1+"|"+i*10+"|"+i*100+"|"+i*1000+"|" );
                     }
                    //NO BORRAR LO DE ABAJO
                    System.out.println("Si deseas repetir el programa Pulsa Cualquier Tecla");
                        System.out.println("Si deseas volver al menu principal Pulsa M");
                        letra = entrada.next().charAt(0);
                }      
                break;
                case 8:
                while (true) {
                    if (letra == 'm'){
                        break;
                    }
                    //AQUI VA EL PROGRAMA
                    System.out.println("Escribe un numero entero POSITIVO");
                    num = entrada.nextInt();
                        if(num >= 0){
                            for(int i = 2; i <= num; i ++){
                                factorial = factorial * i;
                            }System.out.println("El factorial de " + num +  " es: " + factorial);
                        }else{
                            System.out.println("Tu numero debe se positivo");
                        }
                        //NO BORRAR LO DE ABAJO
                    System.out.println("Si deseas repetir el programa Pulsa Cualquier Tecla");
                        System.out.println("Si deseas volver al menu principal Pulsa M");
                        letra = entrada.next().charAt(0);
                }  
                    
                break;
                case 9:
                while (true) {
                    if (letra == 'm'){
                        break;
                    }
                    //AQUI VA EL PROGRAMA
                    System.out.println("Ingresa un numero del 1 al 20");
                    num = entrada.nextInt();
                        if(num >= 1 && num <= 20){
                            for(int i=1; i<=num; i++ ){
                                for(int j=1 ; j<=num ; j++){
                                    System.out.print(" *");
                                }
                                System.out.println("");
                            }
                        }else{
                            System.out.println("El numero que debes ingresar solo debe ser del 1 al 20");
                        }
                    //NO BORRAR LO DE ABAJO 
                    System.out.println("Si deseas repetir el programa Pulsa Cualquier Tecla");
                        System.out.println("Si deseas volver al menu principal Pulsa M");
                        letra = entrada.next().charAt(0);
                }  
                    
                break;
                case 10:
                while (true) {
                    if (letra == 'm'){
                        break;
                    }
                    //AQUI VA EL PROGRAMA
                    System.out.println("Ingresa un numero del 1 al 20");
                    num = entrada.nextInt();
                        if (num>=0 && num <=20){
                            for(int i=0; i<num;i++){
                                System.out.print("*");
                            }
                            System.out.println();
                                for(int i=0; i<num-2; i++){
                                    System.out.print("*");
                                    for(int j=0; j<num-2; j++){
                                        System.out.print(" ");
                                    }
                                    System.out.println("*");
                                    
                                }
                                        for(int i=0; i<num;i++){
                                            System.out.print("*");
                                        }System.out.println(" ");
                        }   else{
                                System.out.println("El numero que debes ingresar solo puede ser del 1 al 20");
                            }   
                    // NO BORRAR LO DE ABAJO  
                    System.out.println("Si deseas repetir el programa Pulsa Cualquier Tecla");
                        System.out.println("Si deseas volver al menu principal Pulsa M");
                        letra = entrada.next().charAt(0);
                }  
                    
                break;
                case 11:
                //PENDIENTE
                while (true) {
                    if (letra == 'm'){
                        break;
                    }
                    //AQUI VA EL PROGRAMA
                    System.out.println("Ingresa un numero del 1 al 20");
                    num = entrada.nextInt();
                        if(num >= 1 && num <= 20){
                            for(int i=1; i<=num; i++){
                                System.out.print("*");
                            }
                        }else{
                            System.out.println("El numero que debes ingresar solo debe ser del 1 al 20");
                        }
                    //NO BORRAR LO DE ABAJO
                    System.out.println("Si deseas repetir el programa Pulsa Cualquier Tecla");
                        System.out.println("Si deseas volver al menu principal Pulsa M");
                        letra = entrada.next().charAt(0);
                }  
                    
                break;
                //PENDIENTE
                case 12:
                while (true) {
                    if (letra == 'm'){
                        break;
                    }

                    //AQUI VA EL PROGRAMA
                    //NO BORRAR LO DE ABAJO
                    System.out.println("Si deseas repetir el programa Pulsa Cualquier Tecla");
                        System.out.println("Si deseas volver al menu principal Pulsa M");
                        letra = entrada.next().charAt(0);
                }  
                    
                break;
                case 13:
                while (true) {
                    if (letra == 'm'){
                        break;
                    }

                    //AQUI VA EL PROGRAMA
                    System.out.println("Escribe el numero de la operacion que deseas realizar");
                    System.out.println("1. Suma");
                    System.out.println("2. Resta");
                    System.out.println("3. Multiplicacion");
                    System.out.println("4. Division");
                    num = entrada.nextInt();
                        switch (num) {
                            case 1:
                                System.out.println("Ingresa el primer numero");
                                num = entrada.nextInt();
                                System.out.println("Ingresa el segundo numero");
                                num2 = entrada.nextInt();
                                resul = num + num2;
                                System.out.println("El resultado es: " + resul);    
                            break;
                            case 2:
                                System.out.println("Ingresa el primer numero");
                                num = entrada.nextInt();
                                System.out.println("Ingresa el segundo numero");
                                num2 = entrada.nextInt();
                                resul = num - num2;
                                System.out.println("El resultado es: " + resul);    
                            break;
                            case 3:
                                System.out.println("Ingresa el primer numero");
                                num = entrada.nextInt();
                                System.out.println("Ingresa el segundo numero");
                                num2 = entrada.nextInt();
                                resul = num * num2;
                                System.out.println("El resultado es: " + resul);    
                            break;
                            case 4:
                                System.out.println("Ingresa el primer numero");
                                num = entrada.nextInt();
                                System.out.println("Ingresa el segundo numero");
                                num2 = entrada.nextInt();
                                resul = num / num2;
                                System.out.println("El resultado es: " + resul);    
                            break;
                        
                            default:
                                break;
                        }
                    //NO BORAR LO DE ABAJO
                    System.out.println("Si deseas repetir el programa Pulsa Cualquier Tecla");
                        System.out.println("Si deseas volver al menu principal Pulsa M");
                        letra = entrada.next().charAt(0);
                }  
                    
                break;
                default:
                break;
            }

            System.out.println("Escribe A para confirmar que quieres volver al menu");
            System.out.println("Escribe cualquier otra tecla para Salir");
            letra = entrada.next().charAt(0);

                }while( letra == 'a');
                System.out.println("Gracias por participar");
    }
}

