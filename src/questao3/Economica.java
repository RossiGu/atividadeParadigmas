package questao3;

public class Economica extends Passagem{

    public Economica(Double valor, String horarioEmbarque, String data) {
        super(valor, horarioEmbarque, data);
    }

    @Override
    public String toString() {
        return "Economica{}";
    }
}
