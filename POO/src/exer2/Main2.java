package exer2;

public class Main2 {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();

        //Exemplos de Upcasting (Sempre implícito)
        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

        //Exemplo de Downcasting (Sempre explícito) exer2.Funcionario -> exer2.Vendedor
        //Deve ser evitado
        Vendedor vendedor_ = (Vendedor) new Funcionario();


    }
}
