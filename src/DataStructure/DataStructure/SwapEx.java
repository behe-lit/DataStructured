package DataStructure.DataStructure;

public class SwapEx {

	public static int[] swap(int[] array,int x, int z) {

        int temp;
        if(array[x]>array[z]) {
            temp = array[x];
            array[x] = array[z];
            array[z] = temp;
        } else {
            System.out.println("���ĵ��� �ʾҽ��ϴ�");
        }
        return array;
    }
	
	
}
