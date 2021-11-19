public class CalculateSale {
    public String CheckSale(int k, int b, int n) {
        int sum = 35*k + 20*b + 15*n;
        if(!(k>=0 && k<=70) || !( b>=0 && b<=80) || !( n>=0 && n<=90))
            return "Invalid";

        if(k < 3 || b < 3 || n < 3 || sum <= 250)
            return "No";

        return "Yes";
    }
}
