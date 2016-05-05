/**
 * Created by vato on 5/5/16.
 */
public class SumOfNumbers {

    private SumTarget target;

    public SumOfNumbers() {
        this.target = null;
    }

    public SumOfNumbers(SumTarget target) {
        this.target = target;
    }

    public long calculateSum(int n) {
        long sum = 0;
        for (int i=0; i<=n; i++) {
            sum += (long) i;
        }
        return sum;
    }

    public long getSumTargetNumber() {
        return target.getTargetNumber();
    }
}
