
package com.commercetools.api.models.cart;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 Example to create an instance using the builder pattern
 <div class=code-example>
 <pre><code class='java'>
   TaxPortionDraft taxPortionDraft = TaxPortionDraft.builder()
           .rate(0.3)
           .amount(amountBuilder -> amountBuilder)
           .build()
 </code></pre>
 </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class TaxPortionDraftBuilder implements Builder<TaxPortionDraft> {

    @Nullable
    private String name;

    private Double rate;

    private com.commercetools.api.models.common.Money amount;

    public TaxPortionDraftBuilder name(@Nullable final String name) {
        this.name = name;
        return this;
    }

    public TaxPortionDraftBuilder rate(final Double rate) {
        this.rate = rate;
        return this;
    }

    /**
     *  <p>Draft type that stores amounts in cent precision for the specified currency.</p>
     *  <p>For storing money values in fractions of the minor unit in a currency, use HighPrecisionMoneyDraft instead.</p>
     */

    public TaxPortionDraftBuilder amount(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.MoneyBuilder> builder) {
        this.amount = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Draft type that stores amounts in cent precision for the specified currency.</p>
     *  <p>For storing money values in fractions of the minor unit in a currency, use HighPrecisionMoneyDraft instead.</p>
     */

    public TaxPortionDraftBuilder amount(final com.commercetools.api.models.common.Money amount) {
        this.amount = amount;
        return this;
    }

    @Nullable
    public String getName() {
        return this.name;
    }

    public Double getRate() {
        return this.rate;
    }

    public com.commercetools.api.models.common.Money getAmount() {
        return this.amount;
    }

    public TaxPortionDraft build() {
        Objects.requireNonNull(rate, TaxPortionDraft.class + ": rate is missing");
        Objects.requireNonNull(amount, TaxPortionDraft.class + ": amount is missing");
        return new TaxPortionDraftImpl(name, rate, amount);
    }

    /**
     * builds TaxPortionDraft without checking for non null required values
     */
    public TaxPortionDraft buildUnchecked() {
        return new TaxPortionDraftImpl(name, rate, amount);
    }

    public static TaxPortionDraftBuilder of() {
        return new TaxPortionDraftBuilder();
    }

    public static TaxPortionDraftBuilder of(final TaxPortionDraft template) {
        TaxPortionDraftBuilder builder = new TaxPortionDraftBuilder();
        builder.name = template.getName();
        builder.rate = template.getRate();
        builder.amount = template.getAmount();
        return builder;
    }

}
