import java.util.Scanner;

public class ReplaceSpace1_4 {
	public static void main(String[] args) {
		System.out.println("Please input a string:");
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();	
		System.out.println(ReplaceSpace(text));
		sc.close();
	}
	
	public static String ReplaceSpace(String s){
		int spaceCount=0;
		char[] ary = s.toCharArray();
		for(int i=0;i<ary.length;i++){
			if(ary[i]==' ')	spaceCount++;
		}
		int newLength=ary.length+spaceCount*2;
		char[] aryNew= new char[newLength];
		aryNew[newLength]='\0';
		for(int j=ary.length-1;j>=0;j--){
			if(ary[j]==' '){
				aryNew[newLength-1]='0';
				aryNew[newLength-2]='2';
				aryNew[newLength-3]='%';
				newLength=newLength-3;					
			}
			else{
				aryNew[newLength-1]=ary[j];
			    newLength--;
			}				
		}
		String d=new String(aryNew);
		return d;	
	}
}
