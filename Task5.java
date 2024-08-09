public class Task5{
  public static void main(String [] arg){
    
  }
  static int gsd(int x,int y){
    if(y==0)
      return x;
    gsd(y,x%y);
  }
}
