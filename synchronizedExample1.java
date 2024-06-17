public class synchronizedExample1 {

	public static void main(String arr[])
	{
		new PrintStringThread("Hello","there");
		new PrintStringThread("How are","you?");
		new PrintStringThread("Thank you","very much !");
		
	}
}
