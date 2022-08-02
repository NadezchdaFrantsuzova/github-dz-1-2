public class SalesManager {
    protected long[] sales;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public long max(){
        long max = -1;
        for (long sale : sales) {
            if (sale > max){
                max = sale;
            }
        }
        return max;
    }

    public int medium (int max){
        int min = sales[0];
        for (int sale : sales){
            if (sale < sales[0]){
                min = sale;
            }
        }
        int sum = 0;
        for (int sale : sales){
            sum += sale;
        }
        int medium = (sum - max - min) / (sales.length - 2);
        return medium;
    }
}
