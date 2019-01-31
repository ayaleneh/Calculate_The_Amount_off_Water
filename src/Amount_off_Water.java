import java.util.Scanner;

public class Amount_off_Water {
    public static void main(String[] args) {
       Double width,height;
       int number_of_inches_of_rainfall=1;
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter the width for roof");
        width=scanner.nextDouble();
        System.out.println("please enter the height for the roof");
        height=scanner.nextDouble();
        //we should change the above input to inches
        Double new_width,new_height;
        new_width=width*12;
        new_height=height*12;
        Double Runoff=(new_width*new_height*number_of_inches_of_rainfall);
        //we should change to gallon the above result
        Runoff=Runoff/231;
        System.out.println("the much water runs off a roof in a rain storm is "+Runoff);

    }
}
