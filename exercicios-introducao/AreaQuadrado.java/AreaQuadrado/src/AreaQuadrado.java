import java.util.Scanner;

public class AreaQuadrado {
    public static void main(String[] args) {
        /*Escreva um código que receba o tamanho do lado de um quadrado, calcule sua área e exiba na tela

        fórmula: área=lado X lado*/

        var scanner = new Scanner(System.in);
        System.out.println("Digite o tamanho do lado do quadrado: ");
        var squareSize = scanner.nextFloat();
        var squareArea = squareSize * squareSize;
        System.out.printf("A área do quadrado é %s", squareArea);

    }
}
