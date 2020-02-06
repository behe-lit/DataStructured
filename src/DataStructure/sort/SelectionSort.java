package DataStructure.sort;

public class SelectionSort {
	public static void main(String[] args) {


//      for (int j = array.length-1; j>=0; j--) {
//
//          System.out.println(array[j]);
      //역순으로 for문을 돌릴 필요성을 느꼈다

      int[] array = {8, 4, 3, 2, 1};

      int temp_value;

      for (int i = 1; i < array.length; i++) {
          temp_value = array[i];
          for (int j = i-1; j >= 0; j--) {

              while (temp_value < array[j]) {

                  array[i] = array[j];
                  array[j] =0;
                  i--;

                  if (temp_value > array[j]) {
                      array[j] = temp_value;
                      break;
                  }
              }
          }
      }
      for(int i=0; i<array.length; i++) {
          System.out.print(array[i]+ ", ");
      }
  }
}
