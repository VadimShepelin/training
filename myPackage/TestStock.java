package myPackage;

public class TestStock {

    public static void main(String[] args) {
        Stock stock = new Stock("SBER","ПАО Сбербанк",281.50);
        stock.setCurrentPrice(282.87);

        System.out.println("Поцент изменения стоимости акции: "+(stock.getChangePercent()*100));
    }
}
