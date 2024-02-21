package com.example.restapiinflearn.events;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class EventTest {
    @Test
    public void builder(){
        Event event = Event.builder()
                .name("Test name")
                .description("Test Description")
                .build();;
        assertThat(event).isNotNull();
    }
    @Test
    public void javaBean(){
        //GIVEN
        String testName = "TestName";
        String testDescription = "TestDescription";

        //WHEN
        Event event = new Event();
        event.setName(testName);
        event.setDescription(testDescription);

        //THEN
        assertThat(event.getName()).isEqualTo(testName);
        assertThat(event.getDescription()).isEqualTo(testDescription);
    }
}