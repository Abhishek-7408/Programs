import java.util.Scanner;

class DecToBin{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int DecimalNum = sc.nextInt();
        String BinNum="";
        if(DecimalNum==0){
            BinNum="0";
        }
        else{
            while(DecimalNum>0){
                BinNum = (DecimalNum%2)+BinNum;
                DecimalNum/=2;
            }
        }
        System.out.println(BinNum);


    }
}