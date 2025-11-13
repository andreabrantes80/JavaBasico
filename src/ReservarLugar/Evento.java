package ReservarLugar;

public class Evento {

    private final int capacidade;

    private int lugaresDisponiveis;

    public Evento() {
        this(10);
    }

    public Evento(int capacidade) {
        if (capacidade < 0) {
            throw new IllegalArgumentException("A capacidade não pode ser negativa. ");
        }
        this.capacidade = capacidade;

        this.lugaresDisponiveis = capacidade;
    }

    public void reservar() {
        if (lugaresDisponiveis == 0) {
            System.out.println("Desculpe, não há lugares disponíveis para reserva. ");
            return;
        }
        lugaresDisponiveis--;
        System.out.println("Lugar reservado com sucesso! ");
    }

    public void cancelar() {
        if (lugaresDisponiveis == capacidade) {
            System.out.println("Não há reservas para cancelar. ");
            return;
        }
        lugaresDisponiveis++;
        System.out.println("Reserva cancelada com suceso! ");

    }

    public int getLugaresDisponiveis() {
        return lugaresDisponiveis;
    }

    public void exibirStatus() {
        int reservados = capacidade - lugaresDisponiveis;

        StringBuilder barra = new StringBuilder("[");

        for (int i = 0; i < capacidade; i++) {
            if (i < reservados) barra.append("|");
            else barra.append("-");
        }
        barra.append("]");

        System.out.println("\n===== STATUS DE EVENTO =====");
        System.out.println("Capacidade total: " + capacidade);
        System.out.println("Reservados: " + reservados);
        System.out.println("Disponíveis: " + lugaresDisponiveis);
        System.out.println("Ocupação: " + barra);

        if (lugaresDisponiveis == 0) {
            System.out.println("O evento está lotado!");
        } else if (lugaresDisponiveis <= capacidade * 0.2) {
            System.out.println("Poucas vagas restantes!");
        } else {
            System.out.println("Há bastante disponibilidade.");
        }

    }


}
