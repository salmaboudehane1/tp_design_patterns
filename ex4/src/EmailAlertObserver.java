public class EmailAlertObserver implements StockObserver {
    private static final int THRESHOLD = 5; // Seuil pour le stock bas

    @Override
    public void update(Stock stock) {
        if (stock.getQuantity() < THRESHOLD) {
            System.out.println("Email Alert: Le stock de " + stock.getName() + " est bas (" + stock.getQuantity() + ").");
        }
    }
}
