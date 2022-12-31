
class Sister{
    void Job(){
        System.out.println("This is my Job");
    }
}

class Purva extends Sister {
    void Job(){
        System.out.println("Doctor of Lazy People");
    }
}
class Manjiri extends Sister{
    void Job(){
        System.out.println("MBBS Doctor");
    }
}
class Aanadi extends Sister{
    void Job(){
        System.out.println("Gynacologist Doctor ");
    }
}
class Khushi extends Sister{
    void Job(){
        System.out.println("Doctor of Liver");
    }
}
class Tanu extends Sister{
    void Job(){
        System.out.println("MBBS Doctor");
    }
}
class Bittu extends Sister{
    void Job(){
        System.out.println("MBA TOURS ");
    }
}
class Krishna extends Sister{
    void Job(){
        System.out.println("Engineer");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Sister s = new Sister();

        Sister s1 = new Purva();
        s1.Job();

        Sister s2 = new Manjiri();
        s2.Job();

        Sister s3 = new Khushi();
        s3.Job();

        Sister s4 = new Tanu();
        s4.Job();

        Sister s5 = new Aanadi();
        s5.Job();

        Sister s6 = new Krishna();
        s6.Job();

        Sister s7 = new Bittu();
        s7.Job();

    }
}
