
package com.commercetools.api.models.project;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ProjectChangeCartsConfigurationActionBuilder implements Builder<ProjectChangeCartsConfigurationAction> {

    private com.commercetools.api.models.project.CartsConfiguration cartsConfiguration;

    public ProjectChangeCartsConfigurationActionBuilder cartsConfiguration(
            Function<com.commercetools.api.models.project.CartsConfigurationBuilder, com.commercetools.api.models.project.CartsConfigurationBuilder> builder) {
        this.cartsConfiguration = builder.apply(com.commercetools.api.models.project.CartsConfigurationBuilder.of())
                .build();
        return this;
    }

    public ProjectChangeCartsConfigurationActionBuilder cartsConfiguration(
            final com.commercetools.api.models.project.CartsConfiguration cartsConfiguration) {
        this.cartsConfiguration = cartsConfiguration;
        return this;
    }

    public com.commercetools.api.models.project.CartsConfiguration getCartsConfiguration() {
        return this.cartsConfiguration;
    }

    public ProjectChangeCartsConfigurationAction build() {
        Objects.requireNonNull(cartsConfiguration,
            ProjectChangeCartsConfigurationAction.class + ": cartsConfiguration is missing");
        return new ProjectChangeCartsConfigurationActionImpl(cartsConfiguration);
    }

    /**
     * builds ProjectChangeCartsConfigurationAction without checking for non null required values
     */
    public ProjectChangeCartsConfigurationAction buildUnchecked() {
        return new ProjectChangeCartsConfigurationActionImpl(cartsConfiguration);
    }

    public static ProjectChangeCartsConfigurationActionBuilder of() {
        return new ProjectChangeCartsConfigurationActionBuilder();
    }

    public static ProjectChangeCartsConfigurationActionBuilder of(
            final ProjectChangeCartsConfigurationAction template) {
        ProjectChangeCartsConfigurationActionBuilder builder = new ProjectChangeCartsConfigurationActionBuilder();
        builder.cartsConfiguration = template.getCartsConfiguration();
        return builder;
    }

}
