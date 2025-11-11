package POO;

public class Pessoa {

    private String nome;

    private boolean acordado;

    private boolean comendo;

    private boolean dirigindo;

    public Pessoa(String nome) {

        this.nome = nome;
        this.acordado = false;
        this.comendo = false;
        this.dirigindo = false;
    }

    public void acordar() {
        if (acordado) {
            System.out.println(nome + " já está acordado.");
        } else {
            acordado = true;
            System.out.println(nome + " acordou.");

        }

    }

    public void comer() {

        if (dirigindo) {
            System.out.println(nome + " não pode comer enquanto dirige.");
        } else if (!acordado) {
            System.out.println(nome + " não pode comer enquanto está dormindo.");

        } else if (comendo) {
            System.out.println(nome + " já está comendo.");
        } else {
            comendo = true;
            System.out.println(nome + " começou a comer.");

        }
    }

    public void pararDeComer() {

        if (!comendo) {
            System.out.println(nome + " não está comendo no momento.");
        } else {
            comendo = false;
            System.out.println(nome + " terminou de comer.");
        }
    }

    public void dirigir() {
        if (!acordado) {
            System.out.println(nome + " não pode dirigir enquanto está dormindo.");
        } else if (comendo) {
            System.out.println(nome + " não deve dirigir enquanto come.");

        } else if (dirigindo) {
            System.out.println(nome + " já está dirigindo.");

        } else {
            dirigindo = true;
            System.out.println(nome + " começou a dirigir.");
        }
    }

    public void pararDeDirigir() {
        if (!dirigindo) {
            System.out.println(nome + " não está dirigindo no momento.");
        } else {
            dirigindo = false;
            System.out.println(nome + " parou de dirigir.");
        }
    }

    public void dormir(){
        if(dirigindo){
            System.out.println(nome+ " não pode dormir enquanto dirige.");
        } else if (comendo) {
            System.out.println(nome + " não pode dormir enquanto come.");

        } else if (!acordado) {
            System.out.println(nome+ " já está dormindo.");

        }else{
            System.out.println(nome+ " foi dormir.");
            acordado =false;
            comendo = false;
        }
    }
}
