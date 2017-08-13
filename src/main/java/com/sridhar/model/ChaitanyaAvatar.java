package com.sridhar.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Qualifier("chaitanya")
@Component
public class ChaitanyaAvatar implements Avatar {
    @Override
    public void paritranayaSaadhunaam() {

    }

    @Override
    public void vinashayachaDushkrutam() {

    }

    @Override
    public void dharmaSamsthapanam() {
        System.out.println("Bhagavatha Dharma is the real Dharma");
    }

    @Override
    public void sambhavaamiYugeYuge() {

    }
}
