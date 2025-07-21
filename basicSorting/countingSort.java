package basicSorting;

// code of Counting sort

public class countingSort {
    public static void main (String []args){
        int counting[] = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
        sortCounting(counting);
    }

    public static void sortCounting (int counting[]){
        int largest = Integer.MIN_VALUE;
        for (int i =0; i < counting.length; i++){
            largest = Math.max(largest, i);
        }

        int count[] = new int[largest+1];
        for (int i =0; i < counting.length; i++){
            count[counting[i]]++;
        }

        int index = 0;
        for (int i = 0; i < count.length; i++){
            while (count[i] > 0) {
                counting[index] = i;
                index++;
                count[i]--;
            }
        }

        printSort(counting);
    }

    public static void printSort(int counting[]){
        for (int i = 0; i < counting.length; i++){
            System.out.print(counting[i] + " ");
        }
    }
}
