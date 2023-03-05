import java.util.Random;

public class Dado {
    private int numCaras;
    private int ultimaCara;

    public Dado() {
        this.numCaras = 6;
        this.ultimaCara = 0;
    }

    public Dado(int numCaras) {
        this.numCaras = numCaras;
        this.ultimaCara = 0;
    }

    public int getNumCaras() {
        return numCaras;
    }

    public int getUltimaCara() {
        return ultimaCara;
    }

    public void setNumCaras(int numCaras) {
        this.numCaras = numCaras;
    }

    public int lanzar() {
        Random rand = new Random();
        this.ultimaCara = rand.nextInt(this.numCaras) + 1;
        return this.ultimaCara;
    }
}

