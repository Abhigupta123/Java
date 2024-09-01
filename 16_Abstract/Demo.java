abstract class Car{                // If u declare a abstract method and not define it ,  you should have the abstract class for it.
    public abstract void drive();

    public void music()
    {
        System.out.print("Listening Song......");
    }
}

class Wagonr extends Car{    //"The class that extends a abstract class is known as Concrete class"  // if u extends a abstract class then it is compulsory to define the all abstract methods that are not defined
    public void drive()                         
    {
        System.out.print("Driving......");
    }
}


public class Demo{
    public static void main(String s[])
    {
        Car obj1 = new Wagonr(); // You cannot make a abstract class as a object , you can only make object of concrete class.
       obj1.drive();
       obj1.music();
    }

}

