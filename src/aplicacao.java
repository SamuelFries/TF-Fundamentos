import java.util.*;

import javax.sound.sampled.SourceDataLine;

public class Aplicacao {
    static CadastroEstudantes cadastro = new CadastroEstudantes();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);//utilizado para tipo String
        Scanner in2= new Scanner(System.in);//utilizado para tipo Int
        CadastroEstudantes registro = new CadastroEstudantes();
        int escolha = 0;
        cadastro.addEstudante(new Aluno(
        "Joao", 
        28, 
        "01002958978", 
        "51998506723", 
        3, 
        "Ciencia da Computacao", 
        1, 
        null));
        
        cadastro.addEstudante(new Aluno(
        "Gabriel", 
        20, 
        "01002958978", 
        "5199999999", 
        3, 
        "Ciencia da Computacao", 
        1, 
        null));

        cadastro.addEstudante(new Aluno(
        "Neri", 
        28, 
        "01002958978", 
        "5199999999", 
        3, 
        "Ciencia da Computacao", 
        1, 
        null));

        do{
        System.out.println("Bem vindo ao aplicativo do Portal Educacional!");
        System.out.println("O que deseja fazer?");
        System.out.println("1 - Adicionar Estudante;");
        System.out.println("2 - Remover Estudante;");
        System.out.println("3 - Verificar informações dos Estudantes;");
        System.out.println("4 - Estudante em ordem alfabética;");
        System.out.println("5 - Media de Idade dos Estudante;");
        System.out.println("6 - Nome do Estudante com maior numero de vogais;");
        System.out.println("7 - Porcentagem de Estudantes por Curso;");
        System.out.println("8 - Sair do Aplicativo.");
        escolha = in.nextInt() ;
        
        do{
        switch (escolha) {
            case 1:
            
                System.out.println("Digite o nome do Estudante a ser adicionado:");
                String nome = in.nextLine();
                
                System.out.println("Digite a idade do Estudante:");
                int idade = in2.nextInt();

                System.out.println("Digite o cpf do Estudante:");
                String cpf = in.nextLine();

                System.out.println("Digite o telefone do Estudante:");
                String telefone = in2.nextLine();

                System.out.println("Digite a modalidade do curso do Estudante:");
                int mod = in2.nextInt();
                
                System.out.println("Digite o curso do Estudante:");
                String curso = in.nextLine();

                System.out.println("Digite o numero de disciplinas do Estudante:");
                int disc = in2.nextInt();
                
                System.out.println("Digite o nome das disciplinas do Estudante:");
                String discMatriculadas = in.nextLine();

                Aluno estudante = new Aluno(nome, idade, cpf, telefone, mod, curso, disc, discMatriculadas);

                cadastro.addEstudante(estudante);
                
                break;
        
            case 2:
            
                System.out.println("Digite o nome do Estudante a ser removido:");

                break;

            case 3:

                cadastro.escreveVetor();

                break;

            case 4:

                cadastro.ordemEstudantes();

                break;

            case 5:

                cadastro.mediaIdadeEstudantes();

                break;

            case 6:

                cadastro.vogaisEstudantes();

            break;

            case 7:

                cadastro.tipoGradEstudantes();

            break;
            
            default:

            break;
        }
        }while(escolha != 8);
         Aluno estudante = new Aluno ();

        private static void adicionarAluno (Scanner in, Scanner in2, CadastroEstudantes registro ) { 
        

        }
        System.out.println("Obrigado por ter utilizado a aplicação, até uma próxima!");
    }
}
