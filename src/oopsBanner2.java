import java.util.HashMap;
import java.util.Map;

public class oopsBanner2 {

    // 🔸 Utility method to create pattern map
    public static Map<Character, String[]> getPatterns() {
        Map<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        map.put('P', new String[]{
                "***** ",
                "*    *",
                "*    *",
                "***** ",
                "*     ",
                "*     ",
                "*     "
        });

        map.put('S', new String[]{
                " *****",
                "*     ",
                "*     ",
                " *****",
                "      *",
                "      *",
                " *****"
        });

        return map;
    }

    // 🔸 Utility method to print banner
    public static void printBanner(String word, Map<Character, String[]> map) {
        for (int i = 0; i < 7; i++) {
            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {
                line.append(map.get(ch)[i]).append("  ");
            }

            System.out.println(line);
        }
    }

    public static void main(String[] args) {
        Map<Character, String[]> patterns = getPatterns();

        String word = "OOPS";

        printBanner(word, patterns);
    }
}