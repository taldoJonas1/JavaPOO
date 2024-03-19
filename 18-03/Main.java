public class Main {
    public static void exibeDados(Funcionario camaleao){
        System.out.println(camaleao.toString());
        System.out.println("Salario final: " + camaleao.calculaSalario());
    }
    public static void main(String[] args) {
        Assistente as1 = new Assistente("João", "Franca", "123", 3500, 8);
        exibeDados(as1);
        Gerente ge1 = new Gerente("Matheus", "Franca", "456", 5000, 2000);
        exibeDados(ge1);
        Diretor di1 = new Diretor("Jennifer", "Franca", "789", 10000, 100);
        exibeDados(di1);
    }
}
