public class Variaveis {
    public static void main(String[] args) {
        int i;
        int I;
        int _1a;
        // int j$10; caracteres especiais não são permitidos

        i = 5;
        I = 3;
        _1a = 2;

        final int j = 10; //final faz com que o j seja uma constante
        final int NUMERO_TENTATIVAS = 5; //Constantes devem ser declaradas com letras maiúsculas e underline
        int quantidadeProduto = 50;
        // int QuantidadeProduto = 30; Não segue a boa prática do primeiro caracter ser minúsculo
        // int qtdProd; Sem expressividade

        System.out.println(i);
        System.out.println(I);
        System.out.println(_1a);
        System.out.println(j);
        System.out.println(NUMERO_TENTATIVAS);
        System.out.println(quantidadeProduto);

    }
}
