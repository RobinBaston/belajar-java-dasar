public class OperasiBoolean {

    public static void main(String[] args) {

        var absen = 70;
        var nilaiAkhir = 80;

        boolean lulusAbsen = absen >= 75;
        boolean lulusNilai = nilaiAkhir >= 75;

        //Opeerasi Dan
        var lulus = lulusAbsen && lulusNilai;
        System.out.println(lulus);

        //Opeerasi Atau
        var lulus1 = lulusAbsen || lulusNilai;
        System.out.println(lulus1);

        //Operasi Kebalikan
        System.out.println(!lulus);
        System.out.println(!lulus1);


    }

}
