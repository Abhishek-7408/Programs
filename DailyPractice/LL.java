import java.util.*;
public class LL {
   
public static void main(String[] args) {
    LinkedList<String> list = new LinkedList<>();
    list.addFirst("a");
    list.addFirst("is");
    list.addFirst("this");

    System.out.println(list);

    list.addLast("LinkedList");
    System.out.println(list);
 //   list.add(0, null);
    System.out.println(list);
    list.add("by default add last");
    System.out.println(list.size());
    System.out.println(list);


    for(int i=0;i<list.size();i++){
        //if(list.get==value){
           // serch
      //  }
        System.out.print(list.get(i)+ " " );

    }
    System.out.println("null");

    list.removeFirst();
    list.remove();
    for(int i=0;i<list.size();i++){
        System.out.print(list.get(i)+" ");
    }



}

}
