package Question13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class ReadWriteThread2 implements Runnable {

  String readFilePath;
  String writeFilePath;
  String empNumber;
  String inputContet;
  String inputTime;
  List<String> readData;
  String createDirPath = null;
  String createFileName;

  public void run() {
    this.readData = read(this.readFilePath, this.inputContet, this.inputTime);
    createDir();
  }

  public ReadWriteThread2(String readfileName) {
    // ファイル名を指定
    File readFile = new File(readfileName);
    // 読み込みファイル名のフルパスを取得
    this.readFilePath = readFile.getAbsolutePath();
  }


  public List<String> read(String readFilePath, String inputContet, String inputTime) {

    List<String> data = new ArrayList<>();
    try(BufferedReader br = new BufferedReader(new FileReader(readFilePath))) {
      String line;
      while ((line = br.readLine()) != null) {
        data.add(line);
      }
      br.close();


      String blank = "	";
      String workContent = blank + inputContet;

      String time = blank + inputTime;

      data.set(3, workContent);
      data.set(6, time);

    } catch(FileNotFoundException e){
      System.out.println(e);
    } catch(IOException e) {
      System.out.println(e);
    }
    return data;
  }

  public void write(List<String> readData) {
    try {
      //
      Path p = Paths.get(this.createDirPath+ "/report_" + this.empNumber + ".txt");
      createFileName = p.toString();
      try{
        Files.createFile(p);
      }catch(IOException e){
        System.out.println(e);
      }

      // FileWriterクラスのオブジェクトを生成する
      FileWriter fileWriter = new FileWriter(createFileName);

      // PrintWriterクラスのオブジェクトを生成する
      PrintWriter printWriter = new PrintWriter(new BufferedWriter(fileWriter));

      // PrintWriterクラスのprintlnメソッドを使ってファイルに書き込む
      for(String text: readData) {
        if(text.equals("以上、報告終わり。")) {
          printWriter.print(text);
        } else {
          printWriter.println(text);
        }
      }

      // 書き込み対象のファイルを閉じてリソースを開放する
      printWriter.close();
    } catch(FileNotFoundException e){
      System.out.println(e);
    } catch(IOException e) {
      System.out.println(e);
    }
  }

  // ディレクトリの作成
  public void createDir() {
    try(BufferedReader br = new BufferedReader(new FileReader("path.text"))) {
      String line;

      while ((line = br.readLine()) != null) {
        this.createDirPath = line;
      }
      br.close();
      // ファイル名を指定
      File f = new File(this.createDirPath);
      if (!f.exists()) {
        //フォルダ作成実行
        f.mkdirs();
        System.out.println("フォルダを作成しました。");
      } else {
        System.out.println("フォルダは既に存在します。");
      }
    } catch(FileNotFoundException e){
      System.out.println(e);
    } catch(IOException e) {
      System.out.println(e);
    }
  }
}
