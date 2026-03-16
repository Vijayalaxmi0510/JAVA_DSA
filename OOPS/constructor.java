public class constructor {
    public static void main(String[] args) {
      student s1=new student("vijayalaxmi");
      s1.rollNo=61;
        System.out.println(s1.name);
        System.out.println(s1.rollNo);
    }
}
class student{
    String name;
    int rollNo;
    student(String name){
        this.name=name;
    }
}
