import java.util.ArrayList;
import java.util.List;

// Este é o objeto intermediário ele implementa a mesma interface
// garantindo que pode usar de forma transparente.
public class ProvedorInternetProxy implements ProvedorInternet {
    
    // O Proxy mantém a referência
    private ProvedorInternet provedorReal = new ProvedorInternetReal();
    private List<String> sitesBloqueados;

    public ProvedorInternetProxy() {
        // lista de sites proibidos
        sitesBloqueados = new ArrayList<>();
        sitesBloqueados.add("facebook.com");
        sitesBloqueados.add("instagram.com");
    }

    @Override
    public void conectar(String url) {
        // O Proxy adiciona antes de chamar o objeto real
        if (sitesBloqueados.contains(url.toLowerCase())) {
            System.out.println("ACESSO NEGADO: O site '" + url + "' é bloqueado pela política da empresa.");
        } else {
            // Se a URL for permitida, o Proxy repassa a chamada para o OBJETO BASE
            provedorReal.conectar(url);
        }
    }
}