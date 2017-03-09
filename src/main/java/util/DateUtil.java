package util;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.lang.String;



public class DateUtil {


    final static SimpleDateFormat dateFormat=
        new SimpleDateFormat("DD.MM.YYYY");



    public static Date toDate(String dateString)
            throws ParseException {
        return dateFormat.parse(dateString);
    }

    public static String toString(Date date) {
        return dateFormat.format(date);
    }
}
