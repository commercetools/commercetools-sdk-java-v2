
package com.commercetools.api.models.cart;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class TaxPortionDraftBuilder implements Builder<TaxPortionDraft> {

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

    public TaxPortionDraftBuilder amount(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.MoneyBuilder> builder) {
        this.amount = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of()).build();
        return this;
    }

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
