// basil206
class StarPattern {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Using for loop:");
        for(int i=1;i<=n;i++){ for(int j=1;j<=i;j++) System.out.print("*"); System.out.println(); }

        System.out.println("Using while loop:");
        int i=1; while(i<=n){ int j=1; while(j<=i){ System.out.print("*"); j++; } System.out.println(); i++; }

        System.out.println("Using do-while loop:");
        i=1; do{ int j=1; do{ System.out.print("*"); j++; }while(j<=i); System.out.println(); i++; }while(i<=n);
    }
}
