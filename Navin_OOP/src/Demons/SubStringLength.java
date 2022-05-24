package Demons;

public class SubStringLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int input = 9384;

		String s = String.valueOf(input);
		int l = s.length();
		char[] a = new char[s.length()];

		for (int i = 0; i < s.length(); i++)
			a[i] = s.charAt(i);

		for (int i = 0; i < s.length(); i++)
			System.out.print(a[i] + " ");

		System.out.println("\n");

		int sum = 0;

		for (int i = 0; i < l / 2; i++) {
			System.out.println(a[i]);
			String str= "" + a[i];
			sum = sum + Integer.parseInt(str);
		}

		System.out.println(sum);

	}

}
