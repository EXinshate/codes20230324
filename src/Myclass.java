public class Myclass {
    int x;

    Myclass(){
        System.out.println("Inside Myclass().");
        x = 0;
    }

    Myclass(int i){
        System.out.println("Inside Myclass(int).");
        x = i;
    }

    Myclass(double d){
        System.out.println("Inside Myclass(double).");
        x = (int) d;
    }

    Myclass(int i, int j){
        System.out.println("Inside Myclass(int，int).");
        x = i * j;
    }
}

class OverloadConsDemo{
    public static void main(String[] args) {
        Myclass t1 = new Myclass();
        Myclass t2 = new Myclass(88);
        Myclass t3 = new Myclass(17.23);
        Myclass t4 = new Myclass(2, 4);

        System.out.println("t1.x : " + t1.x);
        System.out.println("t2.x : " + t2.x);
        System.out.println("t3.x : " + t3.x);
        System.out.println("t4.x : " + t4.x);
    }
}