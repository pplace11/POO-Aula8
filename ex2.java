package aula8;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Diga o primeiro valor: ");
        int n1 = scanner.nextInt();
        System.out.println("Diga o segundo valor: ");
        int n2 = scanner.nextInt();
        System.out.println("Diga a operação: ");
        String operacao = scanner.next();
        
        switch (operacao) {
            case "adicao":
                System.out.println(n1 + n2);
                break;
            case "subtracao":
                System.out.println(n1 - n2);
                break;
            case "mul":
                System.out.println(n1 * n2);
                break;
            case "div":
                System.out.println(n1 / n2);
                break;
            default:
                System.out.println("Operação invalida");
        }
}
}
