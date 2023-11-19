public class CadastroEstudantes{

Aluno[] estudantes;

public CadastroEstudantes(){
    this.estudantes = new Aluno[10];
}

public void addEstudante(int i, CadastroEstudantes estudantes){
    if(i>=0 && i<10){
       this.Aluno[i] = estudantes; 
    }else{
        System.out.println("Nao eh possivel adicionar mais alunos no cadastro.")
    }
}

public void removerEstudante(String nome) {
        for (int i = 0; i < 10; i++) {
            CadastroEstudantes Aluno = this.Aluno[i];
            if (Aluno != null && Aluno.getNome().equals(nome)) {
                this.estudantes[i] = null;
                System.out.println("Estudante removido: " + nome);
                return; // Se encontrou e removeu o item, pode sair do loop
            }else{
                System.out.println("Estudante nao encontrado: " + nome);
        }
        }
    }

public void escreveVetor(CadastroEstudantes[] estudantes){
    for(int i=0; i<estudantes.length; i++){
        if(estudantes[i] != null){
            System.out.println(estudantes[i].toString());
        }
    }
}

public void ordemEstudantes(CadastroEstudantes[] estudantes){
    Arrays.sort(CadastroEstudantes[]);
    for(int i=0; i<estudantes.length; i++){
        if(estudantes[i] != null){
            System.out.println(estudante.getNome(i));
            System.out.println(estudante.getCurso(i));
        }
        
    }
}

public static mediaIdadeEstudantes(CadastroEstudantes[] estudantes){
    Arrays.sort(CadastroEstudantes[]);
    double a = 0;
    for(int i=0; i<estudantes.length; i++){
        if(estudantes[i] != null){
            a = estudante.getIdade(i);
            return a = a + i;
        }else{
                break;
             }
    }
    double b = a/i;
    System.out.println(b)
}

public void vogaisEstudantes{

}

public tipoGradEstudantes(CadastroEstudantes[] estudantes){
    for(int i=0; i<estudantes.length; i++){
        if(estudante.getMod.equals(presencial)){
            //colocar algo que armazene a quantidade de vezes que o if for executado
        }else{
            if(estudante.getMod.equals(graduacaotecnologica)){
                //colocar algo que armazene a quantidade de vezes que o if for executado
            }else{
                if(estudante.getMod.equals(especializacao)){
                    //colocar algo que armazene a quantidade de vezes que o if for executado
                }
            }
        }
        
    }
}

}
