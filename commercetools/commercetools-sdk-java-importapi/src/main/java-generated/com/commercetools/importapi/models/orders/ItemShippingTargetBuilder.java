
package com.commercetools.importapi.models.orders;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ItemShippingTargetBuilder
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
public class ItemShippingTargetBuilder implements Builder<ItemShippingTarget> {

    private String addressKey;

    private Double quantity;

    /**
     <*  <p>Maps to <code>ItemShippingTarget.addressKey</code>.</p>>
     */

    public ItemShippingTargetBuilder addressKey(final String addressKey) {
        this.addressKey = addressKey;
        return this;
    }

    /**
     <*  <p>Maps to <code>ItemShippingTarget.quantity</code>.</p>>
     */

    public ItemShippingTargetBuilder quantity(final Double quantity) {
        this.quantity = quantity;
        return this;
    }

    public String getAddressKey() {
        return this.addressKey;
    }

    public Double getQuantity() {
        return this.quantity;
    }

    public ItemShippingTarget build() {
        Objects.requireNonNull(addressKey, ItemShippingTarget.class + ": addressKey is missing");
        Objects.requireNonNull(quantity, ItemShippingTarget.class + ": quantity is missing");
        return new ItemShippingTargetImpl(addressKey, quantity);
    }

    /**
     * builds ItemShippingTarget without checking for non null required values
     */
    public ItemShippingTarget buildUnchecked() {
        return new ItemShippingTargetImpl(addressKey, quantity);
    }

    public static ItemShippingTargetBuilder of() {
        return new ItemShippingTargetBuilder();
    }

    public static ItemShippingTargetBuilder of(final ItemShippingTarget template) {
        ItemShippingTargetBuilder builder = new ItemShippingTargetBuilder();
        builder.addressKey = template.getAddressKey();
        builder.quantity = template.getQuantity();
        return builder;
    }

}
