import java.util.Arrays;

public class Sorts{
    
    public static void bubbleSort(int[]data){
        // use a nested loop. Esentially we're moving the max number to the right, then repeating that for a smaller section of the array.
        for (int i = 0; i<data.length-1; i++){
            for (int  j = 0; j < data.length-1-i;j++){
                //sort statement
                if( data[j] > data[j+1]){
                    int newNext = data[j];
                    data[j] = data[j+1];
                    data[j+1] = newNext;
                }
            }
        }
    }

    public static void selectionSort(int[] data){
        // use a nested loop. This time we're moving the smallest element to the leftmost spot.
        for (int i = 0; i <data.length-1; i++){
            int minIndex = i;
            for(int j = i+1; j<data.length; j++){
                //find the index of the smallest element from j to arr length using a simple min search.
                if(data[j] < data[minIndex]){
                    minIndex = j;
                }

            }
            //after we find the smallest index we swap. don't swap if minIndex = i;
            if (minIndex!=i){
            int newMin = data[minIndex];
            data[minIndex] = data[i];
            data[i] = newMin;
            }
        }
    }

    public static void insertionSort(int[] data){
        //use a for loop to find an element smaller then the current element. then find the correct index to move this element to. use a while loop to shift everything
        for (int i=1; i<data.length; i++) {
            int current = data[i];
            int prev = i-1;
            while(prev >=0 && data[prev] > current){
                data[prev+1] = data[prev];
                prev--;
            }
            data[prev + 1] = current;
        }
    }

}