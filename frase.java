import java.util.Scanner;

public class frase {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String palavra;
        int qtd, letra = 0;
        char verif = 0;
        String palavraSemA = "", palavraComA = "";

        System.out.println("exercicio String\n");

        System.out.println("Digite a palavra: ");
        palavra = scn.nextLine().toLowerCase();
        qtd = palavra.length();

        for (int i = 0; i < qtd; i++) {
            verif = palavra.charAt(i);
            if (verif != 'a') {
                palavraSemA += String.valueOf(palavra.charAt(i));
                palavraSemA += " ";
            } else {
                palavraComA += String.valueOf(palavra.charAt(i));
                palavraComA += " ";
                letra++;
            }
        }

        System.out.println(palavraSemA);
        System.out.println(palavraComA);
        System.out.println("A palavra: " + palavra + " tem o total de: " + letra + " letras 'A'");
        scn.close();
    }
}