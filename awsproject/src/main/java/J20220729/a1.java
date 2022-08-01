package J20220729;

import java.util.ArrayList;

public class a1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		ArrayList array = new ArrayList();
		array.add(0, 1);
		array.add(1, 2);
		array.add(2, 3);
		array.add(3, 4);
		array.add(4, 5);
		array.add(5, 6);
		array.add(6, 7);
		array.add(7, 8);
		array.add(8, 9);
		array.add(9, 10);
		
		for (int i = 0; i < array.size(); i++) {
			//array.size 얘는 다른 배열이라서 이걸로 써야돼(어렵내;;)
			int value1 = (int) array.get(i) ; 
			//(int) 이게 숫자타입으로 지정해준거고 이 전체 문장은 각 배열에 있는 값 뽑는거야
			sum = sum + value1;
		}System.out.println(array);
		System.out.println(sum);
}

}
