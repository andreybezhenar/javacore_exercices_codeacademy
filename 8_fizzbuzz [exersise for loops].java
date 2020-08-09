// write a FizzBuzz.java program that outputs numbers from 1 to 100… with a catch:
// for multiples of 3, print Fizz instead of the number.
// for the multiples of 5, print Buzz.
// for numbers which are multiples of both 3 and 5, print FizzBuzz.

// desicion: 

public class FizzBuzz {
    
  public static void main(String[] args) {
      
    for (int i=1; i<=100; i++){
        
    if (i%3 == 0){ // [i] multiples of 3? let's check also maybe [i] multiples of 5 same time?
        if (i%5 == 0) {System.out.println("BuzzFizz");} // true? then print BuzzFizz.
        else {System.out.println("Fizz");}} // line above was false? then [i] multiples only of 3 and we print Fizz.
        
    else if (i%5 == 0){System.out.println("Buzz");} // let's check if [i] only multiples of 5 and print Buzz.
    
    else  {System.out.println(i);} // [i] was not a multiple of either 3 or 5? then we just print this number.
       
    
  }
}
}

/* mistakes:
1. shoud be declare type of counter inside of loop FOR. */
