package DSA_1_LoveBabbar450_Arrays;
class ThreeWayPartition{
    public void threewaypartition(int A[], int a, int b){
        int low=0, mid=0;
        int high=A.length-1;
        while(mid<=high){
            if(A[mid]<a){
                int temp=A[low];
                A[low]=A[mid];
                A[mid]=temp;
                low++;
                mid++;
            }
            else if(A[mid]>b){
                int temp=A[mid];
                A[mid]=A[high];
                A[high]=temp;
                high--;
            }
            else{
                mid++;
            }
        }
    }
}
public class DSA_32_ThreeWayPartioning {
    public static void main(String [] args){
        ThreeWayPartition t= new ThreeWayPartition();
        int []A= {1, 2, 3, 3, 4};
        int a=1; int b= 2;
        t.threewaypartition(A, a, b);
        System.out.println("Modified array after three-way partitioning:");
        for (int num : A) {
            System.out.print(num + " ");
        }
    }
}
