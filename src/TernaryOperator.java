public class TernaryOperator {
    public static void main(String[] args) {

        //Tanpa Ternary Operator
        System.out.println("Tanpa Ternaty Operator");

        var nilai = 70;
        String ucapan;

        if (nilai >= 75){
            ucapan = "Selamat Anda Lulus";
        } else {
            ucapan = "Silahkan Coba Lagi";
        }
        System.out.println(ucapan);

        //Dengan Ternary Operator
        System.out.println();
        System.out.println("Ternary Operator");

        //String ucapan = nilai >= 75 ? "Selamat Anda Lulus" : "Silahkan Coba Lagi";
        ucapan = nilai >= 75 ? "Selamat Anda Lulus" : "Silahkan Coba Lagi";

        System.out.println(ucapan);


    }

}
