
package com.commercetools.api.models.cart;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * TaxPortionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TaxPortion taxPortion = TaxPortion.builder()
 *             .rate(0.3)
 *             .amount(amountBuilder -> amountBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class TaxPortionBuilder implements Builder<TaxPortion> {

    @Nullable
    private String name;

    private Double rate;

    private com.commercetools.api.models.common.CentPrecisionMoney amount;

    /**
     *  <p>Name of the tax portion.</p>
     */

    public TaxPortionBuilder name(@Nullable final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>A number in the range 0-1.</p>
     */

    public TaxPortionBuilder rate(final Double rate) {
        this.rate = rate;
        return this;
    }

    /**
     *  <p>Money value of the tax portion.</p>
     */

    public TaxPortionBuilder amount(
            Function<com.commercetools.api.models.common.CentPrecisionMoneyBuilder, com.commercetools.api.models.common.CentPrecisionMoneyBuilder> builder) {
        this.amount = builder.apply(com.commercetools.api.models.common.CentPrecisionMoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Money value of the tax portion.</p>
     */

    public TaxPortionBuilder amount(final com.commercetools.api.models.common.CentPrecisionMoney amount) {
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

    public com.commercetools.api.models.common.CentPrecisionMoney getAmount() {
        return this.amount;
    }

    public TaxPortion build() {
        Objects.requireNonNull(rate, TaxPortion.class + ": rate is missing");
        Objects.requireNonNull(amount, TaxPortion.class + ": amount is missing");
        return new TaxPortionImpl(name, rate, amount);
    }

    /**
     * builds TaxPortion without checking for non null required values
     */
    public TaxPortion buildUnchecked() {
        return new TaxPortionImpl(name, rate, amount);
    }

    public static TaxPortionBuilder of() {
        return new TaxPortionBuilder();
    }

    public static TaxPortionBuilder of(final TaxPortion template) {
        TaxPortionBuilder builder = new TaxPortionBuilder();
        builder.name = template.getName();
        builder.rate = template.getRate();
        builder.amount = template.getAmount();
        return builder;
    }

}
