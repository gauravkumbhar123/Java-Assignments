package JavaBasics;

public class SortArrayExample1 {

	public static void main(String[] args) {
		int [] array = new int [] {90, 23, 5, 109, 12, 22, 67, 34};   
		array.sort(array); 
		System.out.println("Elements of array sorted in ascending order: ");  
		for (int i = 0; i < array.length; i++) {       
		System.out.println(array[i]);   
		}   
		}  
		}  
