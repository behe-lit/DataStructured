package DataStructure.DataStructure;

public class SwapEx {
	
	/*매개변수 배열,swap할 인덱스 no.1, swap할 인덱스 no.2*/
	public static int[] swap(int[] array,int i, int j) {

        int temp;
        if(array[i]>array[j]) { //크기비교 선검사
            temp = array[i];
            array[j] = array[i];
            array[j] = temp;
        } else {
            System.out.println("정렬되지 않았습니다");
        }
        return array; //정렬되었거나 정렬되지않은 배열을 리턴
    }
	
	
}
