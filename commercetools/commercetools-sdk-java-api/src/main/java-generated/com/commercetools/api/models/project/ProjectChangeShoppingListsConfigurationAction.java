
package com.commercetools.api.models.project;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * ProjectChangeShoppingListsConfigurationAction
 *
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
@JsonDeserialize(as = ProjectChangeShoppingListsConfigurationActionImpl.class)
public interface ProjectChangeShoppingListsConfigurationAction extends ProjectUpdateAction {

    /**
     * discriminator value for ProjectChangeShoppingListsConfigurationAction
     */
    String CHANGE_SHOPPING_LISTS_CONFIGURATION = "changeShoppingListsConfiguration";

    /**
     *  <p>Configuration for the Shopping Lists feature.</p>
     * @return shoppingListsConfiguration
     */
    @NotNull
    @Valid
    @JsonProperty("shoppingListsConfiguration")
    public ShoppingListsConfiguration getShoppingListsConfiguration();

    /**
     *  <p>Configuration for the Shopping Lists feature.</p>
     * @param shoppingListsConfiguration value to be set
     */

    public void setShoppingListsConfiguration(final ShoppingListsConfiguration shoppingListsConfiguration);

    /**
     * factory method
     * @return instance of ProjectChangeShoppingListsConfigurationAction
     */
    public static ProjectChangeShoppingListsConfigurationAction of() {
        return new ProjectChangeShoppingListsConfigurationActionImpl();
    }

    /**
     * factory method to create a shallow copy ProjectChangeShoppingListsConfigurationAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProjectChangeShoppingListsConfigurationAction of(
            final ProjectChangeShoppingListsConfigurationAction template) {
        ProjectChangeShoppingListsConfigurationActionImpl instance = new ProjectChangeShoppingListsConfigurationActionImpl();
        instance.setShoppingListsConfiguration(template.getShoppingListsConfiguration());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProjectChangeShoppingListsConfigurationAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProjectChangeShoppingListsConfigurationAction deepCopy(
            @Nullable final ProjectChangeShoppingListsConfigurationAction template) {
        if (template == null) {
            return null;
        }
        ProjectChangeShoppingListsConfigurationActionImpl instance = new ProjectChangeShoppingListsConfigurationActionImpl();
        instance.setShoppingListsConfiguration(com.commercetools.api.models.project.ShoppingListsConfiguration
                .deepCopy(template.getShoppingListsConfiguration()));
        return instance;
    }

    /**
     * builder factory method for ProjectChangeShoppingListsConfigurationAction
     * @return builder
     */
    public static ProjectChangeShoppingListsConfigurationActionBuilder builder() {
        return ProjectChangeShoppingListsConfigurationActionBuilder.of();
    }

    /**
     * create builder for ProjectChangeShoppingListsConfigurationAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProjectChangeShoppingListsConfigurationActionBuilder builder(
            final ProjectChangeShoppingListsConfigurationAction template) {
        return ProjectChangeShoppingListsConfigurationActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProjectChangeShoppingListsConfigurationAction(
            Function<ProjectChangeShoppingListsConfigurationAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProjectChangeShoppingListsConfigurationAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProjectChangeShoppingListsConfigurationAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProjectChangeShoppingListsConfigurationAction>";
            }
        };
    }
}
