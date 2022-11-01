public class StringEndsWith {
    public static boolean solution(String str, String ending){
        char[] arrStrChar = str.toCharArray();
        char[] arrEndingChar = ending.toCharArray();
        if (arrEndingChar.length > arrStrChar.length) return false;
        if (ending.equals("")) return true;
        boolean isTrueOrFalse = false;
        int j = -1;
        for(int i = arrStrChar.length - arrEndingChar.length; i < arrStrChar.length; i++) {
            j++;
            isTrueOrFalse = arrStrChar[i] == arrEndingChar[j];
            if(!isTrueOrFalse) return false;

        }
        return isTrueOrFalse;
    }
}
//System.out.print ( "STR: " + arrStrChar[i] + " \n");
//System.out.print("Ending: " + arrEndingChar[j] + " \n");