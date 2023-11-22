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
        "20505361434", 
        "051927099195", 
        1, 
        "Ciencia da Computacao", 
        3, 
        null));
        
        cadastro.addEstudante(new Aluno(
        "Gabriel", 
        20, 
        "38116643959", 
        "051921337891", 
        3, 
        "Ciencia da Computacao", 
        2, 
        null));

        cadastro.addEstudante(new Aluno(
        "Neri", 
        28, 
        "78743311849", 
        "051929226357", 
        2, 
        "Ciencia da Computacao", 
        4, 
        null));

        do{
            System.out.println("\nBem vindo ao aplicativo do Portal Educacional!");
            System.out.println("O que deseja fazer?");
            System.out.println("1 - Adicionar Estudante;");
            System.out.println("2 - Remover Estudante;");
            System.out.println("3 - Verificar informações dos Estudantes;");
            System.out.println("4 - Estudante em ordem alfabética;");
            System.out.println("5 - Media de Idade dos Estudante;");
            System.out.println("6 - Nome do Estudante com maior numero de vogais;");
            System.out.println("7 - Porcentagem de Estudantes por Curso;");
            System.out.println("8 - Sair do Aplicativo.");
            escolha = in2.nextInt() ;
            int idade=0;
            String cpf = "";
            String telefone = "";
            int mod = 0;
            int disc =0;

            switch (escolha) {
                case 1:
                    
                    System.out.println("\nDigite o nome do Estudante a ser adicionado:");
                    String nome = in.next();
                    
                    do{
                    System.out.println("\nDigite a idade do Estudante:");
                    idade = in2.nextInt();
                        if(idade>150){
                            System.out.println("Revise sua Idade.");
                        }
                    }while(idade>150);

                    do{
                    System.out.println("\nDigite o cpf do Estudante:");
                    System.out.println("Utilize apenas números.");
                    cpf = in.next();
                        if(cpf.length()<1 || cpf.length()>11){
                            System.out.println("Revise seu CPF, ele deve conter 11 numeros.");
                        }
                    }while(cpf.length()<1 || cpf.length()>11);

                    do{
                    System.out.println("\nDigite o telefone do Estudante:");
                    System.out.println("Utilize apenas números e coloque o seu DDD.");
                    telefone = in2.next();
                        if(telefone.length()<1 || telefone.length()>12){
                            System.out.println("Revise seu Numero de telefone, ele deve conter 12 digitos. Exemplo: 051995678234");
                        }
                    }while(telefone.length()<1 || telefone.length()>12);    

                    do{
                    System.out.println("\nDigite a modalidade do curso do Estudante:");
                    System.out.println("1- Extensão");
                    System.out.println("2- Graduação Tecnológica");
                    System.out.println("3- Especialização");
                    mod = in2.nextInt();
                    }while(mod!=1 && mod!=2 && mod!=3);

                    System.out.println("\nDigite o curso do Estudante:");
                    String curso = in.next();

                    do{
                    System.out.println("\nDigite o numero de disciplinas do Estudante:");
                    disc = in2.nextInt();
                        if(disc<2 || disc >6){
                            System.out.println("Revise! Minimo de disciplinas = 2. Maximo de disciplinas = 6.");
                        }
                    }while(disc < 2 || disc > 6);

                    System.out.println("\nDigite o nome das disciplinas do Estudante:");
                    String discMatriculadas = in.next();

                    Aluno estudante = new Aluno(nome, idade, cpf, telefone, mod, curso, disc, new String[disc]);

                    cadastro.addEstudante(estudante);
                    
                    break;
            
                case 2:
                
                    System.out.println("Digite o nome do Estudante a ser removido:");
                    String aluno = in.next();
                    cadastro.removerEstudante(aluno);
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
                    System.out.println("Opção Inválida.");
                    break;
            }

        }while(escolha != 8);
        System.out.println("Obrigado por ter utilizado a aplicação, até uma próxima!");
    }
}
