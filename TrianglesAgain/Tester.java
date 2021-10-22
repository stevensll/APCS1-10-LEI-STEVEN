public class Tester {
    
    public static void main(String[] args){
        //COMMENT OUT ONLY SECTIONS PLEASE. THE CASES ARE DESIGNED TO BE USED SECTION BY SECTION
        
        Point testpoint = new Point(3,4);
        Point testpoint2 = new Point(4,5);
        Point testpoint3 = new Point(3,4);

        /* tests for point
        System.out.println(testpoint.getX()+", "+testpoint.getY());  // 3.0,4.0
        System.out.println(testpoint.equals(testpoint2));            // false
        System.out.println(testpoint.equals(testpoint3));            // true
        System.out.println(testpoint.distanceTo(testpoint2)); // 1.4142135623730951
        System.out.println(testpoint.distanceTo(testpoint3)); // 0.0
        */
        
        Point a = new Point (0.5248, -0.8002);
        Point b = new Point (-2.437885, 1.94);
        Point c = new Point (0.0, 0.0);
        Triangle pointTriangleTest = new Triangle(a,b,c);
        Triangle coordinateTest = new Triangle(0.5248, -0.8002, -2.437885, 1.94,0.0, 0.0);
        
        /*tests for perimeter 
        System.out.println(pointTriangleTest.getPerimeter()); //8.108143867816992
        System.out.println(coordinateTest.getPerimeter());    //8.108143867816992
        */

        /* tests for area
        System.out.println(pointTriangleTest.getArea());      //0.46634178850000285
        System.out.println(coordinateTest.getArea());         //0.46634178850000285
        */

        /* tests for classify()
        Point d = new Point (0.1, 0.1);
        Point e = new Point (-1.9, 0.1);
        Point f = new Point (-0.9, -1.632051);
        System.out.println(new Triangle(d,e,f).classify()); //equilateral
        Triangle coordinateEquilateral = new Triangle (0.1, 0.1, -1.9, 0.1, -0.9, -1.632051);   //equilateral
        Triangle coordinateIsoceles = new Triangle(-0.8, 0.8, 0.8, -0.8, 999.9, 999.9);         //isosceles
        Triangle coordinateScalene = new Triangle (-54.3, 84.7, 43.2, 98.443, -61.2948, 28.0);  //scalene
        System.out.println(coordinateEquilateral.classify());
        System.out.println(coordinateIsoceles.classify());
        System.out.println(coordinateScalene.classify());
        */

        /* tests for toString()
        System.out.println(pointTriangleTest.toString()); //v1(0.5248, -0.8002) v2(-2.437885, 1.94) v3(0.0, 0.0)
        System.out.println(coordinateTest.toString());    //v1(0.5248, -0.8002) v2(-2.437885, 1.94) v3(0.0, 0.0)
        */ 

        /* tests for setVertex()
        Point k = new Point (15, 15);
        Point l = new Point (2, 2);
        Point m = new Point (4.0, 0.0);
        System.out.println(pointTriangleTest.toString());   //v1(0.5248, -0.8002) v2(-2.437885, 1.94) v3(0.0, 0.0)
        pointTriangleTest.setVertex(0, k);
        pointTriangleTest.setVertex(1, l);
        pointTriangleTest.setVertex(2, m);  
        System.out.println(pointTriangleTest.toString());   //v1(15.0, 15.0) v2(2.0, 2.0) v3(4.0, 0.0)
        System.out.println(pointTriangleTest.getPerimeter());   //39.8142786733347
        System.out.println(pointTriangleTest.getArea());    //25.99999999999998
        */

    }
}
        
