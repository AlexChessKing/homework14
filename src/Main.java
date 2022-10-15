public class Main {
    public static void main(String[] args) {
        long[] sales = {4, 56, 0, 223, 500, 22};

        SalesManager manager = new SalesManager(sales);

        System.out.println("Макс: " + manager.max());
        System.out.println("Мин: " + manager.min());
        System.out.println("Обрезанное среднее: " + manager.trimmedAverage());
    }
}
