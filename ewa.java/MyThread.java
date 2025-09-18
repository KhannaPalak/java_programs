//java threads using thread class

class MyThread extends Thread {
    
    //overridden run method from Thread class
    @Override
    public void run()
    {
        //perform some task
        for (int i =0; i<=5 ; i++)
        {
            //generate some random number from 1 to 100
            int randomNum = (int)(Math.random()*100 +1);
            System.out.println("Random number:"+i+": "+randomNum);

            try {
                Thread.sleep(5000); //sleep for 5 sec
            } catch (InterruptedException e) {
               System.out.println("Child thread interrupted.");

            }
        }
        System.out.println("Child thread finished execution.");
    }
}

