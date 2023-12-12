package questao2;

public class Vendedor extends Empregado{

    private Double percentualComissao;

    public Vendedor(String nome, Double salario, Double percentualComissao) {
        super(nome, salario);
        this.percentualComissao = percentualComissao;
    }

    public double calcularSalario() {
        return salario + (salario * percentualComissao/100);
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "percentualComissao=" + percentualComissao +
                ", salario=" + salario +
                '}';
    }
}
