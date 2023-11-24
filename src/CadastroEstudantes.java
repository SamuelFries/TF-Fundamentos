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
            if (this.estudantes[i] != null && this.estudantes[i].getNome().toLowerCase().equals(nome.toLowerCase())) {
                this.estudantes[i] = null;
                System.out.println("Estudante removido: " + nome);
                return; // Se encontrou e removeu o item, pode sair do loop
            }else if(i==9){
                System.out.println("Estudante nao encontrado: " + nome);
            }
        }
    }

    public void escreveVetor(){
        for(int i=0; i<this.estudantes.length; i++){
            if(this.estudantes[i] != null){
                System.out.println(this.estudantes[i].toString()+"\n");
            }
        }
    }

    public void ordemEstudantes(){
        for(int i=0; i<estudantes.length-1; i++){
            for(int j=0; j<estudantes.length-1; j++){
                if(estudantes[i]!= null && estudantes[j] != null){
                    if(comparacao(estudantes[i].getNome().toLowerCase(), estudantes[j].getNome().toLowerCase())){
                        Aluno aux = estudantes[i];
                        estudantes[i] = estudantes[j];
                        estudantes [j] = aux;
                    }
                }
            }    
        }
        escreveVetor();
    }

    public boolean comparacao(String palavra1, String palavra2){
        if(palavra1.charAt(0)<palavra2.charAt(0)){
            return true;
        }return false;
    }

    public void mediaIdadeEstudantes(){
        double somaIdades = 0;
        int i = 0;
        int alunosComparados = 0;

        for(i=0; i<this.estudantes.length; i++){
            if(this.estudantes[i] != null){
                somaIdades += this.estudantes[i].getIdade();
                alunosComparados++;
            }
        }

        System.out.println(somaIdades/alunosComparados);
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
            }else if(i==10){
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
        int pre = 0;
        int gradTec = 0;
        int esp = 0;
        int i=0;
        int alunosComparados = 0;
        
        for(i=0; i<estudantes.length; i++){
            if(this.estudantes[i] != null){
                alunosComparados++;
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
            }else if(i==10){
                System.out.println("Nao existe alunos matriculados.");
            }
        }
    
        System.out.println("Matriculados em modalidade graduacao "+((pre*100/alunosComparados))+"%.");
        System.out.println("Matriculados em modalidade graduacao técnologica "+((gradTec*100/alunosComparados))+"%.");
        System.out.println("Matriculados em modalidade especializacao "+((esp*100/alunosComparados))+"%.");
    }

    public String[] geraVetorDisciplinas(Scanner in, int quantidadeDisciplinas){
        String[] disciplinas = new String[quantidadeDisciplinas];
        
        for(int i = 0; i<quantidadeDisciplinas; i++){
            String disc = in.next();
            disciplinas[i] = disc;
        }

        return disciplinas;
    }

}
