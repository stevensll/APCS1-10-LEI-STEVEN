public class Triangle {
    private Point v1,v2,v3;
    double sideA, sideB, sideC;
    public Triangle(Point a, Point b, Point c){
        v1 = a;
        v2 = b;
        v3 = c;
    }
    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        v1 = new Point (x1,y1);
        v2 = new Point (x2,y2);
        v3 = new Point (x3,y3);

    }
    // helper method that helps set values for sideA/B/C
    public void createSides(){
        sideA = v1.distanceTo(v2);
        sideB = v2.distanceTo(v3);
        sideC = v3.distanceTo(v1);
    }
    // new methods must be without rounding
    public double getPerimeter() {
        createSides();
        return sideA + sideB + sideC;
    }
    public double getArea(){
        double semip = this.getPerimeter() / 2;
        return Math.sqrt(semip*(semip - sideA)*(semip - sideB)*(semip - sideC));
    }
    // this one uses rounding distances to the nearest TENTHOUSANDTHS
    public String classify(){
        createSides();
        sideA = Math.round(sideA * 10000.0) / 10000.0;
        sideB = Math.round(sideB * 10000.0) / 10000.0;
        sideC = Math.round(sideC * 10000.0) / 10000.0;
        if (sideA == sideB && sideB ==sideC) return "equilateral";
        if ( sideA == sideB || sideB == sideC || sideC == sideA) return "isosceles";
        return "scalene";
    }
    public String toString(){
        return( "v1(" + this.v1.getX() + ", " + this.v1.getY() + ") " + 
                "v2(" + this.v2.getX() + ", " + this.v2.getY() + ") " +
                "v3(" + this.v3.getX() + ", " + this.v3.getY() + ")");
    }
    public void setVertex(int index, Point newp) {
        if (index == 0){
            v1 = new Point(newp.getX(), newp.getY());
        }
        if (index == 1){
            v2 = new Point(newp.getX(), newp.getY());
        }
        if (index == 2){
            v3 = new Point(newp.getX(), newp.getY());
        }
    }
}
