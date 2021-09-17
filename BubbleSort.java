

public class BubbleSort{
    public static void main(String[] args) {
        //Create array 
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
        bubbleSort(arr);
        System.out.println("");
        //print sorted array
        System.out.println("Sorted array");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +  " ");
        }
    }
    public static void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length -1 - i; j++) {
                if (arr[j+1] < arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}