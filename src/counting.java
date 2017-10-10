public class counting {
    public static void main(String[] args) {


        int i;
        for (i = 0; i < 10; i++) {


            if (i >= 7) {
                break;
            }
            System.out.println(" we are getting there...");
            if (i >= 3) {
                continue;
            }
            System.out.println(" getting closer...");
        }
        System.out.println(i);
    }
}