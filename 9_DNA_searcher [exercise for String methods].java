// problem: write a DNA.java program that determines whether there is a protein in a strand of DNA.
// decision: 


public class DNA {

  String dna1 = "ATGCGATACGCTTGA"; // first DNA to check.
  String dna2 = "ATGCGATACGTGA"; // second DNA to check;
  String dna3 = "ATTAATATGTACTGA"; // third DNA to check;

  String dna = dna3; // put here DNA you wanna test: dna 1, dna 2 or dna 3.
  
  public DNA (){}; // constructor;

  public static void main(String[] args) {

    DNA myDna = new DNA(); // our instance.
    System.out.print("Length of our DNA is: ");
    System.out.println(myDna.dna.length());

    // If ATG and TGA is a substring, this would print out an index. 
    // if ATG and TGA don’t exist within our DNA, it would print out -1.
    System.out.print("ATG codon starts at: ");
    System.out.println(myDna.dna.indexOf("ATG"));
    System.out.print("TGA codon starts at: ");
    System.out.println(myDna.dna.indexOf("TGA")); 

    int dnaLength = myDna.dna.length(); // lenght of DNA.
    int itStarts = myDna.dna.indexOf("ATG"); // index where ATG starts.
    int itEnds = myDna.dna.indexOf("TGA"); // index where TGA starts.

    if ((itStarts != -1) && (itEnds != -1) && ((itEnds - itStarts)%3 == 0)){
      System.out.println(" ");
      System.out.println("There is protein!");
      System.out.println("And this is: " + myDna.dna.substring(itStarts, (itEnds + 3)));
    } else {System.out.println("No protein");}


    //  -. .-.   .-. .-.   .
    //    \   \ /   \   \ / 
    //   / \   \   / \   \  
    //  ~   `-~ `-`   `-~ `-

  }

}

// code was made this way just for practice String methods (!)
