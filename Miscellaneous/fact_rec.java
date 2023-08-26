public class fact_rec {
    int factorial(int n)
    {
        int num;
        num = num* n * (n-1);
        factorial(--n);
    }
    public static void main(String args[])
    {

    }
    
}
