package com.sandhyaa7.persistence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SWAPIDaoTest {
    @Test
    void getPlanetSuccess(){
        SWAPIDao dao = new SWAPIDao();
        assertEquals("Tatooine", dao.getPlanet().getName());
    }

}