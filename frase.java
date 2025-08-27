import java.util.Scanner;

public class frase {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String palavra;
        int qtd, letraCont = 0;
        char verif = 0;
        String palavraSemA = "", palavraComA = "", letra = "";

        System.out.println("exercicio String\n");

        System.out.println("Digite a palavra: ");
        palavra = scn.nextLine();
        qtd = palavra.length();
        System.out.println("Digite a letra que vai ser usada: ");
        letra = scn.nextLine();

        for (int i = 0; i < qtd; i++) {
            verif = palavra.charAt(i);
            if (verif == letra.toLowerCase().charAt(0)||verif == letra.toUpperCase().charAt(0)) {
                palavraSemA += " ";
                palavraComA += String.valueOf(palavra.charAt(i));
                letraCont++;
            } else {
                palavraSemA += String.valueOf(palavra.charAt(i));
                palavraComA += " ";
            }
        }

        System.out.println(palavraSemA);
        System.out.println(palavraComA);
        System.out.println("A palavra: " + palavra + " tem o total de: " + letraCont + " letras 'A'");
        scn.close();
    }
}