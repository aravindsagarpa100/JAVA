import java.io.*;
public class Cat
{
   
    public static void main(String args[])  throws IOException {  
      FileInputStream in = new FileInputStream("E:/Java/input.txt");
      FileOutputStream out = new FileOutputStream("output.txt"); 
         int c;
         while ((c = in.read()) != -1) {
            out.write(c);
         }
         if (in != null) {
            in.close();
         }
         if (out != null) {
            out.close();
         }
      
   }
}