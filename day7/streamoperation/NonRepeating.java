package streamoperation;
public class NonRepeating{
	public static void main(String[] args) {
	String input = "Java article is awesome";
	Character character = input.chars().mapToObj(c -> (char) c).filter (e -> input.indexOf(e) == input.indexOf(e)).findFirst().get();
	System.out.println( character );
	}

}
//Non Repeating first character