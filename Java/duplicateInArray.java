public class duplicateInArray {
    public static void main(String[] args) {
        


        String arr[] = {"java","C","Java","Python","C++"};

        //approach1
boolean flag = false;
        for(int i=0;i<arr.length;i++){

for(int j=i+1;j<arr.length;j++){

    if(arr[i]==arr[j]){

        System.out.println("Duplicate element found"+arr[i]);
        flag = true;
    }

   
}

        }

        if(flag==false){
            System.out.println("Duplicate not found");
        }


    }
}
