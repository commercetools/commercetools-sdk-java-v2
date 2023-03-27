
package com.commercetools.api.models.order_edit;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderSetCustomLineItemShippingDetailsActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetCustomLineItemShippingDetailsAction stagedOrderSetCustomLineItemShippingDetailsAction = StagedOrderSetCustomLineItemShippingDetailsAction.builder()
 *             .customLineItemId("{customLineItemId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedOrderSetCustomLineItemShippingDetailsActionBuilder
        implements Builder<StagedOrderSetCustomLineItemShippingDetailsAction> {

    private String customLineItemId;

    @Nullable
    private com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetails;

    /**
     * set the value to the customLineItemId
     * @param customLineItemId value to be set
     * @return Builder
     */

    public StagedOrderSetCustomLineItemShippingDetailsActionBuilder customLineItemId(final String customLineItemId) {
        this.customLineItemId = customLineItemId;
        return this;
    }

    /**
     *  <p>For order creation and updates, the sum of the <code>targets</code> must match the quantity of the Line Items or Custom Line Items.</p>
     * @param builder function to build the shippingDetails value
     * @return Builder
     */

    public StagedOrderSetCustomLineItemShippingDetailsActionBuilder shippingDetails(
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

    public StagedOrderSetCustomLineItemShippingDetailsActionBuilder shippingDetails(
            @Nullable final com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetails) {
        this.shippingDetails = shippingDetails;
        return this;
    }

    /**
     * value of customLineItemId}
     * @return customLineItemId
     */

    public String getCustomLineItemId() {
        return this.customLineItemId;
    }

    /**
     *  <p>For order creation and updates, the sum of the <code>targets</code> must match the quantity of the Line Items or Custom Line Items.</p>
     * @return shippingDetails
     */

    @Nullable
    public com.commercetools.api.models.cart.ItemShippingDetailsDraft getShippingDetails() {
        return this.shippingDetails;
    }

    /**
     * builds StagedOrderSetCustomLineItemShippingDetailsAction with checking for non-null required values
     * @return StagedOrderSetCustomLineItemShippingDetailsAction
     */
    public StagedOrderSetCustomLineItemShippingDetailsAction build() {
        Objects.requireNonNull(customLineItemId,
            StagedOrderSetCustomLineItemShippingDetailsAction.class + ": customLineItemId is missing");
        return new StagedOrderSetCustomLineItemShippingDetailsActionImpl(customLineItemId, shippingDetails);
    }

    /**
     * builds StagedOrderSetCustomLineItemShippingDetailsAction without checking for non-null required values
     * @return StagedOrderSetCustomLineItemShippingDetailsAction
     */
    public StagedOrderSetCustomLineItemShippingDetailsAction buildUnchecked() {
        return new StagedOrderSetCustomLineItemShippingDetailsActionImpl(customLineItemId, shippingDetails);
    }

    /**
     * factory method for an instance of StagedOrderSetCustomLineItemShippingDetailsActionBuilder
     * @return builder
     */
    public static StagedOrderSetCustomLineItemShippingDetailsActionBuilder of() {
        return new StagedOrderSetCustomLineItemShippingDetailsActionBuilder();
    }

    /**
     * create builder for StagedOrderSetCustomLineItemShippingDetailsAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderSetCustomLineItemShippingDetailsActionBuilder of(
            final StagedOrderSetCustomLineItemShippingDetailsAction template) {
        StagedOrderSetCustomLineItemShippingDetailsActionBuilder builder = new StagedOrderSetCustomLineItemShippingDetailsActionBuilder();
        builder.customLineItemId = template.getCustomLineItemId();
        builder.shippingDetails = template.getShippingDetails();
        return builder;
    }

}
