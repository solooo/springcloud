package com.htdc.feignconsumer.interf;

import org.springframework.stereotype.Component;

/**
 * Description:
 * Author:Eric
 * Date:2017/10/18
 */
@Component
public class ComputeClientHystrix implements ComputeClient {

    @Override
    public Integer add(Integer a, Integer b) {
        return -999;
    }
}
