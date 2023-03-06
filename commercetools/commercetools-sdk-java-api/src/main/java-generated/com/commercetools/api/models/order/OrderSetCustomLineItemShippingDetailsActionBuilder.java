
package com.commercetools.api.models.order;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderSetCustomLineItemShippingDetailsActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSetCustomLineItemShippingDetailsAction orderSetCustomLineItemShippingDetailsAction = OrderSetCustomLineItemShippingDetailsAction.builder()
 *             .customLineItemId("{customLineItemId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderSetCustomLineItemShippingDetailsActionBuilder
        implements Builder<OrderSetCustomLineItemShippingDetailsAction> {

    private String customLineItemId;

    @Nullable
    private com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetails;

    /**
     *
     */

    public OrderSetCustomLineItemShippingDetailsActionBuilder customLineItemId(final String customLineItemId) {
        this.customLineItemId = customLineItemId;
        return this;
    }

    /**
     *  <p>For order creation and updates, the sum of the <code>targets</code> must match the quantity of the Line Items or Custom Line Items.</p>
     */

    public OrderSetCustomLineItemShippingDetailsActionBuilder shippingDetails(
            Function<com.commercetools.api.models.cart.ItemShippingDetailsDraftBuilder, com.commercetools.api.models.cart.ItemShippingDetailsDraftBuilder> builder) {
        this.shippingDetails = builder.apply(com.commercetools.api.models.cart.ItemShippingDetailsDraftBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>For order creation and updates, the sum of the <code>targets</code> must match the quantity of the Line Items or Custom Line Items.</p>
     */

    public OrderSetCustomLineItemShippingDetailsActionBuilder shippingDetails(
            @Nullable final com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetails) {
        this.shippingDetails = shippingDetails;
        return this;
    }

    public String getCustomLineItemId() {
        return this.customLineItemId;
    }

    @Nullable
    public com.commercetools.api.models.cart.ItemShippingDetailsDraft getShippingDetails() {
        return this.shippingDetails;
    }

    public OrderSetCustomLineItemShippingDetailsAction build() {
        Objects.requireNonNull(customLineItemId,
            OrderSetCustomLineItemShippingDetailsAction.class + ": customLineItemId is missing");
        return new OrderSetCustomLineItemShippingDetailsActionImpl(customLineItemId, shippingDetails);
    }

    /**
     * builds OrderSetCustomLineItemShippingDetailsAction without checking for non null required values
     */
    public OrderSetCustomLineItemShippingDetailsAction buildUnchecked() {
        return new OrderSetCustomLineItemShippingDetailsActionImpl(customLineItemId, shippingDetails);
    }

    public static OrderSetCustomLineItemShippingDetailsActionBuilder of() {
        return new OrderSetCustomLineItemShippingDetailsActionBuilder();
    }

    public static OrderSetCustomLineItemShippingDetailsActionBuilder of(
            final OrderSetCustomLineItemShippingDetailsAction template) {
        OrderSetCustomLineItemShippingDetailsActionBuilder builder = new OrderSetCustomLineItemShippingDetailsActionBuilder();
        builder.customLineItemId = template.getCustomLineItemId();
        builder.shippingDetails = template.getShippingDetails();
        return builder;
    }

}
