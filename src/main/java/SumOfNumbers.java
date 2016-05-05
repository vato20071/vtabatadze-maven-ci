/**
 * Created by vato on 5/5/16.
 */
public class SumOfNumbers {

    public long calculateSum(int n) {
        long sum = 0;
        for (int i=0; i<=n; i++) {
            sum += (long) i;
        }
        return sum;
    }
}
