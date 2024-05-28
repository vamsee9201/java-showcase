
public class compileTimePolymorphism {
    public static void main(String[] args) {
    MathOperations math = new MathOperations();
    System.out.println(math.add(5,7));
        System.out.println(math.add(7,8,9));
        System.out.println(math.add(5.5,7.5));

    }
}

class MathOperations {
    public int add(int a,int b){
        return a+b;
    }
    public int add(int a, int b, int c){
        return a+b+c;
    }
    public double add(double a,double b){
        return a+b;
    }
}
