import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Digite um número de 1 a 10: ");
        var number = scanner.nextInt();

        for (int i = 1; i <= 10; i++){
            System.out.printf("%d x %d = %d\n", number, i, number * i);
        }
    }
}
