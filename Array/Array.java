public class Array {
    public static void main(String[] args) {
        //int[] num = {10, 20, 30};

        int arr[] = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        
        System.out.println(arr.length);

        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        for(int num : arr){
            System.out.println(num);
        }

    }
    
}

