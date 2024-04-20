package herança.empresa;

public class gerente extends funcionario{
    

    
    private Integer quantgerenciados;

        private gerente(){}

    public gerente(String nome, Integer cpf, Integer telefone, Integer quantgerenciados, Double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.quantgerenciados = quantgerenciados;
        this.salario = salario;
    }


    

    public Integer getQuantgerenciados() {
        return this.quantgerenciados;
    }

    public void setQuantgerenciados(Integer quantgerenciados) {
        this.quantgerenciados = quantgerenciados;
    }

    public Double getBonificação() {
        return this.salario * 0.25;
}


    @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", cpf='" + getCpf() + "'" +
            ", telefone='" + getTelefone() + "'" +
            ", quantgerenciados='" + getQuantgerenciados() + "'" +
            ", salario='" + getSalario() + "'" +
            ", bonificação='" + getBonificação() + "'" +
            "}";
    }

}