
// interface are by default abstract (only method signature, no body).
// Interfaces specify what a class must do and not how  
/* bstract classes may contain non-final variables,
 whereas variables in interface are final, public and static.*/



    interface make_call {

        int a =5;

        void calling();
        void hold();
        void receive();
        void end();
    }

     class Call implements make_call{
        @Override
        public void calling() {
            System.out.println("I am Calling");
        }
        public void hold() {
            System.out.println("I am Calling and He kept it on Hold");
        }
        public void receive(){
            System.out.println("I am Calling and he willl definitely Receive it");
        }
        public void end(){
            System.out.println("I am Calling and he Rejected it");
        }
    }

/*   If a class dont implement all methods of interface then make it abstract

abstract class Call implements make_call{
        @Override
        public void calling() {
            System.out.println("I am Calling");
        }
        public void hold() {
            System.out.println("I am Calling and He kept it on Hold");
        }

    }*/
public class Interfaces {

    public static void main(String[] args) {
        Call face = new Call();
        face.calling();
        face.hold();
        face.end();
        face.receive();

    }
}
