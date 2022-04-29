
package com.commercetools.api.models.common;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class CentPrecisionMoneyBuilder implements Builder<CentPrecisionMoney> {

    private Long centAmount;

    private String currencyCode;

    private Integer fractionDigits;

    public CentPrecisionMoneyBuilder centAmount(final Long centAmount) {
        this.centAmount = centAmount;
        return this;
    }

    public CentPrecisionMoneyBuilder currencyCode(final String currencyCode) {
        this.currencyCode = currencyCode;
        return this;
    }

    public CentPrecisionMoneyBuilder fractionDigits(final Integer fractionDigits) {
        this.fractionDigits = fractionDigits;
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

    public CentPrecisionMoney build() {
        Objects.requireNonNull(centAmount, CentPrecisionMoney.class + ": centAmount is missing");
        Objects.requireNonNull(currencyCode, CentPrecisionMoney.class + ": currencyCode is missing");
        Objects.requireNonNull(fractionDigits, CentPrecisionMoney.class + ": fractionDigits is missing");
        return new CentPrecisionMoneyImpl(centAmount, currencyCode, fractionDigits);
    }

    /**
     * builds CentPrecisionMoney without checking for non null required values
     */
    public CentPrecisionMoney buildUnchecked() {
        return new CentPrecisionMoneyImpl(centAmount, currencyCode, fractionDigits);
    }

    public static CentPrecisionMoneyBuilder of() {
        return new CentPrecisionMoneyBuilder();
    }

    public static CentPrecisionMoneyBuilder of(final CentPrecisionMoney template) {
        CentPrecisionMoneyBuilder builder = new CentPrecisionMoneyBuilder();
        builder.centAmount = template.getCentAmount();
        builder.currencyCode = template.getCurrencyCode();
        builder.fractionDigits = template.getFractionDigits();
        return builder;
    }

}
