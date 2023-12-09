import java.util.Scanner;

public class BancoDigital {
    public static void main(String[] args) {
        //iniciando o Scanner para leitura de dados através do teclado
        Scanner leituraTeclado = new Scanner(System.in);

        //Variáveis
        String nomeCliente = "";
        String tipoDeConta = "";
        double saldoDaConta = 0;
        int opcoesSistema = 0;

        //Mensagens de inicialização
        System.out.println("Iniciando sistema...");
        System.out.println("Verificando cliente cadastrado...");

        //Iniciando programa no loop infinito até a escolha da opção "sair"
        while (nomeCliente.equalsIgnoreCase("")){

            //Caso não tenha nenhum cliente cadastrad                                                                                                                                                                    o é necessário cadastrar um cliente antes de usar o sistema

                //Dando a opção de cadastrar o cliente
                System.out.println("Não há clientes cadastrados.");
                System.out.println("Você deseja cadastrar um novo cliente? S ou N?");
                String decisao = leituraTeclado.nextLine();

                if(decisao.equalsIgnoreCase("S")){
                    //Cadastrando clientes atrávels dos dados lidos no teclado
                    System.out.println("Por favor, escreva o nome do cliente: ");
                    nomeCliente = leituraTeclado.nextLine();
                    System.out.println("Ok! Agora me diga qual o tipo de conta:");
                    tipoDeConta = leituraTeclado.nextLine();
                    System.out.println("Ótimo! para começar qual seria o saldo atual da conta:");
                    saldoDaConta = leituraTeclado.nextDouble();
                    System.out.println("Perfeito! Agora podemos iniciar o sistema com a configuração adequada a você. Muito obrigado!!");

                } else if (decisao.equalsIgnoreCase("N")) {
                    //Encerrando o programa caso o cliente não queira se cadastrar e usar o sistema
                    System.out.println("Ok! Encerrando programa. Até mais...");
                    break;
                }else {
                    //Caso não seja escolhida uma opção válida o sistema irá para o proximo loop
                    System.out.println("Opção inválida. Por favor, escrever apenas S ou N.");
                    System.out.println("Tente novamente...");
                }


        }

        if(!nomeCliente.equalsIgnoreCase("")) {

            System.out.println("""
            Carregando dados... 
            
            Bem vindo      """ + nomeCliente);

            System.out.println("");

            System.out.println("""
                    ***************************************

                    Dados do cliente:
                                            
                    Nome do cliente: """ + nomeCliente + """
                                            
                    Tipo de conta: """ + tipoDeConta + """
                                            
                    Saldo da conta: """ + saldoDaConta + """
                                            
                    ***************************************
                    """);


            while (opcoesSistema != 4) {

                System.out.println("""
                                                
                        Operações:
                        1- Consultar Saldo
                        2- Receber valor
                        3- Transferir valor
                        4- Sair
                                                
                        Digite a opção desejada:
                                                
                        """);

                opcoesSistema = leituraTeclado.nextInt();

                switch (opcoesSistema) {

                    case 1:
                        System.out.println("Seu saldo atual é: R$ " + saldoDaConta);
                        break;
                    case 2:
                        //bloco de código sem a utilização da função Depositar()
                        /*System.out.println("Quanto você pretende depositar:");
                        saldoDaConta += leituraTeclado.nextInt();
                        System.out.println("Muito bem... Depositando...");
                        System.out.println("Prontinho! Seu novo saldo é: R$ " + saldoDaConta);
                        */

                        saldoDaConta = Depositar(saldoDaConta);

                        break;

                    case 3:
                        //bloco de código sem a utilização da função  fazerTransferencia()
                       /* System.out.println("Quanto você pretende transferir:");
                        double valorTransferencia = leituraTeclado.nextDouble();

                        if (valorTransferencia < saldoDaConta) {
                            saldoDaConta -= valorTransferencia;
                            System.out.println("Fazendo transferência... Só um momento...");
                            System.out.println("""

                                    Transferência concluída!! Segue os dados da transferência:

                                    Valor da transferência: R$ """ + valorTransferencia + """

                                    Saldo antes da transferência: R$ """ + (saldoDaConta + valorTransferencia) + """

                                    Saldo Atual: R$ """ + saldoDaConta + """

                                    """);

                        } else if (valorTransferencia > saldoDaConta) {
                            System.out.println("Não é possível realizar a transferência... Saldo insuficiente.");
                        }*/

                        saldoDaConta = FazerTransferencia(saldoDaConta);

                        break;
                    case 4:
                        System.out.println("Muito obrigado por usar nosso sistema. Até logo!!");
                        break;
                    default:
                        break;

                }


            }
        }


        leituraTeclado.close();
    }

    //Função utilizada para realizar transferências
    public static double FazerTransferencia(double saldo){
        System.out.println("Quanto você pretende transferir:");
        Scanner leituraDoTeclado = new Scanner(System.in);
        double valorTransferencia = leituraDoTeclado.nextDouble();

        if (valorTransferencia < saldo) {
            saldo -= valorTransferencia;
            System.out.println("Fazendo transferência... Só um momento...");
            System.out.println("""
                                                                
                                    Transferência concluída!! Segue os dados da transferência: 
                                                                
                                    Valor da transferência: R$ """ + valorTransferencia + """
                                                                
                                    Saldo antes da transferência: R$ """ + (saldo + valorTransferencia) + """
                                                                
                                    Saldo Atual: R$ """ + saldo + """

                                    """);

        } else if (valorTransferencia > saldo) {
            System.out.println("Não é possível realizar a transferência... Saldo insuficiente.");
        }
        leituraDoTeclado.close();
        return saldo;
    }
    
    //Função utilizada para realizar depósitos
    public static double Depositar (double saldo){
        Scanner leituraTeclado = new Scanner(System.in);
        System.out.println("Quanto você pretende depositar:");
        saldo += leituraTeclado.nextInt();
        System.out.println("Muito bem... Depositando...");
        System.out.println("Prontinho! Seu novo saldo é: R$ " + saldo);
        leituraTeclado.close();
        return saldo;

    }


}
