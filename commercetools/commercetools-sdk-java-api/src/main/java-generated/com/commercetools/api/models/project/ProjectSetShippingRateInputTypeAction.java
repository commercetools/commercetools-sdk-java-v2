
package com.commercetools.api.models.project;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProjectSetShippingRateInputTypeAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProjectSetShippingRateInputTypeAction projectSetShippingRateInputTypeAction = ProjectSetShippingRateInputTypeAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProjectSetShippingRateInputTypeActionImpl.class)
public interface ProjectSetShippingRateInputTypeAction extends ProjectUpdateAction {

    /**
     * discriminator value for ProjectSetShippingRateInputTypeAction
     */
    String SET_SHIPPING_RATE_INPUT_TYPE = "setShippingRateInputType";

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return shippingRateInputType
     */
    @Valid
    @JsonProperty("shippingRateInputType")
    public ShippingRateInputType getShippingRateInputType();

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param shippingRateInputType value to be set
     */

    public void setShippingRateInputType(final ShippingRateInputType shippingRateInputType);

    /**
     * factory method
     * @return instance of ProjectSetShippingRateInputTypeAction
     */
    public static ProjectSetShippingRateInputTypeAction of() {
        return new ProjectSetShippingRateInputTypeActionImpl();
    }

    /**
     * factory method to create a shallow copy ProjectSetShippingRateInputTypeAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProjectSetShippingRateInputTypeAction of(final ProjectSetShippingRateInputTypeAction template) {
        ProjectSetShippingRateInputTypeActionImpl instance = new ProjectSetShippingRateInputTypeActionImpl();
        instance.setShippingRateInputType(template.getShippingRateInputType());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProjectSetShippingRateInputTypeAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProjectSetShippingRateInputTypeAction deepCopy(
            @Nullable final ProjectSetShippingRateInputTypeAction template) {
        if (template == null) {
            return null;
        }
        ProjectSetShippingRateInputTypeActionImpl instance = new ProjectSetShippingRateInputTypeActionImpl();
        instance.setShippingRateInputType(Optional.ofNullable(template.getShippingRateInputType())
                .map(com.commercetools.api.models.project.ShippingRateInputType::deepCopy)
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for ProjectSetShippingRateInputTypeAction
     * @return builder
     */
    public static ProjectSetShippingRateInputTypeActionBuilder builder() {
        return ProjectSetShippingRateInputTypeActionBuilder.of();
    }

    /**
     * create builder for ProjectSetShippingRateInputTypeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProjectSetShippingRateInputTypeActionBuilder builder(
            final ProjectSetShippingRateInputTypeAction template) {
        return ProjectSetShippingRateInputTypeActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProjectSetShippingRateInputTypeAction(Function<ProjectSetShippingRateInputTypeAction, T> helper) {
        return helper.apply(this);
    }

    public static ProjectSetShippingRateInputTypeAction ofUnset() {
        return ProjectSetShippingRateInputTypeAction.of();
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProjectSetShippingRateInputTypeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProjectSetShippingRateInputTypeAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProjectSetShippingRateInputTypeAction>";
            }
        };
    }
}
