
package com.commercetools.api.models.order_edit;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderSetShippingMethodTaxRateActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetShippingMethodTaxRateAction stagedOrderSetShippingMethodTaxRateAction = StagedOrderSetShippingMethodTaxRateAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedOrderSetShippingMethodTaxRateActionBuilder
        implements Builder<StagedOrderSetShippingMethodTaxRateAction> {

    @Nullable
    private com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate;

    /**
     *  <p>Controls calculation of taxed prices for Line Items, Custom Line Items, and Shipping Methods as explained in Cart tax calculation.</p>
     * @param builder function to build the externalTaxRate value
     * @return Builder
     */

    public StagedOrderSetShippingMethodTaxRateActionBuilder externalTaxRate(
            Function<com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder, com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder> builder) {
        this.externalTaxRate = builder.apply(com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Controls calculation of taxed prices for Line Items, Custom Line Items, and Shipping Methods as explained in Cart tax calculation.</p>
     * @param externalTaxRate value to be set
     * @return Builder
     */

    public StagedOrderSetShippingMethodTaxRateActionBuilder externalTaxRate(
            @Nullable final com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate) {
        this.externalTaxRate = externalTaxRate;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.cart.ExternalTaxRateDraft getExternalTaxRate() {
        return this.externalTaxRate;
    }

    /**
     * builds StagedOrderSetShippingMethodTaxRateAction with checking for non-null required values
     * @return StagedOrderSetShippingMethodTaxRateAction
     */
    public StagedOrderSetShippingMethodTaxRateAction build() {
        return new StagedOrderSetShippingMethodTaxRateActionImpl(externalTaxRate);
    }

    /**
     * builds StagedOrderSetShippingMethodTaxRateAction without checking for non-null required values
     * @return StagedOrderSetShippingMethodTaxRateAction
     */
    public StagedOrderSetShippingMethodTaxRateAction buildUnchecked() {
        return new StagedOrderSetShippingMethodTaxRateActionImpl(externalTaxRate);
    }

    public static StagedOrderSetShippingMethodTaxRateActionBuilder of() {
        return new StagedOrderSetShippingMethodTaxRateActionBuilder();
    }

    public static StagedOrderSetShippingMethodTaxRateActionBuilder of(
            final StagedOrderSetShippingMethodTaxRateAction template) {
        StagedOrderSetShippingMethodTaxRateActionBuilder builder = new StagedOrderSetShippingMethodTaxRateActionBuilder();
        builder.externalTaxRate = template.getExternalTaxRate();
        return builder;
    }

}
