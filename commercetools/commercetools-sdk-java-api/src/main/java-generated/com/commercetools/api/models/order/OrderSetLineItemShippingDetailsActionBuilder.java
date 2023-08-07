
package com.commercetools.api.models.order;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderSetLineItemShippingDetailsActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSetLineItemShippingDetailsAction orderSetLineItemShippingDetailsAction = OrderSetLineItemShippingDetailsAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderSetLineItemShippingDetailsActionBuilder implements Builder<OrderSetLineItemShippingDetailsAction> {

    @Nullable
    private String lineItemId;

    @Nullable
    private String lineItemKey;

    @Nullable
    private com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetails;

    /**
     *  <p><code>id</code> of the LineItem to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @param lineItemId value to be set
     * @return Builder
     */

    public OrderSetLineItemShippingDetailsActionBuilder lineItemId(@Nullable final String lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }

    /**
     *  <p><code>key</code> of the LineItem to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @param lineItemKey value to be set
     * @return Builder
     */

    public OrderSetLineItemShippingDetailsActionBuilder lineItemKey(@Nullable final String lineItemKey) {
        this.lineItemKey = lineItemKey;
        return this;
    }

    /**
     *  <p>Value to set. If empty, the existing value is removed.</p>
     * @param builder function to build the shippingDetails value
     * @return Builder
     */

    public OrderSetLineItemShippingDetailsActionBuilder shippingDetails(
            Function<com.commercetools.api.models.cart.ItemShippingDetailsDraftBuilder, com.commercetools.api.models.cart.ItemShippingDetailsDraftBuilder> builder) {
        this.shippingDetails = builder.apply(com.commercetools.api.models.cart.ItemShippingDetailsDraftBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Value to set. If empty, the existing value is removed.</p>
     * @param builder function to build the shippingDetails value
     * @return Builder
     */

    public OrderSetLineItemShippingDetailsActionBuilder withShippingDetails(
            Function<com.commercetools.api.models.cart.ItemShippingDetailsDraftBuilder, com.commercetools.api.models.cart.ItemShippingDetailsDraft> builder) {
        this.shippingDetails = builder.apply(com.commercetools.api.models.cart.ItemShippingDetailsDraftBuilder.of());
        return this;
    }

    /**
     *  <p>Value to set. If empty, the existing value is removed.</p>
     * @param shippingDetails value to be set
     * @return Builder
     */

    public OrderSetLineItemShippingDetailsActionBuilder shippingDetails(
            @Nullable final com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetails) {
        this.shippingDetails = shippingDetails;
        return this;
    }

    /**
     *  <p><code>id</code> of the LineItem to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @return lineItemId
     */

    @Nullable
    public String getLineItemId() {
        return this.lineItemId;
    }

    /**
     *  <p><code>key</code> of the LineItem to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @return lineItemKey
     */

    @Nullable
    public String getLineItemKey() {
        return this.lineItemKey;
    }

    /**
     *  <p>Value to set. If empty, the existing value is removed.</p>
     * @return shippingDetails
     */

    @Nullable
    public com.commercetools.api.models.cart.ItemShippingDetailsDraft getShippingDetails() {
        return this.shippingDetails;
    }

    /**
     * builds OrderSetLineItemShippingDetailsAction with checking for non-null required values
     * @return OrderSetLineItemShippingDetailsAction
     */
    public OrderSetLineItemShippingDetailsAction build() {
        return new OrderSetLineItemShippingDetailsActionImpl(lineItemId, lineItemKey, shippingDetails);
    }

    /**
     * builds OrderSetLineItemShippingDetailsAction without checking for non-null required values
     * @return OrderSetLineItemShippingDetailsAction
     */
    public OrderSetLineItemShippingDetailsAction buildUnchecked() {
        return new OrderSetLineItemShippingDetailsActionImpl(lineItemId, lineItemKey, shippingDetails);
    }

    /**
     * factory method for an instance of OrderSetLineItemShippingDetailsActionBuilder
     * @return builder
     */
    public static OrderSetLineItemShippingDetailsActionBuilder of() {
        return new OrderSetLineItemShippingDetailsActionBuilder();
    }

    /**
     * create builder for OrderSetLineItemShippingDetailsAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderSetLineItemShippingDetailsActionBuilder of(
            final OrderSetLineItemShippingDetailsAction template) {
        OrderSetLineItemShippingDetailsActionBuilder builder = new OrderSetLineItemShippingDetailsActionBuilder();
        builder.lineItemId = template.getLineItemId();
        builder.lineItemKey = template.getLineItemKey();
        builder.shippingDetails = template.getShippingDetails();
        return builder;
    }

}
