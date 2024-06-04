package Telefone;

public class Ligar implements AparelhoTelefonico{
    
    public void ligar(String numero){
        System.out.println("Ligando.... para ");
    }

    @Override
    public void atender() {
        
    }

    @Override
    public void iniciarCorreioVoz() {
    
    }

    @Override
    public void ligar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'ligar'");
    }

}

