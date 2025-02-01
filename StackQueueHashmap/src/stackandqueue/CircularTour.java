package stackandqueue;

public class CircularTour {
    public static int canComplete(int[] petrol, int [] distance){
        int total = 0;
        int curr = 0;
        int start = 0;

        for(int i =0; i<petrol.length; i++){
            int net = petrol[i] - distance[i];
            total+=net;
            curr +=net;

            if(curr<=0){
                start = i+1;
                curr = 0;

            }
        }

        return total>=0? start:-1;
    }

    public static void main(String[] args) {
        int petrol []= {1,2,3,4,5};
        int distanc[] = {3,4,5,1,2};
        int ans = canComplete(petrol, distanc);
        System.out.println("Starting index:-"+ans);
    }
}
