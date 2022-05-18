package com.masai;

public class vowelAndConsonant {
  
	
	
	void finalVowel(char ch)
	{
		if(ch == 'a' || ch == 'e' || ch=='i' || ch == 'o' || ch == 'u' || ch=='A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
		{
			System.out.println("Vowel");
		}
		else if ((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
		{
			System.out.println("Consonant");
		}
		else
		{
			System.out.println("Invalid character");
		}
	}
	public static void main(String[] args) {
		vowelAndConsonant  alpha = new vowelAndConsonant();
        
		alpha.finalVowel('U');
		
		alpha.finalVowel('D');
		
		alpha.finalVowel('*');
	}

}
