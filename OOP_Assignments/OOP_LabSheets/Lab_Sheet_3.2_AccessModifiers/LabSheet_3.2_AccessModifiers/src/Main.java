public class Main {
    public static void main(String[] args) {
        AccessModifiersDemo show = new AccessModifiersDemo();
        System.out.println(show.getPrivateVar(34));
        System.out.println(show.getDefaultVar(4.3));
        System.out.println(show.getProtectedVar(false));
        System.out.println(show.getPublicVar("bool"));

        SubClassDemo show2 = new SubClassDemo();
        show2.displayProtectedVar();

    }
}
