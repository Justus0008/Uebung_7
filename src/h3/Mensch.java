package h3;

public class Mensch {

    public String name;
    public int gebJahr;
    public int alter;

    public void setName(String n) {
        name = n;
    }

    public void setGebJahr(int j) {
        gebJahr = j;
    }

    public void setAlter() {
        alter = 2025 - gebJahr;
    }

    public String getName() {
        return name;
    }

    public int getGebJahr() {
        return gebJahr;
    }

    public int getAlter() {
        return alter;
    }
}