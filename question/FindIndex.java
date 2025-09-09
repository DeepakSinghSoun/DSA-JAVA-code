package question;

// Leet code question. `Level` : Easy

// find the index of the first occurrence in a string

public class FindIndex {
    public static void main(String []args){
        String haystack = "sadbutsad";
        String needle = "sad";

        int m = 0;
        int n = 0;
        int index = 0;

        for(int i = m ; i < needle.length(); i++){
            for(int j = n; j < haystack.length(); j++){               
                if( needle.charAt(i) == haystack.charAt(j)){
                    m++;
                    n++;
                    index = i;
                }else{
                    m = 0;
                    n = 0;
                }
            }
        }
    }
}