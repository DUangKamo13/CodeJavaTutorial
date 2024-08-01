public class Result1To100 {
    public static void main(String[] args) {
        int Result = 1 ,sum = 0;
        while(Result <= 100){
            sum += Result;
            Result++;
        }
        System.out.println("result 1 To 100 : "+sum);
    }
}
