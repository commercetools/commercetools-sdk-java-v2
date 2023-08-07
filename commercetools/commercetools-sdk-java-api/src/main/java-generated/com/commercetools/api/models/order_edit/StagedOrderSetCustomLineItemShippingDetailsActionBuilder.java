
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
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedOrderSetCustomLineItemShippingDetailsActionBuilder
        implements Builder<StagedOrderSetCustomLineItemShippingDetailsAction> {

    @Nullable
    private String customLineItemId;

    @Nullable
    private String customLineItemKey;

    @Nullable
    private com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetails;

    /**
     *  <p><code>id</code> of the CustomLineItem to update. Either <code>customLineItemId</code> or <code>customLineItemKey</code> is required.</p>
     * @param customLineItemId value to be set
     * @return Builder
     */

    public StagedOrderSetCustomLineItemShippingDetailsActionBuilder customLineItemId(
            @Nullable final String customLineItemId) {
        this.customLineItemId = customLineItemId;
        return this;
    }

    /**
     *  <p><code>key</code> of the CustomLineItem to update. Either <code>customLineItemId</code> or <code>customLineItemKey</code> is required.</p>
     * @param customLineItemKey value to be set
     * @return Builder
     */

    public StagedOrderSetCustomLineItemShippingDetailsActionBuilder customLineItemKey(
            @Nullable final String customLineItemKey) {
        this.customLineItemKey = customLineItemKey;
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
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
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @param builder function to build the shippingDetails value
     * @return Builder
     */

    public StagedOrderSetCustomLineItemShippingDetailsActionBuilder withShippingDetails(
            Function<com.commercetools.api.models.cart.ItemShippingDetailsDraftBuilder, com.commercetools.api.models.cart.ItemShippingDetailsDraft> builder) {
        this.shippingDetails = builder.apply(com.commercetools.api.models.cart.ItemShippingDetailsDraftBuilder.of());
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @param shippingDetails value to be set
     * @return Builder
     */

    public StagedOrderSetCustomLineItemShippingDetailsActionBuilder shippingDetails(
            @Nullable final com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetails) {
        this.shippingDetails = shippingDetails;
        return this;
    }

    /**
     *  <p><code>id</code> of the CustomLineItem to update. Either <code>customLineItemId</code> or <code>customLineItemKey</code> is required.</p>
     * @return customLineItemId
     */

    @Nullable
    public String getCustomLineItemId() {
        return this.customLineItemId;
    }

    /**
     *  <p><code>key</code> of the CustomLineItem to update. Either <code>customLineItemId</code> or <code>customLineItemKey</code> is required.</p>
     * @return customLineItemKey
     */

    @Nullable
    public String getCustomLineItemKey() {
        return this.customLineItemKey;
    }

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
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
        return new StagedOrderSetCustomLineItemShippingDetailsActionImpl(customLineItemId, customLineItemKey,
            shippingDetails);
    }

    /**
     * builds StagedOrderSetCustomLineItemShippingDetailsAction without checking for non-null required values
     * @return StagedOrderSetCustomLineItemShippingDetailsAction
     */
    public StagedOrderSetCustomLineItemShippingDetailsAction buildUnchecked() {
        return new StagedOrderSetCustomLineItemShippingDetailsActionImpl(customLineItemId, customLineItemKey,
            shippingDetails);
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
        builder.customLineItemKey = template.getCustomLineItemKey();
        builder.shippingDetails = template.getShippingDetails();
        return builder;
    }

}
