class medhod {
     int plusmethod(int x, int y)
    {
        return x + y;
    }


         double plusmethod(double a, double b)
        {
            return a+b;
        }



            public static void main(String[] args)
            {
                medhod my=new medhod();

                int mynum1 =my.plusmethod(8, 5);
                int mynum2 =my.plusmethod(9, 4);

                System.out.println("int :" + mynum1);
                System.out.println("double :" + mynum2);
            }
        }

