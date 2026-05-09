import java.util.*;

class Productwisee_NoHm {
    public static void main(String[] args) {

        String[] products = {
                "Product D","Product D","Product C","Product C",
                "Product B","Product A"
        };

        int[] qty = {22,24,9,6,19,23};

        for(int i=0; i<products.length; i++) {

            boolean alreadyPrinted = false;

            for(int j=0; j<i; j++) {
                if(products[i].equals(products[j])) {
                    alreadyPrinted = true;
                    break;
                }
            }

            if(!alreadyPrinted) {

                int sum = 0;

                for(int k=0; k<products.length; k++) {
                    if(products[i].equals(products[k])) {
                        sum += qty[k];
                    }
                }

                System.out.println(products[i] + " = " + sum);
            }
        }
    }
}
