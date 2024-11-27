package aula8.escola;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class GestorAlunos {
    private static final String FICHEIRO_ALUNO = "alunos.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Menu:");
            System.out.println("1. Gravar aluno");
            System.out.println("2. Ler alunos");
            System.out.println("3. Apagar os alunos do ficheiro");
            System.out.println("4. Sair");
            System.out.println("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch(opcao){
                case 1:
                    gravarAluno(scanner);
                    break;
                case 2:
                    lerAluno();
                    break;
                case 3:
                    apagarAlunos();
                    break;
                case 4:
                    System.out.println("Saindo....");
                    break;
                default:
                    System.out.println("Opção inválida. Tenta novamente.");
            }
        } while (opcao != 4);
    }
    private static void gravarAluno(Scanner scanner){
        System.out.println("Digite o nome do aluno: ");
        String nome = scanner.nextLine();
        System.out.println("Digite o número do aluno: ");
        int numeroAluno = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite o curso do aluno: ");
        String curso = scanner.nextLine();

        Aluno aluno = new Aluno(nome, numeroAluno, curso);

        try(BufferedWriter writer = new BufferedWriter(new FileWriter("FICHEIRO_ALUNO", true ))){
            writer.write(aluno.toString());
            writer.newLine();
            System.out.println("Aluno gravado com sucesso.");
        } catch(IOException e){
            System.out.println("Erro ao gravar o aluno" + e.getMessage());
        }
    }
    private static void lerAluno(){
        try(BufferedReader reader = new BufferedReader(new FileReader("FICHEIRO_ALUNO"))){
            String linha;
            System.out.println("Lista de Alunos: ");
            while((linha = reader.readLine()) != null){
                System.out.println(linha);
            }
        } catch(FileNotFoundException e){
            System.out.println("O ficheiro de aluno não existe.");
        } catch(IOException e){
            System.out.println("Erro ao ler os alunos: " + e.getMessage());
        }
    }
    private static void apagarAlunos(){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("FICHEIRO_ALUNO"))){
            System.out.println("Todos os alunos foram apagados.");
        } catch(IOException e){
            System.out.println("Erro ao apagar os alunos: " + e.getMessage());
        }
    }
}
