package Question10;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

// report2.txtに記載するためのクラス
public class WriteFile {
  public static void main(String[] args) {
    try {
      // ファイル名を指定
      File file = new File("report2.txt");

      // 上記ファイル名のフルパスを取得
      String filePath = file.getAbsolutePath();

      // FileWriterクラスのオブジェクトを生成する
      FileWriter fileWriter = new FileWriter(filePath);

      // PrintWriterクラスのオブジェクトを生成する
      PrintWriter printWriter = new PrintWriter(new BufferedWriter(fileWriter));

      // PrintWriterクラスのprintlnメソッドを使ってファイルに書き込む
      printWriter.println("		報告書");
      printWriter.println("		");
      printWriter.println("本日の作業内容:");
      printWriter.println("	ファイル書き込みプログラムの作成");
      printWriter.println("	");
      printWriter.println("作業時間:");
      printWriter.println("	１時間");
      printWriter.println("	");
      printWriter.print("以上、報告終わり。");

      // 書き込み対象のファイルを閉じてリソースを開放する
      printWriter.close();

    } catch(FileNotFoundException e){
      System.out.println(e);
    }catch(IOException e){
      System.out.println(e);
    }
  }
}
