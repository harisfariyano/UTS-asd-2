package UTS;
public class soalno1 {
        public static void main(String[] args) {
        System.out.println("dikerjakan oleh Muhammad Haris Fariyano");
        int[] data = {3,10,4,2,8,13};
        for (int i=0; i<data.length; i++){
            System.out.print(data[i]+" ");
        }
        int k=1;
        while (k<data.length){
            int j = data.length-1;
            while (j>=1){
                if (data[j-1]>data[j]){
                    int temp = data[j];
                    data[j] = data[j-1];
                    data[j-1] = temp;
                }
                j = j-1;
            }
            k = k+1;
        }
        System.out.println("\n");
        System.out.println("<-< Bubble Sort >->");
        for (int i=0; i<data.length; i++){
            System.out.print(data[i]+" ");
        }
    }  
}
