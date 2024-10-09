package main;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Scanner scanner = new Scanner;
        int a, b, c;

        System.out.println("Vamos Somar!");
        System.out.println("Digite o numero 1: "\n);

        a = scanner.nextLine();

        System.out.println("Digite o numero 2: "\n);

        b = scanner.nextLine();

        c = a + b;

        System.out.println("A soma é : " + c);

    }
}
