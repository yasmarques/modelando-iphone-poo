package JuncaoIphone;

import Internet.NavegadorInternet;
import Musica.ReprodutorMusical;
import Telefone.AparelhoTelefonico;

public class Juncao implements NavegadorInternet, ReprodutorMusical, AparelhoTelefonico{



    @Override
    public void ligar() {
        System.out.println("Ligando (de junção)");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo... (de junção)");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Deixa seu recado após o sinal... (de junção)");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando Musica (de junção)");
    }

    @Override
    public void pausar() {
        System.out.println("Pausado (de junção)");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando musica (de junção)");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo... (de junção)");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba (de junção)");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando (de junção)");
    }

}


