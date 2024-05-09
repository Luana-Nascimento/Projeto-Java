package eCommerce;

import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;
import eCommerce.controller.eCommerceController;
import eCommerce.model.Dados;

public class Opcoes {
	
    public static Scanner leia = new Scanner(System.in);
	public static eCommerceController armazenar = new eCommerceController();


    public static void main(String[] args) {
    	
        int opcao;
        
        while (true) {
            System.out.println("\n   REDE MAIS SAÚDE - TREINOS E AULAS FUNCIONAIS."   );
            System.out.println("                                                     ");
            System.out.println("                  OPÇÕES DISPONÍVEIS                 ");
            System.out.println("                                                     ");
            System.out.println("*****************************************************");
            System.out.println("                                                     ");
            System.out.println("            1 - Cadastrar Aluno                      ");
            System.out.println("            2 - Listar Todos os Alunos               ");
            System.out.println("            3 - Atualizar Cadastro do Aluno          ");
            System.out.println("            4 - Deletar Cadastro do Aluno            ");
            System.out.println("            5 - Sair                                 ");
            System.out.println("                                                     "); 
            System.out.println("*****************************************************");
            System.out.println("Entre com a opção desejada:                          ");
            System.out.println("                                                     ");
            
            try {
                opcao = leia.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("\nDigite valores inteiros!");
                leia.nextLine();
                opcao = 0;
            }
            if (opcao == 5) {
                System.out.println("\nRede Mais Saúde.");
                sobre();
                leia.close(); 
                System.exit(0);
            }
            
                switch (opcao) {
                case 1:
                    cadastrarCliente();
                    break;
                case 2:
                    armazenar.listarTodos();
                    break;
                case 3:
                    atualizarCadastro();
                    break;
                case 4:
                    deletarCliente();
                    break;
                default:
                    System.out.println("\nOpção Inválida!\n");
                    break;
            }
        }
    }

    public static void cadastrarCliente() {
        leia.nextLine(); 
        System.out.println("Digite o nome do aluno: ");
        String nomeAluno = leia.nextLine();
        System.out.println("Digite o CPF do aluno: ");
        String cpf = leia.nextLine();
        System.out.println("Digite a data de nascimento do aluno (no formato AAAA-MM-DD): ");
        String dataNascimentoStr = leia.nextLine();
        LocalDate dataNascimento = LocalDate.parse(dataNascimentoStr);
        System.out.println("Digite o e-mail do aluno: ");
        String email = leia.nextLine();
        System.out.println("Digite o telefone de contato do aluno: ");
        String contato = leia.nextLine();

        Dados dados = new Dados(nomeAluno, cpf, dataNascimento, email, contato);
        armazenar.cadastrar(dados);
    }

    public static void atualizarCadastro() {
        leia.nextLine();
        System.out.println("Digite o nome do aluno que deseja atualizar:");
        String nomeAluno = leia.nextLine();
        
        System.out.println("Digite o novo telefone de contato: ");
        String novoTelefone = leia.nextLine();
        System.out.println("Digite o novo e-mail: ");
        String novoEmail = leia.nextLine();
       
        Dados aluno = armazenar.buscarNaCollection(nomeAluno);
        
        if (aluno != null) {
            aluno.setContato(novoTelefone);
            aluno.setEmail(novoEmail);
            armazenar.atualizar(aluno);
        } else {
            System.out.println("O cadastro do aluno(a) " + nomeAluno + " não foi encontrado!");
        }
    }
    

    public static void deletarCliente() {
        leia.nextLine();
        System.out.println("Digite o nome do cliente que deseja deletar:");
        String nome = leia.nextLine();
        armazenar.deletar(nome);
    }

    public static void sobre() {
        System.out.println("\n*********************************************************");
        System.out.println("Projeto Desenvolvido por: Luana Nascimento ");
        System.out.println("luananascimento00@outlook.com");
        System.out.println("github.com/Luana-Nascimento");
        System.out.println("*********************************************************");
    }
}