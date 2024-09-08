public class TiposVariaveis {
    public static void main(String[] args) throws Exception {

        /*tipos primitivos
        Inteiros: byte, short, int e long
        Decimais: float, double
        Caractere: char
        Lógico: boolean*/

        /* Classe String que representa texto na aplicação:

        A classe String é usada para representar texto em Java e oferece muitas ferramentas úteis para manipulação de texto. Ela é imutável, 
        eficiente (graças ao pool de strings), e tem uma vasta gama de métodos para facilitar o trabalho com sequências de caracteres.

        Exemplo:

        public class ExemploString {
        
        public static void main(String[] args) {
        String saudacao = "Olá, Mundo!";
        
        // Mostrar o tamanho da string
        System.out.println("Tamanho: " + saudacao.length());

        // Mostrar uma parte da string
        System.out.println("Parte da string: " + saudacao.substring(5, 10));

        // Transformar a string em maiúsculas
        System.out.println("Maiúsculas: " + saudacao.toUpperCase());

        // Comparar strings
        String outraSaudacao = "olá, mundo!";
        System.out.println("São iguais? " + saudacao.equalsIgnoreCase(outraSaudacao));  // Retorna true (ignora maiúsculas/minúsculas)
             }
        }

        String meuNome = "LUCAS HORII"; */

        double salarioMinimo = 2500;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal; //Realizar o casting (Adequação de variável de maior tamanho, para menor tamanho) 
                                                   //ou alterar o tipo da variável
        int numero = 5;

        numero = 10;

        System.out.println(numero);

        final double VALOR_DE_PI = 3.14; // Para manter o conteúdo da varíavel fixo, é necessário utilizar uma constante
                                         // O nome da variável deve ser em CAIXA ALTA e a palavra 'final' deve ser adicionada antes
                                         // do tipo da variável
        


    }
}
