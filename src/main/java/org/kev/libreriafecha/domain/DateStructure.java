package org.kev.libreriafecha.domain;

import lombok.Builder;
import lombok.Data;
import org.kev.libreriafecha.domain.exceptions.ExceptionDay;

@Data
@Builder
public class DateStructure {

    private int day;
    private int month;
    private int year;

    public void substractDay(Integer day) {
        if(day <1){
            throw new ExceptionDay("No se puede restar dias");
        }
        this.day--;
    }

}
