package aula8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Menu:");
            System.out.println("1. Adicionar tarefas");
            System.out.println("2. Listar tarefas");
            System.out.println("3. Apagar todas as tarefas");
            System.out.println("4. Sair");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch(opcao){
                case 1:
                    adicionarTarefa(scanner);
                    break;
                case 2:
                    listarTarefa();
                    break;
                case 3:
                    apagarTarefas();
                    break;
                case 4:
                    System.out.println("Saindo....");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 4);
    }
    private static void adicionarTarefa(Scanner scanner){
        System.out.println("Digita o nome da tarefa: ");
        String tarefa = scanner.nextLine();
        
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("ficheiro.txt", true))){
            writer.write(tarefa);
            writer.newLine();
            System.out.println("Tarefa adicionada com sucesso.");
        } catch(IOException e){
            System.out.println("Erro ao adicionar a tarefa: " + e.getMessage());
        }
    }
    private static void listarTarefa(){
        try(BufferedReader reader = new BufferedReader(new FileReader("ficheiro.txt"))){
            String linha;
            System.out.println("Lista de Tarefa:");
            while((linha = reader.readLine()) != null){
                System.out.println("- " + linha);
            }
        } catch(FileNotFoundException e){
            System.out.println("O ficheiro de tarefa não existe.");
        } catch(IOException e){
            System.out.println("Erro ao ler as tarefa: " + e.getMessage());
        }
    }
    private static void apagarTarefas(){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("ficheiro.txt"))){
            System.out.println("Todas as tarefas from apagadas.");
        } catch(IOException e){
            System.out.println("Erro ao apagar as tarefas: " + e.getMessage());
        }
    }
}
