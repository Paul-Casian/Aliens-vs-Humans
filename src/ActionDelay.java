public class ActionDelay {

    public static void delays(int sleeptime){
        try {
            Thread.sleep(sleeptime);
        }catch (InterruptedException e){
            System.out.println("Exception e found: " + e);
        }
    }

}
