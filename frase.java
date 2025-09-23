import java.util.Scanner;

public class frase {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int letraCont = 0, palavraQTD = 0;
        String palavraSemLetra = "", palavraComLetra = "", letra = "";

        System.out.println("exercicio String\n");

        System.out.println("Digite o numero de palavras que voce vai usar: ");
        palavraQTD = scn.nextInt();
        scn.nextLine();
        String[] palavrasVetor = new String[palavraQTD];

        System.out.println("Vamos digitar as palavras: ");
        for (int i = 0; i < palavraQTD; i++) {
            System.out.println("Insira a palavra: ");
            palavrasVetor[i] = scn.nextLine();
        }

        System.out.println("Qual a letra para ser isolada?");
        letra = scn.nextLine();

        for (int i = 0; i < palavraQTD; i++) {
            String palavraVerif = palavrasVetor[i];
            for (int j = 0; j < palavraVerif.length(); j++) {
                char verif = palavraVerif.charAt(j);
                if (Character.toLowerCase(verif) == letra.toLowerCase().charAt(0)) {
                    palavraSemLetra += " ";
                    palavraComLetra += String.valueOf(palavraVerif.charAt(j));
                    letraCont++;
                } else {
                    palavraSemLetra += String.valueOf(palavraVerif.charAt(j));
                    palavraComLetra += " ";
                }
            }
            palavraComLetra += "\n";
            palavraSemLetra += "\n";
        }

        System.out.println(palavraSemLetra);
        System.out.println(palavraComLetra);
        scn.close();
    }
}