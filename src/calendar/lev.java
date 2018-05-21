/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calendar;

/**
 *
 * @author acasa
 */
public class lev {
    private int id;
    private String cod;
    private String titlu;
    public lev(int tid, String tcod ,String ttitlu ){
       this.id=tid;
       this.cod=tcod;
       this.titlu=titlu;
    }
    public int idGet(){
        return this.id;
    }
    public void idSet(int tid){
        this.id=tid;
    }
    public String codGet(){
        return this.cod;
    }
    public void codSet(String tcod){
        this.cod=tcod;
    }
      public String titluGet(){
        return this.titlu;
    }
    public void titluSet(String ttitlu){
        this.titlu=ttitlu;
    }
}
