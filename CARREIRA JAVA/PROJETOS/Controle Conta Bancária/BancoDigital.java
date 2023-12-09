import java.util.Scanner;

public class BancoDigital {
    public static void main(String[] args) {
        Scanner leituraTeclado = new Scanner(System.in);

        String nomeCliente = "";
        String tipoDeConta = "";
        double saldoDaConta = 0;
        int opcoesSistema = 0;

        System.out.println("Iniciando sistema...");
        System.out.println("Verificando cliente cadastrado...");

        while (true){
            if(nomeCliente.equalsIgnoreCase("")){
                System.out.println("Não há clientes cadastrados.");
                System.out.println("Você quer cadastrar um novo cliente? S ou N?");
                String decisao = leituraTeclado.nextLine();

                if(decisao.equalsIgnoreCase("S")){

                } else if (decisao.equalsIgnoreCase("N")) {
                    System.out.println("Ok! Encerrando programa. Até mais...");
                    break;
                }else {
                    System.out.println("");
                }
            }

        }

    }
}
