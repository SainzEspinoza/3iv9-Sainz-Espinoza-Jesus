import java.util.*;

class AreasYPerimetros{

    Scanner entrada = new Scanner(System.in);
    int opcion = 0;
    double num = 0;
    double num2 = 0;
    double resultado = 0;

    public void MenuDeFiguras(){

        System.out.println("");
        System.out.println("Selecciona la opcion que desees realizar");
        System.out.println("1. Calcular Area");
        System.out.println("2. Calcular Perimetro");
        System.out.println("");
        opcion = entrada.nextInt();

        switch (opcion) {
            case 1:
                Area();
            break;
            case 2:
                Perimetro();
            break;
            default:
            break;
        }

    }

    public void Area(){

        System.out.println("Selecciona el Area que deseas calcular");
        System.out.println("1. Circulo");
        System.out.println("2. Cuadrado");
        System.out.println("3. Rectangulo");
        System.out.println("4. Triangulo");
        System.out.println("");
        opcion = entrada.nextInt();

        switch (opcion){
            case 1:
                CirculoA();
            break;
            case 2:
                CuadradoA();
            break;
            case 3:
                RectanguloA();
            break;
            case 4:
                TrianguloA();
            break;
            default:
            break;
        }

    }

    public void CirculoA(){

        System.out.println("Escribe la longitud de tu radio");
        
        num = entrada.nextDouble();
        resultado = 3.1416 * ((num)*(num));

        System.out.println("El Area de tu circulo es: " + resultado);
        
    }
    public void CuadradoA(){

        System.out.println("Escribe la longitud de uno de los lados");
        
        num = entrada.nextDouble();
        resultado = num*num;

        System.out.println("El Area de tu cuadrado es: " + resultado);
        
    }
    public void RectanguloA(){

        System.out.println("Escribe la longitud de tu base");
        num = entrada.nextDouble();
        System.out.println("Escribe la longitud de tu altura");
        num2 = entrada.nextDouble();
        resultado = num*num2;

        System.out.println("El area de tu Rectangulo es: " + resultado);
        
    }
    public void TrianguloA(){

        System.out.println("Escribe la longitud de tu base");
        num2 = entrada.nextDouble();
        System.out.println("Escribe la longitud de tu altura");
        num = entrada.nextDouble();
        resultado = (num*num2) / 2;

        System.out.println("El Area de tu triangulo es : " + resultado);
        
    }


    public void Perimetro(){

        System.out.println("Selecciona el Perimetro que deseas calcular");
        System.out.println("1. Circulo");
        System.out.println("2. Cuadrado");
        System.out.println("3. Rectangulo");
        System.out.println("4. Triangulo");
        System.out.println("");
        opcion = entrada.nextInt();

        switch (opcion) {
            case 1:
                CirculoP();
            break;
            case 2:
                CuadradoP();
            break;
            case 3:
                RectanguloP();
            break;
            case 4:
                TrianguloP();
            break;
            default:
            break;
        }

    }


    public void CirculoP(){

        System.out.println("Escribe la longitud de tu radio");
        
        num = entrada.nextDouble();
        resultado = (3.1416 * num) * 2;

        System.out.println("El Perimetro de tu circulo es: " + resultado);
        
    }
    public void CuadradoP(){

        System.out.println("Escribe la longitud de uno de tus lados");
        
        num = entrada.nextDouble();
        resultado = num * 4;

        System.out.println("El Perimetro de tu cuadrado es : " + resultado);
        
    }
    public void RectanguloP(){

        System.out.println("Escribe la longitud la base de tu rectangulo");
        num2 = entrada.nextDouble();
        System.out.println("Escribe la longitud de la altura de tu rectangulo");
        num = entrada.nextDouble();
        resultado = (num * 2) + (num2 * 2);
        System.out.println("El Perimetro de tu rectangulo es : " + resultado);
        
    }
    public void TrianguloP(){

        System.out.println("Escribe la longitud de uno de los lados");
        
        num = entrada.nextDouble();
        resultado = num*3;
        System.out.println("El Perimetro de tu triangulo es : " + resultado);
        
    }

}