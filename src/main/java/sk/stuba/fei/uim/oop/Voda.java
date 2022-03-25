package sk.stuba.fei.uim.oop;

public class Voda extends HracieKarty {
    public Voda() {
    }

    @Override
    public String toString() {
        return "Voda";
    }

    @Override
    public void strel() {
        System.out.println("\u001B[1mstrelil si u vodu\u001B[2m");
    }
    @Override
    public void divokybill() {
        System.out.println("\u001B[1mstrelil si u vodu\u001B[2m");
    }
}
