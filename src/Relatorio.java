public class Relatorio {

    public void gerarRelatorioFinanceiro(Usuario usuario) {
        System.out.println("=== Relatório Financeiro ===");
        System.out.println("Usuário: " + usuario.nome);
        System.out.println("Email: " + usuario.email);
        System.out.println("Saldo Atual: " + usuario.saldo);
        System.out.println("============================");
    }

    public void gerarRelatorioInvestimentos(Investimento investimento) {
        System.out.println("=== Relatório de Investimentos ===");
        System.out.println("Tipo de Investimento: " + investimento.tipo);
        System.out.println("Valor Investido: " + investimento.valorInvestido);
        System.out.println("Rendimento Atual: " + investimento.rendimento);
        System.out.println("=================================");
    }

    public void gerarRelatorioMetas(MetaFinanceira meta) {
        System.out.println("=== Relatório de Metas Financeiras ===");
        System.out.println("Meta: " + meta.descricao);
        System.out.println("Valor Objetivo: " + meta.valorObjetivo);
        System.out.println("Valor Atual: " + meta.valorAtual);
        System.out.println("Prazo: " + meta.prazo);
        System.out.println("====================================");
    }

    public void gerarRelatorioDividas(Divida divida) {
        System.out.println("=== Relatório de Dívidas ===");
        System.out.println("Credor: " + divida.credor);
        System.out.println("Valor da Dívida: " + divida.valor);
        System.out.println("Data de Vencimento: " + divida.dataVencimento);
        System.out.println("==================================");
    }
}
