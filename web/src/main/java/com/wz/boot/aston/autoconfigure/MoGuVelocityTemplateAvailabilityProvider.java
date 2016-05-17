package com.wz.boot.aston.autoconfigure;

import org.springframework.boot.autoconfigure.template.TemplateAvailabilityProvider;
import org.springframework.boot.bind.RelaxedPropertyResolver;
import org.springframework.core.env.Environment;
import org.springframework.core.env.PropertyResolver;
import org.springframework.core.io.ResourceLoader;
import org.springframework.util.ClassUtils;

/**
 * @author wenzeng
 * @since 1.0
 */
public class MoGuVelocityTemplateAvailabilityProvider implements TemplateAvailabilityProvider {

    @Override
    public boolean isTemplateAvailable(String view, Environment environment,
                                       ClassLoader classLoader, ResourceLoader resourceLoader) {
        if (ClassUtils.isPresent("org.apache.velocity.app.VelocityEngine", classLoader)) {
            PropertyResolver resolver = new RelaxedPropertyResolver(environment,
                    "spring.velocity.");
            String loaderPath = resolver.getProperty("resource-loader-path",
                    org.springframework.boot.autoconfigure.velocity.VelocityProperties.DEFAULT_RESOURCE_LOADER_PATH);
            String prefix = resolver.getProperty("prefix",
                    org.springframework.boot.autoconfigure.velocity.VelocityProperties.DEFAULT_PREFIX);
            String suffix = resolver.getProperty("suffix",
                    org.springframework.boot.autoconfigure.velocity.VelocityProperties.DEFAULT_SUFFIX);
            return resourceLoader.getResource(loaderPath + prefix + view + suffix)
                    .exists();
        }
        return false;
    }
}
