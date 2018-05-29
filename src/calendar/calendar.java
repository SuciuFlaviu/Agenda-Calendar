package calendar;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.lang.Object;
import java.text.*;

public class calendar {
  List<eveniment> even;
  public calendar(){
    this.even = new ArrayList<eveniment>();
  }
  public eveniment get(int id){
      return this.even.get(id);
  }
  public void remove(int id){
      this.even.remove(id);
  }
  public int alarm(String ccod){
      int i,k=-1;
      if (this.even.size()>0){
          for(i=0;i<this.even.size();i++){
              if(Long.parseLong(this.even.get(i).cod())==Long.parseLong(ccod)){
                 k=i;
                 break;
              }
          }
      }
      return k;
  }
  
  public int size(){
  return this.even.size(); 
  }
  public void add(String tip, String an, String luna, String zi, String ora,String titlu,String context){

    this.even.add(new eveniment(tip,an,luna,zi,ora,titlu,context));
    
   
  }
  
  public void set(int id,String tip, String an, String luna, String zi, String ora,String titlu,String context){
    even.set(id, new eveniment(tip,an,luna,zi,ora,titlu,context));
  }
  
  /*public static void main(String[] args) {
    //System.out.println("enter text next nextInt");
    
   Scanner reader = new Scanner(System.in); 
   
   
   calendar prog=new calendar();
   prog.list_ev(4);
     
    
   // Reading from System.in 
   System.out.println("Enter a number: "); 
   String sn = reader.next(); 
   // Scans the next token of the input as an int. //once finished 
   reader.close();
  }*/
}
