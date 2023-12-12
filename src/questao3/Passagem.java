package questao3;

public class Passagem {

    private Double valor;
    private String horarioEmbarque;
    private String data;

    public Passagem(Double valor, String horarioEmbarque, String data) {
        this.valor = valor;
        this.horarioEmbarque = horarioEmbarque;
        this.data = data;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getHorarioEmbarque() {
        return horarioEmbarque;
    }

    public void setHorarioEmbarque(String horarioEmbarque) {
        this.horarioEmbarque = horarioEmbarque;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
