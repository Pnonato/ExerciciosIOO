public class App {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Pedro", "Rua 5", "Shopping loja 4");

        // Modificar os dados da pessoa
        pessoa.modificarDados("João", "Avenida Principal", "Escritório 2");

        // Imprimir os dados da pessoa
        System.out.println(pessoa);
    }
}