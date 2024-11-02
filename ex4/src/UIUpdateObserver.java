public class UIUpdateObserver implements StockObserver {
    @Override
    public void update(Stock stock) {
        System.out.println("UI Update: Le stock de " + stock.getName() + " a été mis à jour à " + stock.getQuantity() + ".");
    }
}
