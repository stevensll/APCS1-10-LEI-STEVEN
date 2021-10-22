import java.util.Arrays;
public class Steven_Tester {
    // change /* and */ at the end of each section to // for testing.
    public static void main(String[] args) {
        /* tests for sum()
        int [] a = new int[] {1,2,3,4,5,};
        int [] b = new int[] {};
        System.out.println(ArrayOps.sum(a)); // 15
        System.out.println(ArrayOps.sum(b)); // 0
        */
        /* tests for largest()
        int [] mix = new int[] {-3,4,1,0,2};
        int [] negativesOnly = new int [] {-3,-1,-5,-6,0};
        int [] positivesOnly = new int [] {1,2,9,5,6};
        System.out.println(ArrayOps.largest(mix));          // 4
        System.out.println(ArrayOps.largest(negativesOnly));// 0
        System.out.println(ArrayOps.largest(positivesOnly));// 9
        */
        /* tests for sumRows()
        int[][] a2D = {{1, 0, 12, -1}, {7, -2, 2, 1}, {-5,-2,2,-9}};
        int[][] b2D = {{},{},{},{}};
        int[][] c2D = {{1},{2},{3}};
        System.out.println(Arrays.toString(ArrayOps.sumRows(a2D))); // [12, 8, -14] 
        System.out.println(Arrays.toString(ArrayOps.sumRows(b2D))); // [0, 0, 0, 0]
        System.out.println(Arrays.toString(ArrayOps.sumRows(c2D))); // [1, 2, 3]
        */
        /* tests for largestInRows()
        int[][] d2D = {{1, 0, 12, -1}, {7, -2, 2, 1}, {-5,-2,2,-9}};
        int[][] e2D = {{1},{2},{3}};
        int[][] f2D = {{0},{0},{-1}};
        System.out.println(Arrays.toString(ArrayOps.largestInRows(d2D)));  //[12, 7, 2]
        System.out.println(Arrays.toString(ArrayOps.largestInRows(e2D)));  //[1, 2, 3]  
        System.out.println(Arrays.toString(ArrayOps.largestInRows(f2D)));  //[0, 0, -1]
        */
        /* tests for sum() (2D array version)
        int[][] g2D = {{1,0,12,-1},{7,-2,2,1},{-5,-2,2,-9}};
        int[][] h2D = {{1},{3},{5}};
        int[][] i2D = {{0},{0},{0}};
        int[] j = {1,3,5}; // just to test if java can separate the two methods by params
        System.out.println(ArrayOps.sum(g2D));  //6
        System.out.println(ArrayOps.sum(h2D));  //9
        System.out.println(ArrayOps.sum(i2D));  //0
        System.out.println(ArrayOps.sum(j));    //9
        */
        /* tests for sumCols()
        int[][] k2D = {{1, 0, 12,-1},  
                       {7, -2, 2, 1 },
                       {-5, -2, 2, -9}};
        int[][] l2D = {{1,2,3,4},
                       {5,6,7,8},
                       {0,0,0,0}};
        int[][] m2D= {{},{},{}};
        System.out.println(Arrays.toString(ArrayOps.sumCols(k2D))); //[3, -4, 16, -9]
        System.out.println(Arrays.toString(ArrayOps.sumCols(l2D))); //[6, 8, 10, 12] 
        System.out.println(Arrays.toString(ArrayOps.sumCols(m2D))); //[]
        */
        /* tests for isRowMagic()
        int[][] n2D = {{1, 0, 12, -1}, {7, -2, 2, 1}, {-5,-2,2,-9}};
        int[][] o2D = {{},{},{},{}};
        int[][] p2D = {{1},{2},{3}};  
        int[][] q2D = {{1,2,3,4},{2,3,4,1},{3,4,1,2}};
        System.out.println(ArrayOps.isRowMagic(n2D)); //false
        System.out.println(ArrayOps.isRowMagic(o2D)); //true
        System.out.println(ArrayOps.isRowMagic(p2D)); //false
        System.out.println(ArrayOps.isRowMagic(q2D)); //true
        */
        /* tests for isColsMagic()
        int[][] r2D = {{1,2,3},{2,1,2},{3,3,1}};
        int[][] s2D = {{1,1,1},{2,2,2},{3,3,3}};
        int[][] t2D = {{1,2,3},{1,2,3},{1,2,3}}; 
        System.out.println(ArrayOps.isColMagic(r2D)); //true
        System.out.println(ArrayOps.isColMagic(s2D)); //true
        System.out.println(ArrayOps.isColMagic(t2D)); //false
        */
        /* tests for isLocationMagic
        int[][] u2D ={{2,4,2},{2,2,2}};
        int[][] v2D ={{1,2,1},{3,2,-1}};
        System.out.println(ArrayOps.isLocationMagic(u2D, 0, 1)); //false
        System.out.println(ArrayOps.isLocationMagic(u2D, 1, 1)); //true
        System.out.println(ArrayOps.isLocationMagic(v2D, 0, 0)); //true
        System.out.println(ArrayOps.isLocationMagic(v2D, 1, 1)); //true
        */
    }
}
