
package com.commercetools.history.models.common;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class MoneyBuilder {

    private String currencyCode;

    private Integer centAmount;

    private Integer fractionDigits;

    private com.commercetools.history.models.common.MoneyType type;

    public MoneyBuilder currencyCode(final String currencyCode) {
        this.currencyCode = currencyCode;
        return this;
    }

    public MoneyBuilder centAmount(final Integer centAmount) {
        this.centAmount = centAmount;
        return this;
    }

    public MoneyBuilder fractionDigits(final Integer fractionDigits) {
        this.fractionDigits = fractionDigits;
        return this;
    }

    public MoneyBuilder type(final com.commercetools.history.models.common.MoneyType type) {
        this.type = type;
        return this;
    }

    public String getCurrencyCode() {
        return this.currencyCode;
    }

    public Integer getCentAmount() {
        return this.centAmount;
    }

    public Integer getFractionDigits() {
        return this.fractionDigits;
    }

    public com.commercetools.history.models.common.MoneyType getType() {
        return this.type;
    }

    public Money build() {
        return new MoneyImpl(currencyCode, centAmount, fractionDigits, type);
    }

    public static MoneyBuilder of() {
        return new MoneyBuilder();
    }

    public static MoneyBuilder of(final Money template) {
        MoneyBuilder builder = new MoneyBuilder();
        builder.currencyCode = template.getCurrencyCode();
        builder.centAmount = template.getCentAmount();
        builder.fractionDigits = template.getFractionDigits();
        builder.type = template.getType();
        return builder;
    }

}
