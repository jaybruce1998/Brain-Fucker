import java.io.File;
import java.util.Scanner;
import java.util.HashMap;
import java.io.FileWriter;
public class BrainFucker
{
	public static void main(String[] a) throws Exception
	{
		File myObj = new File(a[0]);
		Scanner input = new Scanner(myObj);
		HashMap<Character, Character> m=new HashMap<>();
		String b="[]<>+-.,", r="";
		for(int i=0; i<8; i++)
			m.put(b.charAt(i), a[1].charAt(i));
		while(input.hasNextLine())
			for(Character c: input.nextLine().toCharArray())
				r+=m.get(c);
		FileWriter myWriter = new FileWriter("output.txt");
		myWriter.write(r);
		myWriter.close();
	}
}