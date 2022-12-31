class parent {
    String name = "Bhumika";
    String name2 = "Narendra";

    public void work() {
        System.out.println("Slap on face , Chappal fekun marte");
    }
}

// Now grandparent will also get parent values
class grandparent extends parent {
    String name3 = "Niramala";
    String name4 = "Wamnrao";
}

public class Inherit {

    public static void main(String[] args) {
        grandparent obj = new grandparent();

        // Override the Bhumika in parent class 
        obj.name = "Anjali";

        System.out.println("Mother is : "+obj.name+" and GrandMother is "+obj.name3 );
        System.out.println("Father is : "+obj.name2+" and GrandFather is "+obj.name4);

        obj.work();

    }
    
    
}
