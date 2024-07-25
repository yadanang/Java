import static java.lang.Math.*;
public class Test2 {
    public static void main(String[] args) {
       /* int[]  arr = new int[]{1,2,3,4,5,6,7,8,9};

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        for (int arr1 : arr) {
            System.out.println(arr1);
        }*/

       /* int[] arr = new int[]{1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(arr));
        System.out.println(myToString(arr));*/


       /* int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10};
        int[] newArr;
        //newArr = Arrays.copyOf( arr, arr.length*2 );
        newArr = Arrays.copyOfRange( arr, 3,80  );
       System.out.println( Arrays.toString( newArr ) );*/


        // }
    /*public static String myToString( int[] arr){
        String ret = "[";
        for(int i=0;i<arr.length;i++){
            ret += arr[i];
            if (i < arr.length-1){
                ret += ", ";
            }
        }
        ret += "]";
        return ret;
    }*/


       /* int[] arr = new int[] {1,2,3,4,5};
        System.out.println("找到了下标是->"+find(arr,5));*/

        /*int[] arr = new int[]{ 1, 2, 8, 4, 6, 5, 7, 3, 10, 9};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));


        System.out.println(Arrays.binarySearch(arr, 12));*/

//int[] arr = new int[]{ 1, 2, 3, 4, 5};
//
//bbb( arr);
//        System.out.println(Arrays.toString(arr));



/*int[] arr = new int[]{1,3,5,7,9,2,4,6,8};
        func(arr);
        System.out.println(Arrays.toString(arr));*/






/*
int[] arr = new int[]{1,2,3,1};
findSum(arr,9);


    }



public static void findSum( int[] arr , int num) {
    boolean o = false;
    for (int i = 0; i < arr.length - 1; i++) {

        for (int j = 1; j < arr.length; j++) {
            int sum = arr[i] + arr[j];
            if (sum == num) {
                System.out.println("找到了" + arr[i] + "和" + arr[j]);
                o = true;
            }
        }
    }
if ( o == false){
    System.out.println("meizhoadao");
}




  */
/*  public  static  void func( int[] arr){
        int lest = 0 ,flg = 0;
        int right = arr.length-1;
        while (lest < right) {
            while (lest < right && arr[lest] % 2 == 0) { //找到奇数了
                lest++;
                }
            while (lest < right && arr[right] % 2 != 0) {
                right--;
            }
            flg =  arr[right];
          arr[right] = arr[lest];
          arr[lest] = flg;
    }*//*

        }
  */
/*  public static void bbb(int[] arr){
        for ( int j = 0; j < arr.length -1 ; j++){
            boolean flg = false;
            for(int i=0; i<arr.length -1 -j; i++){
                int one = i , two = i + 1 , num = 0;
                if ( arr[one] > arr[two] ){
                    num = arr[one];
                    arr[one] = arr[two];
                    arr[two] = num;
                    flg = true;
                }

            }
            if ( flg != true){
                break;
            }
        }

    }*//*

    }
*/

    /*private static int myBinarySearch0(int[] a, int fromIndex, int toIndex,
                                     int key) {
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            int midVal = a[mid];

            if (midVal < key)
                low = mid + 1;
            else if (midVal > key)
                high = mid - 1;
            else
                return mid; // key found
        }
        return -(low + 1);  // key not found.最后一low的位置+1
    }*/


/*
public static int binarySearch(int[] arr, int target) {
        //
    int left = 0, right = arr.length - 1, mid = 0;
    while ( left <= right ) {
        mid = left + (right - left) / 2;
        if ( arr[mid] == target ) {
            return mid;
        }else if ( arr[mid] > target ) {
             right = mid - 1;
        }else {
            left = mid + 1;
        }
    }
    return -1;
}
*/

    /*public static int find(int[] arr,int data) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == data) {
                return i;
            }*/
//
//        }
//        return -1;
        //}





/*

int[] arr = new int[]{1, 2, 3, 1, 2};
int ret = arr[0];
for ( int i = 1 ; i < 5 ; i++ ){
   ret ^= arr[i];
}

        System.out.println(ret);*/


       /* int[][] arr = new int[3][];
        System.out.println(Arrays.deepToString(arr));*/


/*
        System.out.println("hahah");

    }
}






 class WashMachine{
    public String brand;


    public void washClothes() {
        System.out.println("洗衣");
    }

        public static void main(String[]args){
            WashMachine wM = new WashMachine();
            wM.washClothes();
        }

}
*/
            double x = 30;
            double y = 30;
            double r = pow(x, 2) + pow(y, 2);
            System.out.println(r);

    }
}