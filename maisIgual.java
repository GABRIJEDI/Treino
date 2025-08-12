import java.util.Scanner;

public class maisIgual {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String letra, letra2, soma;

        System.out.println("Insira o primeiro char:");
        letra = scn.nextLine();
        System.out.println("Insira o segundo char");
        letra2 = scn.nextLine();

        soma = letra += letra2;

        System.out.println(soma);
    }
}
