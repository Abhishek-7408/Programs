class Pen{
String color;
String type;

public void write(){
    System.out.println("writing something");

}
public void printColor(){
    System.out.println(this.color);

}

public void printType(){
    System.out.println(this.type);
}


}
public class first {
    public static void main(String[] args) {
        
Pen p1 = new Pen();
p1.color = "blue";
p1.type = "ball";

Pen p2 = new Pen();
p2.color = "red";
p2.type = "gel";


p2.printColor();
p1.printColor();
p1.printType();
p2.printType();
p1.write();
    }
}
