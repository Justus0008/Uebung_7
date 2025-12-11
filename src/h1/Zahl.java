package h1;

public class Zahl {
    public boolean even;
    public boolean small;
    public boolean positive;
    public int num;

    public void setEven() {
        even = (Math.abs(num) % 2 == 0);
    }

    public void setPositive() {
        positive = (num > 0);
    }

    public void setSmall() {
        small = (num < 100);
    }
}
