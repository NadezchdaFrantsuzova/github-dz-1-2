public class Main {

    public static void main(String[] args) {

        long [] sales = {1, 20, 50, 190, 210, 60, 70};
        SalesManager salesManager = new SalesManager(sales);

        System.out.println("Максимальный размер продаж: " + salesManager.max());
        System.out.println("Обрезанное среднее количество продаж: " + salesManager.medium(salesManager.max()));
    }
}
