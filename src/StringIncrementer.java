import java.util.ArrayList;
import java.util.stream.Collectors;
public class StringIncrementer {
    public static String incrementString(String str) {
        char[] tempCharArr = str.toCharArray();
        ArrayList<Character> chars = new ArrayList<>();
        ArrayList<Character> word = new ArrayList<>();

        for (int i = 0; i < tempCharArr.length; i++) {
            if (Character.isDigit(tempCharArr[i]) ) {
                chars.add(tempCharArr[i]);
            }
        }
        for (int i = 0; i < tempCharArr.length; i++) {
            if(Character.isDigit(tempCharArr[i]) && tempCharArr[i] != '0') break;
            word.add(tempCharArr[i]);
        }
        if(word.size() == 0) return "1";
        if(chars.size() == 0) word.add('1');
            // managing with +1 to integer
            String StringInt = chars.stream().map(Object::toString)
                    .collect(Collectors.joining(""));
            int plusPlus = Integer.parseInt(StringInt);
            plusPlus++;
            String part2 = String.valueOf(plusPlus);
        String part1 = word.stream().map(Object::toString)
                .collect(Collectors.joining(""));
        String finish = part1+part2;
        System.out.println(finish);
        return finish;
    }
}
