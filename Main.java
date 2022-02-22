import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

class Main {
  public static void main(String[] args) throws FileNotFoundException, JavaLayerException {
    JFileChooser jfc = new JFileChooser();
    jfc.setMultiSelectionEnabled(true);
    jfc.showOpenDialog(null);

    File[] files = jfc.getSelectedFiles();
    // String path = f.getPath();
    // System.out.println(path);
    // String[] path = {"C:\\Users\\abc\\Desktop\\MP3Player\\song1.mpeg","C:\\Users\\abc\\Desktop\\MP3Player\\song2.mpeg","C:\\Users\\abc\\Desktop\\MP3Player\\song4.mpeg","C:\\Users\\abc\\Desktop\\MP3Player\\song3.mpeg"};
    String[] path = new String[files.length];
    for(int i=0; i<files.length;i++) {
      path[i] = files[i].getPath();
    }
    Scanner sc = new Scanner(System.in);
    int choice;
    do {
      System.out.print("Please enter your choice(1-4): ");
      choice = sc.nextInt();
      FileInputStream fis = new FileInputStream(path[choice]);
      BufferedInputStream bis = new BufferedInputStream(fis);
      Player p = new Player(bis);
      System.out.println("You are playing "+ path[choice]);
      p.play();

    }while(choice < 5);
    sc.close();
  }
}