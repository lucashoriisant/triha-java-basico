public class ExemploBreakContinue {
    public static void main(String[] args) {
        for (int numero = 1; numero <=5; numero ++){
            if (numero == 3)
                /*break;*/ //Interrompe no número 2, ou seja, o número do 3 ao 5 não são exibidos
                continue; //Não exibe o número 3, apenas o 1,2, 4 e 5

            System.out.println(numero);
        }
        
    }

}
