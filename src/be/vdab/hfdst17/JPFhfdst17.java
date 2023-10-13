package be.vdab.hfdst17;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class JPFhfdst17 {
    public static void main(String[] args) {
        var totaalF = 0.0F;
        for (var i = 0; i < 1000; i++) {
            totaalF += 0.01F;
        }
        System.out.println("som met floats: " + totaalF);
        var totaalD = 0.0;
        for (var i = 0; i < 1000; i++) {
            totaalD += 0.01;
        }
        System.out.println("som met doubles: " + totaalD);

        var geluksGetal = BigDecimal.valueOf(7);

        var pi = new BigDecimal("3.141592653");

        var eenBigDecimal = BigDecimal.valueOf(2.364);
        eenBigDecimal = eenBigDecimal.setScale(2, RoundingMode.HALF_UP);
        System.out.println(eenBigDecimal);

        var totaalBD = BigDecimal.ZERO;
        var incremBD = BigDecimal.valueOf(0.01);

        for (var i=0; i<1000; i++) {
            totaalBD = totaalBD.add(incremBD);
        }
        System.out.println(totaalBD);

    }

}
