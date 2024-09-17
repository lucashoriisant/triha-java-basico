public class ResultadoEscolarCondicaoTernaria {
    public static void main(String[] args) {
        //Condição Ternária - Cenário 1
        /*int nota = 5;

        String resultado = nota >=7 ? "Aprovado" : "Reprovado";

        System.out.println(resultado);*/

        //Condição Ternária - Cenário 2

        int nota = 6;

        String resultado = nota >=7 ? "Aprovado" : nota >= 5 && nota <= 7 ? "Recuperação" : "Reprovado";

        System.out.println(resultado);

    }

}
