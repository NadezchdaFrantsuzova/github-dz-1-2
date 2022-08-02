public class SalesManager {
    protected int[] sales;

    public SalesManager(int[] sales) {
        this.sales = sales;
    }

    public int max(){
        int max = -1;
        for (int sale : sales) {
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
