public class ArrayOps {
    public static int sum(int [] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        return sum;
    }
    public static int largest(int[] arr) {
        int largest = arr[0];
        //assuming that arr is not empty
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(arr[i],largest);
        }
        return largest;
    }
    public static int [] sumRows(int[][] matrix){
        int [] a = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            a[i] = sum(matrix[i]);
        }
        return (a);
    }
    public static int [] largestInRows(int[][] matrix) {
        int [] a = new int[matrix.length];
        for (int i = 0; i < matrix.length;i++) {
            a[i] = largest(matrix[i]);
        }
        return a;
    }
    public static int sum(int[][]arr){
        int sum = 0;
        for (int i = 0; i < arr.length;i++){
            for (int h = 0; h<arr[i].length;h++ ) {
                sum += arr[i][h];
            }
        }
        return sum;
    }
    public static int[] sumCols(int[][] matrix){
        int [] a = new int[matrix[0].length];
        for (int i = 0; i < matrix[0].length; i++) {
            for (int h = 0; h < matrix.length; h++){
                a[i]+=matrix[h][i];
            }
        }
        return a;
    }
    public static boolean isRowMagic(int[][] matrix) {
        boolean samerows = true;
        int [] a = sumRows(matrix);
        for (int i = 0; i < a.length; i++){
            if (a[i]!=a[0]) samerows = false;
        }
        return samerows;
    }
    public static boolean isColMagic(int[][] matrix) {
        boolean samecols = true;
        int [] a = sumCols(matrix);
        for (int i = 0; i < a.length; i++){
            if(a[i]!=a[0]) samecols = false;
        }
        return samecols;
    }
    public static boolean isLocationMagic(int[][]matrix, int row, int col) {
        int a[] = sumRows(matrix);
        int b[] = sumCols(matrix);
        return a[row] == b[col];
    }
}
