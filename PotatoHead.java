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
    public String toString(){
        return this.earrings+" is the ammount of earrings i have. i have a mustache: "+this.mustache+" this is my nose shape "+this.noseShape+" my shoes are "+this.shoeColor;
    }
    public static void main(String[]args){
        PotatoHead kash= new PotatoHead();
        PotatoHead delia= new PotatoHead(true,2,"black","round");
        int dEarrings=delia.getearrings();
        kash.setshoeColor("red");
        System.out.println(kash.toString());
        System.out.println(delia.toString());
    }
}