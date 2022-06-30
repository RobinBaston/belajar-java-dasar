public class Variable {

    public static void main(String[] args) {

        //tidak Langsung
        String name;
        name = "Robin Bastian Aritonang";

        System.out.println(name);

        int age = 28;
        String address = "Indonesia";

        System.out.println(age);
        System.out.println(address);

        //kata kunci var
        //dengan var java akan secara otomatis mendeteeksi tipe data
        var firstnName = "Robin";
        var middleName = "Bastian";
        var lastName = "Aritonang";

        System.out.println(firstnName);
        System.out.println(middleName);
        System.out.println(lastName);

        //kata kunci final
        //variable ini tidak bisa diubah datanya
        //final String name = "Robin Bastian Aritonang";


    }

}
