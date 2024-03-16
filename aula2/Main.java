package aula2;

public class Main {

    public static void main(String[] args) {

        Calculadora calc = new Calculadora();
        calc.numA = 4.0;
        calc.numB = 2.0;
        System.out.println( "Soma:" + calc.somar());
        System.out.println( "sobtração:" + calc.subtrair());
        System.out.println( "multiplicaçao:" + calc.multiplicar());
        System.out.println( "divisão:" + calc.dividir());

    }
    
}
