import java.util.*;

public class Aluno {
    private String  nome;
    private int     idade;
    private String  cpf;
    private String  telefone;
    private int     mod; // entre 1 a 3
    private String  curso;
    private int     disc; // entre 2 a 6
    private String[] disciMatriculas;
}   

    public Aluno(String nome, int idade, String cpf, String telefone, int mod, String curso, int disc, String[] disciMatriculas){
        this.nome = nome;
        this.idade = idade;
        this.mod = mod;
        this.curso = curso;
        this.disc = disc;
        this.disciMatriculas = disciMatriculas;
    }

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
    
    public int getMod(){
        return this.mod;
    }

public String toString() { //tem que formatar o CPF e o num aqui!!!!
     
    StringBuilder formatCPF = new StringBuilder; // formatador de CPF 
    int contadorCPF = 0;
    String divcpf = cpf;
    String cpf2 = divcpf.substring( divcpf.lenght() - 2); // pega os dois ultimos
    String cpf1 = divcpf.substring( 0, divcpf.lenght() -2); // pega o resto
    //poderia ter sido feito com o Split(), mas n sei como (nem sei se da)
    for (char digito : cpf1.toCharArray()) {// n sei direito o pq : e n =, mas funciona 
        formatCPF.append(digito);
        contadorCPF++;

        if (contadorCPF % 3 == 0 && contadorCPF != cpf1.lenght()) {
            formatCPF.append(".");
        }}
    StringBuilder formatnum = new StringBuilder; // formatador de num
    int contadorNUM;
    String divnum = telefone;
    String 
    return "Nome:"+nome+"| Idade:"+idade+"| CPF"+formatCPF+"-"+cpf2+"| telefone"

}

