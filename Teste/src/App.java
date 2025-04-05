import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o resultado da expressão (2 * 5) + (10 / 2)?");

        short resultado = 0;
        resultado = sc.nextShort();

        if (resultado ==  (2 * 5) + (10 / 2)){ //Aqui pode substituir (2 * 5) + (10 / 2) por 15 que seria a resposta
            System.out.println("Correto!");
        } else {
            System.out.println("Errado!");
        }

        sc.close();
    }
}
