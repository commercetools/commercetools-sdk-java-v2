
package com.commercetools.history.models.common;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SubRateBuilder implements Builder<SubRate> {

    private String name;

    private Integer amount;

    public SubRateBuilder name(final String name) {
        this.name = name;
        return this;
    }

    public SubRateBuilder amount(final Integer amount) {
        this.amount = amount;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public Integer getAmount() {
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
