public class PerhitunganDiskonHelper {
    
    
     // Fungsi untuk menghitung penghematan
    public static double hitungPenghematan(double hargaAsli, double persenDiskon, double persenKupon) {
        double totalDiskon = persenDiskon + persenKupon;
        
        // Batasi total diskon maksimal 90%
        if (totalDiskon > 90) {
            totalDiskon = 90;
        }

        // Rumus penghematan
        return hargaAsli * totalDiskon / 100.0;
    }

    // Fungsi untuk menghitung harga akhir
    public static double hitungHargaAkhir(double hargaAsli, double persenDiskon, double persenKupon) {
        double penghematan = hitungPenghematan(hargaAsli, persenDiskon, persenKupon);
        return hargaAsli - penghematan;
    }

    // Fungsi untuk mendapatkan nilai diskon kupon dari kode kupon
    public static double cekKupon(String kodeKupon) {
        if (kodeKupon == null) return 0;
        kodeKupon = kodeKupon.trim().toUpperCase();
        
        return switch (kodeKupon) {
            case "HEMAT10" -> 10;
            case "SALE20" -> 20;
            case "DISKON5" -> 5;
            default -> 0;
        };
    }

    // Fungsi untuk menampilkan hasil perhitungan sebagai string format
    public static String hasilPerhitungan(double hargaAsli, double diskon, double kupon) {
        double penghematan = hitungPenghematan(hargaAsli, diskon, kupon);
        double hargaAkhir = hitungHargaAkhir(hargaAsli, diskon, kupon);
        return String.format(
            "Harga Asli: Rp %.2f\nDiskon: %.0f%% + Kupon: %.0f%%\nPenghematan: Rp %.2f\nHarga Akhir: Rp %.2f\n",
            hargaAsli, diskon, kupon, penghematan, hargaAkhir
        );
    }
}
