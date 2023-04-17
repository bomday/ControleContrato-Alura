import java.util.Scanner;
public class ControleContrato {
    public static void main(String[] args) {
        //CONTROLE DE CONTA BANCÁRIA
        Scanner dados = new Scanner(System.in);

        System.out.println("Informe os dados da sua conta abaixo");
        System.out.println("Informe seu nome:");
        String cliente = dados.nextLine();
        System.out.println("Informe o Tipo de Conta:");
        String tipoConta = dados.nextLine();
        System.out.println("Informe seu saldo atual:");
        double saldo = dados.nextDouble();

        System.out.println("********************************************************\n");
        System.out.println("Dados Iniciais do Cliente\n");
        System.out.println("Nome do Cliente: " + cliente);
        System.out.println("Tipo de Conta: " + tipoConta);
        System.out.println("Saldo na Conta: " + saldo);
        System.out.println("\n********************************************************");

        System.out.println("""
                \nIndique o número de uma das opções abaixo para continuar:
                
                1. Consultar Saldos
                2. Receber valor
                3. Transferir valor
                4. Sair
                """);
        int opcao = 0;

        while (opcao != 4) {
            opcao = dados.nextInt();

            if (opcao == 1 || opcao == 2 || opcao == 3) {
                if (opcao == 1) {
                    System.out.println("Seu saldo atual é: " + saldo);
                } else if (opcao == 2) {
                    System.out.println("Informe o valor recebido:");
                    double valorRecebido = dados.nextDouble();
                    saldo += valorRecebido;
                    System.out.println("Recebimento realizado com sucesso!\nSeu saldo atual é de R$" + saldo + ".");
                } else {
                    System.out.println("Informe o valor a ser Transferido:");
                    double valorTransferido = dados.nextDouble();

                    if (valorTransferido > saldo) {
                        System.out.println("Você apenas pode transferir um valor menor ou igual ao do seu saldo atual de R$" + saldo + ".");
                    } else {
                        saldo -= valorTransferido;
                        System.out.println("Transferência realizada com sucesso!\nSeu saldo atual é de R$" + saldo + ".");
                    }
                }
            } else {
                System.out.println("Opção inválida!\nEscolha uma das opções disponibilizadas.");

                System.out.println("""
                \nIndique o número de uma das opções abaixo para continuar:
                
                1. Consultar Saldos
                2. Receber valor
                3. Transferir valor
                4. Sair
                """);
            }
        }

        System.out.println("Processo finalizado!");
    }
}