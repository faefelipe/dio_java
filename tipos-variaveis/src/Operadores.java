public class Operadores {
    public static void main(String[] args) {

        boolean condicao1 = true;
        boolean condicao2 = false;

        if(condicao1 && condicao2) {
            System.out.println("as duas condicoes são verdadeiras");
        }

        if(condicao1 || condicao2) {
            System.out.println("uma das condicoes é verdadeira");
        }
        
        String nomeUm = "Felipe";
        String nomeDois = new String("Felipe");

        System.out.println(nomeUm.equals(nomeDois));
        int numero = 5;

        System.out.println(++ numero);
        System.out.println(numero++);
        System.out.println(numero);

        System.out.println(--numero);
        System.out.println(numero--);
        System.out.println(numero);

        boolean variavel = true;
        variavel = !variavel;
        System.out.println(variavel);

        int a, b;
        a = 5;
        b = 6;

        String resultado = a==b ? "Verdadeiro" : "falso";

        System.out.println(resultado);

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        System.out.println("numeroUm é igual a numeroDois? " + simNao);

        simNao = numero1 != numero2;

        System.out.println("numeroUm é diferente do numeroDois? " + simNao);

        simNao = numero1 > numero2;

        System.out.println("numeroUm é maior que numeroDois? " + simNao);

    }
}
