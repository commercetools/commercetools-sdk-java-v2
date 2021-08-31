
package com.commercetools.api.models.project;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProjectChangeShoppingListsConfigurationBuilder
        implements Builder<ProjectChangeShoppingListsConfiguration> {

    @Nullable
    private com.commercetools.api.models.project.ShoppingListsConfiguration shoppingListsConfiguration;

    public ProjectChangeShoppingListsConfigurationBuilder shoppingListsConfiguration(
            Function<com.commercetools.api.models.project.ShoppingListsConfigurationBuilder, com.commercetools.api.models.project.ShoppingListsConfigurationBuilder> builder) {
        this.shoppingListsConfiguration = builder
                .apply(com.commercetools.api.models.project.ShoppingListsConfigurationBuilder.of())
                .build();
        return this;
    }

    public ProjectChangeShoppingListsConfigurationBuilder shoppingListsConfiguration(
            @Nullable final com.commercetools.api.models.project.ShoppingListsConfiguration shoppingListsConfiguration) {
        this.shoppingListsConfiguration = shoppingListsConfiguration;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.project.ShoppingListsConfiguration getShoppingListsConfiguration() {
        return this.shoppingListsConfiguration;
    }

    public ProjectChangeShoppingListsConfiguration build() {
        return new ProjectChangeShoppingListsConfigurationImpl(shoppingListsConfiguration);
    }

    /**
     * builds ProjectChangeShoppingListsConfiguration without checking for non null required values
     */
    public ProjectChangeShoppingListsConfiguration buildUnchecked() {
        return new ProjectChangeShoppingListsConfigurationImpl(shoppingListsConfiguration);
    }

    public static ProjectChangeShoppingListsConfigurationBuilder of() {
        return new ProjectChangeShoppingListsConfigurationBuilder();
    }

    public static ProjectChangeShoppingListsConfigurationBuilder of(
            final ProjectChangeShoppingListsConfiguration template) {
        ProjectChangeShoppingListsConfigurationBuilder builder = new ProjectChangeShoppingListsConfigurationBuilder();
        builder.shoppingListsConfiguration = template.getShoppingListsConfiguration();
        return builder;
    }

}
