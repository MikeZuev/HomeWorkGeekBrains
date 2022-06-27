package quarter2lesson1;

public class Human implements Runner, Jumper{





    @Override
    public boolean jump(int a) {
        if(a <= 2){
            System.out.printf("Human jumps over %d meters%n", a);
            return true;
        }else{
            System.out.printf("Human can't jump so high as %d%n", a);
            return false;
        }

    }

    @Override
    public boolean  run(int a) {
        if(a <= 3000){
            System.out.printf("Human runs  %d meters%n", a);
            return true;
        }else{
            System.out.printf("Human tired and can't run  %d meters%n", a);
            return false;
        }

    }
}
