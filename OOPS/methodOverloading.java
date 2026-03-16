public class methodOverloading {
    public static void main(String[] args) {
        calculator calc=new calculator();
        System.out.println(calc.sum(1,2));
        System.out.println(calc.sum(1,2,3));
        System.out.println(calc.sum(2.3,2.1));
    }
}
class calculator{
    int sum(int a,int b){
        return a+b;
    }
    int sum(int a,int b, int c){
        return a+b+c;
    }
    double sum(double a,double b){
        return a+b;
    }
}
