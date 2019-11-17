package _TestJavaProgramsSkills;

public class Testpalindrome {

	
public static void main(String[] args) {
  
	int num=969;
	int check=969;
    int reverse=0;
    int rem=0;
	while(num>0)
	{
		rem=num%10;
		reverse=reverse*10+rem;
		num=num/10;
	}
	if(reverse==check)
	{
		System.out.println("palindrome");
	}else{
		System.out.println("not palindrome");
	}
	}
}
