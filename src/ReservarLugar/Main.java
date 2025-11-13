package ReservarLugar;

import java.util.Scanner;

public class Main {

    private static  void mostrarMenu(){
        System.out.println("\n ========= MENU ========");
        System.out.println("1 - Reservar o lugar");
        System.out.println("2 - Cancelar uma reserva");
        System.out.println("3 - Mostrar status do evento");
        System.out.println("0 - Sair");
        System.out.print("Escolha uma opção: " +
                "");
    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe a capacidade do evento (ou pressione Enter para usar 10): ");

        String linhaCap = entrada.nextLine().trim();

        Evento evento;

        if(linhaCap.isEmpty()){
            evento = new Evento();
        }else{
            try {
                int cap = Integer.parseInt(linhaCap);
                evento = new Evento(cap);

            }catch (NumberFormatException e){
                System.out.println("Valor inválido. Usando capacidade padrão (10)");
                evento = new Evento();
            }
        }

        while (true){
            mostrarMenu();
            String opcao = entrada.nextLine().trim();

            switch (opcao){
                case "1"-> evento.reservar();
                case "2"-> evento.cancelar();
                case "3"-> evento.exibirStatus();
                case "0"-> {
                    System.out.println("Encerrando o sistema. Até mais!");
                    entrada.close();
                    return;
                }
                default -> System.out.println("Opção inválida, tente novamente.");
            }

        }
    }
}
