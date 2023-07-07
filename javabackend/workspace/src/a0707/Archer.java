package a0707;

public class Archer {
    String name;
    String power;

    public Archer(String name, String power) {
        this.name = name;
        this.power = power;
    }
// object라는 클래스는 모든 객체의 조상클래스

    public boolean equals(Object obj) {

        Archer temp = (Archer) obj;
        if (name == temp.name && power == temp.power) {
            return true;
        } else {
            return false;
        }
    }
}