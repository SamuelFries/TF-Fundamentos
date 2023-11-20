import java.util.*;

public class CadastroEstudantes{

    Aluno[] estudantes;

    public CadastroEstudantes(){
        this.estudantes = new Aluno[10];
    }

    public void addEstudante(Aluno estudante){
        for(int i = 0; i<10; i++){
            if(this.estudantes[i] == null){
                this.estudantes[i] = estudante;
                return;
            }else{
                if(i==10){
                System.out.println("Nao foi possivel adicionar o aluno");
                }
            }
        }
    }

    public void removerEstudante(String nome) {
        for (int i = 0; i < 10; i++) {
            if (this.estudantes[i] != null && this.estudantes[i].getNome().equals(nome)) {
                this.estudantes[i] = null;
                System.out.println("Estudante removido: " + nome);
                return; // Se encontrou e removeu o item, pode sair do loop
            }else{
                System.out.println("Estudante nao encontrado: " + nome);
            }
        }
    }

    public void escreveVetor(){
        for(int i=0; i<this.estudantes.length; i++){
            if(this.estudantes[i] != null){
                System.out.println(this.estudantes[i].toString());
            }
        }
    }

    public void ordemEstudantes(){
        Arrays.sort(this.estudantes);
        for(int i=0; i<this.estudantes.length; i++){
            if(this.estudantes[i] != null){
                System.out.println(estudantes[i].getNome());
                System.out.println(estudantes[i].getCurso());
            }
        }
    }

    public void mediaIdadeEstudantes(){
        Arrays.sort(this.estudantes);
        double somaIdades = 0;
        int i = 0;

        for(i=0; i<this.estudantes.length; i++){
            if(this.estudantes[i] != null){
                somaIdades =+ this.estudantes[i].getIdade();
            }else{
                break;
            }
        }

        System.out.println(somaIdades/(i+1));
    }

    public void vogaisEstudantes(){
        String[] nomesVogais = new String[10];
        int vogaisAgora = 0;
        int vogaisAntes = 0;

        for(int i=0; i<this.estudantes.length; i++){
            if(this.estudantes[i] != null){
                String nome = this.estudantes[i].getNome();
                vogaisAgora = 0;
                for(int j=0; j<nome.length(); j++){
                    if(verificaVogais(nome.charAt(j))){
                        vogaisAgora++;
                    }
                }
                if(vogaisAgora>vogaisAntes){
                    vogaisAntes = vogaisAgora;
                    nomesVogais = new String[10];
                    nomesVogais[i] = nome;
                }else if(vogaisAgora==vogaisAntes){
                    vogaisAntes = vogaisAgora;
                    nomesVogais[i] = nome;
                }
            }else{
                System.out.println("Não ha estudantes cadastrados.");
            }    
        }
        for(int i=0; i<nomesVogais.length; i++){
            if(nomesVogais[i] != null){
                System.out.println(nomesVogais[i].toString());
            }
        }
    }

    public boolean verificaVogais(char vogal){//método para verificar vogais, usado para auxiliar o metodo vogaisEstudantes
        if (vogal=='a' || vogal=='e' || vogal=='i' || vogal=='o' || vogal=='u') {
            return true;
        }else{
            return false;
        }
    }

    public void tipoGradEstudantes(){
        Arrays.sort(this.estudantes);
        int pre = 0;
        int gradTec = 0;
        int esp = 0;
        int i=0;
        if(this.estudantes[0] != null){
        for(i=0; i<estudantes.length; i++){
            switch (this.estudantes[i].getMod()) {
                case 1:
                    pre++;
                    break;
                
                case 2:
                    gradTec++;
                    break;

                case 3:
                    esp++;
                    break;
            }
        }
    

        System.out.println("Matriculados em modalidade graduacao "+((pre/i)*100)+" porcento.");
        System.out.println("Matriculados em modalidade graduacao técnologica "+((gradTec/i)*100)+" porcento.");
        System.out.println("Matriculados em modalidade especializacao "+((esp/i)*100)+" porcento.");
        }else{
            System.out.println("Nao existe alunos matriculados.");
        }

    }

}
