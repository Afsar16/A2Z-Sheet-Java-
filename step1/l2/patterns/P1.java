public class P1 {
    public static void main(String[] args) {
        // p1
        // for(int i=0; i<5; i++) {
        //     for(int j=0; j<5; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // p2 
        for(int i=0; i<5; i++) {
            for(int j=0; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // p3 
        for(int i=1; i<=5; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        // p3 
        for(int i=1; i<=5; i++) {
            for(int j=0; j<i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
        // p5 
        int n = 5;
        for(int i=1; i<=n; i++) {
            for(int j=0; j<n-i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // p6 
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i+1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
