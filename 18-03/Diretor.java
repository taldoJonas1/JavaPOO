public class Diretor extends Funcionario{
    private int acoesEmpresa;

    public Diretor() {
    }

    public Diretor(String nome, String endereco, String cpf, float salario, int acoesEmpresa) {
        super(nome, endereco, cpf, salario);
        this.acoesEmpresa = acoesEmpresa;
    }

    public float getAcoesEmpresa() {
        return acoesEmpresa;
    }

    public void setAcoesEmpresa(int acoesEmpresa) {
        this.acoesEmpresa = acoesEmpresa;
    }

    @Override
    public String toString() {
        return "Diretor{" +
                "acoesEmpresa=" + acoesEmpresa +
                '}';
    }

    @Override
    public float calculaSalario() {
        return super.calculaSalario() + ((this.acoesEmpresa * 2) / 12.0f);
    }
}
