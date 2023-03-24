
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
 *             .lineItemId("{lineItemId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderSetLineItemShippingDetailsActionBuilder implements Builder<OrderSetLineItemShippingDetailsAction> {

    private String lineItemId;

    @Nullable
    private com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetails;

    /**
     *
     * @param lineItemId value to be set
     * @return Builder
     */

    public OrderSetLineItemShippingDetailsActionBuilder lineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }

    /**
     *  <p>For order creation and updates, the sum of the <code>targets</code> must match the quantity of the Line Items or Custom Line Items.</p>
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
     *  <p>For order creation and updates, the sum of the <code>targets</code> must match the quantity of the Line Items or Custom Line Items.</p>
     * @param shippingDetails value to be set
     * @return Builder
     */

    public OrderSetLineItemShippingDetailsActionBuilder shippingDetails(
            @Nullable final com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetails) {
        this.shippingDetails = shippingDetails;
        return this;
    }

    public String getLineItemId() {
        return this.lineItemId;
    }

    @Nullable
    public com.commercetools.api.models.cart.ItemShippingDetailsDraft getShippingDetails() {
        return this.shippingDetails;
    }

    /**
     * builds OrderSetLineItemShippingDetailsAction with checking for non-null required values
     * @return OrderSetLineItemShippingDetailsAction
     */
    public OrderSetLineItemShippingDetailsAction build() {
        Objects.requireNonNull(lineItemId, OrderSetLineItemShippingDetailsAction.class + ": lineItemId is missing");
        return new OrderSetLineItemShippingDetailsActionImpl(lineItemId, shippingDetails);
    }

    /**
     * builds OrderSetLineItemShippingDetailsAction without checking for non-null required values
     * @return OrderSetLineItemShippingDetailsAction
     */
    public OrderSetLineItemShippingDetailsAction buildUnchecked() {
        return new OrderSetLineItemShippingDetailsActionImpl(lineItemId, shippingDetails);
    }

    public static OrderSetLineItemShippingDetailsActionBuilder of() {
        return new OrderSetLineItemShippingDetailsActionBuilder();
    }

    public static OrderSetLineItemShippingDetailsActionBuilder of(
            final OrderSetLineItemShippingDetailsAction template) {
        OrderSetLineItemShippingDetailsActionBuilder builder = new OrderSetLineItemShippingDetailsActionBuilder();
        builder.lineItemId = template.getLineItemId();
        builder.shippingDetails = template.getShippingDetails();
        return builder;
    }

}
