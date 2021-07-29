
package com.commercetools.api.models.project;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProjectChangeShoppingListsConfigurationBuilder {

    @Nullable
    private com.commercetools.api.models.project.ShoppingListsConfiguration shoppingListsConfiguration;

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
