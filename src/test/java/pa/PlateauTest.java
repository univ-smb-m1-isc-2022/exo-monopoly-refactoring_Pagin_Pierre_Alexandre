package pa;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PlateauTest {

    static Plateau p;

    @BeforeAll
    public static void init(){
       p = new Plateau();
    }

    @Test
    public void testBoucleCase(){
        Case c = p.depart;
        for (int i = 0; i < 31; i++) {
            c = c.retourneCaseSuivante();
        }
        assertThat(c).isEqualTo(p.depart);
    }

}
