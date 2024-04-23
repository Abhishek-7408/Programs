public class largeColSum {
    public static void main(String[] args) {

int sum=0;

        int a[][] = {{55,60,65,40},{44,55,888,88},{88,44,88,44},{55,55,44,88}};
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

        //LARGEST COLUMN SUM
int largest = Integer.MIN_VALUE;
for(int i=0;i<a.length;i++){
    for(int j=0;j<a[i].length;j++){
sum=sum+a[j][i];
    }
    if(sum>largest){
        largest = sum;
    }
}


System.out.println("Largest column sum is:"+sum);
    }
}
