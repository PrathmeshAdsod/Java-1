

public class Construct {

    int age;
    String name;
    long num;
    public Construct(int myage) {
        this.age = myage;
        System.out.println("Myself Prathmesh !!");
    }

    private Construct(int myage,String name,long num) {
        this.age = myage;
        this.name = name;
        this.num = num;
    }

    public static void main(String[] args) {
        Construct obj = new Construct(70);
        Construct obj2 = new Construct(60,"Prathmesh",808033580);
        System.out.println(obj.age);
        System.out.println("I am "+obj2.name+" my age is "+obj2.age+" and my Number is "+obj2.num);
    }
}
