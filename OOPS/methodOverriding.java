public class methodOverriding {
    public static void main(String[] args) {
      deer d=new deer();
      d.eat();
    }
}
class Animal{
    void eat(){
        System.out.println("Eats anything");
    }
}
class deer extends Animal{
    void eat(){
        System.out.println("Eats grass");
    }
}