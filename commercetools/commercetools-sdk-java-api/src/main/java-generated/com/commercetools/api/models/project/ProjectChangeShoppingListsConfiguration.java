
package com.commercetools.api.models.project;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProjectChangeShoppingListsConfigurationImpl.class)
public interface ProjectChangeShoppingListsConfiguration extends ProjectUpdateAction {

    String CHANGE_SHOPPING_LISTS_CONFIGURATION = "changeShoppingListsConfiguration";

    @Valid
    @JsonProperty("shoppingListsConfiguration")
    public ShoppingListsConfiguration getShoppingListsConfiguration();

    public void setShoppingListsConfiguration(final ShoppingListsConfiguration shoppingListsConfiguration);

    public static ProjectChangeShoppingListsConfiguration of() {
        return new ProjectChangeShoppingListsConfigurationImpl();
    }

    public static ProjectChangeShoppingListsConfiguration of(final ProjectChangeShoppingListsConfiguration template) {
        ProjectChangeShoppingListsConfigurationImpl instance = new ProjectChangeShoppingListsConfigurationImpl();
        instance.setShoppingListsConfiguration(template.getShoppingListsConfiguration());
        return instance;
    }

    public static ProjectChangeShoppingListsConfigurationBuilder builder() {
        return ProjectChangeShoppingListsConfigurationBuilder.of();
    }

    public static ProjectChangeShoppingListsConfigurationBuilder builder(
            final ProjectChangeShoppingListsConfiguration template) {
        return ProjectChangeShoppingListsConfigurationBuilder.of(template);
    }

    default <T> T withProjectChangeShoppingListsConfiguration(
            Function<ProjectChangeShoppingListsConfiguration, T> helper) {
        return helper.apply(this);
    }
}
