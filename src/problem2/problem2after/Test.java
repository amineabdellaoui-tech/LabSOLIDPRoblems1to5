package problem2.problem2after;

import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args){
        Parcel parcel=new Parcel(2.0);
        List<ShippingMethod> methods= Arrays.asList(
                new StandardShipping(),
                new ExpressShipping(),
                new DroneShipping(),
                new PickupShipping()
        );

        for(ShippingMethod method:methods){
            System.out.printf("%s: %.2f MAD\n",method.name(),parcel.shippingCost(method));
        }
    }

}
