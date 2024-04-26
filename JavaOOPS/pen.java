 class Pen{
    String color;
    String type;

    public void write(){
        System.out.println("Writing");
    }


    public void print(){
        System.out.println(this.color);
    }
    
}


public class pen {
    public static void main(String[] args) {

Pen p1 = new Pen();
p1.color = "blue";
p1.type = "gel";

p1.write();
p1.print();

        
    }
}
