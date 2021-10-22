public class RationalNumber extends Number{
    private int numerator, denominator;

    public RationalNumber(int nume, int deno){
        numerator = nume;
        denominator = deno;
        if (deno == 0) {
            numerator = 0; 
            denominator = 1;
        }
        else if ((nume == 0)){
            denominator = 1;
        }
        else if (denominator < 0) {
            numerator *= -1; 
            denominator *= -1;
            reduce();
        }
        else reduce();
    }

    public static int gcd(int a, int b){
        int divisor = Math.abs(Math.max(a,b));
        int dividend = Math.abs(Math.min(a,b));
        // assume the dividend is gcd. the loop will take care of it if that is not the case
        int gcd = dividend;
        // if there's a remainder, find a gcd smaller than the dividend. end right before
        // the reaminder turns to 0.
        while (divisor % dividend != 0){
            int rem = divisor % dividend;
            divisor = dividend;
            dividend = rem;
            gcd = rem;
        }
        return gcd;
    }

    private void reduce(){
        int gcd = gcd(numerator,denominator);
        numerator /=gcd;
        denominator /=gcd;
    }

    public double getValue(){
        return ((double)numerator) / denominator;
    }

    public int getNumerator(){
        return numerator;
    }

    public int getDenominator(){
        return denominator;
    }

    //overrides RealNumber.equals()
    public boolean equals(RationalNumber other) { 
        return ( 
            (this.getNumerator() == other.getNumerator()) && 
            (this.getDenominator() == other.getDenominator()) 
            );
    }

    public String toString(){
        if(numerator == 0) return "0";
        else if(denominator == 1) return numerator+"";
        else return numerator+"/"+denominator;
    }

    public RationalNumber reciprocal(){
        return new RationalNumber(this.getDenominator(), this.getNumerator());
    }

    public RationalNumber multiply(RationalNumber other){
        return new RationalNumber(this.getNumerator()*other.getNumerator(),this.getDenominator()*other.getDenominator());
    }

    public RationalNumber divide(RationalNumber other){
        return this.multiply(other.reciprocal());
    }

    public RationalNumber add(RationalNumber other){
        int d = (this.getDenominator() * other.getDenominator());
        int n1 = (this.getNumerator() * other.getDenominator());
        int n2 = (other.getNumerator() * this.getDenominator());
        return new RationalNumber(n1+n2,d);
    }

    public RationalNumber subtract(RationalNumber other){
        int d = (this.getDenominator() * other.getDenominator());
        int n1 = (this.getNumerator() * other.getDenominator());
        int n2 = (other.getNumerator() * this.getDenominator());
        return new RationalNumber(n1-n2,d);
    }

     
}
