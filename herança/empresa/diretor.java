package herança.empresa;

public class diretor extends funcionario {
    
    
    private Integer QuantGErencias;

    private diretor(){}


    public diretor(String nome, Integer cpf, Integer telefone, Double salario, Integer QuantGErencias) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.salario = salario;
        this.QuantGErencias = QuantGErencias;
    }

    public Integer getQuantGErencias() {
        return this.QuantGErencias;
    }

    public void setQuantGErencias(Integer QuantGErencias) {
        this.QuantGErencias = QuantGErencias;
    }

    public Double setBonificação() {
         return this.salario * 0.35;
}


    @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", cpf='" + getCpf() + "'" +
            ", telefone='" + getTelefone() + "'" +
            ", salario='" + getSalario() + "'" +
            ", QuantGErencias='" + getQuantGErencias() + "'" +
            "}";
    }
}