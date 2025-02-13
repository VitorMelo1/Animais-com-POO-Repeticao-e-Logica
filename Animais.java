public class Animais {
    String nome;
    String raca;
    int idade;
    public Animais(String nome, String raca, int idade){
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
    }
    public void imprimir(){
        System.out.println("Nome: " + nome);
        System.out.println("Raça: " + raca);
        System.out.println("Idade: " + idade);
    }

}
