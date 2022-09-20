import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class StudyTest {

    @Test
    void split() {
        assertThat("a ,".split(",")).hasSize(1).containsOnly("a ");
        assertThat(",".split(",")).hasSize(0);
        assertThat("".split(",")).hasSize(1).containsOnly("");
        assertThat(" , ".split(",")).hasSize(2).containsOnly(" ");
    }

}
