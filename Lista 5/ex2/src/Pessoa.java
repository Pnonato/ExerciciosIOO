public class Pessoa {
    private String nome;
    private String endereco;
    private String enderecoComercial;

    public Pessoa(String nome, String endereco, String enderecoComercial) {
        if (nome != null && endereco != null && enderecoComercial != null) {
            this.nome = nome;
            this.endereco = endereco;
            this.enderecoComercial = enderecoComercial;
        } else {
            throw new IllegalArgumentException("Nome e endereços não podem ser nulos");
        }
    }

    public void modificarDados(String nome, String endereco, String enderecoComercial) {
        if (nome != null && endereco != null && enderecoComercial != null) {
            this.nome = nome;
            this.endereco = endereco;
            this.enderecoComercial = enderecoComercial;
        } else {
            throw new IllegalArgumentException("Nome e endereços não podem ser nulos");
        }
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "; Endereço residencial: " + endereco + "; Endereço comercial: " + enderecoComercial;
    }
}