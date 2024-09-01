enum Laptop{
    macbook(2000),dell(1800),hp,lenovo(1200);
    private int price;


    private Laptop(){        // Default Constructor
        this.price = 500;
    }

    private Laptop(int price){     // Parametraize Constructor
        this.price = price;
    }
    // public void setPrice(int price)
    // {
    //     this.price = price;
    // }
    public int getPrice()
    {
        return price;
    }
}


public class Main{
    public static void main(String s[])
    {
        Laptop lp[] = Laptop.values();
        
        for(Laptop l:lp)
        {
            System.out.println(l +" : "+l.getPrice());
        }
    }
}