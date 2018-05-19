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
  public void list_ev(String tip){
    DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd hh:MM:ss"); 	
    Date date = new Date(); 
    String strdata= dateFormat.format(date);
    strdata=strdata.replace(" ",";");
    strdata=strdata.replace("/",";");
    strdata=strdata.replace(":",";");
    System.out.println();
    String[] dt=strdata.split(";");
    System.out.println(dt[2]);
    
  }
  public void add(String tip, String an, String luna, String zi, String ora){

    this.even.add(new eveniment(tip,an,luna,zi,ora));
    
   
  }
  
  public void set(int id,String tip, String an, String luna, String zi, String ora){
    even.set(id, new eveniment(tip,an,luna,zi,ora));
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
