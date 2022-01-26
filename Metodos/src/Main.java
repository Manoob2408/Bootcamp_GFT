public class Main {
    public static void main(String[] args) {

        //Exercício Calculadora
        System.out.println("Exercício Calculadora: ");
        Calculadora.soma(3,5);
        Calculadora.subtracao(8,4);
        Calculadora.multiplicacao(5,6);
        Calculadora.divisao(40,3);

        //Exercicio Mensagem
        System.out.println("Exercicio Mensagem:");
        Mensagem.obterMensagem(12);
        Mensagem.obterMensagem(4);
        Mensagem.obterMensagem(16);

        //Exercício Empréstimo
        System.out.println("Exercicio Empréstimo:");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(2050, Emprestimo.getTresParcelas());
        Emprestimo.calcular(4080, 5);

        //Exercicio Area
        System.out.println("Exercicio Area:");
        Area.calculaArea(5); //Quadrado
        Area.calculaArea(4,6); //Retângulo
        Area.calculaArea(8,4,3); //Trapézio
    }
}
