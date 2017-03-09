import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import util.DateUtil;

import java.util.Date;

public class SimpleDateFORMAT extends Assert {

    //конвертируем дату из сторки date и обратно
    @Test
    public void testConvertToDateAndBack() throws Exception{
        String dateString = "08.03.2017";
        Date date = DateUtil.toDate(dateString);
        System.out.println("date=" +date);
        String dateStringBack = DateUtil.toString(date);
        //при конвертировании получается тоже самое
        assertEquals(dateString,dateStringBack);

        
    }
}
