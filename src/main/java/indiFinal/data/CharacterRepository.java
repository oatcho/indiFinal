package indiFinal.data;

import indiFinal.model.Character;
import indiFinal.service.CharacterService;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class CharacterRepository {
    private ArrayList<Character> characters = new ArrayList<>();
    CharacterService characterService = new CharacterService();


    public ArrayList<Character> getCharacters() {
        return characters;
    }

    public void setCharacters(ArrayList<Character> characters) {
        this.characters = characters;
    }

//    public void fetchAllCharacters(){
//        Character luke = characterService.fetchSingleCharacter(1);
//    }

    public void setAllCharactersAndAddToArrayList(){
        Character luke = characterService.fetchSingleCharacter(1);
        Character luke1 = new Character(luke.getName(), luke.getBirthYear(), luke.getGender());
        characters.add(luke1);

        Character c3 = characterService.fetchSingleCharacter(2);
        Character c31 = new Character(c3.getName(), c3.getBirthYear(), c3.getGender());
        characters.add(c31);



    }

    public Character findByName(String name){
        for (Character character: characters){
            if (character.getName().equalsIgnoreCase(name)){
                return character;
            }
        }
        return null;
    }
}
