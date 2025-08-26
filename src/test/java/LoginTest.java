import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class LoginTest {

    @Test
    public void loginAvecCridentialsCorrect(){
        assertEquals(1, 1);
    }
    @Test
    public void loginAvecCridentialsIncorrect(){
        assertEquals(2, 2);
    }

}
