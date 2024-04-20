package aula4;

public class sistema {
    

    public static void main(String[] args){

        contacorrente c1 = new contacorrente(123);
        contacorrente c2 = new contacorrente(124);

        c2.setNumero( 125);

        c1.getSaldo();
    }
}
