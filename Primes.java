public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        boolean[] arrP = new boolean[n+1];

        arrP[0] = false;
        arrP[1] = false;
        
        for (int i = 2; i <= n; i++)
        {
            arrP[i] = true;
        }

        int p = 2;
       

        for (int i = p; i  < arrP.length; i++)
        {
            boolean firstTime = true;

            if (i % p == 0 && firstTime == true)
               {
                arrP[p] = true;
                firstTime = false;
               }

            if ( i < arrP.length - 1)
            {
                for (int j = i + 1; j < arrP.length; j++)
            {
               if (j % p == 0 && firstTime == false)
               {
                arrP[j] = false;
               }
            }

            if (arrP[i + 1] == true)
            {
                p = i + 1;
            }

            }
        } 

        for (int i = 0; i > arrP.length; i++)
        {
            if (arrP[i] == true)
            {
                System.out.println(i);
            }
        }
   }
}