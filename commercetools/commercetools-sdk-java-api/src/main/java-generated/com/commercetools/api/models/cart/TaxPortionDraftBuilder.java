
package com.commercetools.api.models.cart;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * TaxPortionDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TaxPortionDraft taxPortionDraft = TaxPortionDraft.builder()
 *             .rate(0.3)
 *             .amount(amountBuilder -> amountBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class TaxPortionDraftBuilder implements Builder<TaxPortionDraft> {

    @Nullable
    private String name;

    private Double rate;

    private com.commercetools.api.models.common.Money amount;

    /**
     *  <p>Name of the tax portion.</p>
     * @param name value to be set
     * @return Builder
     */

    public TaxPortionDraftBuilder name(@Nullable final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>A number in the range 0-1.</p>
     * @param rate value to be set
     * @return Builder
     */

    public TaxPortionDraftBuilder rate(final Double rate) {
        this.rate = rate;
        return this;
    }

    /**
     *  <p>Money value for the tax portion.</p>
     * @param builder function to build the amount value
     * @return Builder
     */

    public TaxPortionDraftBuilder amount(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.MoneyBuilder> builder) {
        this.amount = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Money value for the tax portion.</p>
     * @param builder function to build the amount value
     * @return Builder
     */

    public TaxPortionDraftBuilder withAmount(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.Money> builder) {
        this.amount = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of());
        return this;
    }

    /**
     *  <p>Money value for the tax portion.</p>
     * @param amount value to be set
     * @return Builder
     */

    public TaxPortionDraftBuilder amount(final com.commercetools.api.models.common.Money amount) {
        this.amount = amount;
        return this;
    }

    /**
     *  <p>Name of the tax portion.</p>
     * @return name
     */

    @Nullable
    public String getName() {
        return this.name;
    }

    /**
     *  <p>A number in the range 0-1.</p>
     * @return rate
     */

    public Double getRate() {
        return this.rate;
    }

    /**
     *  <p>Money value for the tax portion.</p>
     * @return amount
     */

    public com.commercetools.api.models.common.Money getAmount() {
        return this.amount;
    }

    /**
     * builds TaxPortionDraft with checking for non-null required values
     * @return TaxPortionDraft
     */
    public TaxPortionDraft build() {
        Objects.requireNonNull(rate, TaxPortionDraft.class + ": rate is missing");
        Objects.requireNonNull(amount, TaxPortionDraft.class + ": amount is missing");
        return new TaxPortionDraftImpl(name, rate, amount);
    }

    /**
     * builds TaxPortionDraft without checking for non-null required values
     * @return TaxPortionDraft
     */
    public TaxPortionDraft buildUnchecked() {
        return new TaxPortionDraftImpl(name, rate, amount);
    }

    /**
     * factory method for an instance of TaxPortionDraftBuilder
     * @return builder
     */
    public static TaxPortionDraftBuilder of() {
        return new TaxPortionDraftBuilder();
    }

    /**
     * create builder for TaxPortionDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TaxPortionDraftBuilder of(final TaxPortionDraft template) {
        TaxPortionDraftBuilder builder = new TaxPortionDraftBuilder();
        builder.name = template.getName();
        builder.rate = template.getRate();
        builder.amount = template.getAmount();
        return builder;
    }

}
