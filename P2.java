public class P2 {
    public static void main(String[] args) {
        int n = 5;

        //p8
        // for(int i=0; i<n-1; i++) {
        //     for(int j=0; j<n-i-1; j++) {
        //         System.out.print(" ");
        //     }
        //     for(int k=0; k<=i; k++) {
        //         System.out.print("*");
        //     }
        //     for(int l=0; l<i; l++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //p9
    //     for(int i=0; i<n; i++) {
    //         for(int k=0; k<i; k++) {
    //             System.out.print(" ");
    //         }
    //         for(int j=0; j<n-i; j++) {
    //             System.out.print("*");
    //         }
    //         for(int l=0; l<n-i-1; l++) {
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     } 

        // p11 
        // for(int i=0; i<n-1; i++) {
        //     for(int j=0; j<=i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // } 
        // for(int i=0; i<n; i++) {
        //     for(int j=0; j<=n-i-1; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // } 

        // p11 
        int count = 1;
        for(int i=0; i<n; i++) {
            if(i%2 == 0) {
                count = 1;
            }else count = 0;

            for(int j=0; j<=i; j++) {
                System.out.print(count);
                count = 1-count;
            }
            System.out.println();
        }
    }
}


