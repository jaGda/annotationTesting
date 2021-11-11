package org.example;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonTest {

    @Test
    public void givenObjectSerializedThenTrueReturned() {
        Person person = new Person("jan", "kowalski", "36");
        ObjectToJsonConverter serializer = new ObjectToJsonConverter();
        String jsonString = serializer.concertToJson(person);
        assertEquals(
                "{\"personAge\":\"36\",\"firstName\":\"Jan\",\"lastName\":\"Kowalski\"}",
                jsonString);
    }
}