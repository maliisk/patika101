package java101;

public class harmonicAvarage {
    public static void main(String[] args) {
        double [] list = {1,2,3,4,5,6};
        double sum =0.0;

        for (int i=0; i<list.length;i++){
            sum+=(1/list[i]);

        }
        double  average =(list.length/sum);

        System.out.println("The harmonic average is : " + average);

    }
}
