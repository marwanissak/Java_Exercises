package com.company;

public class Prime {

        public static void Prime_calc(int number) {


            //read in from user
            //Scanner in;
            //in = new Scanner(System.in);
            //String string = in.nextLine();
            //int number = Integer.parseInt(string);


            double  A=0 , B=1,C ;
            System.out.println(A );
            System.out.println(B );
            for(int i=0; i<number; i++){
                C = A + B;
                A=B;
                B=C;
                System.out.println(C);
            }






        }
}

