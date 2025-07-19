package basicSorting;

// Selection Sort Code

public class selectionSort {
    public static void main (String []args){
        int selection[] = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
        sortSelection(selection);
    }

    public static void sortSelection(int selection[]){
        int n = selection.length;
        for (int i = 0; i < n-1; i++){
            int minIndex = i;
            for (int j = i + 1; j < n; j++){
                if (selection[minIndex] > selection[j]){
                    minIndex = j;
                }
            }
            
            int temp = selection[i];
            selection[i] = selection[minIndex];
            selection[minIndex] = temp;
        }
        printSort(selection);
    }

    public static void printSort(int selection[]){
        for (int i = 0; i < selection.length; i++){
            System.out.print(selection[i] + " ");
        }
    }
}
