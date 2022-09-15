package reflection;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Coder {

    @MyAnnotation
    @Test
    public void say1(){
        System.out.println(1);
    }
    @MyAnnotation (value = 4)
    @Test
    public void say4(){
        System.out.println(4);
    }
    @MyAnnotation (value = 3)
    @Test
    public void say3(){
        System.out.println(3);
    }
    @MyAnnotation (value = 2)
    @Test
    public void say2(){
        System.out.println(2);
    }
    @MyAnnotation
    @Test
    public void say11(){
        System.out.println(1);
    }

    @AfterSuite
    public void afterAll(){
        System.out.println("Coder is writing code");
    }

    @BeforeSuite
    public void beforeAll(){
        System.out.println("Coder plays football");
    }
}