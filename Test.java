
public class Test {
	public static void main(String[] args){
		String toTokenize = "Hey\\you";
		String[] tokenized = toTokenize.split("\\\\");
		System.out.println(toTokenize);
		String result = "";
		for(int i = 0; i < tokenized.length - 1; i++)
			result += tokenized[i] + "\\\\";
		result += tokenized[tokenized.length-1];
		System.out.println(result);
	}
}
