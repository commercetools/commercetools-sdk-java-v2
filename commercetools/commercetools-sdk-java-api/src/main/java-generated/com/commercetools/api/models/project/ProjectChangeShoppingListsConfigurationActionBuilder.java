
package com.commercetools.api.models.project;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProjectChangeShoppingListsConfigurationActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProjectChangeShoppingListsConfigurationAction projectChangeShoppingListsConfigurationAction = ProjectChangeShoppingListsConfigurationAction.builder()
 *             .shoppingListsConfiguration(shoppingListsConfigurationBuilder -> shoppingListsConfigurationBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProjectChangeShoppingListsConfigurationActionBuilder
        implements Builder<ProjectChangeShoppingListsConfigurationAction> {

    private com.commercetools.api.models.project.ShoppingListsConfiguration shoppingListsConfiguration;

    /**
     *  <p>Configuration for the Shopping Lists feature.</p>
     */

    public ProjectChangeShoppingListsConfigurationActionBuilder shoppingListsConfiguration(
            Function<com.commercetools.api.models.project.ShoppingListsConfigurationBuilder, com.commercetools.api.models.project.ShoppingListsConfigurationBuilder> builder) {
        this.shoppingListsConfiguration = builder
                .apply(com.commercetools.api.models.project.ShoppingListsConfigurationBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Configuration for the Shopping Lists feature.</p>
     */

    public ProjectChangeShoppingListsConfigurationActionBuilder shoppingListsConfiguration(
            final com.commercetools.api.models.project.ShoppingListsConfiguration shoppingListsConfiguration) {
        this.shoppingListsConfiguration = shoppingListsConfiguration;
        return this;
    }

    public com.commercetools.api.models.project.ShoppingListsConfiguration getShoppingListsConfiguration() {
        return this.shoppingListsConfiguration;
    }

    public ProjectChangeShoppingListsConfigurationAction build() {
        Objects.requireNonNull(shoppingListsConfiguration,
            ProjectChangeShoppingListsConfigurationAction.class + ": shoppingListsConfiguration is missing");
        return new ProjectChangeShoppingListsConfigurationActionImpl(shoppingListsConfiguration);
    }

    /**
     * builds ProjectChangeShoppingListsConfigurationAction without checking for non null required values
     */
    public ProjectChangeShoppingListsConfigurationAction buildUnchecked() {
        return new ProjectChangeShoppingListsConfigurationActionImpl(shoppingListsConfiguration);
    }

    public static ProjectChangeShoppingListsConfigurationActionBuilder of() {
        return new ProjectChangeShoppingListsConfigurationActionBuilder();
    }

    public static ProjectChangeShoppingListsConfigurationActionBuilder of(
            final ProjectChangeShoppingListsConfigurationAction template) {
        ProjectChangeShoppingListsConfigurationActionBuilder builder = new ProjectChangeShoppingListsConfigurationActionBuilder();
        builder.shoppingListsConfiguration = template.getShoppingListsConfiguration();
        return builder;
    }

}
