public class InsertionSort{
    public static void main(String[] args) {
        int arr [] = new int[100];
        //populate with random values
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*10);
        }

        //print unsorted array
        System.out.println("Unsorted array");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +  " ");
        }

        insertionSort(arr);

        System.out.println("");
        //print sorted array
        System.out.println("Sorted array");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +  " ");
        }
    }

    public static void insertionSort(int array[]) {  
        int n = array.length;  
        for (int j = 1; j < n; j++) {  
            int key = array[j];  
            int i = j-1;  
            while ( (i > -1) && ( array [i] > key ) ) {  
                array [i+1] = array [i];  
                i--;  
            }  
            array[i+1] = key;  
        }  
    }  
}