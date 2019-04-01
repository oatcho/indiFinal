package indiFinal.controller;

import indiFinal.data.CharacterRepository;
import indiFinal.model.Character;
import indiFinal.service.CharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class AppController {
    @Autowired
    CharacterRepository characterRepository = new CharacterRepository();
//    CharacterService characterService = new CharacterService();



    @RequestMapping("/")
    public String displayHomePage(ModelMap modelMap){
        characterRepository.fetchAllCharacters();
        characterRepository.setAllCharactersAndAddToArrayList();
        List<Character> allChars = characterRepository.getCharacters();
        modelMap.put("allChar", allChars);
        return "home";
    }
}
