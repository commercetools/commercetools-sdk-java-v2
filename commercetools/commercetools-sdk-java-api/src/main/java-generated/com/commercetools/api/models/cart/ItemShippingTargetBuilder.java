
package com.commercetools.api.models.cart;

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

    private Long quantity;

    /**
     <*  <p>The key of the address in the cart's <code>itemShippingAddresses</code></p>>
     */

    public ItemShippingTargetBuilder addressKey(final String addressKey) {
        this.addressKey = addressKey;
        return this;
    }

    /**
     <*  <p>The quantity of items that should go to the address with the specified <code>addressKey</code>. Only positive values are allowed. Using <code>0</code> as quantity is also possible in a draft object, but the element will not be present in the resulting ItemShippingDetails.</p>>
     */

    public ItemShippingTargetBuilder quantity(final Long quantity) {
        this.quantity = quantity;
        return this;
    }

    public String getAddressKey() {
        return this.addressKey;
    }

    public Long getQuantity() {
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
