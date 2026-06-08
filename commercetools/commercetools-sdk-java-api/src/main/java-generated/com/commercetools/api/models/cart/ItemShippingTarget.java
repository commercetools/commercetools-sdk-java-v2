
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Determines the address (as a reference to an address in <code>itemShippingAddresses</code>) and the quantity shipped to the address.</p>
 *  <p>If multiple shipping addresses are present for a Line Item or Custom Line Item, sub-quantities must be specified. An array of addresses and sub-quantities is stored per Line Item or Custom Line Item.</p>
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
     *  <p>Key of the address in the <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> <code>itemShippingAddresses</code>. Duplicate address keys are not allowed.</p>
     * @return addressKey
     */
    @NotNull
    @JsonProperty("addressKey")
    public String getAddressKey();

    /**
     *  <p>Quantity of Line Items or Custom Line Items shipped to the address with the specified <code>addressKey</code>.</p>
     *  <p>If a quantity is updated to <code>0</code> when defining <a href="https://docs.commercetools.com/apis/ctp:api:type:ItemShippingDetailsDraft" rel="nofollow">ItemShippingDetailsDraft</a>, the <code>targets</code> are removed from a Line Item or Custom Line Item in the resulting <a href="https://docs.commercetools.com/apis/ctp:api:type:ItemShippingDetails" rel="nofollow">ItemShippingDetails</a>.</p>
     * @return quantity
     */
    @NotNull
    @JsonProperty("quantity")
    public Long getQuantity();

    /**
     *  <p>User-defined unique identifier of the Shipping Method in a Cart with <code>Multiple</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>.</p>
     *  <p>It connects Line Item or Custom Line Item quantities with individual Shipping Methods.</p>
     * @return shippingMethodKey
     */

    @JsonProperty("shippingMethodKey")
    public String getShippingMethodKey();

    /**
     *  <p>Key of the address in the <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> <code>itemShippingAddresses</code>. Duplicate address keys are not allowed.</p>
     * @param addressKey value to be set
     */

    public void setAddressKey(final String addressKey);

    /**
     *  <p>Quantity of Line Items or Custom Line Items shipped to the address with the specified <code>addressKey</code>.</p>
     *  <p>If a quantity is updated to <code>0</code> when defining <a href="https://docs.commercetools.com/apis/ctp:api:type:ItemShippingDetailsDraft" rel="nofollow">ItemShippingDetailsDraft</a>, the <code>targets</code> are removed from a Line Item or Custom Line Item in the resulting <a href="https://docs.commercetools.com/apis/ctp:api:type:ItemShippingDetails" rel="nofollow">ItemShippingDetails</a>.</p>
     * @param quantity value to be set
     */

    public void setQuantity(final Long quantity);

    /**
     *  <p>User-defined unique identifier of the Shipping Method in a Cart with <code>Multiple</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>.</p>
     *  <p>It connects Line Item or Custom Line Item quantities with individual Shipping Methods.</p>
     * @param shippingMethodKey value to be set
     */

    public void setShippingMethodKey(final String shippingMethodKey);

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
        instance.setShippingMethodKey(template.getShippingMethodKey());
        return instance;
    }

    public ItemShippingTarget copyDeep();

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
        instance.setShippingMethodKey(template.getShippingMethodKey());
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
