package laboratoire1;
import java.util.*;
public class RechercheTableau {

	  // Ne pas changer ces fonctions, elles seront utilis�es pour tester votre programme
    // Elles peuvent cependant servir seulement d'interface et utiliser une m�thode "helper" 
    // avec des param�tres suppl�mentaires, au besoin. 
	static long startTime = System.currentTimeMillis();
    public static int RechercheLineaire(int[] tab, int n, int x){
    	
    	for (int i = 0; i < n; i++) {
            //Return the index of the element if the element
            //is found
            if (tab[i] == x)
                return i;
            
        }
    	
    	//return -1 if the element is not found
    	
        return -1;
        
    }

    public static int RechercheBinaire(int[] tab, int n, int val){
        return RechercheBinaireHelper(tab, 0, tab.length-1,val);
    }

    static int RechercheBinaireHelper(int[] tab, int low, int high, int val)
    {
        int mid = (low + high) / 2;
        if (low == high)
            return -1;

        if(tab[mid] > val)
            return RechercheBinaireHelper(tab,low,mid,val);
        else if (tab[mid] < val)
            return RechercheBinaireHelper(tab,mid+1,high,val);
        else
            return mid;
    }


    public int RechercheBinaireModifie(int[] tab, int n, int val){
        return -1;
    }
	
    public static void main(String[] args)
    {
        int[] arr = { 3, 4, 1, 7, 5 };
        int n = arr.length;
          
        int x = 7;
  
        int index = RechercheLineaire (arr, n, x);
        if (index == -1)
            System.out.println("Element is not present in the array");
        else
            System.out.println("Element found at position " + index);
        
        
        long finishTime = System.currentTimeMillis();
        //long elapsedTime = finishTime - startTime; // elapsed time in milliseconds
        System.out.println("That took " + (finishTime - startTime) + " milliseconds");
    }
    
}
	

