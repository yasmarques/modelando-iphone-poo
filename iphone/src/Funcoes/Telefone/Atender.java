package Telefone ;

public class Atender implements AparelhoTelefonico {
    
    public void atender(){
        System.out.println("Atendeu!!");
    }

    @Override
    public void ligar() {

    }

    @Override
    public void iniciarCorreioVoz() {
    }
}
