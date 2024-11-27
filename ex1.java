package aula8;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Diga a nota do aluno de 0a20: ");
        int nota = scanner.nextInt();

        switch (nota) {
            case 0, 1, 2, 3, 4, 5, 6, 7 ,8, 9:
                System.out.println("Insuficiente");
                break;
            case 10, 11, 12, 13:
                System.out.println("Suficiente");
                break;
            case 14, 15, 16, 17:
                System.out.println("Bom");
                break;
            case 18, 19, 20:
                System.out.println("Muito bom");
            default:
                System.out.println("Número invalido.");
        }
    }
}
