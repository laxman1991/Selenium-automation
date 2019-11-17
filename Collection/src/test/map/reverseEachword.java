package test.map;
public class reverseEachword {

	public static void main(String[] args) {

		String name="india is loving";
		
		String token[]=name.split("\\s");
		String reverse=" ";
		for(int i=0;i<token.length;i++)
		{
			for(int k=token[i].length()-1;k>=0;k--)
			{
				reverse=reverse+token[i].charAt(k);
			}
			System.out.print(reverse);
		}
		/*for(int i=token.length-1;i>=0;i--)
		{
			reverse=reverse+" "+token[i];
		}
		System.out.println(reverse+" ");*/
	}
}
