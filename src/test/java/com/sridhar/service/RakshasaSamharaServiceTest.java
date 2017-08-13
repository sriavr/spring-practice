package com.sridhar.service;

import com.sridhar.configuration.AppConfiguration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = AppConfiguration.class)

public class RakshasaSamharaServiceTest {
    @Autowired(required = true)
    private RakshasaSamharaService rakshasaSamharaService;


    @Test
    public void doRakshasaSamhara() throws Exception {
        rakshasaSamharaService.doRakshasaSamhara();
    }

}