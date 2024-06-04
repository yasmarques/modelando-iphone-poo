package Musica;

public class TocarMusica implements ReprodutorMusical{

    public void tocar(){
        System.out.println("PLAY!");
    }



    @Override
    public void pausar() {

    }

    @Override
    public void selecionarMusica(String musica) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'selecionarMusica'");
    }
    
}
