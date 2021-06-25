package Question14;

import Question6.Management;

class ActAsDeputyManager1 {
  public static void main(String[] args) {
    Management kakarityou = new Management(){
      public void manage() {
        System.out.println("係長代理です。");
      }
    };
    kakarityou.manage();
  }
}
