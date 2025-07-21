package basicSorting;

// code of insertion sort

public class insertionSort {
    public static void main (String []args){
        int insertion[] = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
        sortInsertion(insertion);
    }

    public static void sortInsertion (int insertion[]){
        for(int i = 1; i < insertion.length; i++){
            int curr = insertion[i];
            int prev = i-1;

            while (prev >= 0 && insertion[prev] > curr) {
                insertion[prev+1] = insertion[prev];
                prev--;
            }
            insertion[prev+1] = curr;
        }
        printSort(insertion);
    }

    public static void printSort(int insertion[]){
        for (int i = 0; i < insertion.length; i++){
            System.out.print(insertion[i] + " ");
        }
    }
}
