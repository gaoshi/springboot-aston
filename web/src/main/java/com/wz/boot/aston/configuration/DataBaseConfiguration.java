package com.wz.boot.aston.configuration;

import org.springframework.boot.bind.RelaxedPropertyResolver;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author wenzeng
 * @since 1.0
 */
@Configuration
@EnableTransactionManagement
public class DataBaseConfiguration implements EnvironmentAware {

    private static final String PREFIX_DRUID_JDBC = "druid.jdbc";

    private RelaxedPropertyResolver relaxedPropertyResolver;

    @Override
    public void setEnvironment(Environment environment) {
        this.relaxedPropertyResolver = new RelaxedPropertyResolver(environment, PREFIX_DRUID_JDBC);
    }
}
