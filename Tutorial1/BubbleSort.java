public class BubbleSort {
    public static void main(String[] args){
        int[] list = new int[]{3,20,2,8,4,1};
        int n = 6;
        bubble(list, n);
        for(int i=0;i<n;i++)System.out.println(list[i]);
    }
    public static void bubble(int[] a, int n){
        int i, j ,t;
        for(i=n-2;i>=0;i--){
            for(j=0;j<=i;j++){
                if(a[j]>a[j+1]){
                    t=a[j];
                    a[j] = a[j+1];
                    a[j+1] = t;     
                }
            }
        }
    }
}
