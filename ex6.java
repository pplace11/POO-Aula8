package aula8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a palavra que deseja procurar: ");
        String palavraProcurada = scanner.nextLine();

        procurarPalavra(palavraProcurada, palavraProcurada);
    }
    public static void procurarPalavra(String ficheiro, String palavraProcurada){
        try(BufferedReader br = new BufferedReader(new FileReader("frases.txt"))){
            String linha;
            boolean encontrada = false;
            while((linha = br.readLine()) != null){
                if(linha.equals(palavraProcurada)){
                    encontrada = true;
                    break;
                }
            }
            if(encontrada){
                System.out.println("A palavra '" + palavraProcurada + "' foi encontrada.");
            }else{
                System.out.println("A palavra '" + palavraProcurada + "não foi encontrada.");
            }
        } catch(IOException e){
            System.out.println("Ocorreu um erro ao ler o ficheiro: " + e.getMessage());
        }
    }
}
