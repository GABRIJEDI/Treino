import java.util.Scanner;

public class frase {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String palavra;
        int letraCont = 0;
        String palavraSemLetra = "", palavraComLetra = "", letra = "";

        System.out.println("exercicio String\n");

        System.out.println("Digite a palavra: ");
        palavra = scn.nextLine();
        System.out.println("Digite a letra que vai ser usada: ");
        letra = scn.nextLine();

        for (int i = 0; i < palavra.length(); i++) {
            char verif = palavra.charAt(i);
            if (verif == letra.toLowerCase().charAt(0) || verif == letra.toUpperCase().charAt(0)) {
                palavraSemLetra += " ";
                palavraComLetra += String.valueOf(palavra.charAt(i));
                letraCont++;
            } else {
                palavraSemLetra += String.valueOf(palavra.charAt(i));
                palavraComLetra += " ";
            }
        }

        System.out.println(palavraSemLetra);
        System.out.println(palavraComLetra);
        System.out.println("A palavra: " + palavra + " tem o total de: " + letraCont + " letras " + letra);
        scn.close();
    }
}