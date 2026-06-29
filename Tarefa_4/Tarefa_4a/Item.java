public class Item {
    String nomeItem;
    double valorItem;

    public Item(String nomeItem, double valorItem) {
        this.nomeItem = nomeItem;
        this.valorItem = valorItem;
    }

    @Override
    public String toString() {
        return nomeItem;
    }
    public double getValorItem() {
        return valorItem;
    }
    public void setValorItem(double valorItem) {
        this.valorItem = valorItem;
    }
}
