package hu.szamalk;

import java.util.Arrays;

public class LogikaiJatek extends Babu {
    private Babu[][] tabla = new Babu[4][5];
    private int[] sorrend = new int[10];
    private int babuDb;

    public LogikaiJatek() {
        this(3);
    }

    public LogikaiJatek(int babuDb) {
        super("kék");
        this.babuDb = babuDb;
        if(2 >= babuDb && babuDb >= 15){
            System.out.println("minimum 2, maximum 15 db bábú");
        }
    }

    public boolean van8FelettEro(){
        return false;
    }

    public void kezd(){

    }

    public void ment(){

    }

    public void vege(){

    }

    @Override
    public String toString() {
        return "LogikaiJatek{" +
                "tabla=" + Arrays.toString(tabla) +
                ", sorrend=" + Arrays.toString(sorrend) +
                ", babuDb=" + babuDb +
                '}';
    }
}
