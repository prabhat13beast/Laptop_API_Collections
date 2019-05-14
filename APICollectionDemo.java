import java.util.Scanner;
import java.util.ArrayList;
class Laptop{
    private Integer ramSize, hddSize,id;
    private String brand;
 
    Laptop(int id, int ramSize, int hddSize, String brand ){
        this.id=id;
        this.ramSize = ramSize;
        this.hddSize = hddSize;
        this.brand = brand;
    }
 
    //Creating the getters

    public Integer getId(){
        return this.id;
    }

    public Integer getRamSize(){
        return this.ramSize;
    }
 
    public Integer getHddSize(){
        return this.hddSize;
    }
 
    public String getBrand(){
        return this.brand;
    }

    public void setRamSize(int ramSize){
        this.ramSize = ramSize;
    }
    public void setID(int id){
        this.id = id;
    }
    public void setHddSize(int hddSize){
        this.hddSize = hddSize;
    }
 
    public void setBrand(String brand){
        this.brand = brand;
}
}
 
class APICollectionDemo{
    static ArrayList list;
    public static void main(String[] args) {
    
        list = new ArrayList();

        list.add(new Laptop(1, 4, 500, "DELL"));
        list.add(new Laptop(2, 8, 800, "HP"));
        list.add(new Laptop(3, 6, 500, "ASUS"));

        int choice;
         do{

        System.out.println("1.Add \n2.Remove. \n3.SearchItem \n4.ViewAll.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter one of the choices:");
        APICollectionDemo rf = new APICollectionDemo();
        choice = sc.nextInt();
        switch(choice)
        { 
            case 1:rf.addItem(); break;

            case 2:rf.removeItem(); break;

            case 3:rf.searchItem(); break;

            case 4:rf.viewAll(); break;

            default:System.out.println("enter correct choice:");

         }
     }while(choice<=4);

    }

    static void searchItem(){
    Scanner s = new Scanner(System.in);
    System.out.println("enter id to search:"); 
    int r5 = s.nextInt();
    int flag=0;
       for(Object ref: list)
                    {
                        if(((Laptop)ref).getId().equals(r5))
                        {
                            System.out.println("ID : " + ((Laptop)ref).getId());
                            System.out.println("Ram : " + ((Laptop)ref).getRamSize());
                            System.out.println("HDD Size : " + ((Laptop)ref).getHddSize());
                            System.out.println("Brand : " + ((Laptop)ref).getBrand());
                            System.out.println("");
                            flag=1;
                        }
                        
                }if(flag==0)
                 System.out.println("Sorry Entry not found\n");
        }


    static void removeItem()
    {
    Scanner s = new Scanner(System.in);
    System.out.println("enter id to delete:");
    int r4 = s.nextInt();
    for(Object ref: list)
            {
                if(((Laptop)ref).getId().equals(r4))
                {
                    System.out.println(list.remove(ref));
                    System.out.println("Item Removed");
                    break;
                }  
    }
            }

    static void addItem(){
    String str;
    Scanner s = new Scanner(System.in);
    System.out.println("enter id:");
    int r1 = s.nextInt();
    System.out.println("enter RAM size:");
    int r2 = s.nextInt();
    System.out.println("enter Harddisk space:");
    int r3 = s.nextInt();
    System.out.println("enter Brand name:");
    Scanner sc = new Scanner(System.in);
    str = sc.nextLine(); 
    list.add(new Laptop(r1, r2, r3, str));
    System.out.println("item added");

}

       static void viewAll(){

        for(Object ref: list)
            {
                System.out.println("\nID : " + ((Laptop)ref).getId());
                System.out.println("Ram : " + ((Laptop)ref).getRamSize());
                System.out.println("HDD Size : " + ((Laptop)ref).getHddSize());
                System.out.println("Brand : " + ((Laptop)ref).getBrand());
            }


         }
 
    }

   