package com.sridhar.model;

import org.springframework.beans.factory.annotation.Qualifier;

@Qualifier("rama")
public class RamaAvatar implements Avatar{
    @Override
    public String paritranayaSaadhunaam() {
        return "";
    }

    @Override
    public void vinashayachaDushkrutam() {

    }

    @Override
    public void dharmaSamsthapanam() {

    }

    @Override
    public void sambhavaamiYugeYuge() {

    }
}
