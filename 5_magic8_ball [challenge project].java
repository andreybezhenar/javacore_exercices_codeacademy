// problem: Magic 8-Ball
// decision:

import java.util.Random;

public class Magic8{
public static void main(String[] args){

int randomNumber = new Random().nextInt(8) + 1; // this code line generate random number. 
//"+1" changes the lower limit of the range from 0 to 1.

switch (randomNumber){

  case 1:
  System.out.println("As I see it, yes.");
  break;

  case 2:
  System.out.println(" Without a doubt.");
  break;

  case 3:
  System.out.println("You may rely on it.");
  break;

  case 4:
  System.out.println("Ask again later.");
  break;

  case 5:
  System.out.println(" Cannot predict now.");
  break;

  case 6:
  System.out.println("My sources say no.");
  break;

  case 7:
  System.out.println("Outlook not so good.");
  break;

  case 8:
  System.out.println("Yes.");
  break;
}

}
}
