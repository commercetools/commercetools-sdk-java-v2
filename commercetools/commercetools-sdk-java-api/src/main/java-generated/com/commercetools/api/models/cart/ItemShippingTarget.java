
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

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
     *  <p>Key of the address in the Cart <code>itemShippingAddresses</code>. Duplicate address keys are not allowed.</p>
     * @return addressKey
     */
    @NotNull
    @JsonProperty("addressKey")
    public String getAddressKey();

    /**
     *  <p>Quantity of Line Items or Custom Line Items shipped to the address with the specified <code>addressKey</code>.</p>
     *  <p>If a quantity is updated to <code>0</code> when defining ItemShippingDetailsDraft, the <code>targets</code> are removed from a Line Item or Custom Line Item in the resulting ItemShippingDetails.</p>
     * @return quantity
     */
    @NotNull
    @JsonProperty("quantity")
    public Long getQuantity();

    /**
     *  <p>User-defined unique identifier of the Shipping Method in a Cart with <code>Multiple</code> ShippingMode.</p>
     *  <p>It connects Line Item quantities with individual shipping addresses.</p>
     * @return shippingMethodKey
     */

    @JsonProperty("shippingMethodKey")
    public String getShippingMethodKey();

    public void setAddressKey(final String addressKey);

    public void setQuantity(final Long quantity);

    public void setShippingMethodKey(final String shippingMethodKey);

    public static ItemShippingTarget of() {
        return new ItemShippingTargetImpl();
    }

    public static ItemShippingTarget of(final ItemShippingTarget template) {
        ItemShippingTargetImpl instance = new ItemShippingTargetImpl();
        instance.setAddressKey(template.getAddressKey());
        instance.setQuantity(template.getQuantity());
        instance.setShippingMethodKey(template.getShippingMethodKey());
        return instance;
    }

    public static ItemShippingTargetBuilder builder() {
        return ItemShippingTargetBuilder.of();
    }

    public static ItemShippingTargetBuilder builder(final ItemShippingTarget template) {
        return ItemShippingTargetBuilder.of(template);
    }

    default <T> T withItemShippingTarget(Function<ItemShippingTarget, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ItemShippingTarget> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ItemShippingTarget>() {
            @Override
            public String toString() {
                return "TypeReference<ItemShippingTarget>";
            }
        };
    }
}
