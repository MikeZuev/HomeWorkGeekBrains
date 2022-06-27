package quarter2lesson1;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        Human man = new Human();
        Cat cat = new Cat();
        Robot terminator = new Robot();
        Wall wall = new Wall(3);
        Treadmill treadmill = new Treadmill(2500);


        ArrayList<Runner> runners = new ArrayList<>(3);
        runners.add(man);
        runners.add(cat);
        runners.add(terminator);

        ArrayList<Obstacles> obstacles = new ArrayList<>(2);
        obstacles.add(treadmill);
        obstacles.add(wall);

        competition(runners, obstacles);


    }

    public static void competition(ArrayList<Runner> runners, ArrayList<Obstacles> obstacles) {
        ArrayList<Jumper> jumpers = new ArrayList<>(3);
        for (int i = 0; i < obstacles.size() - 1; i++) {
            for (int j = 0; j < runners.size(); j++) {
                if (runners.get(j).run(obstacles.get(i).getLength()) == true) {
                    System.out.println("passed!");
                    jumpers.add((Jumper) runners.get(j));

                }
            }
        }



        Jumping(jumpers, obstacles);


    }


    public static void Running(ArrayList<Runner> a, Obstacles[] b) {

        for (int i = 0; i < b.length - 1; i++) {
            for (int j = 0; j < a.size(); j++) {
                if (a.get(j).run(b[i].getLength()) == true) {
                    System.out.println("passed!");


                } else {
                    System.out.println("didn't pass");
                    ;
                    a.remove(j);


                }
            }

        }


    }

    public static void Jumping(ArrayList<Jumper> a, ArrayList<Obstacles> obstacles) {
        for (int i = obstacles.size() - 1; i > 0; i--) {
            for (int j = 0; j < a.size(); j++) {
                if (a.get(j).jump(obstacles.get(i).getHight()) == true) {


                }
            }
        }
    }
}



