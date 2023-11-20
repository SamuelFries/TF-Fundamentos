import java.util.Arrays;

public class CadastroEstudantes{

    Aluno[] estudantes;

    public CadastroEstudantes(){
        this.estudantes = new Aluno[10];
    }

    public void addEstudante(Aluno estudante){
        for(int i = 0; i<10; i++){
            if(this.estudantes[i] != null){
                this.estudantes[i] = estudante;
            }else{
                System.out.println("Nao foi possivel adicionar o aluno");
            }
        }
    }

    public void removerEstudante(String nome) {
        for (int i = 0; i < 10; i++) {
            //CadastroEstudantes Aluno = this.Aluno[i];
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
                //System.out.println(estudantes[i].getCurso());
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

    }

    public void tipoGradEstudantes(){
        Arrays.sort(this.estudantes);
        int pre = 0;
        int gradTec = 0;
        int esp = 0;

        for(int i=0; i<estudantes.length; i++){
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

        System.out.println("Matriculados em modalidade graduacao ");
        System.out.println();
        System.out.println();
    }

}
