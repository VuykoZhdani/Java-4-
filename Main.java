package Method;

import Realization.*;

public class Main {
    public static void main(String [] args)
    {
        Voltmetr voltmetr1 =new Voltmetr(40, 34.69);
        Stetoscop stetoscop1 =new Stetoscop(56, 97);
        Voltmetr voltmetr2 =new Voltmetr(20, 64.69);
        Stetoscop stetoscop2 =new Stetoscop(76, 97);
        Voltmetr voltmetr3 =new Voltmetr(41, 54.69);
        Stetoscop stetoscop3 =new Stetoscop(26, 1007);


        Physics[] chmo={
                voltmetr1, stetoscop1, voltmetr2, stetoscop2, voltmetr3, stetoscop3
    };
        Compass Yacock=new Compass(chmo);
        Yacock.sortArraybyPrice();
        Yacock.printArray();
        Yacock.sortArraybyWeight();
        Yacock.printArray();
        Yacock.sortArraybyPriceR();
        Yacock.printArray();
        Yacock.sortArraybyWeightR();
        Yacock.printArray();
        Yacock.findUsingEnhancedForLoop(1007);
    }
}
