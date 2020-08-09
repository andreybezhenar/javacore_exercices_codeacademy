//problem: build playlist.java with 5 songs using a Java ArrayList.
//decision: 

import java.util.ArrayList;

public class Playlist {
  
  public static void main(String[] args) {

ArrayList<String> desertIslandPlaylist = new ArrayList<String>();

// add songs to playlist:
desertIslandPlaylist.add("Britney Spears x Toxic");
desertIslandPlaylist.add("Charlie XCX x Super Love");
desertIslandPlaylist.add("Taylor Swift x Lover");
desertIslandPlaylist.add("Papa Roach x LAst Resort");
desertIslandPlaylist.add("Halsey x Graveyard");
desertIslandPlaylist.add("Hana x Underwater");

// list of songs:
System.out.println("Playlist: ");
System.out.println(desertIslandPlaylist); // [Britney Spears x Toxic, Charlie XCX x Super Love, Taylor Swift x Lover, Papa Roach x LAst Resort, Halsey x Graveyard, Hana x Underwater]
System.out.println("");

// number of songs:
System.out.println("Number of songs is: ");
System.out.println(desertIslandPlaylist.size()); // 6
System.out.println("");

// remove extra song:
desertIslandPlaylist.remove(0); // bye bye "Britney Spears x Toxic".

// list of songs now:
System.out.println("Playlist after removing the song with index o: ");
System.out.println(desertIslandPlaylist); // [Charlie XCX x Super Love, Taylor Swift x Lover, Papa Roach x LAst Resort, Halsey x Graveyard, Hana x Underwater]
System.out.println("");

// number of songs now:
System.out.println("Number of songs after removing that song is :");
System.out.println(desertIslandPlaylist.size()); // 5
System.out.println("");

// swap 2 songs:
int indexOfSongA = desertIslandPlaylist.indexOf("Charlie XCX x Super Love"); // index of this song is 1.
int indexOfSongB = desertIslandPlaylist.indexOf("Hana x Underwater"); // index of this song is 5.

String nameOfsongA = desertIslandPlaylist.get(indexOfSongA); // save the name of first song.
String nameOfSongB = desertIslandPlaylist.get(indexOfSongB); // save the name of second song.

desertIslandPlaylist.set(indexOfSongA, nameOfSongB); // swap first song.
desertIslandPlaylist.set(indexOfSongB, nameOfsongA); //swap second song.

// new list of songs:
System.out.println("Playlist after changing the order of two songs: ");
System.out.println(desertIslandPlaylist); // [Hana x Underwater, Taylor Swift x Lover, Papa Roach x LAst Resort, Halsey x Graveyard, Charlie XCX x Super Love]
System.out.println("");
  }
  
}
