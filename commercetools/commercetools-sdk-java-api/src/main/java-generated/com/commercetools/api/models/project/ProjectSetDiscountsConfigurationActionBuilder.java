
package com.commercetools.api.models.project;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProjectSetDiscountsConfigurationActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProjectSetDiscountsConfigurationAction projectSetDiscountsConfigurationAction = ProjectSetDiscountsConfigurationAction.builder()
 *             .discountsConfiguration(discountsConfigurationBuilder -> discountsConfigurationBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProjectSetDiscountsConfigurationActionBuilder implements Builder<ProjectSetDiscountsConfigurationAction> {

    private com.commercetools.api.models.project.DiscountsConfiguration discountsConfiguration;

    /**
     *  <p>Configuration for the behavior of Cart and Product Discounts in the Project.</p>
     * @param builder function to build the discountsConfiguration value
     * @return Builder
     */

    public ProjectSetDiscountsConfigurationActionBuilder discountsConfiguration(
            Function<com.commercetools.api.models.project.DiscountsConfigurationBuilder, com.commercetools.api.models.project.DiscountsConfigurationBuilder> builder) {
        this.discountsConfiguration = builder
                .apply(com.commercetools.api.models.project.DiscountsConfigurationBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Configuration for the behavior of Cart and Product Discounts in the Project.</p>
     * @param builder function to build the discountsConfiguration value
     * @return Builder
     */

    public ProjectSetDiscountsConfigurationActionBuilder withDiscountsConfiguration(
            Function<com.commercetools.api.models.project.DiscountsConfigurationBuilder, com.commercetools.api.models.project.DiscountsConfiguration> builder) {
        this.discountsConfiguration = builder
                .apply(com.commercetools.api.models.project.DiscountsConfigurationBuilder.of());
        return this;
    }

    /**
     *  <p>Configuration for the behavior of Cart and Product Discounts in the Project.</p>
     * @param discountsConfiguration value to be set
     * @return Builder
     */

    public ProjectSetDiscountsConfigurationActionBuilder discountsConfiguration(
            final com.commercetools.api.models.project.DiscountsConfiguration discountsConfiguration) {
        this.discountsConfiguration = discountsConfiguration;
        return this;
    }

    /**
     *  <p>Configuration for the behavior of Cart and Product Discounts in the Project.</p>
     * @return discountsConfiguration
     */

    public com.commercetools.api.models.project.DiscountsConfiguration getDiscountsConfiguration() {
        return this.discountsConfiguration;
    }

    /**
     * builds ProjectSetDiscountsConfigurationAction with checking for non-null required values
     * @return ProjectSetDiscountsConfigurationAction
     */
    public ProjectSetDiscountsConfigurationAction build() {
        Objects.requireNonNull(discountsConfiguration,
            ProjectSetDiscountsConfigurationAction.class + ": discountsConfiguration is missing");
        return new ProjectSetDiscountsConfigurationActionImpl(discountsConfiguration);
    }

    /**
     * builds ProjectSetDiscountsConfigurationAction without checking for non-null required values
     * @return ProjectSetDiscountsConfigurationAction
     */
    public ProjectSetDiscountsConfigurationAction buildUnchecked() {
        return new ProjectSetDiscountsConfigurationActionImpl(discountsConfiguration);
    }

    /**
     * factory method for an instance of ProjectSetDiscountsConfigurationActionBuilder
     * @return builder
     */
    public static ProjectSetDiscountsConfigurationActionBuilder of() {
        return new ProjectSetDiscountsConfigurationActionBuilder();
    }

    /**
     * create builder for ProjectSetDiscountsConfigurationAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProjectSetDiscountsConfigurationActionBuilder of(
            final ProjectSetDiscountsConfigurationAction template) {
        ProjectSetDiscountsConfigurationActionBuilder builder = new ProjectSetDiscountsConfigurationActionBuilder();
        builder.discountsConfiguration = template.getDiscountsConfiguration();
        return builder;
    }

}
