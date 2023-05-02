package it.epicode.be;
import java.util.Arrays;

public class esercizio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println(moltiplica(2,3));
      System.out.println(concatena("6",3));
      String[] arrayDiStringhe = { "1", "2", "3","4", "5" };
      System.out.println(Arrays.toString(inserisciInArray(arrayDiStringhe, "ciao")));

	}
	
	static int moltiplica(int n1,int n2){
   return n1 * n2;
}
	
	static String concatena(String word, int n ) {
		return word + n;
	}
	
	
	
	public static String[] inserisciInArray(String[] arr, String word) {
        String[] newArray = new String[arr.length + 1];
           int index = 0;

           for (int i = 0; i < newArray.length; i++) {
               if (i == 2) {
                   newArray[i] = word;
               } else {
                   newArray[i] = arr[index];
                   index++;
               }
           }

           return newArray;
   }
	
}
