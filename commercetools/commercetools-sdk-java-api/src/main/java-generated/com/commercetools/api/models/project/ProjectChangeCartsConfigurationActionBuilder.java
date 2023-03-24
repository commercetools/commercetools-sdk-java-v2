
package com.commercetools.api.models.project;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProjectChangeCartsConfigurationActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProjectChangeCartsConfigurationAction projectChangeCartsConfigurationAction = ProjectChangeCartsConfigurationAction.builder()
 *             .cartsConfiguration(cartsConfigurationBuilder -> cartsConfigurationBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProjectChangeCartsConfigurationActionBuilder implements Builder<ProjectChangeCartsConfigurationAction> {

    private com.commercetools.api.models.project.CartsConfiguration cartsConfiguration;

    /**
     *  <p>Configuration for the Carts feature.</p>
     * @param builder function to build the cartsConfiguration value
     * @return Builder
     */

    public ProjectChangeCartsConfigurationActionBuilder cartsConfiguration(
            Function<com.commercetools.api.models.project.CartsConfigurationBuilder, com.commercetools.api.models.project.CartsConfigurationBuilder> builder) {
        this.cartsConfiguration = builder.apply(com.commercetools.api.models.project.CartsConfigurationBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Configuration for the Carts feature.</p>
     * @param cartsConfiguration value to be set
     * @return Builder
     */

    public ProjectChangeCartsConfigurationActionBuilder cartsConfiguration(
            final com.commercetools.api.models.project.CartsConfiguration cartsConfiguration) {
        this.cartsConfiguration = cartsConfiguration;
        return this;
    }

    public com.commercetools.api.models.project.CartsConfiguration getCartsConfiguration() {
        return this.cartsConfiguration;
    }

    /**
     * builds ProjectChangeCartsConfigurationAction with checking for non-null required values
     * @return ProjectChangeCartsConfigurationAction
     */
    public ProjectChangeCartsConfigurationAction build() {
        Objects.requireNonNull(cartsConfiguration,
            ProjectChangeCartsConfigurationAction.class + ": cartsConfiguration is missing");
        return new ProjectChangeCartsConfigurationActionImpl(cartsConfiguration);
    }

    /**
     * builds ProjectChangeCartsConfigurationAction without checking for non-null required values
     * @return ProjectChangeCartsConfigurationAction
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
