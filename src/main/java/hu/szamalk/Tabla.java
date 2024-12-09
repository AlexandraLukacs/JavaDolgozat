package hu.szamalk;

public class Tabla {
    private char[][] t;
    private char uresCella;

    public Tabla(char uresCella) {
        t[7][7] = uresCella;
        this.uresCella = uresCella;
    }

    public void megjelenit(){
        Tabla tabla = new Tabla('#');
        for (int sor = 0; sor < t.length; sor++) {
            for (int oszl = 0; oszl < t.length; oszl++) {
                System.out.println(t[sor][oszl]);
            }
        }
    }

    
}

