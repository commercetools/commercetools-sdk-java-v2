
package com.commercetools.api.models.order_edit;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderSetCustomLineItemTaxRateActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetCustomLineItemTaxRateAction stagedOrderSetCustomLineItemTaxRateAction = StagedOrderSetCustomLineItemTaxRateAction.builder()
 *             .customLineItemId("{customLineItemId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedOrderSetCustomLineItemTaxRateActionBuilder
        implements Builder<StagedOrderSetCustomLineItemTaxRateAction> {

    private String customLineItemId;

    @Nullable
    private com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate;

    /**
     * set the value to the customLineItemId
     * @param customLineItemId value to be set
     * @return Builder
     */

    public StagedOrderSetCustomLineItemTaxRateActionBuilder customLineItemId(final String customLineItemId) {
        this.customLineItemId = customLineItemId;
        return this;
    }

    /**
     *  <p>Controls calculation of taxed prices for Line Items, Custom Line Items, and Shipping Methods as explained in Cart tax calculation.</p>
     * @param builder function to build the externalTaxRate value
     * @return Builder
     */

    public StagedOrderSetCustomLineItemTaxRateActionBuilder externalTaxRate(
            Function<com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder, com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder> builder) {
        this.externalTaxRate = builder.apply(com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Controls calculation of taxed prices for Line Items, Custom Line Items, and Shipping Methods as explained in Cart tax calculation.</p>
     * @param builder function to build the externalTaxRate value
     * @return Builder
     */

    public StagedOrderSetCustomLineItemTaxRateActionBuilder withExternalTaxRate(
            Function<com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder, com.commercetools.api.models.cart.ExternalTaxRateDraft> builder) {
        this.externalTaxRate = builder.apply(com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder.of());
        return this;
    }

    /**
     *  <p>Controls calculation of taxed prices for Line Items, Custom Line Items, and Shipping Methods as explained in Cart tax calculation.</p>
     * @param externalTaxRate value to be set
     * @return Builder
     */

    public StagedOrderSetCustomLineItemTaxRateActionBuilder externalTaxRate(
            @Nullable final com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate) {
        this.externalTaxRate = externalTaxRate;
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
     *  <p>Controls calculation of taxed prices for Line Items, Custom Line Items, and Shipping Methods as explained in Cart tax calculation.</p>
     * @return externalTaxRate
     */

    @Nullable
    public com.commercetools.api.models.cart.ExternalTaxRateDraft getExternalTaxRate() {
        return this.externalTaxRate;
    }

    /**
     * builds StagedOrderSetCustomLineItemTaxRateAction with checking for non-null required values
     * @return StagedOrderSetCustomLineItemTaxRateAction
     */
    public StagedOrderSetCustomLineItemTaxRateAction build() {
        Objects.requireNonNull(customLineItemId,
            StagedOrderSetCustomLineItemTaxRateAction.class + ": customLineItemId is missing");
        return new StagedOrderSetCustomLineItemTaxRateActionImpl(customLineItemId, externalTaxRate);
    }

    /**
     * builds StagedOrderSetCustomLineItemTaxRateAction without checking for non-null required values
     * @return StagedOrderSetCustomLineItemTaxRateAction
     */
    public StagedOrderSetCustomLineItemTaxRateAction buildUnchecked() {
        return new StagedOrderSetCustomLineItemTaxRateActionImpl(customLineItemId, externalTaxRate);
    }

    /**
     * factory method for an instance of StagedOrderSetCustomLineItemTaxRateActionBuilder
     * @return builder
     */
    public static StagedOrderSetCustomLineItemTaxRateActionBuilder of() {
        return new StagedOrderSetCustomLineItemTaxRateActionBuilder();
    }

    /**
     * create builder for StagedOrderSetCustomLineItemTaxRateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderSetCustomLineItemTaxRateActionBuilder of(
            final StagedOrderSetCustomLineItemTaxRateAction template) {
        StagedOrderSetCustomLineItemTaxRateActionBuilder builder = new StagedOrderSetCustomLineItemTaxRateActionBuilder();
        builder.customLineItemId = template.getCustomLineItemId();
        builder.externalTaxRate = template.getExternalTaxRate();
        return builder;
    }

}
