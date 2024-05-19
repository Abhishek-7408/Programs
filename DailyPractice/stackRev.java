import java.util.*;
public class stackRev {
public static void pushAtbootom(int data,Stack<Integer> s){

if(s.isEmpty()){
    s.push(data);
    return;
}
int top = s.pop();
pushAtbootom(data, s);
s.push(top);

}
public static void reverse(Stack<Integer> s){
if(s.isEmpty()){
    return;
}

    int top = s.pop();
    reverse(s);
    pushAtbootom(top, s);
}


    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
 s.push(1);
 s.push(2);
 s.push(3);
 s.push(4);
 s.push(5);
 s.push(6);
 s.push(8);
 s.push(10);




reverse(s);
 while(!s.isEmpty()){
    System.out.println(s.peek());
    s.pop();
 }
    }
}
