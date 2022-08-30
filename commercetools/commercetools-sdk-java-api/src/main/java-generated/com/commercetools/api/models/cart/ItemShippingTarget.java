
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ItemShippingTarget
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
     *  <p>The key of the address in the cart's <code>itemShippingAddresses</code></p>
     */
    @NotNull
    @JsonProperty("addressKey")
    public String getAddressKey();

    /**
     *  <p>The quantity of items that should go to the address with the specified <code>addressKey</code>. Only positive values are allowed. Using <code>0</code> as quantity is also possible in a draft object, but the element will not be present in the resulting ItemShippingDetails.</p>
     */
    @NotNull
    @JsonProperty("quantity")
    public Long getQuantity();

    /**
     *  <p>User-defined unique identifier of the Shipping Method in a Cart with <code>Multi</code> ShippingMode.</p>
     *  <p>It connects Line Item quantities with individual shipping addresses.</p>
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
