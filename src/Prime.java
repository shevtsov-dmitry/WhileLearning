public class Prime {
    public static boolean isPrime(int num){
       boolean prime = true;
        switch(num){
            case -1, 0, 1,2 -> {
                return false;
            }
        }
        if(num >= 0)
            for(int i = 2; i < num; i++)
                if (0 == num % i) {
                    prime = false;
                    break;
                }
        if(num < 0)
            for(int j = num; j < -1;j++)
                if (0 == (num % j)) {
                    prime = false;
                    break;
                }
       return prime;
}
}