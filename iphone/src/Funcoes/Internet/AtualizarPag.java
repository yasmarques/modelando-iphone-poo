package Internet;

public class AtualizarPag implements NavegadorInternet{
    public void atualizarPagina(){
        System.out.println("Atualizando......");
    }

    @Override
    public void exibirPagina() {
        throw new UnsupportedOperationException("Unimplemented method 'exibirPagina'");
    }

    @Override
    public void adicionarNovaAba() {
        throw new UnsupportedOperationException("Unimplemented method 'adicionarNovaAba'");
    }
}
