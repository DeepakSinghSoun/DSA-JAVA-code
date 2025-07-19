package basicSorting;

// Bubble Sort Code

public class bubbleSort {
    public static void main (String []args){
        int bubble[] = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
        sortBubble(bubble);
    }

    public static void sortBubble(int bubble[]){
        int n = bubble.length;
        for (int i = 0; i < n-1; i++){
            int swap = 0;
            for (int j = 0 ;j < n-1-i; j++){
                if (bubble[j] > bubble[j+1]){
                    int temp = bubble[j];
                    bubble[j] = bubble[j+1];
                    bubble[j+1] = temp;
                    swap++;
                }
            }

            if (swap == 0){
                break;
            }
        }
        printSort(bubble);
    }

    public static void printSort(int bubble[]){
        for (int i = 0; i < bubble.length; i++){
            System.out.print(bubble[i] + " ");
        }
    }
}
