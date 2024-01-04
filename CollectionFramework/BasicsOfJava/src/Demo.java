class Demo{
	public static void main(String[] args) {
		String str2="I love you so much that you are always in my thoughts, \n"
				+ "No matter what I am doing.\n"
				+ "I always think about the beautiful memories we have created together,\n"
				+ "And I want to make many more lovely moments.\n"
				+ "You are the best thing that has happened to me,\n"
				+ "and I thank you for all the love you have brought into my life.\n"
				+ "Thank you for making me a fortunate.\n"
				+ "Your dearest,\n"
				+ "---> BIKASH <---";
		String str="WISH YOU MANY MANY HAPPY RETURNS OF THE DAY";
		String str1="MONIKA";
		
		
		for(int i=0;i<=str.length()-1;i++) {
			System.out.print(str.charAt(i));
			try {
				Thread.sleep(100);
			}catch(Exception e)
			{
				System.out.print("Handled");
			}
			
		}
		System.out.println();
		for(int i=0;i<=str1.length()-1;i++)
		{
			System.out.print(str1.charAt(i));
			try {
				Thread.sleep(100);
			}catch(Exception e)
			{
				System.out.print("Handled");
			}
			
		}
		System.out.println();
		
		for(int i=0;i<=str2.length()-1;i++) {
			System.out.print(str2.charAt(i));
			try {
				Thread.sleep(50);
			}catch(Exception e)
			{
				System.out.print("Handled");
			}
			
		}
		
	}
	}