// O cliente não "fala" diretamente com o ProvedorInternetReal. Ele se comunica apenas 
// com o Proxy, achando que está falando com o provedor de internet normal.
public class Main {
    public static void main(String[] args) {
        
        // O cliente instancia o Proxy sem mexer no objeto base direto
        ProvedorInternet internetCorporativa = new ProvedorInternetProxy();

        System.out.println("--- Funcionário acessando a internet ---");
        
        // Tentativa de acesso a um site de trabalho (Permitido)
        internetCorporativa.conectar("google.com");
        
        // Tentativa de acesso ao sistema da empresa (Permitido)
        internetCorporativa.conectar("intranet.empresa.com");
        
        // Tentativa de acesso a uma rede social (Bloqueado pelo Proxy)
        internetCorporativa.conectar("facebook.com");
        
    }
}