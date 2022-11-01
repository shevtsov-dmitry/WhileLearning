public class CatsAndShelves {
    public static int solution(int start, int finish)
    {
        // exceptions to algorithm
        switch(finish - start){
            case 0 -> {
                return 0;
            }
            case 1, 3 -> {
                return 1;
            }
            case 2 -> {
                return 2;
            }
        }
        // algorithm
        int jump = 3;
        int i = 0;
        while(true){
            if (start < finish){
                start+= jump;
                i++;
            }
            if (start == finish) break;
            if (start == finish - 3){
                i+= 1; break;
            }
            if(start == finish - 2){
                i+=2; break;
            }
            if(start == finish - 1){
                i++; break;
            }
            if(start == finish + 1){
                i+=2; break;
            }
            if(start == finish + 2){
                i+=1; break;
            }
        }
        return i;
}
}
