
public class SelectionSort {

	public static void main(String[] args) {
		int[] intArray = new int[7];
		int temp=0;
		intArray[0] = 20;
		intArray[1] = 35;
		intArray[2] = -15;
		intArray[3] = 7;
		intArray[4] = 55;
		intArray[5] = 1;
		intArray[6] = -22;
		
		//printing array
		
		System.out.println("Array before sorting\n");
		
		for(int i =0; i<intArray.length; i++) {
			System.out.print(intArray[i]);
			System.out.print("\t");
		}
		
		//sorting array using selection sort
		
		int large=0;
		for(int i=0; i<intArray.length-1;i++) {
			for(int j=0; j<intArray.length-1-i;j++) {
				if(intArray[large] < intArray[j+1]) {
					large=j+1;
				}
			}
			temp = intArray[intArray.length-1-i];
			intArray[intArray.length-1-i] = intArray[large];
			intArray[large] = temp;
			large=0;
		}

		//printing array after sorting
		
		System.out.println("\n\nArray after sorting\n");
				
		for(int i =0; i<intArray.length; i++) {
			System.out.print(intArray[i]);
			System.out.print("\t");
		}
	}

}
