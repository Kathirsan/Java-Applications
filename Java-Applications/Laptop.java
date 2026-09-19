public class Laptop{
    String name = "";
    String proc ="";
    int ram = 0;
    int price=0;

    public static void main (String[] args){
     Laptop lap1 = new Laptop();
     lap1.name="Hp";
     lap1.proc ="i5";
     lap1.ram=20;
     lap1.price=90000;

     Laptop lap2 = new Laptop();
     lap2.name="Lenova";
     lap2.proc ="i7";
     lap2.ram=16;
     lap2.price=180000;

     System.out.println(lap1.price);
          System.out.print(lap2.price);

    }
}