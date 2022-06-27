package quarter2lesson1;

public class Robot implements  Runner, Jumper{

    @Override
    public boolean jump(int a) {
        if(a <= 10){
            System.out.printf("Robot jumps over %d meters%n", a);
            return true;
        }else{
            System.out.printf("Robot can't jump so high as %d%n", a);
            return false;
        }


    }

    @Override
    public boolean run(int a) {
        if(a <= 30000){
            System.out.printf("Robot runs  %d meters%n", a);
            return true;
        }else{
            System.out.printf("Robot discharged and can't run  %d meters%n", a);
            return false;
        }

    }
}
