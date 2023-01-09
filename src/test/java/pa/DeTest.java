package pa;

import org.junit.jupiter.api.Test;
import pa.De;


import static org.assertj.core.api.Assertions.assertThat;

public class DeTest {

    @Test
    public void rangeLancer(){
        De de = new De();
        for (int i = 0; i < 12; i++) {
            de.lancer();
            assertThat(de.getValeur()).isBetween(1, 6);
        }
    }

    @Test
    public void DeNonNul(){
        De de = new De();
        assertThat(de.getValeur()).isNotNull();
    }
}
