package questao2;

public class Teste {
    public static void main(String[] args) {
        Empregado empregado = new Empregado("Gustavo", 2000.0);
        System.out.println(empregado);

        Empregado vendedor = new Vendedor("Joao", 3000.0, 10.0);
        System.out.println(vendedor);

        Empregado gerente = new Gerente("Gustavo", 2000.0, "Gerencia");
        System.out.println(gerente);
    }
}
