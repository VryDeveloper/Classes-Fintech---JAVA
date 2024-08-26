public class Divida {
    public String credor;
    public double valor;
    public String dataVencimento;

    //Contrutor
    public Divida(String credor, double valor, String dataVencimento){
        this.credor = credor;
        this.valor = valor;
        this.dataVencimento = dataVencimento;
    }

    //Metodos
    public void pagarDivida(){
        System.out.println("Divida com "+credor+ " no valor de "+ valor +" com vencimento em " + dataVencimento +
                " paga com sucesso!");
    }
    public void exibirDetalhesDivida(){
        System.out.println("Divida com "+credor+" de " + valor + " vencendo em " + dataVencimento);
    }
}
