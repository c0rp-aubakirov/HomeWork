public class FizzBuzz {
    public static void main(String[] args) {
        for(int i = 0; i<100; i++){
            System.out.println(checkIt(i));
        }
    }

    private static String checkIt(int i){
        if(i==0)
            return "0";
        if(i%15==0){
            return "FizzBuzz";
        }else if(i%3==0){
            return "Fizz";
        }else if(i%5==0){
            return "Buzz";
        }
        return Integer.toString(i);
    }
}
