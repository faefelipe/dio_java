public class Operadores {
    public static void main(String[] args) {
        String nome = "Felipe";
        double soma = 10.5 + 15.7;
        int subtracao = 113 - 25;
        int divisao = 15 / 3;
        int modulo = 18 % 3;
        
        String nomeCompleto = "Linguagem" + "Java";
        System.out.println(nomeCompleto);
        System.out.println(nome);
        System.out.println(soma);
        System.out.println(subtracao);
        System.out.println(divisao);
        System.out.println(modulo);

        String concatenacao = "?";

        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao);

        int numero = 5;
        numero = - numero;

        System.out.println("aqui: " + numero);

        numero = numero * -1;
        System.out.println(numero);
    }
}
