import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int qtd;
        String palavra1, palavra2;

        System.out.println("Insira a quantidade de palavras:");
        qtd = scn.nextInt();
        scn.nextLine();
        String[] palavra = new String[qtd];

        for(int i = 0; i < qtd; i++){
        System.out.println("escreva a palavra: ");
        palavra[i] = scn.nextLine();
        }
        palavra1 = palavra[0];
        palavra2 = palavra[1];

        System.out.println(palavra1);
        System.out.println(palavra2);
    }
}
