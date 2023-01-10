
public class Cliente {
    private String nome;
    private Double confiabilidade;

    public Cliente(String nome, Double confiabilidade) {
        this.nome = nome;
        this.confiabilidade = confiabilidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getConfiabilidade() {
        return confiabilidade;
    }

    public void setConfiabilidade(Double confiabilidade) {
        this.confiabilidade = confiabilidade;
    }

    public double calcularEmprestimo(Double valor) {
        return Banco.calcularEmprestimo(valor, this.confiabilidade);
    }
}
