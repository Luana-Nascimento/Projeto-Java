package eCommerce;

import java.util.Scanner;
import java.time.LocalDate;
import eCommerce.model.Dados;

public class Opcoes {

    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        int opcao;
        
  
        Dados aluno1 = new Dados("Luana Izaias do Nascimento", "45810776809", LocalDate.of(1998, 3, 9), "luananascimento00@outlook.com", "11981414217", "crédito", LocalDate.of(2024, 5, 1)); //*melhorar essa data de pagamento
        aluno1.visualizarCadastro();
        
        while (true) {
            System.out.println("\n          BEM VINDOS A REDE MAIS SAÚDE!"            );
            System.out.println("                                                     ");
            System.out.println("                  AULAS DISPONÍVEIS                  ");
            System.out.println("                                                     ");
            System.out.println("*****************************************************");
            System.out.println("                                                     ");
            System.out.println("            1 - Musculação 120,00                    ");
            System.out.println("            2 - Bike 40,00/aula                      ");
            System.out.println("            3 - Cross Trainning  110,00              ");
            System.out.println("            4 - Pilates  80,00                       ");
            System.out.println("            5 - Jiu-Jitsu  95,00                     ");
            System.out.println("            6 - Boxe  95,00                          ");
            System.out.println("            7 - Natação  240,00                      ");
            System.out.println("            8 - Sair                                 ");
            System.out.println("                                                     "); 
            System.out.println("*****************************************************");
            System.out.println("Entre com a opção desejada:                          ");
            System.out.println("                                                     ");
            
            opcao = leia.nextInt(); 
            
            if (opcao == 8) {
                System.out.println("\nRede Mais Saúde - O seu Futuro começa aqui!");
                sobre();
                leia.close(); 
                System.exit(0);
            }
            
            switch (opcao) {
                case 1:
                    System.out.println("Musculação\n\n");
                    break;
                case 2:
                    System.out.println("Bike\n\n");
                    break;
                case 3:
                    System.out.println("Cross Trainning\n\n");
                    break;
                case 4:
                    System.out.println("Pilates\n\n");
                    break;
                case 5:
                    System.out.println("Jiu-Jitsu\n\n");
                    break;
                case 6:
                    System.out.println("Boxe\n\n");
                    break;
                case 7:
                    System.out.println("Natação\n\n");
                    break;
                case 8:
                    System.out.println("Sair\n\n");
                    break;
                default:
                    System.out.println("\nOpção Inválida!\n");
                    break;
            }
        }
    }

    public static void sobre() {
        System.out.println("\n*********************************************************");
        System.out.println("Projeto Desenvolvido por: Luana Nascimento ");
        System.out.println("luananascimento00@outlook.com");
        System.out.println("github.com/Luana-Nascimento");
        System.out.println("*********************************************************");
    }
}

