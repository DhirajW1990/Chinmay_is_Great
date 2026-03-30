// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
public class Overloading {
   public Overloading() {
   }

   void show(int var1) {
      System.out.println("Number1:" + var1);
   }

   void show(int var1, int var2) {
      System.out.println("number1:" + var1 + "number2:" + var2);
   }

   public static void main(String[] var0) {
      Overloading var1 = new Overloading();
      var1.show(3);
      var1.show(6, 7);
   }
}
