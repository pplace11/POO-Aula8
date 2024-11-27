package aula8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        
    }
    public static void ficheiro(){
        try{
            Scanner fileScanner = new Scanner(new File("palavra.txt"));
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                System.out.println(line);
            }
            fileScanner.close();
        } catch(FileNotFoundException e){
            System.err.println("Erro na abertura do ficheiro.");
        }
    }
}
