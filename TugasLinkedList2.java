import java.util.LinkedList;

public class TugasLinkedList2 {
    public static void main(String[] args) {
        
        System.out.println("======================================");
        System.out.println("Nama\t : Syakina Triyana");
        System.out.println("NIM\t : 2111522017");
        System.out.println("Matkul\t : Struktur Data dan Algoritma");
        System.out.println("======================================");
        System.out.println("");

        LinkedList<String> Nama = new LinkedList<>();
        LinkedList<String> NIM = new LinkedList<>();
        LinkedList<String> Alamat = new LinkedList<>();

        Nama.add("Syakina Triyana");
        NIM.add("2111522017");
        Alamat.add("Pariaman");

        System.out.println("--------------------------------------");
        System.out.println("--Data Mahasiswa Universitas Andalas--");
        System.out.println("--------------------------------------");
        System.out.println("Data Awal");
        System.out.println("Nama\t: " + Nama);
        System.out.println("NIM\t: " + NIM);
        System.out.println("Alamat\t: " + Alamat);
        System.out.println("--------------------------------------");

        //Melakukan perintah Add untuk menambahkan data mahasiswa

        Nama.add("Khorry Maghfirah");
        NIM.add("2111523021");
        Alamat.add("Lubuk Alung");

        Nama.add("Syintia Rahmi");
        NIM.add("2111521023");
        Alamat.add("Jambi");

        Nama.add("Fajrika Gilsa");
        NIM.add("2111522017");
        Alamat.add("Pasaman");

        Nama.add("Muhammad Aldho");
        NIM.add("2111521008");
        Alamat.add("Naras");

        System.out.println("Data setelah ditambahkan");
        System.out.println("Nama\t: " + Nama);
        System.out.println("NIM\t: " + NIM);
        System.out.println("Alamat\t: " + Alamat);
        System.out.println("--------------------------------------");

        //Melakukan perintah Remove untuk menghapus salah satu atau beberapa data

        Nama.removeLast();
        NIM.remove(2);
        Alamat.removeFirst();

        System.out.println("Data setelah dihapus");
        System.out.println("Nama\t: " + Nama);
        System.out.println("NIM\t: " + NIM);
        System.out.println("Alamat\t: " + Alamat);
        System.out.println("--------------------------------------");

        //Melakukan perintah Set untuk menyisipkan data

        Nama.set(3, "Yazid Faathir");
        Nama.set(0, "Melanie Pratiwi");

        NIM.set(1, "2111523024");
        NIM.set(3, "2111521032");

        Alamat.set(0, "Banten");
        Alamat.set(2, "Medan");

        System.out.println("Data setelah disisipkan");
        System.out.println("Nama\t: " + Nama);
        System.out.println("NIM\t: " + NIM);
        System.out.println("Alamat\t: " + Alamat);
        System.out.println("--------------------------------------");

        //Melakukan perintah Pop untuk Mengeluarkan data teratas

        System.out.println("Fungsi Pop");
        System.out.println("Data Nama Terhapus\t: " + Nama.pop());
        System.out.println("Data Nama Setelah Pop\t: " + Nama);
        System.out.println("");
        System.out.println("Data NIM Terhapus\t: " + NIM.pop());
        System.out.println("Data NIM Setelah Pop\t: " + NIM);
        System.out.println("");
        System.out.println("Data ALamat Terhapus\t: " + Alamat.pop());
        System.out.println("Data Alamat Setelah Pop\t: " + Alamat);
        System.out.println("--------------------------------------");

        //Melakukan perintah Push untuk Memasukkan data ke dalam LinkedList

        Nama.push("Frissila Sabrina");
        NIM.push("2111523025");
        Alamat.push("Wonosobo");

        System.out.println("Fungsi Push");
        System.out.println("Nama setelah Push\t: " + Nama);
        System.out.println("NIM setelah Push\t: " + NIM);
        System.out.println("Alamat setelah Push\t: " + Alamat);
        System.out.println("--------------------------------------");

        //Melakukan perintah IsEmpty()

        System.out.println("Perintah IsEmpty");
        System.out.println("Apakah Data Nama Mahasiswa Kosong? " + Nama.isEmpty());
        System.out.println("Apakah Data NIM Mahasiswa Kosong? " + NIM.isEmpty());
        System.out.println("Apakah Data Alamat Mahasiswa Kosong? " + Alamat.isEmpty());
        System.out.println("--------------------------------------");

        //Melakukan perintah IndexOf()

        System.out.println("Perintah IndexOf");
        System.out.println("Index dari Nama (Syintia Rahmi)\t: " + Nama.indexOf("Syintia Rahmi"));
        System.out.println("Index dari NIM (2111523025)\t: " + NIM.indexOf("2111523025"));
        System.out.println("Index dari Alamat (Jambi)\t: " + Alamat.indexOf("Jambi"));
        System.out.println("--------------------------------------");

        //Melakukan perintah Get()

        System.out.println("Perintah Get");
        System.out.println("Get Nama index ke-3\t: " + Nama.get(3));
        System.out.println("Get NIM index ke-0\t: " + NIM.get(0));
        System.out.println("Get Alamat index ke-2\t: " + Alamat.get(2));
        System.out.println("--------------------------------------");
    }
}
