package quarter2lesson1;

public class Cat implements Runner, Jumper{


    @Override
    public boolean jump(int a) {
        if(a <= 3){
            System.out.printf("Cat jumps over %d meters%n", a);
            return true;
        }else{
            System.out.printf("Cat can't jump so high as %d%n", a);
            return false;
        }

    }

    @Override
    public boolean run(int a) {
        if(a <= 1500){
            System.out.printf("Cat runs  %d meters%n", a);
            return true;
        }else{
            System.out.printf("Cat tired and can't run  %d meters%n", a);
            return false;
        }

    }
}
