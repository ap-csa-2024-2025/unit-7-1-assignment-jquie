import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    String input = "";
    ArrayList <String> words = new ArrayList<String>();
    while (!input.equals("STOP"))
    {
      System.out.println("In the loop. Enter a word:");
      input = sc.nextLine();
      words.add(input);
    }
    words.remove(words.size()-1);

    System.out.println("List size: " + words.size());
    System.out.println("List: " + words);

    if (words.size() > 2)
    {
      String temp = words.get(words.size()-1);
      words.remove(0);
      words.add(0,temp);
      words.remove(words.size()-1);
    }
    System.out.println("List: " + words);
  }
}
