
package com.commercetools.api.models.cart;

import java.util.*;

import javax.annotation.Nullable;

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

    @Nullable
    private String shippingMethodKey;

    /**
     *  <p>Key of the address in the <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> <code>itemShippingAddresses</code>. Duplicate address keys are not allowed.</p>
     * @param addressKey value to be set
     * @return Builder
     */

    public ItemShippingTargetBuilder addressKey(final String addressKey) {
        this.addressKey = addressKey;
        return this;
    }

    /**
     *  <p>Quantity of Line Items or Custom Line Items shipped to the address with the specified <code>addressKey</code>.</p>
     *  <p>If a quantity is updated to <code>0</code> when defining <a href="https://docs.commercetools.com/apis/ctp:api:type:ItemShippingDetailsDraft" rel="nofollow">ItemShippingDetailsDraft</a>, the <code>targets</code> are removed from a Line Item or Custom Line Item in the resulting <a href="https://docs.commercetools.com/apis/ctp:api:type:ItemShippingDetails" rel="nofollow">ItemShippingDetails</a>.</p>
     * @param quantity value to be set
     * @return Builder
     */

    public ItemShippingTargetBuilder quantity(final Long quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the Shipping Method in a Cart with <code>Multiple</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>.</p>
     *  <p>It connects Line Item or Custom Line Item quantities with individual Shipping Methods.</p>
     * @param shippingMethodKey value to be set
     * @return Builder
     */

    public ItemShippingTargetBuilder shippingMethodKey(@Nullable final String shippingMethodKey) {
        this.shippingMethodKey = shippingMethodKey;
        return this;
    }

    /**
     *  <p>Key of the address in the <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> <code>itemShippingAddresses</code>. Duplicate address keys are not allowed.</p>
     * @return addressKey
     */

    public String getAddressKey() {
        return this.addressKey;
    }

    /**
     *  <p>Quantity of Line Items or Custom Line Items shipped to the address with the specified <code>addressKey</code>.</p>
     *  <p>If a quantity is updated to <code>0</code> when defining <a href="https://docs.commercetools.com/apis/ctp:api:type:ItemShippingDetailsDraft" rel="nofollow">ItemShippingDetailsDraft</a>, the <code>targets</code> are removed from a Line Item or Custom Line Item in the resulting <a href="https://docs.commercetools.com/apis/ctp:api:type:ItemShippingDetails" rel="nofollow">ItemShippingDetails</a>.</p>
     * @return quantity
     */

    public Long getQuantity() {
        return this.quantity;
    }

    /**
     *  <p>User-defined unique identifier of the Shipping Method in a Cart with <code>Multiple</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>.</p>
     *  <p>It connects Line Item or Custom Line Item quantities with individual Shipping Methods.</p>
     * @return shippingMethodKey
     */

    @Nullable
    public String getShippingMethodKey() {
        return this.shippingMethodKey;
    }

    /**
     * builds ItemShippingTarget with checking for non-null required values
     * @return ItemShippingTarget
     */
    public ItemShippingTarget build() {
        Objects.requireNonNull(addressKey, ItemShippingTarget.class + ": addressKey is missing");
        Objects.requireNonNull(quantity, ItemShippingTarget.class + ": quantity is missing");
        return new ItemShippingTargetImpl(addressKey, quantity, shippingMethodKey);
    }

    /**
     * builds ItemShippingTarget without checking for non-null required values
     * @return ItemShippingTarget
     */
    public ItemShippingTarget buildUnchecked() {
        return new ItemShippingTargetImpl(addressKey, quantity, shippingMethodKey);
    }

    /**
     * factory method for an instance of ItemShippingTargetBuilder
     * @return builder
     */
    public static ItemShippingTargetBuilder of() {
        return new ItemShippingTargetBuilder();
    }

    /**
     * create builder for ItemShippingTarget instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ItemShippingTargetBuilder of(final ItemShippingTarget template) {
        ItemShippingTargetBuilder builder = new ItemShippingTargetBuilder();
        builder.addressKey = template.getAddressKey();
        builder.quantity = template.getQuantity();
        builder.shippingMethodKey = template.getShippingMethodKey();
        return builder;
    }

}
