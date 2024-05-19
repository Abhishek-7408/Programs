import java.util.*;
public class pushBottomofStack {
public static void pushAtbootom(int data,Stack<Integer> s){

if(s.isEmpty()){
    s.push(data);
    return;
}
int top = s.pop();
pushAtbootom(data, s);
s.push(top);

}



    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
 s.push(1);
 s.push(1);
 s.push(1);
 s.push(1);
 s.push(1);
 s.push(1);
 s.push(1);
 s.push(1);



 pushAtbootom(5, s);

 while(!s.isEmpty()){
    System.out.println(s.peek());
    s.pop();
 }
    }
}
