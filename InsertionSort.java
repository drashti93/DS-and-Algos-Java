
public class InsertionSort {

	public static void main(String[] args) {
		

		//declaring and initializing array
		
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
				
				//sorting array using insertion sort
				
				for(int i=1; i<intArray.length;i++) {
					int newElement = intArray[i];
					for(int j=i-1; j>=0; j--) {
						if(newElement < intArray[j]) {
							intArray[j+1] = intArray[j];
							intArray[j] = newElement;
						}
						else {
							break;
						}
					}
				}
				
				//printing array after sorting
				
				System.out.println("\n\nArray after sorting\n");
						
				for(int i =0; i<intArray.length; i++) {
					System.out.print(intArray[i]);
					System.out.print("\t");
				}

	}

}
