public class OperasiMatematika {

    public static void main(String[] args) {

        int a = 100;
        int b = 10;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        //kode : Augmented Assignments
        System.out.println();
        System.out.println("Augmented Assignments");
        int c = 100;

        //bentuk rinci
        c = c +10;
        System.out.println(c);

        //bentuk ringkas
        c += 10;
        System.out.println(c);

        c -= 10;
        System.out.println(c);

        c *= 10;
        System.out.println(c);

        //Unary Operator
        System.out.println();
        System.out.println("Unary Operator");

        int d = 100;

        d++; //++d;
        System.out.println(d); //hasilnya akan ditambah 1

        d--; //--d;
        System.out.println(d); //hasilnya akan dikurang 1

        System.out.println(!true);//kebalikan

    }

}
