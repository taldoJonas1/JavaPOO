public class Funcionario {
    protected String nome, endereco, cpf;
    protected float salario;

    public Funcionario() {
    }

    public Funcionario(java.lang.String nome, java.lang.String endereco, java.lang.String cpf, float salario) {
        this.nome = nome;
        this.endereco = endereco;
        this.cpf = cpf;
        this.salario = salario;
    }

    public java.lang.String getNome() {
        return nome;
    }

    public java.lang.String getEndereco() {
        return endereco;
    }

    public java.lang.String getCpf() {
        return cpf;
    }

    public float getSalario() {
        return salario;
    }

    public void setNome(java.lang.String nome) {
        this.nome = nome;
    }

    public void setEndereco(java.lang.String endereco) {
        this.endereco = endereco;
    }

    public void setCpf(java.lang.String cpf) {
        this.cpf = cpf;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", cpf='" + cpf + '\'' +
                ", salario=" + salario +
                '}';
    }

    public float calculaSalario(){
        return this.salario;
    }
}
