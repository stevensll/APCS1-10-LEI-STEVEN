public abstract class Number {
    public abstract double getValue();

    public int compareTo(Number other){
        int n = 0;
        if (this.equals(other)) n = 0;
        else if(this.getValue()>other.getValue()) n = 1;
        else if(this.getValue()<other.getValue()) n = -1;
        return n;
    }


    public boolean equals(Number other){
        boolean isEqual = false;
        double a = this.getValue();
        double b = other.getValue();
        double diffPercentA = Math.abs( (a-b) / a);
        double diffPercentB = Math.abs( (a-b) / b);
        if (a == 0 && b == 0) isEqual = true;
        if (diffPercentA < 0.00001 && diffPercentB < 0.00001) isEqual = true;
        return isEqual;
    }
}
