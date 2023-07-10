package a0710;
// 난 동물원의 사육사이다.
// 육식 동물이 들어오면 난 먹이를 던져준다.
// 호랑이가 오면 사과를 던져준다.
// 사자가 오면 바나나를 던져준다
// 악어가 오면 딸기를 던져준다
// 표범이 오면 오렌지를 던져준다

public class Sample {
    public static void main(String[] args) {
        ZooKeeper zooKeeper = new ZooKeeper();
        Tiger tiger = new Tiger();
        Lion lion = new Lion();
        Crocodile crocodile = new Crocodile();
        Leopard leopard = new Leopard();
        zooKeeper.feed(tiger);
        zooKeeper.feed(lion);
        zooKeeper.feed(crocodile);
        zooKeeper.feed(leopard);
    }
}

class Animal {
    String name;
    public Animal() {

    }
    
    public Animal(String name){
        this.name = name;
    }
}
class Tiger extends Animal{

}
class Lion extends Animal{
}
class Crocodile extends Animal{
}
class Leopard extends Animal{
}
class ZooKeeper{
    void feed(Tiger tiger){
        System.out.println("feed apple");
    }
    void feed(Lion lion){
        System.out.println("feed banana");
    }
    void feed(Crocodile crocodile){
        System.out.println("feed strawberry");
    }
    void feed(Leopard leopard){
        System.out.println("feed orange");
    }
}