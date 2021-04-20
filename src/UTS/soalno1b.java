package UTS;
    import java.util.Scanner;
public class soalno1b {
    public static void main(String[] args) {
        System.out.println("dikerjakan oleh Muhammad Haris Fariyano");
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
    public static void tampil(int data[]){
        for(int i=0;i<data.length;i++){
            System.out.print(data[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[]args){
        System.out.println("");
        System.out.println();
        int A[]={3, 10, 4, 2, 8, 13};
        Nomor1.tampil(A);
        Nomor1.ShellSort(A);
        Nomor1.tampil(A);  
    
    
        int B [] = {3, 10, 4, 2, 8, 13};
        int cari ;
        int IndeksAwal = 0; // 0
        int IndeksAkhir = B.length-1;
        int ketemu = 0;
        int point = 0;
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan data yang dicari : ");
        cari = scan.nextInt();
        System.out.println();
        
        while ((IndeksAwal <= IndeksAkhir && (ketemu == 0))){
            point = (IndeksAwal + IndeksAkhir) / 2;
            System.out.println("Indeks Pointer : " + point);
            if(cari == B[point]){ 
                ketemu = 1;
                System.out.println("Data " +
                        cari + " Telah ditemukan pada indeks ke - " + point);
            
            }
            else if(cari < B[point]){
                System.out.println("Cari di kiri ");
                IndeksAkhir = point-1;
            }
            else{
                IndeksAwal = point + 1;
                System.out.println("Cari di kanan");
            }
        }  
        if(ketemu == 1)
            System.out.println("Kesimpulan : Data ditemukan");
        else
            System.out.println("Kesimpulan : Data tidak ditemukan");       
        System.out.println("");
        
    }  
}
}
