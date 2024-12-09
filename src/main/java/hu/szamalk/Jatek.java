package hu.szamalk;

public abstract class Jatek {
    private static int jatekDb = 0;

    public Jatek() {
        this.jatekDb += 1;
    }

    public static int getJatekDb() {
        return jatekDb;
    }

    public void kezd(){
        System.out.println("Kezdés");
    }

    public void ment(){
        System.out.println("Mentés");
    }

    public void vege(){
        System.out.println("Vége");
    }
}
