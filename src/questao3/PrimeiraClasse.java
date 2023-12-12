package questao3;

public class PrimeiraClasse extends Passagem{

    private Double valorPrimeiraClasse;


    public PrimeiraClasse(Double valor, String horarioEmbarque, String data, Double  valorPrimeiraClasse) {
        super(valor, horarioEmbarque, data);
        this.valorPrimeiraClasse = valorPrimeiraClasse;
    }

    public Double getValorPrimeiraClasse() {
        return valorPrimeiraClasse;
    }

    public void setValorPrimeiraClasse(Double valorPrimeiraClasse) {
        this.valorPrimeiraClasse = valorPrimeiraClasse;
    }

    public double valorPassagem() {
        return getValor() + this.valorPrimeiraClasse;
    }

    public void acessoRefeicao() {
        System.out.println("=====Refeição Disponível=====");
        System.out.println("Agua \n" +
                "Barra de Cereal \n" +
                "Biscoito \n" +
                "Bife à Parmegiana \n" +
                "Batata assada");
    }

    @Override
    public String toString() {
        return "PrimeiraClasse{" +
                "valor=" + getValor() +
                ", horarioEmbarque='" + getHorarioEmbarque() + '\'' +
                ", data='" + getData() + '\'' +
                ", valorPrimeiraClasse=" + valorPrimeiraClasse +
                '}';
    }
}
