import java.util.Scanner;

public class DiferencaIdadePessoas {
    public static void main(String[] args) {
        /*Escreva um código que receba o nome e a idade de 2 pessoas e imprima a diferença de idade entre elas*/

        var scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro nome: ");
        var name1 = scanner.next();
        System.out.println("Digite o segundo nome: ");
        var name2 = scanner.next();
        System.out.println("Digite a primeira idade: ");
        var age1 = scanner.nextInt();
        System.out.println("Digite a segunda idade: ");
        var difference = 0;
        var age2 = scanner.nextInt();
        if (age1 > age2) {
            difference = age1 - age2;
        }else{
            difference = age2 - age1;
        }
        System.out.printf("A diferença de idade entre %s e %s é de %d ano(s) \n", name1, name2, difference);

    }
}
