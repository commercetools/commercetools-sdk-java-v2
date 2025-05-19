
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
 * ShippingMethodChangeNameAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShippingMethodChangeNameAction shippingMethodChangeNameAction = ShippingMethodChangeNameAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("changeName")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ShippingMethodChangeNameActionImpl.class)
public interface ShippingMethodChangeNameAction extends ShippingMethodUpdateAction {

    /**
     * discriminator value for ShippingMethodChangeNameAction
     */
    String CHANGE_NAME = "changeName";

    /**
     *  <p>Unique value to set within a Project. Must not be empty.</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p>Unique value to set within a Project. Must not be empty.</p>
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     * factory method
     * @return instance of ShippingMethodChangeNameAction
     */
    public static ShippingMethodChangeNameAction of() {
        return new ShippingMethodChangeNameActionImpl();
    }

    /**
     * factory method to create a shallow copy ShippingMethodChangeNameAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ShippingMethodChangeNameAction of(final ShippingMethodChangeNameAction template) {
        ShippingMethodChangeNameActionImpl instance = new ShippingMethodChangeNameActionImpl();
        instance.setName(template.getName());
        return instance;
    }

    public ShippingMethodChangeNameAction copyDeep();

    /**
     * factory method to create a deep copy of ShippingMethodChangeNameAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ShippingMethodChangeNameAction deepCopy(@Nullable final ShippingMethodChangeNameAction template) {
        if (template == null) {
            return null;
        }
        ShippingMethodChangeNameActionImpl instance = new ShippingMethodChangeNameActionImpl();
        instance.setName(template.getName());
        return instance;
    }

    /**
     * builder factory method for ShippingMethodChangeNameAction
     * @return builder
     */
    public static ShippingMethodChangeNameActionBuilder builder() {
        return ShippingMethodChangeNameActionBuilder.of();
    }

    /**
     * create builder for ShippingMethodChangeNameAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShippingMethodChangeNameActionBuilder builder(final ShippingMethodChangeNameAction template) {
        return ShippingMethodChangeNameActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withShippingMethodChangeNameAction(Function<ShippingMethodChangeNameAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ShippingMethodChangeNameAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShippingMethodChangeNameAction>() {
            @Override
            public String toString() {
                return "TypeReference<ShippingMethodChangeNameAction>";
            }
        };
    }
}
