import Interface.AparelhoTelefonico;
import Interface.NavegadorInternet;
import Interface.ReprodutorMusical;

public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    @Override
    public void tocar() { System.out.println("Reproduzindo música..."); }

    @Override
    public void pausar() { System.out.println("Música pausada."); }

    @Override
    public void ajustarVolume(int nivel) { System.out.println("Volume ajustado para: " + nivel); }

    @Override
    public void fazerChamada(String numero) { System.out.println("Ligando para: " + numero); }

    @Override
    public void receberChamada() { System.out.println("Recebendo chamada..."); }

    @Override
    public void armazenarContato(String nome, String numero) {
        System.out.println("Contato salvo: " + nome + " - " + numero);
    }

    @Override
    public void carregarPagina(String url) { System.out.println("Carregando página: " + url); }

    @Override
    public void salvarFavorito(String url) { System.out.println("Página adicionada aos favoritos: " + url); }

    @Override
    public void realizarBusca(String termo) { System.out.println("Buscando por: " + termo); }
}