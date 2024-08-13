
public class P3 {
    public static void main(String[] args) {
        // p13
        // int num = 1;
        int n = 5;
        // for(int i=0; i<n; i++) {
        //     for(int j=0; j<=i; j++) {
        //         System.out.print(num++ + " ");
        //     }
        //     System.out.println();
        // }

        // p14
        // char ch = 65; this will print A - O
        // for(int i=0; i<n; i++) {
        //     char ch = 65;
        //     for(int j=0; j<=i; j++) {
        //         System.out.print( ch++ + " ");
        //     }
        //     System.out.println();
        // }

        // p15
        // for(int i=0; i<n; i++) {
        //     char ch = 65;
        //     for(int j=0; j<n-i; j++) {
        //         System.out.print( ch++ + " ");
        //     }
        //     System.out.println();
        // }

        // p16
        // char ch = 65;
        // for(int i=0; i<n; i++) {
            
        //     for(int j=0; j<=i; j++) {
        //         System.out.print( ch + " ");
        //     }
        //     System.out.println();
        //     ch++;
        // }

        // p17
        for(int i=0; i<n; i++) {
            char ch = 'A';
            for(int space=0; space<n-i+1; space++) {
                System.out.print(" ");
            }
            for(int j=0; j<=i; j++) {
                System.out.print(ch++);
            }
            ch--;
            for(int k=0; k<i; k++) {
                System.out.print(--ch); 
            }
            System.out.println();
            // ch++;
        } 
    }
}
