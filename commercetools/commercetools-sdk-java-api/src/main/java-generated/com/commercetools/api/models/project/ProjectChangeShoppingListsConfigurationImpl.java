
package com.commercetools.api.models.project;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProjectChangeShoppingListsConfigurationImpl implements ProjectChangeShoppingListsConfiguration {

    private String action;

    private com.commercetools.api.models.project.ShoppingListsConfiguration shoppingListsConfiguration;

    @JsonCreator
    ProjectChangeShoppingListsConfigurationImpl(
            @JsonProperty("shoppingListsConfiguration") final com.commercetools.api.models.project.ShoppingListsConfiguration shoppingListsConfiguration) {
        this.shoppingListsConfiguration = shoppingListsConfiguration;
        this.action = CHANGE_SHOPPING_LISTS_CONFIGURATION;
    }

    public ProjectChangeShoppingListsConfigurationImpl() {
        this.action = CHANGE_SHOPPING_LISTS_CONFIGURATION;
    }

    public String getAction() {
        return this.action;
    }

    public com.commercetools.api.models.project.ShoppingListsConfiguration getShoppingListsConfiguration() {
        return this.shoppingListsConfiguration;
    }

    public void setShoppingListsConfiguration(
            final com.commercetools.api.models.project.ShoppingListsConfiguration shoppingListsConfiguration) {
        this.shoppingListsConfiguration = shoppingListsConfiguration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProjectChangeShoppingListsConfigurationImpl that = (ProjectChangeShoppingListsConfigurationImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(shoppingListsConfiguration, that.shoppingListsConfiguration)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(shoppingListsConfiguration).toHashCode();
    }

}
