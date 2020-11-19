
public class CircularList 
{  private int value;
   private CircularList next;
   private CircularList tail;//tail is pointing to the last node
   public CircularList head;
   public void Addfirst(int val)
   {
       CircularList cl=new CircularList ();
       cl.value=val;
       if(tail==null)
       {
           tail=cl;;
           cl.next=cl;
           
       }
       else
       {
           cl.next=tail.next;
           tail.next=cl;
           
       }
   }
   public void show()
   {   CircularList  temp=tail;
       if(tail==null)
       {
           System.out.println("Empty list ");
       }
       else
       {
           while(temp.next!=tail)
           {    temp=temp.next;
               System.out.println(temp.value);
              
           }
           temp=temp.next;
           System.out.println(temp.value);
       }
   }
   
   public void AddLast(int val)
   {
      CircularList c=new CircularList();
      c.value=val;
      if(tail==null)
      {
          tail=c;
          c.next=c;
          
      }
      else
      {
          c.next=tail.next;
          tail.next=c;
          tail=c;
                  
      }
              
   }
   public boolean searchDataPresentORnot(int val)
   {       CircularList temp=tail.next;
   
          if(tail.next.value==val)
          {
              System.out.println("yes present");
                      return true;
          }
          
          else
          {
              while(temp!=tail)
              {
                  if(temp.value==val)
                  {
                       System.out.println("yes present");
                       return true;
                  }
                  temp=temp.next;
                  
              } 
              System.out.println("element not present");
              return false;
              
          }
   }
   public void removeFirst()
   {    if(tail==null)
             
         { 
             System.out.println("list is empty cant deleted");
         }
       else
   {
       
  
         CircularList temp=tail.next;
  
             temp=temp.next;
             tail.next=temp;
         
   }
       
   }
   public void removeelement(int data)
   {
       CircularList temp=tail.next;
       CircularList prev=tail;
       CircularList  head=tail.next;
       if(temp.value==data)
       {
            if(temp==temp.next)
            {
                tail=null;
            }
            else
            {
                temp.next=temp.next.next;
              
            }
       }
       prev=temp;
       temp=temp.next;
       while(temp!=head)
       {
           if(temp.value==data)
           {
               if(temp==tail)
               {
                   tail=prev;
               }
               prev.next=temp.next;
               
           }
           prev=temp;
           temp=temp.next;
           
       }
   }
   public void removeall()
   {
       tail=null;
   }
   public CircularList Copyreverse()

   {             
       CircularList c1=new  CircularList(); 
       CircularList temp=tail.next;
       CircularList head=temp;
       if(temp!=null)
       {
           c1.Addfirst(temp.value);
            temp=temp.next;   
       }
       while(temp!=head)
       {
           
           c1.Addfirst(temp.value);
           temp=temp.next;
       }
       return c1;
   }
   
   
   public CircularList copyList()
   {    CircularList c2=new CircularList();
       CircularList temp=tail.next;
       CircularList head=tail.next;
       if(temp!=null)
       {
           c2.AddLast(temp.value);
           temp=temp.next;
       }
       while(temp!=head)
       {
           c2.AddLast(temp.value);
           temp=temp.next;
       }
       return c2;
   }
   public static void main(String arg[])
   {
       CircularList l=new CircularList ();
       CircularList l1=new CircularList ();
       l.Addfirst(10);
       l.Addfirst(20);
       l.Addfirst(30);
       l.Addfirst(40);
       l.AddLast(50);
       l.show();
       l1.removeFirst();
       l.searchDataPresentORnot(40);
       l.removeFirst();
      l.removeelement(50);
       l.show();
     //  l.removeall();
       System.out.println("original L list");
       l.show();
      System.out.println("reverse L list");
      CircularList l3=  l.Copyreverse();
       l3.show();
      System.out.println("copied new L list");
      CircularList l4=l.copyList();
      l4.show();
   }
   
    
}
