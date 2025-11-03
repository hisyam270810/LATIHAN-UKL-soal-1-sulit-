import java.util.Scanner;

public class soal1RataRataNilaiRPL {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        //meminta input jumlah siswa
        System.out.print("masukkan jumlah siswa:" );
        int jumlahsiswa = input.nextInt();

        double totalNilai = 0;

        //menginput nilai siswa
        for (int i =1 ; i <= jumlahsiswa; i++) {
            System.out.print("masukkan nilai siswa ke-" + i + ":");
            double nilai = input.nextDouble();
            totalNilai += nilai;//menjumlahkan nilai
        }
        //menghitung rata rata nilai 
        double ratarata= totalNilai/jumlahsiswa;

        System.out.println("=========RINCIAN NILAI RPL=========");        
        System.out.println("===================================");
        System.out.println("jumlah siswa:"+jumlahsiswa);
        System.out.println("total nilai: "+totalNilai);
        System.out.println("rata rata nilai: "+ratarata);
    }
}
