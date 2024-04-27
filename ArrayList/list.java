import java.util.*;
public class list {

public static void main(String[] args) {
    ArrayList<Integer> list1=new ArrayList<>();
    Scanner sc = new Scanner(System.in);
// add 
    list1.add(10);
    list1.add(20);
    list1.add(30);
    list1.add(40);
    list1.add(50);
    list1.add(60);
    list1.add(70);
    list1.add(80);

    System.out.println(list1);


    //get
    int element = list1.get(0);
    System.out.println(element);


    // add in b/w
    list1.add(5, 96);
    System.out.println(list1);
    System.out.println(list1.size());

    //set

    list1.set(0,999);
    System.out.println(list1);


    // delete element

    list1.remove(0);
    System.out.println(list1);

    // list size 

    int size = list1.size();
    System.out.println(size);


    // loop
    for(int i=0;i<list1.size();i++){
        System.out.print(list1.get(i)+" ");
    }
    System.out.println();



    // collection soerting list

    Collections.sort(list1);


    System.out.println("sorted list:\n"+list1+" ");




    
}



}