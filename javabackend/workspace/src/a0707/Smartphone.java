package a0707;

public class Smartphone extends Phone{
    Smartphone(String owner){
        super(owner);
    }

    void internetSearch(){
        System.out.println("인터넷 검색을 합니다.");
    }
}
