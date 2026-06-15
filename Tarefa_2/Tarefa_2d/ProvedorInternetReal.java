// Esta classe é o objeto que o Proxy vai proteger
// Ela quem de fato executa a ação principal
public class ProvedorInternetReal implements ProvedorInternet {
    
    @Override
    public void conectar(String url) {
        System.out.println("Conectando ao site: " + url);
    }
}