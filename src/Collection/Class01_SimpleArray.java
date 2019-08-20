package Collection;

public class Class01_SimpleArray {

	public static void main(String[] args) {

		int[] arr = new int[3];
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;

		System.out.println("Lenght of array is" + arr.length);

		for (int i = 0; i < arr.length; i++) {

			System.out.println(arr[i]);
		}

		int[] arr1 = { 10, 20, 30 };
		System.out.println("Lenght of array is" + arr1.length);

		for (int i = 0; i < arr1.length; i++) {

			System.out.println(arr1[i]);
		}

		int[][] arr2 = new int[2][3];
		arr2[0][0] = 10;
		arr2[0][1] = 20;
		arr2[0][2] = 30;

		arr2[1][0] = 40;
		arr2[1][1] = 50;
		arr2[1][2] = 60;

		System.out.println("Lenght of Two array is" + arr2.length);

		for (int i = 0; i < arr2.length; i++) {

			for (int j = 0; j < arr2[i].length; j++) {

				System.out.println(arr2[i][j]);

			}
		}

	}

}
