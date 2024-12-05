public class Primes {
    public static void main(String[] args) {
        
        System.out.println( "Prime numbers up to " + (args [0] + ":"));
        int n = Integer.parseInt(args[0]);
        int count = 0;
        int i = 2;
        while (i <= n) {
            
            if (i == 2) {
                System.out.println(i);
                count ++;
            } 
            
            else {
                int num = i -1;

                while (i % num != 0) {
                    num --;

                    if (num == 1) {
                        count ++;
                        System.out.println(i);
                        break;
                    }
                }
            }
            i++;
        }
        
        System.out.println("There are " + count + " primes between 2 and " + n + " (" + ((count * 100) / n) + "% are primes)");
   }
}