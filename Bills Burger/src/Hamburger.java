public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    //Four Possible addition

    private String addition1Name;
    private Double addition1Price;

    private String addition2Name;
    private Double addition2Price;

    private String addition3Name;
    private Double addition3Price;

    private String addition4Name;
    private Double addition4Price;

   
    

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;

        //Four Possible addition
         String addition1Name;
         this.addition1Price = 0.0;
         String addition2Name;
         this.addition2Price = 0.0;
         String addition3Name;
         this.addition3Price = 0.0;
         String addition4Name;
         this.addition4Price = 0.0;
    }
    
    public void addHamburgerAddition1(String addition1Name, double addition1Price){
        this.addition1Name = addition1Name;
        this.addition1Price = addition1Price;
        System.out.println("Added " + this.addition1Name + " for an extra " + this.addition1Price );
    }
    public void addHamburgerAddition2(String addition2Name, double addition2Price){
        this.addition2Name = addition2Name;
        this.addition2Price = addition2Price;
        System.out.println("Added " + this.addition2Name + " for an extra " + this.addition2Price );
    }
    public void addHamburgerAddition3(String addition3Name, double addition3Price){
        this.addition3Name = addition3Name;
        this.addition3Price = addition3Price;
        System.out.println("Added " + this.addition3Name + " for an extra " + this.addition3Price );
    }
    public void addHamburgerAddition4(String addition4Name, double addition4Price){
        this.addition4Name = addition4Name;
        this.addition4Price = addition4Price;
        System.out.println("Added " + this.addition4Name + " for an extra " + this.addition4Price );
    }
    public double itemizeHamburger(){

        return this.price + this.addition1Price + this.addition2Price + this.addition3Price + this.addition4Price;
    }
    
}
