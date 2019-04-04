package indiFinal.data;

import indiFinal.controller.AppController;
import indiFinal.model.Character;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.ResponseSpecification;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;
import static sun.plugin2.main.client.ServiceDelegate.get;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

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
    public void shouldRetrievesSearchedForCharacter(){
        charRepo.addAllCharactersToArrayList();
        Character returnedCharacter = charRepo.findByName("yoda");
        assertThat(returnedCharacter, equalTo(charRepo.characters.get(9)));
    }

    @Test
    public void testsForSuccessfulRequestAndContentTypeFromCharacterEndpoint(){
        given().when().get("https://swapi.co/api/people/1/?format=json").then().assertThat()
                .statusCode(200).and().contentType(ContentType.JSON);
    }

    @Test
    public void testsForSuccessfulRequestAndContentTypeFromPlanetEndpoint(){
        given().when().get("https://swapi.co/api/planets/1/?format=json").then().assertThat()
                .statusCode(200).and().contentType(ContentType.JSON);
    }
}