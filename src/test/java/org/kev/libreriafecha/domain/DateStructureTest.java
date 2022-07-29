package org.kev.libreriafecha.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.kev.libreriafecha.domain.exceptions.ExceptionDay;

import static org.junit.jupiter.api.Assertions.*;

class DateStructureTest {

    @Test
    void testDateStructure() {
        DateStructure dateStructure = DateStructure.builder()
                .day(1)
                .month(1)
                .year(1)
                .build();

        Assertions.assertEquals(1, dateStructure.getDay());
        Assertions.assertEquals(1, dateStructure.getMonth());
        Assertions.assertEquals(1, dateStructure.getYear());

        Assertions.assertTrue(dateStructure.getDay()== 1);

    }

    @Test
    void testDateStructure2() {
        DateStructure dateStructure = DateStructure.builder()
                .day(1)
                .month(1)
                .year(1)
                .build();

        Assertions.assertEquals(1, dateStructure.getDay());
        Assertions.assertEquals(1, dateStructure.getMonth());
        Assertions.assertEquals(1, dateStructure.getYear());

        Assertions.assertTrue(dateStructure.getDay()== 1);

        Assertions.assertNotNull(dateStructure);

        Exception exception = assertThrows(ExceptionDay.class, () -> {
            dateStructure.substractDay(0);
        });

        String acutal = exception.getMessage();
        String expected = "No se puede restar dias";

        assertEquals(expected, acutal);

    }
}