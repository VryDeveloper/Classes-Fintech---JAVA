public class Login {
    //PROJETO FINTECH - ViCInvest 26/08/2024 VictorRM558964
    //Atributos da class Login, username e password para simular a entrada de usuario.
    public String username;
    private String password;

    // Construtor
    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }

    //teste de logica. Com retorno true e falso.
    public boolean autenticar(String inputUsername, String inputPassword) {
        if (this.username.equals(inputUsername) && this.password.equals(inputPassword)) {
            System.out.println("Autenticação bem-sucedida para o usuário: " + username);
            return true;
        } else {
            System.out.println("Falha na autenticação.");
            return false;
        }
    }
}
