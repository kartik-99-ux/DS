
package datastructures;
import java.util.*;

public class Josephus extends Thread
{
    
  public  static void whoisalive(Vector s,int k,int index)throws Exception
  {
       
       if(s.size()==1)
       {    Thread.sleep(1000);
         System.out.println("Josephus Zinda hai-----> (: because he was at position ");
           System.out.println(s.get(0));
       }
       try{
       index=(index+k)%s.size();
       s.remove(s.get(index));
       whoisalive(s,k,index);}
       catch(Exception e){}
       
       
  }
    
    
    
  public static void main(String arg[]) throws Exception 
  {    Josephus t=new Josephus();
     t.start();
      Scanner obj=new Scanner(System.in);
     Vector<Integer> a=new Vector<Integer>();
     int n=40;
    for(int i=1;i<=n;i++)
    {
        a.add(i);
    }
    int k=7;
    k=k-1;
    int index=0;
    whoisalive(a,k,index);
      
  }
    
}
