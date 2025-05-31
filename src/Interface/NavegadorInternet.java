package Interface;

public interface NavegadorInternet {
    void carregarPagina(String url);
    void salvarFavorito(String url);
    void realizarBusca(String termo);
}
