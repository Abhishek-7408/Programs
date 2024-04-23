import java.util.Arrays;

public class checkArrayeql {
    public static void main(String[] args) {
    int a1[] = {55,66,10,88};
    int a2[]= {55,66,88,10};
// // build approach
// boolean status = Arrays.equals(a1, a2);

// if(status==true){
//     System.out.println("eqauals");
// }
// else
// {
//     System.out.println("Not equals");
// }

boolean status=true;
if(a1.length==a2.length)
{
for(int i=0;i<a1.length;i++)
{
    if(a1[i]!=a2[i])
    {
        status=false;
    }
}
}
else{
    status = false;

}

if(status==true)
{
    System.out.println("Equals");
}

else{
    System.out.println("false");
}


    }
}
