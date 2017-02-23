public class SkipEncrypt{
	public static void main(String[] args){
		
		System.out.println("What is the message you would like to 3ncrypt?");
		String a = IO.readString();	//get input from user
		
		int spaces = (a.length() - a.replace(" ", "").length()-1);//counts number of whitespace in original input
		
		SkipEncrypt n = new SkipEncrypt();//create 3ncrypt object and implement it with input
		String result = n.skip3ncrypt((a.replaceAll("\\s+","")), spaces);//removes spaces from input
		
		
		System.out.println("------------------------");
		System.out.println("Here is your 3ncryption:");
		System.out.println(result);
		System.out.println("------------------------");
	}//main method end
	
	String skip3ncrypt(String a, int spaces){
		//Define different strings to put the different chars in- will add them later
		String s1 = "";
		String s2 = "";
		String s3 = "";
		String answer = "";
		
		for(int j = 0; j < (a.length() - spaces); j+=3){
			s1 = s1 + a.charAt(j);
			s2 = s2 + a.charAt(j+1);
			s3 = s3 + a.charAt(j+2);	
		}//for end
		
		int randChar1 = (int) (Math.random()* s1.length());
		int randChar2 = (int) (Math.random()* s2.length());
		int randChar3 = (int) (Math.random()* s3.length());
		
		s1.charAt(randChar1) = (char)(int)(Math.random() + 8);
		s2.charAt(randChar2) = (int)(Math.random() - 4);
		s3.charAt(randChar3) = (int)(Math.random() + 2);
		
		
		int rand1 = (int) (Math.random() *50 +1);
		int rand2 = (int) (Math.random() *1000 +17);
		int rand3 = (int) Math.random();
		
		answer = s1 + rand1 + s3 + rand2 + s2 + rand3;
		return answer;
	}//skipEncrypt method end
}//SkipEncrypt class end
