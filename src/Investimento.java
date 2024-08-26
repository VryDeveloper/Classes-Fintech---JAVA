public class Investimento {
    //Atributos da classe investimento, investimentos, valorInvestido, rendimento.
    public String tipo;//tipo para lembrar investimento: açõe, renda fixa, fundos etc...
    public double valorInvestido;
    public double rendimento;


    //Construtor
    public Investimento(String tipo, double valorInvestido, double rendimento){
        this.tipo = tipo;
        this.valorInvestido = valorInvestido;
        this.rendimento = rendimento;
    }

    //Metodos da classe investimento;
    public void calcularInvestimento(double valor){
        System.out.println("Rendimento calculado para " + tipo);
    }
    public void adicionarRendimento(double valor){
        System.out.println("Investimento de " +valor+ " adicionado ao "+tipo);
    }
}
