import java.util.Scanner;

public class Apresentacao {
    public int obterQuantidade() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seja bem-vindo ao cadastro de animais! \nQuantos animais deseja cadastrar?");
        int quantidade = scanner.nextInt();
        scanner.nextLine();

        return quantidade;
    }
}
