import java.util.Scanner;

public class par{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double num, verif;

        System.out.println("Exercicio par\n");
        System.out.println("Insira o numero para conferir se é par");
        num = scn.nextDouble();

        verif = num %2;

        if(verif == 0){
            System.out.println("O valor:"+num+" é par!");
        } else{
            System.out.println("O valor:"+num+" é impar!");
        }
        scn.close();
    }
}