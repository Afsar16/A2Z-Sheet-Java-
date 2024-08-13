public class P4 {
    public static void main(String[] args) {
        int N = 5;
        // pattern 18
        // for (int i = 0; i < N; i++) {
        //     for (char ch= (char)(int)('A'+N-1-i); ch <= (char)(int)('A'+N-1); ch++) {
        //         System.out.print(ch + " ");
        //     }
        //     System.out.println();
        // }

        //pattern 19
        for(int i=0; i<N; i++) {
            for(int j=0; j<N-i; j++) {
                System.out.print("*");
            }
            for(int s=0; s<i*2; s++) {
             System.out.print(" ");
            }
            for(int k=0; k<N-i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0; i<N; i++) {
            for(int j=0; j<=i; j++) {
                System.out.print("*");
            }
            for(int s=1; s<N*2-2*i-1; s++) {
             System.out.print(" ");
            }
            for(int k=0; k<=i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        // pattern 20
        System.out.println();
        System.out.println("Pattern 20");
        System.out.println();
        for(int i=0; i<N-1; i++) {
            for(int j=0; j<=i; j++) {
                System.out.print("*");
            }
            for(int s=1; s<N*2-2*i-1; s++) {
             System.out.print(" ");
            }
            for(int k=0; k<=i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0; i<N; i++) {
            for(int j=0; j<N-i; j++) {
                System.out.print("*");
            }
            for(int s=0; s<i*2; s++) {
             System.out.print(" ");
            }
            for(int k=0; k<N-i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        // patter 21
        System.out.println();
        System.out.println("Pattern 21");
        System.out.println();

        // int n = 6;
        int n = 4;
        for(int i=0;i<n;i++){
         
            // inner loop for printing the stars at borders only.
            for(int j=0;j<n;j++){
                
                if(i==0 || j==0 || i==n-1 || j==n-1)
                   System.out.print("*");
                   
                // if not border index, print space.
                else System.out.print(" ");
            }
            
             // As soon as the stars for each iteration are printed, we move to the
             // next row and give a line break otherwise all stars
             // would get printed in 1 line.
             System.out.println();
        }

        // pattern 22
        System.out.println();
        System.out.println("Pattern 22");
        System.out.println();
        for(int i=0;i<2*n-1;i++){
         
            // inner loop for no. of columns.
            for(int j=0;j<2*n-1;j++){
                
                int top = i;
                int bottom = j;
                int right = (2*n - 2) - j;
                int left = (2*n - 2) - i;
                
               System.out.print(n- Math.min(Math.min(top,bottom), Math.min(left,right)) + " ");
            }

            System.out.println();
        }
    }
}


