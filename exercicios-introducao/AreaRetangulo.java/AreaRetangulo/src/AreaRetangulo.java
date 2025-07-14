import java.util.Scanner;

public class AreaRetangulo {
    public static void main(String[] args) {
        /*Escreva um código que receba a base e a altura de um retângulo, calcule sua área e exiba na tela

        fórmula: área=base X altura*/

        var scanner = new Scanner(System.in);
        System.out.println("Digite o tamanho da base do retãngulo: ");
        var base = scanner.nextFloat();
        System.out.println("Digite o tamanho da altura do retângulo: ");
        var height = scanner.nextFloat();
        var rectangleArea = base * height;
        System.out.printf("A área do retângulo é: %s", rectangleArea);



    }
}
