package com.econetmedia.developer.interview.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestTemplate;

/**
 * Created by jmuzinda on 10/25/17.
 */
public class RestConsumerImpl implements RestConsumer {

    private final Logger logger = LoggerFactory.getLogger(RestConsumerImpl.class);

    @Override
    public SampleRestObject makeRestCall(int postId) {
        RestTemplate restTemplate = new RestTemplate();
        SampleRestObject entity = null;
        final String END_POINT = "https://jsonplaceholder.typicode.com/posts/"+postId;
        try{
            ResponseEntity<SampleRestObject> sampleObject =
                    restTemplate.exchange(END_POINT.trim(), HttpMethod.GET, null, SampleRestObject.class);
            entity = sampleObject.getBody();
        } catch(HttpServerErrorException ex){
            logger.error(ex.getMessage());
        }
        return entity;
    }
}
