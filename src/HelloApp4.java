public class HelloApp4 {
    public static void main(String[] args) {
        String names = "";

        if (args.length > 0) {
            for (String name : args) {
                if (!names.isEmpty()) {
                    names += ", ";
                }
                names += name;
            }
        } else {
            names = "World";
        }

        System.out.println("Hello, " + names + "!");
    }
}