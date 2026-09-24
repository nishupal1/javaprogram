public class vdo17_logical {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = true;
        if (a && b) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        boolean c = true;
        boolean d = false;
        boolean e = true;
        if (c && d && e) {       // associtivity left to right
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        boolean a1 = true;
        boolean a2 = false;
        if (a || b) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        System.out.print("Not(a1) is ");
        System.out.println(!a1);
        System.out.print("Not(b2) is ");
        System.out.print(!a2);
    }
}