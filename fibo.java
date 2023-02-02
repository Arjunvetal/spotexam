class fibo{

    public static void main1(String[] args) {
        int n1=0,n2=1,n3,i,count=20;

        System.out.println(n1+" "+n2);

         for(i=2;i<=count;i++){
         n3=n1+n2;
         System.out.println(n3);
         n1=n2;
         n2=n3;

         }  
         //upadate file 

    public static void PrimeNo()
    {
        int num=20, count;

        for(int i=1; i<=num; i++)
        {
            count = 0;
            for(int j=2; j<=i/2; j++)
            {
                if(i%j == 0)
                {
                    count++;
                    break;
                }
            }

            if(count == 0)
            {
                System.out.println(i);
            }
        }
    }
    }
}