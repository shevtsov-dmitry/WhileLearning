
import java.util.Arrays;

public class DescendingOrder {
    public static int sortDec(final int num){
        //splitting the num to int array for each number
        String tempStr = String.valueOf(num);
        char[] charArr = tempStr.toCharArray();
        int[] arrInt = new int[charArr.length];
        for (int i = 0; i < charArr.length; i++) {
            arrInt[i] = Character.getNumericValue(charArr[i]);
        }
        // sorting an array
        Arrays.sort(arrInt);
        for(int i = 0; i < arrInt.length / 2; i++){
            int temp = arrInt[i];
            arrInt[i] = arrInt[arrInt.length - i - 1];
            arrInt[arrInt.length - i - 1] = temp;
        }
        // parsing final number, then returning it
        String lovely = Arrays.toString(arrInt);
        String newLovely = lovely.replace("[","").replace("]","")
                .replace(",","").replace(" ","");
        return Integer.parseInt(newLovely);
    }
}
