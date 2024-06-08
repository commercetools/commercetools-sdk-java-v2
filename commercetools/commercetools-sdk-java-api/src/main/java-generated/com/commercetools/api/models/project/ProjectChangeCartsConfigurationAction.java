
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
 * ProjectChangeCartsConfigurationAction
 *
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
@JsonDeserialize(as = ProjectChangeCartsConfigurationActionImpl.class)
public interface ProjectChangeCartsConfigurationAction extends ProjectUpdateAction {

    /**
     * discriminator value for ProjectChangeCartsConfigurationAction
     */
    String CHANGE_CARTS_CONFIGURATION = "changeCartsConfiguration";

    /**
     *  <p>Configuration for the Carts feature.</p>
     * @return cartsConfiguration
     */
    @NotNull
    @Valid
    @JsonProperty("cartsConfiguration")
    public CartsConfiguration getCartsConfiguration();

    /**
     *  <p>Configuration for the Carts feature.</p>
     * @param cartsConfiguration value to be set
     */

    public void setCartsConfiguration(final CartsConfiguration cartsConfiguration);

    /**
     * factory method
     * @return instance of ProjectChangeCartsConfigurationAction
     */
    public static ProjectChangeCartsConfigurationAction of() {
        return new ProjectChangeCartsConfigurationActionImpl();
    }

    /**
     * factory method to create a shallow copy ProjectChangeCartsConfigurationAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProjectChangeCartsConfigurationAction of(final ProjectChangeCartsConfigurationAction template) {
        ProjectChangeCartsConfigurationActionImpl instance = new ProjectChangeCartsConfigurationActionImpl();
        instance.setCartsConfiguration(template.getCartsConfiguration());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProjectChangeCartsConfigurationAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProjectChangeCartsConfigurationAction deepCopy(
            @Nullable final ProjectChangeCartsConfigurationAction template) {
        if (template == null) {
            return null;
        }
        ProjectChangeCartsConfigurationActionImpl instance = new ProjectChangeCartsConfigurationActionImpl();
        instance.setCartsConfiguration(
            com.commercetools.api.models.project.CartsConfiguration.deepCopy(template.getCartsConfiguration()));
        return instance;
    }

    /**
     * builder factory method for ProjectChangeCartsConfigurationAction
     * @return builder
     */
    public static ProjectChangeCartsConfigurationActionBuilder builder() {
        return ProjectChangeCartsConfigurationActionBuilder.of();
    }

    /**
     * create builder for ProjectChangeCartsConfigurationAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProjectChangeCartsConfigurationActionBuilder builder(
            final ProjectChangeCartsConfigurationAction template) {
        return ProjectChangeCartsConfigurationActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProjectChangeCartsConfigurationAction(Function<ProjectChangeCartsConfigurationAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProjectChangeCartsConfigurationAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProjectChangeCartsConfigurationAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProjectChangeCartsConfigurationAction>";
            }
        };
    }
}
