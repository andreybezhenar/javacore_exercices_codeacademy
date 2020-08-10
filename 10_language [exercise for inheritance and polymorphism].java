// problem: build out a Java package with these classes: 
// Language.java, Mayan.java, SinoTibetan.java to model real-world language families.
// desicion:


// 1 file: Language.java that contains also main():
public class Language {

  // fields:
  protected String name; 
  protected int numSpeakers;
  protected String regionsSpoken;
  protected String wordOrder;

  // constructor:
  public Language (String name, int numSpeakers, String regionsSpoken, String wordOrder) {
  this.name = name;
  this.numSpeakers = numSpeakers;
  this.regionsSpoken = regionsSpoken;
  this.wordOrder = wordOrder;
  };

  // method:
  public void getInfo() {
    System.out.print (this.name + " is spoken by ");
    System.out.println (this.numSpeakers + " people mainly in " + this.regionsSpoken + ".");
    System.out.println ("The language follows the word order: " + this.wordOrder + ".");
  }

public static void main (String[] args) {

  // instance of Language class:
  Language myRussian = new Language("Russian", 10000, "Siberia", "Wish I could know");
    myRussian.getInfo();

  // instance of Mayan class:
  Mayan myChuj = new Mayan ("Chuj", 200);
  myChuj.getInfo();

  // instance 1 of SinoTibetan class:
  SinoTibetan mandarinChinese = new SinoTibetan ("Mandarin Chinese", 60000);
 mandarinChinese.getInfo();

  // instance 2 of SinoTibetan class:
   SinoTibetan burmese = new SinoTibetan ("Burmese", 90000);
burmese.getInfo();
  }
}


// 2 file: Mayan.java where we modified constructor and method getInfo():
public class Mayan extends Language {
    
  // modified constructor:
Mayan (String languageName, int speakers) {
    super(languageName, speakers, "Central America", "verb-object-subject");};

  // modified method:
  @Override
  public void getInfo() {
  System.out.print (this.name + " is spoken by ");
  System.out.println (this.numSpeakers + " people mainly in " + this.regionsSpoken + ".");
  System.out.println ("The language follows the word order: " + this.wordOrder + ".");
  System.out.println("Fun fact: " + this.name + " is an ergative language.");

  }
}


// 3 file: Sinotibetan.java where we modified constructor:
public class SinoTibetan extends Language {

  // constructor:
SinoTibetan (String languageName, int speakers) {
    super (languageName, speakers, "Asia", "subject-object-verb");
  };
}

/*mistakes to remember:
no mistakes :) 
*/
