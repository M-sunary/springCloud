package com.microsrv.microsrvclient.RESTful;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MicrosrvController {

    @Autowired
    DiscoveryClient discoveryClient;

    private Logger logger = LoggerFactory.getLogger(MicrosrvController.class);

    @RequestMapping(value="/msg", method = RequestMethod.GET)
    public String add(){
       String res = "客户端注册接口";
        logger.info("打印结果:{}",res);
        return res;
    }
}
