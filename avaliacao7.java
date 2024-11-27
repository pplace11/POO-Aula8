package aula8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class avaliacao7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        
        do {
            System.out.println("Menu:");
            System.out.println("1. Criar ficheiro com número");
            System.out.println("2. Contar número de ocorrências");
            System.out.println("3. Limpar ficheiro");
            System.out.println("4. Sair");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch(opcao){
                case 1:
                    criarFicheiroComNumeros();
                    break;
                case 2:
                    contarOcorrencias(scanner);
                    break;
                case 3:
                    limparFicheiro();
                    break;
                case 4:
                    System.out.println("Saindo....");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 4);
    }
    private static void criarFicheiroComNumeros(){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("numeros.txt", true))){
            Random random = new Random();
            for(int i=0; i<100; i++){
                int numero = random.nextInt(50) + 1;
                writer.write(String.valueOf(numero));
                writer.newLine();
            }
            System.out.println("Ficheiro criado com 100 número aleatorio.");
        } catch(IOException e){
            System.out.println("Erro ao criar o ficheiro:" + e.getMessage());
        }
    }
    
    private static void contarOcorrencias(Scanner scanner){
        System.out.println("Digite o número a ser procurado: ");
        int numeroProcurado = scanner.nextInt();
        int contador = 0;

        try(BufferedReader reader = new BufferedReader(new FileReader("numero.txt"))){
            String linha;
            while ((linha = reader.readLine()) != null){
                if(Integer.parseInt(linha) == numeroProcurado){
                    contador++;
                }
            }
            System.out.println("O número " + numeroProcurado + " aparece " + contador + " vezes no ficheiro.");
        } catch(FileNotFoundException e){
            System.out.println("O ficheiro não existe.");
        } catch(IOException e){
            System.out.println("Erro ao ler o ficheiro: " + e.getMessage());
        }
    }
    
    private static void limparFicheiro(){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("numero.txt"))){
            System.out.println("Ficheiro limpo com sucesso.");
        } catch(IOException e){
            System.out.println("Erro ao limpar o ficheiro: " + e.getMessage());
        }
    }
}
