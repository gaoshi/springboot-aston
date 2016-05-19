package com.wz.boot.aston.autoconfigure;

import org.springframework.web.servlet.view.AbstractUrlBasedView;
import org.springframework.web.servlet.view.velocity.VelocityLayoutViewResolver;

/**
 * @author wenzeng
 * @since 1.0
 */
public class MoGuEmbeddedVelocityLayoutViewResolver extends VelocityLayoutViewResolver {

    private String toolboxConfigLocation;

    @Override
    protected void initApplicationContext() {
        if (this.toolboxConfigLocation != null) {
            setViewClass(MoGuEmbeddedVelocityToolboxView.class);
            this.logger.info("Using MoGuEmbeddedVelocityToolboxView instead of default VelocityView due to specified toolboxConfigLocation");
        }
        super.initApplicationContext();
    }

    @Override
    public void setToolboxConfigLocation(String toolboxConfigLocation) {
        super.setToolboxConfigLocation(toolboxConfigLocation);
        this.toolboxConfigLocation = toolboxConfigLocation;
    }

    @Override
    protected AbstractUrlBasedView buildView(String viewName) throws Exception {
        return super.buildView(viewName);
    }
}
