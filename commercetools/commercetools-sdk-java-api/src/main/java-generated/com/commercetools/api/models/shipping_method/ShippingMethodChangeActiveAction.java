
package com.commercetools.api.models.shipping_method;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 * ShippingMethodChangeActiveAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShippingMethodChangeActiveAction shippingMethodChangeActiveAction = ShippingMethodChangeActiveAction.builder()
 *             .active(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ShippingMethodChangeActiveActionImpl.class)
public interface ShippingMethodChangeActiveAction extends ShippingMethodUpdateAction {

    /**
     * discriminator value for ShippingMethodChangeActiveAction
     */
    String CHANGE_ACTIVE = "changeActive";

    /**
     *  <p>Value to set.</p>
     *  <p>If set to <code>false</code>, the ShippingMethod cannot be used during the creation or update of a Cart or Order.</p>
     * @return active
     */
    @NotNull
    @JsonProperty("active")
    public Boolean getActive();

    /**
     *  <p>Value to set.</p>
     *  <p>If set to <code>false</code>, the ShippingMethod cannot be used during the creation or update of a Cart or Order.</p>
     * @param active value to be set
     */

    public void setActive(final Boolean active);

    /**
     * factory method
     * @return instance of ShippingMethodChangeActiveAction
     */
    public static ShippingMethodChangeActiveAction of() {
        return new ShippingMethodChangeActiveActionImpl();
    }

    /**
     * factory method to create a shallow copy ShippingMethodChangeActiveAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ShippingMethodChangeActiveAction of(final ShippingMethodChangeActiveAction template) {
        ShippingMethodChangeActiveActionImpl instance = new ShippingMethodChangeActiveActionImpl();
        instance.setActive(template.getActive());
        return instance;
    }

    /**
     * factory method to create a deep copy of ShippingMethodChangeActiveAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ShippingMethodChangeActiveAction deepCopy(@Nullable final ShippingMethodChangeActiveAction template) {
        if (template == null) {
            return null;
        }
        ShippingMethodChangeActiveActionImpl instance = new ShippingMethodChangeActiveActionImpl();
        instance.setActive(template.getActive());
        return instance;
    }

    /**
     * builder factory method for ShippingMethodChangeActiveAction
     * @return builder
     */
    public static ShippingMethodChangeActiveActionBuilder builder() {
        return ShippingMethodChangeActiveActionBuilder.of();
    }

    /**
     * create builder for ShippingMethodChangeActiveAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShippingMethodChangeActiveActionBuilder builder(final ShippingMethodChangeActiveAction template) {
        return ShippingMethodChangeActiveActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withShippingMethodChangeActiveAction(Function<ShippingMethodChangeActiveAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ShippingMethodChangeActiveAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShippingMethodChangeActiveAction>() {
            @Override
            public String toString() {
                return "TypeReference<ShippingMethodChangeActiveAction>";
            }
        };
    }
}
