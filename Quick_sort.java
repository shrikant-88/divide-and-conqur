public class Quick_sort {
    public static int  partition(int []arr,int l,int r) {
     int pivot = arr[l];
     int i = l;   //left indx
     for(int j = i+1;j<=r;j++){
        if(arr[j]<=pivot){
            i++;
            int tamp = arr[j];
            arr[j]=arr[i];
            arr[i]=tamp;
        }
        
     }

     int temp = arr[i];
     arr[i]=arr[l];
     arr[l] =  temp;
     return i;
        
    }
   
    public static void Quick_sort(int []arr,int i,int j) {
        if(i<j){
        int pivot_indx = partition(arr,i,j);
        Quick_sort(arr, i, pivot_indx-1);
        Quick_sort(arr, pivot_indx+1, j);

    }
}
public static void printArray(int []arr) {
    for(int i = 0 ; i<arr.length ;i++){
        System.out.println(arr[i]);
    }
}
    public static void main(String[] args) {
        int arr[] ={23,45,67,12,31,23,13,23,11};
        
        Quick_sort(arr,0,arr.length-1);
        printArray(arr);
    }
}
