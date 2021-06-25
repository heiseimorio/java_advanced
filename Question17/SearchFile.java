package Question17;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;


public class SearchFile {
  public static void main(String[] args) {
    /**
     * 0039    第一開発部
     * 0035    開発部
     * 0079    開発部
     * 0123    第一開発部
     * 0303    第二開発部
     * 上記の人達のファイル名を出力する
     *
     * File クラスの listFiles メソ⏿ドとラムダ式を用いて。
     */
    List<String> inputData = new ArrayList<>();
    try(BufferedReader br = new BufferedReader(new FileReader("EmployeeList.dat"))) {
      String line;

      while ((line = br.readLine()) != null) {
        inputData.add(line);
      }
      br.close();
    }catch(FileNotFoundException e){
      System.out.println(e);
    }catch(IOException e){
      System.out.println(e);
    }

    List<String> target = new ArrayList<>();
    inputData.forEach(text -> {
      if(text.contains("開発部")) {
        String trimmingEmpNumber = text.substring(0, 4);
        target.add(trimmingEmpNumber);
      }
    });

    // 報告書フォルダ(Question17用ファイル置場)のパスを取得
    String filePath = searchDirPath();

    // Fileクラスのメソッドをラムダ式で使って、取得する
    File dir = new File(filePath);
    File[] files = dir.listFiles(file -> file.isFile());

    // 〇〇開発部に所属している人のファイル名を出力
    for (int i = 0; i < files.length; i++) {
        String fileName = files[i].getName();
        for(String empNumber : target) {
          if(fileName.contains(empNumber)) {
            System.out.println(fileName);
          }
        }
    }

  }

  // path.textからQuestion17用ファイル置場のpathを取得
  private static String searchDirPath() {
    String question17Path = null;
    try(BufferedReader br = new BufferedReader(new FileReader("path.text"))) {
      String line;
      int count = 0;
      while ((line = br.readLine()) != null) {
        count++;
        if(count == 2) {
          question17Path = line;
        }
      }
      br.close();

    } catch(FileNotFoundException e){
      System.out.println(e);
    } catch(IOException e) {
      System.out.println(e);
    }
    return question17Path;
  }

}
