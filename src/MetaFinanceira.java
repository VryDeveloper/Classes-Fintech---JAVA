public class MetaFinanceira {
    //Atributos da classe metafinanceira
    public String descricao; //Nome da meta - Objetivo da meta etc...
    public double valorObjetivo;
    public double valorAtual;
    public String prazo;

    //Contrutor
    public MetaFinanceira(String descricao, double valorObjetivo, double valorAtual, String prazo) {
        this.descricao = descricao;
        this.valorObjetivo = valorObjetivo;
        this.valorAtual = valorAtual;
        this.prazo = prazo;
    }




    //Metodos, acompanharProgresso, atualizarMeta.
    public void acompanharProgresso(){
        System.out.println("Progresso da meta: " +descricao+ " - " +(valorAtual/valorObjetivo * 100) + "% Concluído.");
                //Fazendo um calculo de percentual para conclusão.;
    }
    public void atualizarMeta(double valor){
        System.out.println("Meta " +descricao+ " atualizada com valor: " +valor);
        valorAtual = valorAtual+valor;
        acompanharProgresso();
    }
}
