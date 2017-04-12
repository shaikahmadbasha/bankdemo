package com.capg.authservice;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.capg.authservice.AuthServerApp;

/**
 * @author Peter Schneider-Manzell
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = AuthServerApp.class)
@WebAppConfiguration
@IntegrationTest({"server.port=0", "management.port=0"})
public abstract class AbstractTokenTests {

    @Value("${local.server.port}")
    int port;


}
