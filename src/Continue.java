public class Continue {
    public static void main(String[] args) {

        //jika kondisi bernilai benar
        //maka perulangan akan di teruskan ke perulangan selanjutnya
        for (var counter = 1; counter <= 100; counter++) {
            /*if (counter % 2 == 0){ //Bilangan Ganjil
                continue;
            }
            System.out.println("Perulangan Ganjil " + counter);
            */
            if (counter % 2 == 1){ //Bilangan Genap
                continue;
            }
            System.out.println("Perulangan Genap " + counter);
        }

    }
}