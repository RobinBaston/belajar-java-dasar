public class ForEach {
    public static void main(String[] args) {

        //TANPA FOR EACH
        System.out.println("Aray Tanpa For Each");

        String[] names = { //Array
                "Robin", "Bastian", "Aritonang",
                "Florentina", "Widya", "Lestari"
        };

        for (var i = 0; i < names.length; i++){
            System.out.println(names[i]);
        }

        //FOR EACH
        System.out.println();
        System.out.println("FOR EACH");

        for (var name : names){
            System.out.println(name);
        }

    }
}
