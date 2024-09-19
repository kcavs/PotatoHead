import java.util.*;
public class PotatoHead{
    private boolean mustache;
    private int earrings;
    private String shoeColor;
    private String noseShape;
    public PotatoHead(){
        mustache=true;
        earrings= 5;
        shoeColor= "blue";
        noseShape= "round";
    }
    public PotatoHead(boolean m, int e, String s, String n){
        mustache=m;
        earrings=e;
        shoeColor=s;
        noseShape=n;
    }
    public boolean getmustache(){
        return mustache;
    }
    public int getearrings(){
        return earrings;
    }
    public String getshoeColor(){
        return shoeColor;
    }
    public String getnoseShape(){
        return noseShape;
    }
    public void setmustache(boolean m){
        mustache=m;
    }
    public void setearrings(int e){
        earrings=e;
    }
    public void setshoeColor(String s){
        shoeColor=s;
    }
    public void setnoseShape(String n){
        noseShape=n;
    }
    public void talk(){
        System.out.println("superb");
    }
    public int ski(){
        int miles=1;
        miles+=1;
        return miles;
    }
    public boolean lieDetect(){
        Scanner input=new Scanner(System.in);
        System.out.println("tell a truth or lie about yourself: ");
        String x=input.nextLine();
        double y=Math.random();
        boolean tf = false;
        if(y>=0.5){
            tf=true;
        }
        if(y<=0.4){
            tf=false;
        }
        return tf;
    }
    public String toString(){
        return "i have a mustache: "+this.mustache;
    }
    public static void main(String[]args){
        PotatoHead kash= new PotatoHead();
        PotatoHead delia= new PotatoHead(true,2,"black","round");
        int dEarrings=delia.getearrings();
        kash.setshoeColor("red");
        System.out.println(kash.toString());
        System.out.println(delia.toString());
        kash.talk();
        kash.ski();
        delia.lieDetect();
    }
}