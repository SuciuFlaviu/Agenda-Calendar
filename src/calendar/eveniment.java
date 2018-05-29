package calendar;

public class eveniment {
  private String tip;
  private String an;
  private String luna;
  private String zi;
  private String ora;
  private String titlu;
  private String cont;
  public eveniment(String rtip, String ran, String rluna, String rzi, String rora, String rtitlu, String rcont){
    this.tip=rtip;
    this.an=ran;
    this.luna=rluna;
    this.zi=rzi;
    this.ora=rora;
    this.titlu=rtitlu;
    this.cont=rcont;
  }
  
   public String titluget(){
    return this.titlu;
  }
  public void titluset(String a){
    this.titlu=a;
  } public String contget(){
    return this.cont;
  }
  public void contset(String a){
    this.cont=a;
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
    this.tip=a;
  }
   public String anget(){
    return this.an;
  }
  public void anset(String a){
    this.an=a;
  }  
  public String cod(){
      return (this.an+this.luna+this.zi+this.ora.split(":")[0]+this.ora.split(":")[1]);
  }
  
}
