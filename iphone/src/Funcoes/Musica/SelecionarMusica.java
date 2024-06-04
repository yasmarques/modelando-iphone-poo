package Musica;

public class SelecionarMusica implements ReprodutorMusical {

    public void selecionarMusica(String musica){
        System.out.println("Musica selecionado: " + musica);
    }

    @Override
    public void tocar() {
        throw new UnsupportedOperationException("Unimplemented method 'tocar'");
    }

    @Override
    public void pausar() {
        
        throw new UnsupportedOperationException("Unimplemented method 'pausar'");
    
    }

}
