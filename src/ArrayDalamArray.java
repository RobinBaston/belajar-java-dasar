public class ArrayDalamArray {

    public static void main(String[] args) {

        String[][] members = {
                {"Robin", "Bastian", "Aritonang"},
                {"Florentina", "Widya"},
                {"Christabel", "Ester"}
        };

        System.out.println(members[0][1]); //panggil array 1, ambil data ke 2
        System.out.println(members[1][0]);
        System.out.println(members[2][1]);
        System.out.println(members[0][2]); //panggil array 1, ambil data ke 3

    }

}
