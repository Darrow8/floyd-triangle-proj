import java.util.*;  


public class Main {
  public static void main(String[] args) {

    System.out.println("Enter Number of Rows:");
    Scanner sc = new Scanner(System.in);   
    int rows = sc.nextInt();  
    System.out.println("");
    int  num = 1 ;
    for(int i =1; i<= rows; i++){
      for (int j = 1; j <= i; j++) {
        System.out.print(num);
        num++;
      }
      System.out.println("");
    }
  }
}
