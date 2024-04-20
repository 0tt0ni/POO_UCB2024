package aula4;

public class contacorrente {
    
    private int numero;
    private double saldo;

    private contacorrente(){}

    public contacorrente(int numconta){

        this.numero = numconta;
        this.saldo = 0;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
