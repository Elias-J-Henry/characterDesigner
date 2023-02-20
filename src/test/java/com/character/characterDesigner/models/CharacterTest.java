package com.character.characterDesigner.models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CharacterTest {
    Character character;

    @BeforeEach
    public void init() {
        character = new Character();

        character.setFirstName("Wayland");
        character.setLastName("Grey");
        character.setAge(27L);
        character.setGender("Male");
        character.setSexuality("Gay");
        character.setDiet("Air");
        character.setPersonality("Clever, Cold, Ambitious");
        character.setStyle("Femme Fatale");
        character.setRace("White");
        character.setSkinTone("Pale");
        character.setEyeColor("Green");
        character.setHairColor("Brown");
        character.setHairLength("Long");
        character.setBodyType("Slim");
        character.setHeight("6'2");
        character.setNationality("American");
        character.setOccupation("Serial Killer");
        character.setReligion("Wicca");
        character.setDislikes("People");
        character.setDesire("World Domination");
    }
    
    @Test
    public void settersTest() {

        Assertions.assertNotNull(character.getFirstName());
        Assertions.assertNotNull(character.getLastName());
        Assertions.assertNotNull(character.getAge());
        Assertions.assertNotNull(character.getGender());
        Assertions.assertNotNull(character.getSexuality());
        Assertions.assertNotNull(character.getDiet());
        Assertions.assertNotNull(character.getPersonality());
        Assertions.assertNotNull(character.getStyle());
        Assertions.assertNotNull(character.getRace());
        Assertions.assertNotNull(character.getSkinTone());
        Assertions.assertNotNull(character.getEyeColor());
        Assertions.assertNotNull(character.getHairColor());
        Assertions.assertNotNull(character.getHairLength());
        Assertions.assertNotNull(character.getBodyType());
        Assertions.assertNotNull(character.getHeight());
        Assertions.assertNotNull(character.getNationality());
        Assertions.assertNotNull(character.getOccupation());
        Assertions.assertNotNull(character.getReligion());
        Assertions.assertNotNull(character.getDislikes());
        Assertions.assertNotNull(character.getDesire());
    }
    
}
