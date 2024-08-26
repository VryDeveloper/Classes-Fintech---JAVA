
public class Main {
    //PROJETO FINTECH - ViCInvest 26/08/2024 VictorRM558964
    public static void main(String[] args) {
        // Cria um objeto Login e Usuario.
        Login login = new Login("Victor Augusto", "RM558964");
        Usuario usuario = new Usuario("Victor Augusto", "victor.092.augusto@gmail.com", 5000.00, login);
        System.out.println(login.username);
        //Não retorna nada pois "password" é private (teste).
        //System.out.println(login.password);
        System.out.println(" ");

        // Simula o processo de login adicionando receita e registrando um gasto teste.
        if (login.autenticar("Victor Augusto", "RM558964")) {
            // Se a autenticação for bem-sucedida, permite que o usuário realize operações:
            usuario.adicionarReceita(200.00);
            usuario.registrarGasto(100.00);
            usuario.visualizarSaldo();


            System.out.println(" ");

            //Objeto Meta, teste dos metodos.
            MetaFinanceira meta = new MetaFinanceira("Estudos", 3000, 300, "01/09/2004");

            meta.acompanharProgresso();
            meta.atualizarMeta(300); //Valor Adicionado a valorTotal. e chama o metodo acompanharProgrsso atualizado.

            System.out.println(" ");

            //Objeto Investimento, teste dos metodos.
            Investimento investimento = new Investimento("Renda Fixa", 3250.53, 20.23);

            investimento.calcularInvestimento(200);
            investimento.adicionarRendimento(500);

            //Objeto Divida, teste dos metodos.
            Divida divida = new Divida("Santander: Consorcio", 20000, "20/06/2025");

            divida.exibirDetalhesDivida();
            divida.pagarDivida();

            // Criação do relatório final:
            Relatorio relatorio = new Relatorio();

            relatorio.gerarRelatorioFinanceiro(usuario);
            relatorio.gerarRelatorioInvestimentos(investimento);
            relatorio.gerarRelatorioMetas(meta);
            relatorio.gerarRelatorioDividas(divida);

        }
    }
}
