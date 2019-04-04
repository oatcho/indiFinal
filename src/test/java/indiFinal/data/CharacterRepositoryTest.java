package indiFinal.data;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

public class CharacterRepositoryTest {

    private CharacterRepository charRepo;

    @Before
    public void create(){
        charRepo = new CharacterRepository();
    }

    @Test
    public void shouldAddAllCharactersToArrayList() {
        charRepo.addAllCharactersToArrayList();
        int result = charRepo.characters.size();
        assertThat(result, equalTo(16));
    }

    @Test
    public void should
}