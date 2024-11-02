
//StockObserver est une interface qui définit un contrat que tous les observateurs
// (ou "listeners") doivent respecter.
public interface StockObserver {
    void update(Stock stock);
}

