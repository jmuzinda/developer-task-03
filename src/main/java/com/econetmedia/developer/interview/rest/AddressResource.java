package com.econetmedia.developer.interview.rest;

import com.econetmedia.developer.interview.model.Address;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.io.IOException;

/**
 * Created by jmuzinda on 10/25/17.
 */
@RestController
public class AddressResource {

    private final Logger logger = LoggerFactory.getLogger(RestConsumerImpl.class);

    @RequestMapping(path = "/get-address", method = RequestMethod.GET, consumes = { "application/json", "application/xml" })
    @ResponseBody
    public void receivePersonAddress(Address address) {
        String currentUserHome = System.getProperty("user.home");
        File file = new File(File.separator + "data" + File.separator + "naruto" + File.separator + "log" + File.separator + "MyInterview.log");
        //if directory exists?
        if (!file.exists()) {
            try {
                file.getParentFile().mkdirs();
                file.createNewFile();
            } catch (IOException e) {
                //fail to create directory
                e.printStackTrace();
            }
        }
        logger.debug("Address Part 1 : " + address.getAddressPart1());
        logger.debug("Address Part 2 : " + address.getAddressPart2());
        logger.debug("Address Part 3 : " + address.getAddressPart3());
        logger.debug("Address Part 4 : " + address.getAddressPart4());
        RestConsumer restConsumer = new RestConsumerImpl();
        SampleRestObject obj = restConsumer.makeRestCall(1);
        System.out.println("ID: " + obj.getId() + " Title: " + obj.getTitle() + " UserId: " + obj.getUserId() + " Body: " + obj.getId());
    }
}
