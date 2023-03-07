
package com.commercetools.api.models.order_edit;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderSetLineItemTaxAmountActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetLineItemTaxAmountAction stagedOrderSetLineItemTaxAmountAction = StagedOrderSetLineItemTaxAmountAction.builder()
 *             .lineItemId("{lineItemId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedOrderSetLineItemTaxAmountActionBuilder implements Builder<StagedOrderSetLineItemTaxAmountAction> {

    private String lineItemId;

    @Nullable
    private com.commercetools.api.models.cart.ExternalTaxAmountDraft externalTaxAmount;

    @Nullable
    private String shippingKey;

    /**
     *
     */

    public StagedOrderSetLineItemTaxAmountActionBuilder lineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }

    /**
     *  <p>Cannot be used in LineItemDraft or CustomLineItemDraft.</p>
     *  <p>Can only be set by these update actions:</p>
     *  <ul>
     *   <li>Set LineItem TaxAmount, Set CustomLineItem TaxAmount, or Set ShippingMethod TaxAmount on Carts</li>
     *   <li>Set LineItem TaxAmount, Set CustomLineItem TaxAmount, or Set ShippingMethod TaxAmount on Order Edits</li>
     *  </ul>
     */

    public StagedOrderSetLineItemTaxAmountActionBuilder externalTaxAmount(
            Function<com.commercetools.api.models.cart.ExternalTaxAmountDraftBuilder, com.commercetools.api.models.cart.ExternalTaxAmountDraftBuilder> builder) {
        this.externalTaxAmount = builder.apply(com.commercetools.api.models.cart.ExternalTaxAmountDraftBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Cannot be used in LineItemDraft or CustomLineItemDraft.</p>
     *  <p>Can only be set by these update actions:</p>
     *  <ul>
     *   <li>Set LineItem TaxAmount, Set CustomLineItem TaxAmount, or Set ShippingMethod TaxAmount on Carts</li>
     *   <li>Set LineItem TaxAmount, Set CustomLineItem TaxAmount, or Set ShippingMethod TaxAmount on Order Edits</li>
     *  </ul>
     */

    public StagedOrderSetLineItemTaxAmountActionBuilder externalTaxAmount(
            @Nullable final com.commercetools.api.models.cart.ExternalTaxAmountDraft externalTaxAmount) {
        this.externalTaxAmount = externalTaxAmount;
        return this;
    }

    /**
     *  <p><code>key</code> of the ShippingMethod used for this Line Item.``` This is required for Carts with <code>Multiple</code> ShippingMode.</p>
     */

    public StagedOrderSetLineItemTaxAmountActionBuilder shippingKey(@Nullable final String shippingKey) {
        this.shippingKey = shippingKey;
        return this;
    }

    public String getLineItemId() {
        return this.lineItemId;
    }

    @Nullable
    public com.commercetools.api.models.cart.ExternalTaxAmountDraft getExternalTaxAmount() {
        return this.externalTaxAmount;
    }

    @Nullable
    public String getShippingKey() {
        return this.shippingKey;
    }

    public StagedOrderSetLineItemTaxAmountAction build() {
        Objects.requireNonNull(lineItemId, StagedOrderSetLineItemTaxAmountAction.class + ": lineItemId is missing");
        return new StagedOrderSetLineItemTaxAmountActionImpl(lineItemId, externalTaxAmount, shippingKey);
    }

    /**
     * builds StagedOrderSetLineItemTaxAmountAction without checking for non null required values
     */
    public StagedOrderSetLineItemTaxAmountAction buildUnchecked() {
        return new StagedOrderSetLineItemTaxAmountActionImpl(lineItemId, externalTaxAmount, shippingKey);
    }

    public static StagedOrderSetLineItemTaxAmountActionBuilder of() {
        return new StagedOrderSetLineItemTaxAmountActionBuilder();
    }

    public static StagedOrderSetLineItemTaxAmountActionBuilder of(
            final StagedOrderSetLineItemTaxAmountAction template) {
        StagedOrderSetLineItemTaxAmountActionBuilder builder = new StagedOrderSetLineItemTaxAmountActionBuilder();
        builder.lineItemId = template.getLineItemId();
        builder.externalTaxAmount = template.getExternalTaxAmount();
        builder.shippingKey = template.getShippingKey();
        return builder;
    }

}
