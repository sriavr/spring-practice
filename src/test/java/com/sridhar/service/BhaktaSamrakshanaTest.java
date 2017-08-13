package com.sridhar.service;

import com.sridhar.configuration.AppConfiguration;
import com.sridhar.model.Avatar;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import static org.mockito.BDDMockito.given;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = AppConfiguration.class)
public class BhaktaSamrakshanaTest {

    @MockBean
    @Qualifier("chaitanya")
    private Avatar avatar;


    @Before
    public void setup(){
        given(this.avatar.paritranayaSaadhunaam()).willReturn("patita-pāvana-hetu tava avatāra\n" +
                "mo sama patita prabhu nā pāibe āra");
    }

    @Test
    public void doBhaktaSamrakshana(){
        System.out.println("avatar.paritranayaSaadhunaam() = " + avatar.paritranayaSaadhunaam());
    }


}
