import java.util.Scanner;

public class frase {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int letraCont = 0, palavraQTD = 0, stringCont = 0;;
        String palavraSemLetra = "", palavraComLetra = "", letra = "", palavra = "";

 
        System.out.println("exercicio String\n");

        System.out.println("Digite o numero de palavras que voce vai usar: ");
        palavraQTD = scn.nextInt();
        scn.nextLine();
        char[] palavras = new char[palavraQTD];

        do
        System.out.println("Vamos digitar as palavras: ");
        for(int i = 0; i < palavras.length; i++){
            System.out.println("Insira a palavra: ");
            palavras[i] = scn.nextLine();
            stringCont++;
        }
        while(int teste < palavraQTD);

        System.out.println("Qual a letra para ser isolada?");
        letra = scn.nextLine();

        System.out.println(stringCont);
          for (int i = 0; i < stringCont; i++) {
            char verif = palavras[i].charAt(i);
            if (Character.toLowerCase(verif) == letra.toLowerCase().charAt(0)) {
                palavraSemLetra += " ";
                palavraComLetra += String.valueOf(palavras[i].charAt(i));
                letraCont++;
            } else {
                palavraSemLetra += String.valueOf(palavras[i].charAt(i));
                palavraComLetra += " ";
            }
        }

        System.out.println(palavraSemLetra);
        System.out.println(palavraComLetra);
        scn.close();
    }
}