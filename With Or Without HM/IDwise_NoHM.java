import java.util.*;

class IDwise_NoHM {
    public static void main(String[] args) {

        String[] ids = {"E011","E011","E012","E013","E012"};
        int[] qty = {22,24,9,6,19};

        for(int i=0; i<ids.length; i++) {

            boolean found = false;

            for(int j=0; j<i; j++) {
                if(ids[i].equals(ids[j])) {
                    found = true;
                    break;
                }
            }

            if(!found) {

                int sum = 0;

                for(int k=0; k<ids.length; k++) {
                    if(ids[i].equals(ids[k])) {
                        sum += qty[k];
                    }
                }

                System.out.println(ids[i] + " = " + sum);
            }
        }
    }
}
