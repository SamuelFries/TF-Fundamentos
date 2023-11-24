import java.util.*;

public class CadastroEstudantes{

    Aluno[] estudantes;

    public CadastroEstudantes(){
        this.estudantes = new Aluno[10];
    }

    public void addEstudante(Aluno estudante){
        for(int i = 0; i<10; i++){//passa por todos os indices do objeto
            if(this.estudantes[i] == null){//verifica se o indice ja esta preenchido
                this.estudantes[i] = estudante;
                return;
            }else{
                if(i==10){//se todos os indices do objeto aluno estiverem preenchidos, impossibilita adicionar mais alunos
                System.out.println("Nao foi possivel adicionar o aluno");
                }
            }
        }
    }

    public void removerEstudante(String aluno) {
        for (int i = 0; i < 10; i++) {
            if (this.estudantes[i] != null && this.estudantes[i].getNome().toLowerCase().equals(aluno.toLowerCase())) {//compara se no indice o nome é igual ao que é enviado pelo usuario, e se a posicao nao esta vazia
                this.estudantes[i] = null;//remove o estudante
                System.out.println("Estudante removido: " + aluno);
                return; // Se encontrou e removeu o item, pode sair do loop
            }else if(i==9){
                System.out.println("Estudante nao encontrado: " + aluno);//se percorrer o vetor até a posicao 9 e nao encontrar, informa que o Estudante nao foi encontrado
            }
        }
    }

    public void escreveVetor(){
        for(int i=0; i<this.estudantes.length; i++){
            if(this.estudantes[i] != null){//verifica se a posicao no vetor nao esta vazia, se estiver vazia passa para a proxima
                System.out.println(this.estudantes[i].toString()+"\n");//imprime o estudante 
            }
        }
    }

    public void ordemEstudantes(){
        for(int i=0; i<estudantes.length-1; i++){
            for(int j=0; j<estudantes.length-1; j++){
                if(estudantes[i]!= null && estudantes[j] != null){//compara se nos dois indices comparados existe algo escrito
                    if(comparacao(estudantes[i].getNome().toLowerCase(), estudantes[j].getNome().toLowerCase())){//compara os nomes nos vetores
                        Aluno aux = estudantes[i];//armazena o valor numa variavel auxiliar
                        estudantes[i] = estudantes[j];
                        estudantes [j] = aux;
                    }
                }
            }    
        }
        escreveVetor();
    }

    public boolean comparacao(String palavra1, String palavra2){//metodo usado para o método ordemEstudantes
        if(palavra1.charAt(0)<palavra2.charAt(0)){//compara a primeira letra de cada palavra para ordenar elas 
            return true;
        }return false;
    }

    public void mediaIdadeEstudantes(){
        double somaIdades = 0;
        int i = 0;
        int alunosComparados = 0;

        for(i=0; i<this.estudantes.length; i++){//percorre todo o objeto de alunos
            if(this.estudantes[i] != null){//se for diferente de null, executa abaixo
                somaIdades += this.estudantes[i].getIdade();//soma como um acumulador pegando a idade do estudante no vetor
                alunosComparados++;//soma no contador para depois ocorrer a divisao da maneira correta
            }
        }

        System.out.println("Média de idade dos estudantes "+somaIdades/alunosComparados);
    }

    public void vogaisEstudantes(){
        String[] nomesVogais = new String[10];
        int vogaisAgora = 0;
        int vogaisAntes = 0;

        for(int i=0; i<this.estudantes.length; i++){
            if(this.estudantes[i] != null){//verifica se a posicao no vetor nao esta vazia
                String nome = this.estudantes[i].getNome();//pega o nome do estudante no vetor
                vogaisAgora = 0;//declara as vogais agora como 0 para inciar
                for(int j=0; j<nome.length(); j++){
                    if(verificaVogais(nome.charAt(j))){//utiliza o metodo verificaVogais para ver quantas vogais tem no nome
                        vogaisAgora++;//cada vogal no nome, adiciona no acumulador
                    }
                }
                if(vogaisAgora>vogaisAntes){//compara os dois nomes
                    vogaisAntes = vogaisAgora;//atribui o valor de vogaisAgora para vogaisAntes pois é maior, segundo o "if" acima
                    nomesVogais = new String[10];//cria o objeto so com os nomes com maior numero de vogais
                    nomesVogais[i] = nome;//declara nome como o nome do objeto
                }else if(vogaisAgora==vogaisAntes){//compara os dois 
                    vogaisAntes = vogaisAgora;//se for igual atribui o vogais Agora para o vogaisAntes
                    nomesVogais[i] = nome;
                }
            }else if(i==9){//se chegar ao ultimo indice sem comparações, imprime que nao ha estudantes cadastrados
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
            if(this.estudantes[i] != null){//se for diferente de null a posicao, executa o "if"
                alunosComparados++;//se executar, soma 1 na quantidade de alunos que foram comparados
                switch (this.estudantes[i].getMod()) {//pega a modalidade 
                    case 1://se for 1, soma pre+1
                        pre++;
                        break;
                    
                    case 2://se for 2, soma gradTec+1
                        gradTec++;
                        break;

                    case 3://se for 3, soma esp+1
                        esp++;
                        break;
                }
            }else if(i==9){//se chegar ao final do indice sem comparacoes, imprime que nao ha alunos matriculados
                System.out.println("Nao existe alunos matriculados.");
            }
        }
    
        System.out.println("Matriculados em modalidade extensão "+((pre*100/alunosComparados))+"%.");//imprime a porcentagem de alunos matriculados em extensao
        System.out.println("Matriculados em modalidade graduacao técnologica "+((gradTec*100/alunosComparados))+"%.");//imprime a porcentagem de alunos matriculados em graduacao tecnologia
        System.out.println("Matriculados em modalidade especializacao "+((esp*100/alunosComparados))+"%.");//imprime a porcentagem de alunos matriculados em especializacao
    }

    public String[] geraVetorDisciplinas(Scanner in, int quantidadeDisciplinas){
        String[] disciplinas = new String[quantidadeDisciplinas];
        
        for(int i = 0; i<quantidadeDisciplinas; i++){//executa até o indice ser igual que a quantidade de disciplinas
            System.out.println("\nDigite o nome das disciplinas, uma de cada vez:");
            System.out.println("Coloque uma disciplina, e aperte ENTER para colocar a proxima");
            System.out.println("Não utilize espacos durante a colocacao das disciplinas.");
            String disc = in.next();//recebe a disciplina
            disciplinas[i] = disc;//armazena a disciplina no indice do objeto que foi criado 
        }

        return disciplinas;//retorna o objeto disciplinas com todas as disciplinas dentro
    }

}
