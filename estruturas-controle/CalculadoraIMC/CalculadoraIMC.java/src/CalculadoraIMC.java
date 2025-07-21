import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Digite a sua altura");
        var height = scanner.nextFloat();
        System.out.println("Digite o seu peso");
        var weight = scanner.nextFloat();

        var IMC = (weight/(height*height));

        if(IMC <= 18.5){
            System.out.println("Abaixo do peso");
        }

        if ((IMC >= 18.6) && (IMC <= 24.9)){
            System.out.println("Peso ideal");
        }

        if ((IMC >= 25.0) && (IMC <= 29.9)){
            System.out.println("Levemente acima do peso");
        }

        if ((IMC >= 30.0) && (IMC <= 34.9)){
            System.out.println("Obesidade Grau I (Moderada)");
        }

        if ((IMC >= 35.0) && (IMC <= 39.9)){
            System.out.println("Obesidade Grau II (Severa)");
        }

        if (IMC >= 40.0){
            System.out.println("Obesidade Grau III (Mórbida)");
        }

        System.out.printf("O seu IMC é de %f", IMC);
    }
}
