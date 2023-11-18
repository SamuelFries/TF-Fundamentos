public class CadastroEstudantes{

private CadastroEstudante[] Aluno;    

public Cadastro(){
    this.Aluno = new CadastroEstudantes[10];
}

public void addEstudante(int i, CadastroEstudantes[]){
    if(i>=0 && i<10){
       this.Aluno[i] = CadastroEstudantes[]; 
    }else{
        System.out.println("Nao eh possivel adicionar mais alunos no cadastro.")
    }
}

public void removeEstudante(int i, CadastroEstudantes[]){
    
}

