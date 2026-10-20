// basil206
class ExceptionDemo {
    static void divide(int a,int b) throws ArithmeticException {
        if(b==0) throw new ArithmeticException("Division by zero");
        System.out.println("Result: "+(a/b));
    }
    public static void main(String[] args) {
        try { divide(10,0); }
        catch(ArithmeticException e){ System.out.println("Caught: "+e); }
        finally { System.out.println("Finally block executed"); }
    }
}
