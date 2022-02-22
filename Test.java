// public import java.io.BufferedInputStream;
// import java.io.File;
// // import java.io.File;
// import java.io.FileInputStream;
// import java.util.Scanner;

// import javax.swing.JFileChooser;
// // import javax.swing.filechooser.FileFilter;

// import javazoom.jl.player.Player;
// // import extensionFilter.*;

// class Main {
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     try {
//       String path = "C:\\Users\\abc\\Desktop\\MP3Player\\song1.mpeg";
//       // String[] arr = {"C:Users\\abc\\Desktop\\MP3Player\\song1.mpeg", "C:Users\\abc\\Desktop\\MP3Player\\song2.mpeg", "C:Users\\abc\\Desktop\\MP3Player\\song3.mpeg", "C:Users\\abc\\Desktop\\MP3Player\\song4.mpeg", "C:Users\\abc\\Desktop\\MP3Player\\song5.mpeg"};
//       // JFileChooser jc = new JFileChooser();
//       // jc.setFileFilter(new FileFilter() {
//       //   @Override
//       //   public boolean accept(File f) {
//       //     if(f.isDirectory()){
//       //       return true;
//       //     } else {
//       //       String  ext = Utils.getExtension(f);
//       //       if(ext!=null) {
//       //         if(ext.equals("mp3")|| ext.equals("mpeg")){
//       //           return true;
//       //         }
//       //       }
            
//       //     }
//       //     return false;
//       //   }

//       //   @Override
//       //   public String getDescription() {
//       //     return "only audio files";
//       //   }
        
//       // });
//       // jc.addChoosableFileFilter(new FileFilter() {
//       //   @Override
//       //   public String getDescription() {
//       //     System.out.println(3);
//       //     return "mpeg files only (.mpeg)";
//       //   }

//       //   @Override
//       //   public boolean accept(File f) {
//       //     if (f.isDirectory()) {
//       //       System.out.println(1);
//       //       return true;
//       //     } else {
//       //       System.out.println(2);
//       //       return f.getName().toLowerCase().endsWith(".mpeg");
//       //     }
//       //   }
//       // });
//       // jc.showOpenDialog(null);
//       // File f = jc.getSelectedFile();
//       // System.out.println(f.getPath());
      
//       // while(true) {
//       //   int ch = sc.nextInt();
//       //   String path = arr[0];
//       //   switch(ch){
//       //     case 1:
//       //     System.out.print(path);
//       //     path = arr[0];
//       //     break;
//       //     case 2:
//       //     path = arr[1];
//       //     break;
//       //     case 3:
//       //     path = arr[2];
//       //     break;
//       //     case 4:
//       //     path = arr[3];
//       //     break;
//       //     case 5:
//       //     path = arr[4];
//       //     break;
//       //     default:
//       //     break;

//       //   }
//       //   System.out.print(arr[ch]);
//         FileInputStream fis = new FileInputStream(path);
//         BufferedInputStream bfs = new BufferedInputStream(fis);
//         Player p = new Player(bfs);
//         p.play();
      

//     } catch (Exception e) {
//       System.out.println(e);
//     } finally{
//       sc.close();
//     }
//   }
  
// }class Test {
  
// }
