public class Operadores {
    public static void main(String[] args) {
        /* BLOCO 1 CONCATENAÇÃO
        
        String nomeCompleto = "LINGUAGEM " + "JAVA";

        System.out.println(nomeCompleto);

        String concatenacao = "?";

        concatenacao = 1+1+1+"1"; // 31

        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1; // 1111 -> No caso em questão, após o algoritmo identificar uma String, ele segue concatenando em formato
                                  // de String, até o final

        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1"; // 1111 -> Segue concatenando String's até o final 

        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1; // 1111 -> Segue concatenando String's até o final 

        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1); // 13 -> Realiza a concatenação da String, com a soma dos números (1+1+1)

        System.out.println(concatenacao);*/

        /*BLOCO 2 OPERADORES ARITMÉTICOS
        int numero = 5;

        numero = - numero;

        System.out.println (numero);

        numero = numero * -1;

        System.out.println(numero);

         */

        /*BLOCO 3 ++ e -- (Incremento e Decremento)

        int numero = 5;

        //repeticao x
        numero ++; //numero = numero + 1;

        System.out.println (numero);

        System.out.println(++ numero); //Utilizando o pre-fixo ++, a variável em questão (numero), recebe o incremento
                                       //antes de exibir o conteúdo da variável

        System.out.println(numero ++); //Utilizando o pos-fixo ++, a variavel em questão (numero), recebe o incremento
                                       //apos a exibicao do conteudo da variável

        System.out.println(numero);*/

        /*  BLOCO 4 - OPERADORES BOOLEANOS E CONVERSÃO

        boolean variavel = true;

        System.out.println(!variavel); //Alteração fica na memória, ou seja, apenas nessa exibição

        System.out.println(variavel); //É exibido o resultado definido na primeira atribução da variável

        variavel = !variavel; //Realiza a conversão do conteúdo da variável, nesse caso de true para false;

        System.out.println(variavel); //Resultado da conversão booleana - false; */

        /*OPERADOR TERNÁRIO

        int a, b;

        a = 5;
        b = 6;

        String resultado = a==b ? "verdadeiro" : "falso";
           
        System.out.println(resultado); */

        //OPERADORES RELACIONAIS -> Apoiam na tomada de decisão

        String nomeUm = "LUCAS";
        String nomeDois = "LUCAS";

        System.out.println("nomeUm é igual a nomeDois?" + nomeUm.equals(nomeDois)); //Utilizar a expressão equals(), na comparação de objetos

        int numero1 = 1;
        int numero2 = 2;

        if (numero1 < numero2){
            System.out.println("A condição é verdadeira!");
        }

        boolean simNao = numero1 == numero2;

        System.out.println("numeroUm é igual a numeroDois? " + simNao);

        simNao = numero1 != numero2;

        System.out.println("numeroUm é diferente a numeroDois? " + simNao);

        simNao = numero1 > numero2;

        System.out.println("numeroUm é maior que numeroDois? " + simNao);

    }

}
