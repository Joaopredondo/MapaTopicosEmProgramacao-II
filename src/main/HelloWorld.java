package main;
import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Olá, Mundo!");
        
        saudacaoPersonalizada();
    }

    public static void saudacaoPersonalizada() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        
        System.out.println("Bem-vindo ao Java, " + nome + "!");
        
        scanner.close();
    }
}