package com.wz.boot.aston.service.impl;

import com.wz.boot.aston.service.ExampleService;
import com.wz.boot.aston.utils.TimeUtil;
import org.springframework.stereotype.Service;

/**
 * @author wenzeng
 * @since 1.0
 */
@Service(ExampleService.BEAN_NAME)
public class ExampleServiceImpl implements ExampleService {

    @Override
    public long unixTimeStamp() {
        return TimeUtil.currentTimeSecs();
    }
}

