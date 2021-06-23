package Question9;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
  public static void main(String[] args) {
    try{
      // ファイル名を指定
      File file = new File("report.txt");

      // 上記ファイル名のフルパスを取得
      String str = file.getAbsolutePath();

      // FileReaderクラスのreadメソッドを使って、1文字ずつ読み取る
      FileReader filereader = new FileReader(str);
      int ch;
      while((ch = filereader.read()) != -1){
        // 1文字ずつ読み取った値をchar型にキャストして表示
        System.out.print((char)ch);
      }

      // 最後にファイルを閉じてリソースを開放する
      filereader.close();

      System.out.println();

    }catch(FileNotFoundException e){
      System.out.println(e);
    }catch(IOException e){
      System.out.println(e);
    }
  }
}
