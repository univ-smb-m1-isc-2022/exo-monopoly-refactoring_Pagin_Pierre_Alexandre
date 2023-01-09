package pa;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class CaseConstructibleTest {

    @Mock
    Quartier q;

    @Mock
    Joueur j;

    @Test
    public void proprietaireDefaultTest(){
        CaseConstructible c = new CaseConstructible("test",0,0,q);
        assertThat(c.hasProprietaire()).isFalse();
        assertThat(c.getProprietaire()).isNull();

        c.setProprietaire(j);
        assertThat(c.getProprietaire()).isEqualTo(j);

        assertThat(c.hasProprietaire()).isTrue();
        assertThat(c.getProprietaire()).isNotNull();
    }

    @Test
    public void testQuartierCase(){
        CaseConstructible c = new CaseConstructible("test",0,0,q);

        when(q.getCouleur()).thenReturn("couleur");
        assertThat(c.getCouleur()).isEqualTo("couleur");
        when(q.getSizeQuartier()).thenReturn(2);
        assertThat(c.nombreProprieteDeLaCouleur()).isEqualTo(2);
    }
}
