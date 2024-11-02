import java.util.HashMap;
import java.util.Map;

public class DailyReportObserver implements StockObserver {
    private Map<String, Integer> stockChanges = new HashMap<>();

    @Override
    public void update(Stock stock) {
        stockChanges.put(stock.getName(), stock.getQuantity());
        System.out.println("Daily Report: " + stock.getName() + " est à " + stock.getQuantity() + ".");
    }

    public void generateReport() {
        System.out.println("Rapport quotidien des changements de stock : " + stockChanges);
    }
}
