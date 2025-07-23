import java.util.Scanner;

public class FiltroDivisiveis {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        System.out.println("Digite o número inicial: ");
        var initialNumber = scanner.nextInt();

        var anotherNumber = 0;

        do{
            System.out.println("Digite outro número: ");
            anotherNumber = scanner.nextInt();

            if (anotherNumber < initialNumber){
                System.out.println("Número ignorado (menor que o inicial)");
                continue;
            }

            if (anotherNumber % initialNumber != 0){
                System.out.println("Número não divisível por " + initialNumber + ". Encerrando.");
                break;
            }

        }while(true);
        scanner.close();
    }
}
