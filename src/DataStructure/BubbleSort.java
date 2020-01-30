package DataStructure;

public class BubbleSort {
	//버블정렬ㄹ
	public static void main(String[] args) {
		int array[] = {5,4,3,2,1};

		int temp;
		int i;
		int j;

		for(i=0; i<array.length-1; i++) {
			for(j=i+1; j<array.length; j++) {
				if(array[i]>array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}

		for(i=0; i<array.length; i++) {
			System.out.print("array["+i+"]"+"\t");
		}

	}

}
