
package com.commercetools.importapi.models.orders;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>The item's shipping target.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ItemShippingTarget itemShippingTarget = ItemShippingTarget.builder()
 *             .addressKey("{addressKey}")
 *             .quantity(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ItemShippingTargetImpl.class)
public interface ItemShippingTarget {

    /**
     *  <p>Maps to <code>ItemShippingTarget.addressKey</code>.</p>
     * @return addressKey
     */
    @NotNull
    @JsonProperty("addressKey")
    public String getAddressKey();

    /**
     *  <p>Maps to <code>ItemShippingTarget.quantity</code>.</p>
     * @return quantity
     */
    @NotNull
    @JsonProperty("quantity")
    public Double getQuantity();

    /**
     *  <p>Maps to <code>ItemShippingTarget.addressKey</code>.</p>
     * @param addressKey value to be set
     */

    public void setAddressKey(final String addressKey);

    /**
     *  <p>Maps to <code>ItemShippingTarget.quantity</code>.</p>
     * @param quantity value to be set
     */

    public void setQuantity(final Double quantity);

    /**
     * factory method
     * @return instance of ItemShippingTarget
     */
    public static ItemShippingTarget of() {
        return new ItemShippingTargetImpl();
    }

    /**
     * factory method to create a shallow copy ItemShippingTarget
     * @param template instance to be copied
     * @return copy instance
     */
    public static ItemShippingTarget of(final ItemShippingTarget template) {
        ItemShippingTargetImpl instance = new ItemShippingTargetImpl();
        instance.setAddressKey(template.getAddressKey());
        instance.setQuantity(template.getQuantity());
        return instance;
    }

    /**
     * factory method to create a deep copy of ItemShippingTarget
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ItemShippingTarget deepCopy(@Nullable final ItemShippingTarget template) {
        if (template == null) {
            return null;
        }
        ItemShippingTargetImpl instance = new ItemShippingTargetImpl();
        instance.setAddressKey(template.getAddressKey());
        instance.setQuantity(template.getQuantity());
        return instance;
    }

    /**
     * builder factory method for ItemShippingTarget
     * @return builder
     */
    public static ItemShippingTargetBuilder builder() {
        return ItemShippingTargetBuilder.of();
    }

    /**
     * create builder for ItemShippingTarget instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ItemShippingTargetBuilder builder(final ItemShippingTarget template) {
        return ItemShippingTargetBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withItemShippingTarget(Function<ItemShippingTarget, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ItemShippingTarget> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ItemShippingTarget>() {
            @Override
            public String toString() {
                return "TypeReference<ItemShippingTarget>";
            }
        };
    }
}
