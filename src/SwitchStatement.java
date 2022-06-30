import javax.crypto.spec.PSource;

public class SwitchStatement {
    public static void main(String[] args) {

        var nilai = "A";

        //Pengguunaan Switch Case
        System.out.println("Switch Case");

        switch (nilai) {
            case "A":
                System.out.println("Wow, Anda Lulus Dengan Baik");
                break;
            case "B":
            case "C":
                System.out.println("Nilai Anda Cukup baik");
                break;
            case "D":
                System.out.println("Anda Tidak Lulus");
                break;
            default:
                System.out.println("Mungkin Anda Salah Jurusan");
        }

        //Penggunaan Switch Lambda
        //Lebih Ringkas
        System.out.println();
        System.out.println("Switch Lambda");

        switch (nilai) {
            case "A" -> System.out.println("Wow, Anda Lulus Dengan Baik");
            case "B", "C" -> System.out.println("Nilai Anda Cukup Baik");
            case "D" -> System.out.println("Anda Tidak Lulus");
            default -> {
                System.out.println("Mungkin Anda Salah Jurusan");
            }
        }

        //Switch Tanpa Yield
        System.out.println();
        System.out.println("Switch Tanpa Yield");

        String ucapan;

        switch (nilai) {
            case "A" -> ucapan = "Wow, Anda Lulus Dengan Baik";
            case "B", "C" -> ucapan = "Nilai Anda Cukup Baik";
            case "D" -> ucapan = "Anda Tidak Lulus";
            default -> ucapan = "Mungkin Anda Salah Jurusan";
        }
        System.out.println(ucapan);

        //Switch Dengan Yield
        System.out.println();
        System.out.println("Switch Dengan Yiled");

        ucapan = switch (nilai) {
            case "A":
                yield "Wow, Anda Lulus Dengan Baik";
            case "B", "C"  :
                yield "Nilai Anda Cukup Baik";
            case "D":
                yield "Anda Tidak Lulus";
            default:
                yield "Mungkin Anda Salah Jurusan";
        };
        System.out.println(ucapan);


    }

}
