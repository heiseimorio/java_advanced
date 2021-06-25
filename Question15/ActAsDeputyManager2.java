package Question15;

import Question6.Management;

class ActAsDeputyManager2 {
  public static void main(String[] args) {
    Management kakarityouLamda = () -> {
      System.out.println("係長代理(ラムダ)です。");
    };
    kakarityouLamda.manage();
  }
}
