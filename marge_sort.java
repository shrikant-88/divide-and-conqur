public class marge_sort {
    public static void margeProcdure(int []arr, int i, int mid, int j) {
        int k=i;
        int n1 = mid -i+1;
        int n2 = j-mid;
        int [] s1 = new int [n1];
        int [] s2 = new int [n2];
        for(int a =0;a<n1;a++){
            s1[a]=arr[i+a];
            
        }
        for(int a =0;a<n2;a++){
            s2[a]=arr[mid+1+a];
        }
        int a=0;
        int b=0;
        while(a < n1 && b < n2){
            if(s1[a]<=s2[b]){
                arr[k]=s1[a];
                a++;
            }
            else{
                arr[k]=s2[b];
                b++;
            }
            k++;
        }
        while(a<n1){
            arr[k]=s1[a];
            a++;
            k++;
        }
        while(b<n2){
            arr[k]=s2[b];
            b++;
            k++;
        }

    }
    public static void margeSort(int arr[],int i ,int j) {
        
        if(i<j){
            int mid = (i+j)/2;
            margeSort(arr, i, mid);
            margeSort(arr, mid+1, j);

            margeProcdure(arr,i,mid,j);
        }
    }
    public static void printArray(int []arr) {
        for(int i = 0 ; i<arr.length ;i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int arr[] = {23,45,32,78,12,8,93};
        int lastIndx = arr.length -1;
        System.out.println("before sorting ");
        printArray(arr);
        margeSort(arr,0,lastIndx);
        System.out.println("After sorting ");
        printArray(arr);
    }
}
