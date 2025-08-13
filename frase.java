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
        palavra = scn.nextLine();
        qtd = palavra.length();

        for (int i = 0; i < qtd; i++) {
            verif = palavra.charAt(i);
            if (verif != 'a' && verif != 'A') {
                palavraSemA += String.valueOf(palavra.charAt(i));
                palavraComA += " ";
            } else if (verif == 'a') {
                palavraSemA += " ";
                palavraComA += String.valueOf(palavra.charAt(i));
                letra++;
            } else if (verif == 'A') {
                palavraSemA += " ";
                palavraComA += String.valueOf(palavra.charAt(i));
                letra++;
            } else {
                System.out.println("Thiago é tchola");
            }
        }

        System.out.println(palavraSemA);
        System.out.println(palavraComA);
        System.out.println("A palavra: " + palavra + " tem o total de: " + letra + " letras 'A'");
        scn.close();
    }
}