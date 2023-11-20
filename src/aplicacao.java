public class Aplicacao {
    static CadastroEstudantes cadastro = new CadastroEstudantes();

    public static void main(String[] args) {
        cadastro.addEstudante(new Aluno(
        "Joao", 
        28, 
        "010.029.589-78", 
        "5199999999", 
        3, 
        "Ciencia da Computacao", 
        1, 
        null));
        
        cadastro.addEstudante(new Aluno(
        "Gabriel", 
        20, 
        "010.029.589-78", 
        "5199999999", 
        3, 
        "Ciencia da Computacao", 
        1, 
        null));

        cadastro.addEstudante(new Aluno(
        "Neri", 
        28, 
        "010.029.589-78", 
        "5199999999", 
        3, 
        "Ciencia da Computacao", 
        1, 
        null));

        cadastro.escreveVetor();
        cadastro.ordemEstudantes();
        cadastro.escreveVetor();
        System.out.println(" Proximo metodo: ");
        cadastro.vogaisEstudantes();

    }
}