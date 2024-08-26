public class Usuario {
    //PROJETO FINTECH - ViCInvest 26/08/2024 VictorRM558964.
    //Atributos da class usuario, nome, email e o saldo.
    public String nome;
    public String email;
    public double saldo;

    // O objeto Login associado ao usuario.
    private Login login;

    // Construtor
    public Usuario(String nome, String email, double saldoInicial, Login login) {
        this.nome = nome;
        this.email = email;
        this.saldo = saldoInicial;
        this.login = login;
    }

    //Metodos da classe usuario. adicionarReceita, registrarGasto, visualizarSaldo.
    public void adicionarReceita(double valor) {
        this.saldo += valor;
        System.out.println("Receita de " + valor + " adicionada ao saldo.");
    }

    public void registrarGasto(double valor) {
        this.saldo -= valor;
        System.out.println("Gasto de " + valor + " registrado.");
    }

    public void visualizarSaldo() {
        System.out.println("Saldo atual: " + saldo);
    }
}
