class Mobile{
    static String name;    // static variable
    int price;
    int model;

    public void show(){
        System.out.print(name + ":" + price + ":" + model);

    }
}


public class test4{
    public static void main(String s[]){
    Mobile set1 = new Mobile();
    Mobile set2 = new Mobile();

    set1.name = "Vivo";
    set1.price= 250000;
    set1.model= 999;

    set2.name = "IPhone";
    set2.price= 500000;
    set2.model= 888;

    set1.name="Nothing";   // Bcz we declare " static name " so that's why when  i only  change the name of set1 it reflect to set2 also 


    set1.show();
    set2.show();
    }

}