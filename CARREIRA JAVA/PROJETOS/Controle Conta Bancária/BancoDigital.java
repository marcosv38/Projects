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

            //Caso não tenha nenhum cliente cadastrado é necessário cadastrar um cliente antes de usar o sistema

                //Dando a opção de cadastrar o cliente
                System.out.println("Não há clientes cadastrados.");
                System.out.println("Você quer cadastrar um novo cliente? S ou N?");
                String decisao = leituraTeclado.nextLine();

                if(decisao.equalsIgnoreCase("S")){
                    //Cadastrando clientes atrávels dos dados lidos no teclado
                    System.out.println("Por favor, escreva o nome do cliente: ");
                    nomeCliente = leituraTeclado.nextLine();
                    System.out.println("Ok! Agora me diga qual o tipo de conta:");
                    tipoDeConta = leituraTeclado.nextLine();
                    System.out.println("Ótimo! para começar qual seria o saldo atual da conta:");
                    saldoDaConta = leituraTeclado.nextDouble();
                    System.out.println("Perfeito! Agora podemos iniciar o sistema com a configuração adequada a você. Bem vindo!!");

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


        while(!nomeCliente.equalsIgnoreCase("")){
            if ()
            System.out.println("Dados carregados... Bem vindo "+ nomeCliente);
            System.out.println("");

            System.out.println("""
                        ***************************************
                        
                        Nome do cliente: """+nomeCliente+"""
                        
                        Tipo de conta: """+tipoDeConta+"""
                        
                        Saldo da conta: """+saldoDaConta+"""
                        
                        ***************************************
                        """);

        }


    }
}
