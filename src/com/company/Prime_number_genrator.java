package com.company;

 class Prime_number_genrator {
     static void Prime_number_genrator_func (int n_input)
     {
         System.out.println(2);
         for (int b = 3 ; b <n_input ; b++)
         {
             if(Prime_number_check(b))
             {
                 System.out.println(b);
             }

         }

     }

    private static boolean Prime_number_check(int n_input)
    {
        int output_number= 0;
        for (int i = 2 ; i <n_input ; i++)
        {

                if (n_input % i == 0) {
                    return false;
                }


        }
        return true;
    }

}
