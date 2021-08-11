
package com.commercetools.api.models.project;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProjectChangeCartsConfigurationBuilder implements Builder<ProjectChangeCartsConfiguration> {

    @Nullable
    private com.commercetools.api.models.project.CartsConfiguration cartsConfiguration;

    public ProjectChangeCartsConfigurationBuilder cartsConfiguration(
            Function<com.commercetools.api.models.project.CartsConfigurationBuilder, com.commercetools.api.models.project.CartsConfigurationBuilder> builder) {
        this.cartsConfiguration = builder.apply(com.commercetools.api.models.project.CartsConfigurationBuilder.of())
                .build();
        return this;
    }

    public ProjectChangeCartsConfigurationBuilder cartsConfiguration(
            @Nullable final com.commercetools.api.models.project.CartsConfiguration cartsConfiguration) {
        this.cartsConfiguration = cartsConfiguration;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.project.CartsConfiguration getCartsConfiguration() {
        return this.cartsConfiguration;
    }

    public ProjectChangeCartsConfiguration build() {
        return new ProjectChangeCartsConfigurationImpl(cartsConfiguration);
    }

    /**
     * builds ProjectChangeCartsConfiguration without checking for non null required values
     */
    public ProjectChangeCartsConfiguration buildUnchecked() {
        return new ProjectChangeCartsConfigurationImpl(cartsConfiguration);
    }

    public static ProjectChangeCartsConfigurationBuilder of() {
        return new ProjectChangeCartsConfigurationBuilder();
    }

    public static ProjectChangeCartsConfigurationBuilder of(final ProjectChangeCartsConfiguration template) {
        ProjectChangeCartsConfigurationBuilder builder = new ProjectChangeCartsConfigurationBuilder();
        builder.cartsConfiguration = template.getCartsConfiguration();
        return builder;
    }

}
