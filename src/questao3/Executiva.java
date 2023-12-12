package questao3;

public class Executiva extends Passagem{

    private Double valorExecutiva;

    public Executiva(Double valor, String horarioEmbarque, String data, Double valorExecutiva) {
        super(valor, horarioEmbarque, data);
        this.valorExecutiva = valorExecutiva;
    }

    public void setValorExecutiva(Double valorAdicional) {
        this.valorExecutiva = valorAdicional;
    }

    public double valorPassagem() {
        return getValor() + this.valorExecutiva;
    }

    public void acessoRefeicao() {
        System.out.println("=====Refeição Disponível=====");
        System.out.println("Agua \n" +
                "Barra de Cereal \n" +
                "Biscoito");
    }

    @Override
    public String toString() {
        return "Executiva{" +
                "valor=" + getValor() +
                ", horarioEmbarque='" + getHorarioEmbarque() + '\'' +
                ", data='" + getData() + '\'' +
                ", valorExecutiva=" + valorExecutiva +
                '}';
    }
}
