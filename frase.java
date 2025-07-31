import java.util.Scanner;

public class frase {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);   
        String palavra;
        int qtd, letra = 0;
        char verif = 0;

        System.out.println("exercicio String\n");

        System.out.println("Digite a palavra: ");
        palavra = scn.next().toLowerCase();
        qtd = palavra.length();
        char[] texto = new char[qtd];

        for (int i = 0; i < qtd; i++) {
            verif = palavra.charAt(i);
            if (verif != 'a') {
                texto[i] = verif;
                
            }else if(verif == 'a'){
                letra++;
            }
        }

        System.out.println(texto);
        System.out.println("A palavra: " + palavra + " tem o total de: " + letra + " letras 'A'");
        scn.close();
    }
}