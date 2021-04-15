
package com.commercetools.api.models.cart;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class TaxPortionBuilder {

    @Nullable
    private String name;

    private Double rate;

    private com.commercetools.api.models.common.TypedMoney amount;

    public TaxPortionBuilder name(@Nullable final String name) {
        this.name = name;
        return this;
    }

    public TaxPortionBuilder rate(final Double rate) {
        this.rate = rate;
        return this;
    }

    public TaxPortionBuilder amount(final com.commercetools.api.models.common.TypedMoney amount) {
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

    public com.commercetools.api.models.common.TypedMoney getAmount() {
        return this.amount;
    }

    public TaxPortion build() {
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
