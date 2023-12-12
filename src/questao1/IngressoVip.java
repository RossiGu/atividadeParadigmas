package questao1;

public class IngressoVip extends Ingresso {

    private Double valorAdicional;

    public IngressoVip(Double valor, Double valorAdicional) {
        super(valor);
        this.valorAdicional = valorAdicional;
    }

    @Override
    public String toString() {
        return String.format("Ingresso VIP: ", getValor() + valorAdicional);
    }
}
