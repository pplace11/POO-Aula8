package aula8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        println();
    }
    public static void println(){
        try{
            PrintWriter printWriter = new PrintWriter(new File("frases.txt"));
            Scanner scanner = new Scanner(System.in);
            
            while (true) {
                System.out.println("Diga uma frase: ");
                String frase1 = scanner.nextLine();
                if (frase1.isEmpty())
                    break;
                printWriter.print(frase1);
            }
            printWriter.close();
        }catch(FileNotFoundException e){
            System.err.println("Erro na criaçao.");
        }
    }
}
