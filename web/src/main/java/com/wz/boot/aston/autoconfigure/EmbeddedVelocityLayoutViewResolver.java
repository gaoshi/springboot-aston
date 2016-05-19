package com.wz.boot.aston.autoconfigure;

import org.springframework.boot.web.servlet.view.velocity.EmbeddedVelocityToolboxView;
import org.springframework.web.servlet.view.velocity.VelocityLayoutViewResolver;
import org.springframework.web.servlet.view.velocity.VelocityView;

/**
 * @author wenzeng
 * @since 1.0
 */
public class EmbeddedVelocityLayoutViewResolver extends VelocityLayoutViewResolver {
    private String toolboxConfigLocation;

    @Override
    protected void initApplicationContext() {
        if (this.toolboxConfigLocation != null) {
            if (VelocityView.class.equals(getViewClass())) {
                this.logger.info("Using EmbeddedVelocityToolboxView instead of "
                        + "default VelocityView due to specified toolboxConfigLocation");
                setViewClass(EmbeddedVelocityToolboxView.class);
            }
        }
        super.initApplicationContext();
    }

    @Override
    public void setToolboxConfigLocation(String toolboxConfigLocation) {
        super.setToolboxConfigLocation(toolboxConfigLocation);
        this.toolboxConfigLocation = toolboxConfigLocation;
    }
}
