package main.java.com.wz.boot.aston.test;

import com.wz.boot.aston.Application;
import com.wz.boot.aston.service.ExampleService;
import com.wz.boot.aston.utils.TimeUtil;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @author wenzeng
 * @since 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {Application.class}, webEnvironment = SpringBootTest.WebEnvironment.NONE)
public class ExampleTest {

    @Resource
    private ExampleService exampleService;

    @Test
    public void unixTimeStamp() {
        final long actual = exampleService.unixTimeStamp();
        Assertions.assertThat(actual).isLessThanOrEqualTo(TimeUtil.currentTimeSeconds());
    }


}
