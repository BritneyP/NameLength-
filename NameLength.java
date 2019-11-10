import java.util.Scanner;
public class PersonName {

  public static void main(String[] args) {
  Scanner keyboard= new Scanner (System.in);
  String name;
  System.out.println("What is your name?");
  name=keyboard.next();
  System.out.println("The name is" + " "+ name+ " "+"which is"+ " " +name.length()+" "+"letters long");
  keyboard.close();
  

  }

}
