
package com.commercetools.api.models.order_edit;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderSetShippingMethodTaxAmountActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetShippingMethodTaxAmountAction stagedOrderSetShippingMethodTaxAmountAction = StagedOrderSetShippingMethodTaxAmountAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedOrderSetShippingMethodTaxAmountActionBuilder
        implements Builder<StagedOrderSetShippingMethodTaxAmountAction> {

    @Nullable
    private com.commercetools.api.models.cart.ExternalTaxAmountDraft externalTaxAmount;

    /**
     *
     */

    public StagedOrderSetShippingMethodTaxAmountActionBuilder externalTaxAmount(
            Function<com.commercetools.api.models.cart.ExternalTaxAmountDraftBuilder, com.commercetools.api.models.cart.ExternalTaxAmountDraftBuilder> builder) {
        this.externalTaxAmount = builder.apply(com.commercetools.api.models.cart.ExternalTaxAmountDraftBuilder.of())
                .build();
        return this;
    }

    /**
     *
     */

    public StagedOrderSetShippingMethodTaxAmountActionBuilder externalTaxAmount(
            @Nullable final com.commercetools.api.models.cart.ExternalTaxAmountDraft externalTaxAmount) {
        this.externalTaxAmount = externalTaxAmount;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.cart.ExternalTaxAmountDraft getExternalTaxAmount() {
        return this.externalTaxAmount;
    }

    public StagedOrderSetShippingMethodTaxAmountAction build() {
        return new StagedOrderSetShippingMethodTaxAmountActionImpl(externalTaxAmount);
    }

    /**
     * builds StagedOrderSetShippingMethodTaxAmountAction without checking for non null required values
     */
    public StagedOrderSetShippingMethodTaxAmountAction buildUnchecked() {
        return new StagedOrderSetShippingMethodTaxAmountActionImpl(externalTaxAmount);
    }

    public static StagedOrderSetShippingMethodTaxAmountActionBuilder of() {
        return new StagedOrderSetShippingMethodTaxAmountActionBuilder();
    }

    public static StagedOrderSetShippingMethodTaxAmountActionBuilder of(
            final StagedOrderSetShippingMethodTaxAmountAction template) {
        StagedOrderSetShippingMethodTaxAmountActionBuilder builder = new StagedOrderSetShippingMethodTaxAmountActionBuilder();
        builder.externalTaxAmount = template.getExternalTaxAmount();
        return builder;
    }

}
