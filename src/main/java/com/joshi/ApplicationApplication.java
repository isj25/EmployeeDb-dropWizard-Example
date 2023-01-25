package com.joshi;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ApplicationApplication extends Application<ApplicationConfiguration> {
    private static final Logger LOG = LoggerFactory.getLogger(ApplicationApplication.class);
    public static void main(final String[] args) throws Exception {
        new ApplicationApplication().run(args);
    }

    @Override
    public String getName() {
        return "Application";
    }

    @Override
    public void initialize(final Bootstrap<ApplicationConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final ApplicationConfiguration configuration,
                    final Environment environment) throws Exception {
        // TODO: implement application
        LOG.info("Registering Resources");
        environment.jersey().register(new EmployeeRestController(environment.getValidator()));
    }

}
