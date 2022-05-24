package EmailDemo;

public class CheckValidEmail {
	public static void main(String[] args) {

		String email = "bhagya1234@yahoo.com";

		if (email.contains("@") && email.contains(".com") || email.contains(".edu") || email.contains(".in")
				|| email.contains(".org"))
		{
			String[] emailarr = email.split("@");
			if (emailarr.length <= 2) 
			{
				if(emailarr[0].contains(".com") ||emailarr[0].contains(".edu")
					|| emailarr[0].contains(".org") || emailarr[0].contains(".in"))
					
					System.out.println("Invalid Domain");
				
				else
				{
					//System.out.println("Valid Domain");
			
				int res = 0;
				for (int j = 0; j < emailarr.length; j++) 
				{
					String s = emailarr[j];

					for (int i = 0; i < s.length(); i++) 
					{

						char ch = s.charAt(i);
						if ((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122) ||
							(ch >= 48 && ch <= 57) || (ch == 46)) 
						{
							res = res + 1;
							continue;
						}

						else
							System.out.println("Invalid character:  " + ch);
						break;

					} // inner for

				} // outer for

				if (res == email.length() - 1)
					System.out.println("valid email ..!!!");
			}// else for valid domain 
			} // if only 1 @ char

			else
				System.out.println("email must conatin only one '@' character");// @ more than one

		} // if valid email loop

		else
			System.out.println("invalid email");

	} // main

}// class