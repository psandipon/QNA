package Sorting;
public class SelectionSort {  
	public int [] Sort(int[] arr) {  
        for (int i = 0; i < arr.length - 1; i++)  
        {  
            int min = i;  
            for (int j = i + 1; j < arr.length; j++){  
                if (arr[j] < arr[min]){  
                    min = j;//searching for lowest index  
                }  
            }  
            int smallerNumber = arr[min];   
            arr[min] = arr[i];  
            arr[i] = smallerNumber;  
        }
		return arr;  
    }  
}