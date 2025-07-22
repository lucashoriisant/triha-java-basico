import java.util.Scanner;

public class NumerosParesImparesIntervalo {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        var number1 = scanner.nextInt();

        System.out.println("Digite o segundo número: ");
        var number2 = scanner.nextInt();

        while (number2 < number1){
            System.out.println("Digite o segundo número deve ser maior que o primeiro. Digite novamente: ");
            number2 = scanner.nextInt();
        }

        System.out.println ("Escolha 'PAR' ou 'IMPAR': ");
        var chooseEvenOrOdd = scanner.next();

            for (int i  = number2; i >= number1; i--){
                if (chooseEvenOrOdd.equalsIgnoreCase("PAR") && i % 2 == 0){
                    System.out.println(i);
            }
                if (chooseEvenOrOdd.equalsIgnoreCase("IMPAR") && i % 2 != 0){
                    System.out.println(i);
                }
        }
        scanner.close();
    }
}
