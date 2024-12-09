package hu.szamalk;

public class Tabla {
    private char[][] t;
    private char uresCella;

    public Tabla(char uresCella) {
        this.t[7][7] = uresCella;
    }

    public void megjelenit(){
        Tabla tabla = new Tabla('#');
        for (int sor = 0; sor < t.length; sor++) {
            for (int oszl = 0; oszl < t.length; oszl++) {
                System.out.println(t[sor][oszl]);
            }
        }
    }

    public void elhelyez(int n){
        char kiralyno = 'K';

    }

    public boolean uresOszlop(){
        
        return false;
    }

    public boolean uresSor(){
        return false;
    }
}

