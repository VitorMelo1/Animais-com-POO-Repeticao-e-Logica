import java.util.Scanner;

public class AnimalMain {
    public static void main(String[] args) {
        Apresentacao apresentacao = new Apresentacao();
        int quantidade = apresentacao.obterQuantidade();

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < quantidade; i++) {
            boolean felino = false; 
            
            System.out.print("Digite o nome do animal: ");
            String nome = scanner.nextLine();
            System.out.print("Digite a raça do animal (Gato ou Cachorro): ");
            String raca = scanner.nextLine().toUpperCase();
            if (raca.equals("GATO")) {
                felino = true;
            }
            System.out.print("Digite a idade do animal: ");
            int idade = scanner.nextInt();
            scanner.nextLine();
            
            if (felino) {
                Animais gato = new Gato(nome, raca, idade);
                gato.imprimir();
                System.out.println("Seu gato " + nome + " está cadastrado!");
            } else {
                Animais cachorro = new Cachorro(nome, raca, idade);
                cachorro.imprimir();
                System.out.println("Seu cachorro " + nome + " está cadastrado!");
            }
        }
        
        scanner.close();
    }
}
