package com.manman.app.rest;

import com.manman.app.enums.ClientCode;
import com.manman.app.response.TestResponse;

import com.manman.service.api.service.EchoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by yzchen on 2017/4/20.
 */
@RestController
@RequestMapping(value = "/testController")
public class TestController {
    private static final Logger logger = LoggerFactory.getLogger(TestController.class);

    @Autowired
    private EchoService echoService;

    @ResponseBody
    @RequestMapping(value = "/testMethod", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
    public TestResponse testMethod() {

        TestResponse rsp = new TestResponse();

        String res = echoService.Hello();

        logger.info("<<<<<<<<<< "+res + " >>>>>>>>>>>>");

        rsp.setResult(ClientCode.AUTHENTICATE_ERROR.getCode());
        rsp.setErrorMsg("jint");
        return rsp;
    }



}
