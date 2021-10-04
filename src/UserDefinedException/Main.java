package UserDefinedException;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the array size: ");
		int n = input.nextInt();
		int arr[] = new int[n];
		System.out.print("Enter the Values: ");
		boolean b = true;
		try {
			for (int i = 0; i < arr.length; i++) {
                b=true;
				arr[i] = input.nextInt();
				for (int j = 2; j < arr[i]; j++) {
					if (arr[i] % j == 0) {
						b = false;
						break;
					}

				}
				if (b == true) {
					throw new OwnException("PRIME NOT ALLOWED");

				}

			}
		} catch (OwnException e) {
			System.out.println(e.getMessage());
		}
	}
}

class OwnException extends Exception {

	public OwnException(String string) {
		super(string);
	}

}
