public class RecursionExample {
    static void recursion(int i, int sum)     
    {
        // if(i<n) return;
        // System.out.println(i);
        // recursion(i-1, n);
        if(i<1) {
            System.out.println(sum);
            return;
        }
        recursion(i-1, sum*i);
    }
    public static void main(String[] args) {
        recursion(5, 1);
    }
}
