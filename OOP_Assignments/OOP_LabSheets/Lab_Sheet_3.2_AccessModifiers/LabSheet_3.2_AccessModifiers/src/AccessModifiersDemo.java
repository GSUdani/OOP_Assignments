public class AccessModifiersDemo {
    private int privateVar;
    double defaultVar;
    protected boolean protectedVar;
    public String publicVar;


    public int getPrivateVar(int x) {
        int privateVar=x;
        return privateVar;
    }

    double getDefaultVar(double y) {
        double defaultVar =y;
        return defaultVar;
    }

    protected boolean getProtectedVar(boolean z) {
        boolean protectedVar=z;
        return protectedVar;

    }

    public String getPublicVar(String i) {
        String publicVar=i;
        return publicVar;
    }

}
