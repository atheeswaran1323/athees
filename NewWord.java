package forloop;

public class NewWord {
public static void main(String[]args) {
	String word="onesoft";
	String reverse="";
	for(int i=0;i<word.length();i++) {
		reverse=reverse+word.charAt(i);
		System.out.println(reverse);
		
	}
}
}
