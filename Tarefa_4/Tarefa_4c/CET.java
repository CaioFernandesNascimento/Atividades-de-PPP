import java.util.ArrayList;
import java.util.List;

public class CET {
    private final List<ObserverCET> observadores = new ArrayList<>();
    private double temperatura;
    private double umidade;
    private double vento;

    public void adicionarObservador(ObserverCET obs) {
        observadores.add(obs);
    }

    public void removerObservador(ObserverCET obs) {
        observadores.remove(obs);
    }

    public void setMedicoes(double temperatura, double umidade, double vento) {
        this.temperatura = temperatura;
        this.umidade = umidade;
        this.vento = vento;
        notificarObservadores();
    }

    private void notificarObservadores() {
        for (ObserverCET obs : observadores) {
            obs.atualizar(temperatura, umidade, vento);
        }
    }
}
