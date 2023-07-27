public class revnum {
    public static void main(String[] args) {
        int n=78976;
        int count=0;
        int numrev=0;
        while(n>0){
            int rem=n%10;
            n=n/10;
            numrev=numrev*10+rem;
            count++;
        }
        System.out.println(numrev);
    }
}
