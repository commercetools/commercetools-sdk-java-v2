
package com.commercetools.api.models.order;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 Example to create an instance using the builder pattern
 <div class=code-example>
 <pre><code class='java'>
   TaxedItemPriceDraft taxedItemPriceDraft = TaxedItemPriceDraft.builder()
           .totalNet(totalNetBuilder -> totalNetBuilder)
           .totalGross(totalGrossBuilder -> totalGrossBuilder)
           .build()
 </code></pre>
 </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class TaxedItemPriceDraftBuilder implements Builder<TaxedItemPriceDraft> {

    private com.commercetools.api.models.common.Money totalNet;

    private com.commercetools.api.models.common.Money totalGross;

    /**
     *  <p>Draft type that stores amounts in cent precision for the specified currency.</p>
     *  <p>For storing money values in fractions of the minor unit in a currency, use HighPrecisionMoneyDraft instead.</p>
     */

    public TaxedItemPriceDraftBuilder totalNet(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.MoneyBuilder> builder) {
        this.totalNet = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Draft type that stores amounts in cent precision for the specified currency.</p>
     *  <p>For storing money values in fractions of the minor unit in a currency, use HighPrecisionMoneyDraft instead.</p>
     */

    public TaxedItemPriceDraftBuilder totalNet(final com.commercetools.api.models.common.Money totalNet) {
        this.totalNet = totalNet;
        return this;
    }

    /**
     *  <p>Draft type that stores amounts in cent precision for the specified currency.</p>
     *  <p>For storing money values in fractions of the minor unit in a currency, use HighPrecisionMoneyDraft instead.</p>
     */

    public TaxedItemPriceDraftBuilder totalGross(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.MoneyBuilder> builder) {
        this.totalGross = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Draft type that stores amounts in cent precision for the specified currency.</p>
     *  <p>For storing money values in fractions of the minor unit in a currency, use HighPrecisionMoneyDraft instead.</p>
     */

    public TaxedItemPriceDraftBuilder totalGross(final com.commercetools.api.models.common.Money totalGross) {
        this.totalGross = totalGross;
        return this;
    }

    public com.commercetools.api.models.common.Money getTotalNet() {
        return this.totalNet;
    }

    public com.commercetools.api.models.common.Money getTotalGross() {
        return this.totalGross;
    }

    public TaxedItemPriceDraft build() {
        Objects.requireNonNull(totalNet, TaxedItemPriceDraft.class + ": totalNet is missing");
        Objects.requireNonNull(totalGross, TaxedItemPriceDraft.class + ": totalGross is missing");
        return new TaxedItemPriceDraftImpl(totalNet, totalGross);
    }

    /**
     * builds TaxedItemPriceDraft without checking for non null required values
     */
    public TaxedItemPriceDraft buildUnchecked() {
        return new TaxedItemPriceDraftImpl(totalNet, totalGross);
    }

    public static TaxedItemPriceDraftBuilder of() {
        return new TaxedItemPriceDraftBuilder();
    }

    public static TaxedItemPriceDraftBuilder of(final TaxedItemPriceDraft template) {
        TaxedItemPriceDraftBuilder builder = new TaxedItemPriceDraftBuilder();
        builder.totalNet = template.getTotalNet();
        builder.totalGross = template.getTotalGross();
        return builder;
    }

}
