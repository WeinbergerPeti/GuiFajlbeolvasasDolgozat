package modell;

public class FajlBeolvas 
{
    private String nev;
    private int kor;
    private String neme;
    private int munkavalToltottEv;
    
    public FajlBeolvas(String sor)
    {
        String []s = sor.split(";");
        
        this.nev=s[0];
        this.kor=Integer.parseInt(s[1]);
        this.neme=s[2];
        this.munkavalToltottEv=Integer.parseInt(s[3]);
    }

    public String getNev() {
        return nev;
    }

    public int getKor() {
        return kor;
    }

    public String getNeme() {
        return neme;
    }

    public int getMunkavalToltottEv() {
        return munkavalToltottEv;
    }
    
    
}
