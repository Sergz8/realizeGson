import org.junit.Assert;
import org.junit.Test;
import testPupil.Pupil;

public class PupilTest extends Assert {
    /**
    *1. ФИО
    *2. Дата рождения
    *3. Список оценок -числа в диапазоне от 1 до 5
    **/
    @Test
    public void testStudentCreate() throws Exception {
        Student p =new Student(
                "Иванов Иван Иванович",
                "10.06.1983",
                3,5,2
        );
        Student p2 =new Student(
                "Иванов Иван Иванович"
        );

    }


}
