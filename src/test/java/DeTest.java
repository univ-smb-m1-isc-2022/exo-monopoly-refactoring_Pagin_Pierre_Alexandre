import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DeTest {

    @Test
    public void rangeLancer(){
        De de = new De();
        de.lancer();
        assertThat(de.getValeur()).isBetween(1,6);
    }

}
