package aula8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        System.out.println(contagem());
    }
    public static int contagem(){
        int contador = 0;
        try{
            Scanner fileScanner = new Scanner(new File("frases.txt"));
            while (fileScanner.hasNextLine()) {
                System.out.println(fileScanner.nextLine());
                contador++;
            }
            fileScanner.close();
        } catch(FileNotFoundException e){
            System.err.println("Erro na abertura do ficheiro.");
        }
        return contador;
}
}
