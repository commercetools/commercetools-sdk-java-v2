
package com.commercetools.api.models.order_edit;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderSetCustomLineItemTaxAmountActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetCustomLineItemTaxAmountAction stagedOrderSetCustomLineItemTaxAmountAction = StagedOrderSetCustomLineItemTaxAmountAction.builder()
 *             .customLineItemId("{customLineItemId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedOrderSetCustomLineItemTaxAmountActionBuilder
        implements Builder<StagedOrderSetCustomLineItemTaxAmountAction> {

    private String customLineItemId;

    @Nullable
    private com.commercetools.api.models.cart.ExternalTaxAmountDraft externalTaxAmount;

    /**
     * set the value to the customLineItemId
     * @param customLineItemId value to be set
     * @return Builder
     */

    public StagedOrderSetCustomLineItemTaxAmountActionBuilder customLineItemId(final String customLineItemId) {
        this.customLineItemId = customLineItemId;
        return this;
    }

    /**
     *  <p>Cannot be used in LineItemDraft or CustomLineItemDraft.</p>
     *  <p>Can only be set by these update actions:</p>
     *  <ul>
     *   <li>Set LineItem TaxAmount, Set CustomLineItem TaxAmount, or Set ShippingMethod TaxAmount on Carts</li>
     *   <li>Set LineItem TaxAmount, Set CustomLineItem TaxAmount, or Set ShippingMethod TaxAmount on Order Edits</li>
     *  </ul>
     * @param builder function to build the externalTaxAmount value
     * @return Builder
     */

    public StagedOrderSetCustomLineItemTaxAmountActionBuilder externalTaxAmount(
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
     * @param builder function to build the externalTaxAmount value
     * @return Builder
     */

    public StagedOrderSetCustomLineItemTaxAmountActionBuilder withExternalTaxAmount(
            Function<com.commercetools.api.models.cart.ExternalTaxAmountDraftBuilder, com.commercetools.api.models.cart.ExternalTaxAmountDraft> builder) {
        this.externalTaxAmount = builder.apply(com.commercetools.api.models.cart.ExternalTaxAmountDraftBuilder.of());
        return this;
    }

    /**
     *  <p>Cannot be used in LineItemDraft or CustomLineItemDraft.</p>
     *  <p>Can only be set by these update actions:</p>
     *  <ul>
     *   <li>Set LineItem TaxAmount, Set CustomLineItem TaxAmount, or Set ShippingMethod TaxAmount on Carts</li>
     *   <li>Set LineItem TaxAmount, Set CustomLineItem TaxAmount, or Set ShippingMethod TaxAmount on Order Edits</li>
     *  </ul>
     * @param externalTaxAmount value to be set
     * @return Builder
     */

    public StagedOrderSetCustomLineItemTaxAmountActionBuilder externalTaxAmount(
            @Nullable final com.commercetools.api.models.cart.ExternalTaxAmountDraft externalTaxAmount) {
        this.externalTaxAmount = externalTaxAmount;
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
     *  <p>Cannot be used in LineItemDraft or CustomLineItemDraft.</p>
     *  <p>Can only be set by these update actions:</p>
     *  <ul>
     *   <li>Set LineItem TaxAmount, Set CustomLineItem TaxAmount, or Set ShippingMethod TaxAmount on Carts</li>
     *   <li>Set LineItem TaxAmount, Set CustomLineItem TaxAmount, or Set ShippingMethod TaxAmount on Order Edits</li>
     *  </ul>
     * @return externalTaxAmount
     */

    @Nullable
    public com.commercetools.api.models.cart.ExternalTaxAmountDraft getExternalTaxAmount() {
        return this.externalTaxAmount;
    }

    /**
     * builds StagedOrderSetCustomLineItemTaxAmountAction with checking for non-null required values
     * @return StagedOrderSetCustomLineItemTaxAmountAction
     */
    public StagedOrderSetCustomLineItemTaxAmountAction build() {
        Objects.requireNonNull(customLineItemId,
            StagedOrderSetCustomLineItemTaxAmountAction.class + ": customLineItemId is missing");
        return new StagedOrderSetCustomLineItemTaxAmountActionImpl(customLineItemId, externalTaxAmount);
    }

    /**
     * builds StagedOrderSetCustomLineItemTaxAmountAction without checking for non-null required values
     * @return StagedOrderSetCustomLineItemTaxAmountAction
     */
    public StagedOrderSetCustomLineItemTaxAmountAction buildUnchecked() {
        return new StagedOrderSetCustomLineItemTaxAmountActionImpl(customLineItemId, externalTaxAmount);
    }

    /**
     * factory method for an instance of StagedOrderSetCustomLineItemTaxAmountActionBuilder
     * @return builder
     */
    public static StagedOrderSetCustomLineItemTaxAmountActionBuilder of() {
        return new StagedOrderSetCustomLineItemTaxAmountActionBuilder();
    }

    /**
     * create builder for StagedOrderSetCustomLineItemTaxAmountAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderSetCustomLineItemTaxAmountActionBuilder of(
            final StagedOrderSetCustomLineItemTaxAmountAction template) {
        StagedOrderSetCustomLineItemTaxAmountActionBuilder builder = new StagedOrderSetCustomLineItemTaxAmountActionBuilder();
        builder.customLineItemId = template.getCustomLineItemId();
        builder.externalTaxAmount = template.getExternalTaxAmount();
        return builder;
    }

}
