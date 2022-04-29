
package com.commercetools.api.models.common;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class HighPrecisionMoneyBuilder implements Builder<HighPrecisionMoney> {

    private Long centAmount;

    private String currencyCode;

    private Integer fractionDigits;

    private Long preciseAmount;

    public HighPrecisionMoneyBuilder centAmount(final Long centAmount) {
        this.centAmount = centAmount;
        return this;
    }

    public HighPrecisionMoneyBuilder currencyCode(final String currencyCode) {
        this.currencyCode = currencyCode;
        return this;
    }

    public HighPrecisionMoneyBuilder fractionDigits(final Integer fractionDigits) {
        this.fractionDigits = fractionDigits;
        return this;
    }

    public HighPrecisionMoneyBuilder preciseAmount(final Long preciseAmount) {
        this.preciseAmount = preciseAmount;
        return this;
    }

    public Long getCentAmount() {
        return this.centAmount;
    }

    public String getCurrencyCode() {
        return this.currencyCode;
    }

    public Integer getFractionDigits() {
        return this.fractionDigits;
    }

    public Long getPreciseAmount() {
        return this.preciseAmount;
    }

    public HighPrecisionMoney build() {
        Objects.requireNonNull(centAmount, HighPrecisionMoney.class + ": centAmount is missing");
        Objects.requireNonNull(currencyCode, HighPrecisionMoney.class + ": currencyCode is missing");
        Objects.requireNonNull(fractionDigits, HighPrecisionMoney.class + ": fractionDigits is missing");
        Objects.requireNonNull(preciseAmount, HighPrecisionMoney.class + ": preciseAmount is missing");
        return new HighPrecisionMoneyImpl(centAmount, currencyCode, fractionDigits, preciseAmount);
    }

    /**
     * builds HighPrecisionMoney without checking for non null required values
     */
    public HighPrecisionMoney buildUnchecked() {
        return new HighPrecisionMoneyImpl(centAmount, currencyCode, fractionDigits, preciseAmount);
    }

    public static HighPrecisionMoneyBuilder of() {
        return new HighPrecisionMoneyBuilder();
    }

    public static HighPrecisionMoneyBuilder of(final HighPrecisionMoney template) {
        HighPrecisionMoneyBuilder builder = new HighPrecisionMoneyBuilder();
        builder.centAmount = template.getCentAmount();
        builder.currencyCode = template.getCurrencyCode();
        builder.fractionDigits = template.getFractionDigits();
        builder.preciseAmount = template.getPreciseAmount();
        return builder;
    }

}
