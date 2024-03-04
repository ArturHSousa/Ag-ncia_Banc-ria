package Util;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Utils {

    static NumberFormat format = new DecimalFormat("R$ #,##0.00");

    public static String doubleString(Double valor){
        return format.format(valor);
    }
}
