
package com.commercetools.api.models.project;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * ProjectChangeShoppingListsConfigurationAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProjectChangeShoppingListsConfigurationActionImpl
        implements ProjectChangeShoppingListsConfigurationAction, ModelBase {

    private String action;

    private com.commercetools.api.models.project.ShoppingListsConfiguration shoppingListsConfiguration;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProjectChangeShoppingListsConfigurationActionImpl(
            @JsonProperty("shoppingListsConfiguration") final com.commercetools.api.models.project.ShoppingListsConfiguration shoppingListsConfiguration) {
        this.shoppingListsConfiguration = shoppingListsConfiguration;
        this.action = CHANGE_SHOPPING_LISTS_CONFIGURATION;
    }

    /**
     * create empty instance
     */
    public ProjectChangeShoppingListsConfigurationActionImpl() {
        this.action = CHANGE_SHOPPING_LISTS_CONFIGURATION;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Configuration for the Shopping Lists feature.</p>
     */

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

        ProjectChangeShoppingListsConfigurationActionImpl that = (ProjectChangeShoppingListsConfigurationActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(shoppingListsConfiguration, that.shoppingListsConfiguration)
                .append(action, that.action)
                .append(shoppingListsConfiguration, that.shoppingListsConfiguration)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(shoppingListsConfiguration).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("shoppingListsConfiguration", shoppingListsConfiguration)
                .build();
    }

    @Override
    public ProjectChangeShoppingListsConfigurationAction copyDeep() {
        return ProjectChangeShoppingListsConfigurationAction.deepCopy(this);
    }
}
