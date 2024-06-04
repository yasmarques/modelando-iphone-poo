package Musica;

public class PausarMusica implements ReprodutorMusical {

    public void pausar(){
        System.out.println("Musica Pausada");
    }

    @Override
    public void tocar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'tocar'");
    }

    @Override
    public void selecionarMusica(String musica) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'selecionarMusica'");
    }

}
