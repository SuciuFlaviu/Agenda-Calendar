package calendar;

public class eveniment {
  private String tip;
  private String an;
  private String luna;
  private String zi;
  private String ora;
  public eveniment(String rtip, String ran, String rluna, String rzi, String rora){
    this.tip=rtip;
    this.an=ran;
    this.luna=rluna;
    this.zi=rzi;
    this.ora=rora;
  }
  public String tipget(){
    return this.tip;
  }
  public void tipset(String a){
    this.tip=a;
  }
   public String lunaget(){
    return this.luna;
  }
  public void lunaset(String a){
    this.luna=a;
  }
   public String ziget(){
    return this.zi;
  }
  public void ziset(String a){
    this.zi=a;
  }
   public String oraget(){
    return this.ora;
  }
  public void oraset(String a){
    this.tip=ora;
  }
  
  
}
