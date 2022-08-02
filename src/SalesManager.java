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

    public long medium (long max){
        long min = sales[0];
        for (long sale : sales){
            if (sale < sales[0]){
                min = sale;
            }
        }
        long sum = 0;
        for (long sale : sales){
            sum += sale;
        }
        long medium = (sum - max - min) / (sales.length - 2);
        return medium;
    }
}
