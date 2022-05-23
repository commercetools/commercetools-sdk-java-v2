
package com.commercetools.api.models.order_edit;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 Example to create an instance using the builder pattern
 <div class=code-example>
 <pre><code class='java'>
   StagedOrderSetLineItemPriceAction stagedOrderSetLineItemPriceAction = StagedOrderSetLineItemPriceAction.builder()
           .lineItemId("{lineItemId}")
           .build()
 </code></pre>
 </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedOrderSetLineItemPriceActionBuilder implements Builder<StagedOrderSetLineItemPriceAction> {

    private String lineItemId;

    @Nullable
    private com.commercetools.api.models.common.Money externalPrice;

    public StagedOrderSetLineItemPriceActionBuilder lineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }

    /**
     *  <p>Draft type that stores amounts in cent precision for the specified currency.</p>
     *  <p>For storing money values in fractions of the minor unit in a currency, use HighPrecisionMoneyDraft instead.</p>
     */

    public StagedOrderSetLineItemPriceActionBuilder externalPrice(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.MoneyBuilder> builder) {
        this.externalPrice = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Draft type that stores amounts in cent precision for the specified currency.</p>
     *  <p>For storing money values in fractions of the minor unit in a currency, use HighPrecisionMoneyDraft instead.</p>
     */

    public StagedOrderSetLineItemPriceActionBuilder externalPrice(
            @Nullable final com.commercetools.api.models.common.Money externalPrice) {
        this.externalPrice = externalPrice;
        return this;
    }

    public String getLineItemId() {
        return this.lineItemId;
    }

    @Nullable
    public com.commercetools.api.models.common.Money getExternalPrice() {
        return this.externalPrice;
    }

    public StagedOrderSetLineItemPriceAction build() {
        Objects.requireNonNull(lineItemId, StagedOrderSetLineItemPriceAction.class + ": lineItemId is missing");
        return new StagedOrderSetLineItemPriceActionImpl(lineItemId, externalPrice);
    }

    /**
     * builds StagedOrderSetLineItemPriceAction without checking for non null required values
     */
    public StagedOrderSetLineItemPriceAction buildUnchecked() {
        return new StagedOrderSetLineItemPriceActionImpl(lineItemId, externalPrice);
    }

    public static StagedOrderSetLineItemPriceActionBuilder of() {
        return new StagedOrderSetLineItemPriceActionBuilder();
    }

    public static StagedOrderSetLineItemPriceActionBuilder of(final StagedOrderSetLineItemPriceAction template) {
        StagedOrderSetLineItemPriceActionBuilder builder = new StagedOrderSetLineItemPriceActionBuilder();
        builder.lineItemId = template.getLineItemId();
        builder.externalPrice = template.getExternalPrice();
        return builder;
    }

}
