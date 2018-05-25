/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calendar;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.lang.Object;
import java.text.*;
/**
 *
 * @author acasa
 */
public class llist {
  private List<lev> llev;
  public llist(){
    this.llev = new ArrayList<lev>();
  }
  public void clear(){
      this.llev.clear();
  }
  public void add(int id, String cod, String titlu){
      this.llev.add(new lev(id,cod,titlu));
  }
}
