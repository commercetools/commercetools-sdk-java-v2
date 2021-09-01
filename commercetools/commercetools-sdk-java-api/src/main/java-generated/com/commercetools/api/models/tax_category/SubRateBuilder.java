
package com.commercetools.api.models.tax_category;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SubRateBuilder implements Builder<SubRate> {

    private String name;

    private Double amount;

    public SubRateBuilder name(final String name) {
        this.name = name;
        return this;
    }

    public SubRateBuilder amount(final Double amount) {
        this.amount = amount;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public Double getAmount() {
        return this.amount;
    }

    public SubRate build() {
        Objects.requireNonNull(name, SubRate.class + ": name is missing");
        Objects.requireNonNull(amount, SubRate.class + ": amount is missing");
        return new SubRateImpl(name, amount);
    }

    /**
     * builds SubRate without checking for non null required values
     */
    public SubRate buildUnchecked() {
        return new SubRateImpl(name, amount);
    }

    public static SubRateBuilder of() {
        return new SubRateBuilder();
    }

    public static SubRateBuilder of(final SubRate template) {
        SubRateBuilder builder = new SubRateBuilder();
        builder.name = template.getName();
        builder.amount = template.getAmount();
        return builder;
    }

}
