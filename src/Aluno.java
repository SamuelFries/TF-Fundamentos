import java.util.*;

public class Aluno {
    private String  nome;
    private int     idade;
    private String  cpf;
    private String  telefone;
    private int     mod; 
    private String  curso;
    private int     disc; 
    private String[] discMatriculadas;

    //CONSTRUTOR
    public Aluno(String nome, int idade, String cpf, String telefone, int mod, String curso, int disc, String[] discMatriculadas){
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.telefone = telefone;
        this.mod = mod;
        this.curso = curso;
        this.disc = disc;
        this.discMatriculadas = discMatriculadas;
    }

    //GET E SET
    public String getNome() {
        return nome;      
    }

    public void setNome (String nome){
        this.nome = nome; 
    }
    
    public int getIdade(){
        return idade;
    }
    
    public void setIdade(int idade){
        this.idade = idade; 
    }
    
    public String getCpf(){
        return cpf;
    }

    public void setCpf (String cpf){
        if (cpf.length() == 11){
        this.cpf = cpf; 
        } else {
            System.out.println("O CPF deve conter 11 digitos");
        }
    }
    
    public String getTelefone(){
        return telefone;
    }

    public int getMod(){
        return mod;
    }  

    public void setMod(int mod){
        this.mod = mod;
    }

    public String getCurso(){
        return curso;
    }

    public int getDisc(){
        return disc;
    }

    public void setDisc(int disc){
        this.disc = disc;
    }

    public String[] getDiscMatricus(){
        return discMatriculadas;
    }

    public void setDiscMatriculadas(String[] discMatriculadas) {
        this.discMatriculadas = discMatriculadas;
    }
    
    //MÉTODO toString PARA FORMATAR
    public String toString() {
        return "Nome: " + nome +
                "\nIdade: " + idade +
                "\nCPF: " + formatarCpf() +
                "\nTelefone: " + formatarTelefone() +
                "\nModalidade do Curso: " + obterMod() +
                "\nNome do Curso: " + curso +
                "\nQuantidade de Disciplinas: " + disc +
                "\nDisciplinas Matriculadas: " + Arrays.toString(discMatriculadas);
    }

    //MÉTODO PARA FORMATAR O CPF
    private String formatarCpf() {       
         return cpf.substring(0, 3) + "." + cpf.substring(3, 6) + "." + cpf.substring(6, 9) + "-" + cpf.substring(9,11);
    }  

    //MÉTODO PARA FORMATAR TELEFONE
    private String formatarTelefone() {
        return "(" + 
        telefone.substring(0, 3) + 
        ") " + 
        telefone.substring(3, 4) + 
        " " + 
        telefone.substring(4, 8) + 
        "-" + 
        telefone.substring(8,11);
    }

      // MÉTODO PARA OBTER MODALIDADE DO CURSO POR EXTENSO
      private String obterMod() {
        switch (mod) {
            case 1:
                return "Extensão";
            case 2:
                return "Graduação Tecnológica";
            case 3:
                return "Especialização";
            default:
                return "Tipo de curso inválido";
        }
    }
}
