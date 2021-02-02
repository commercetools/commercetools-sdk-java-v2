
package com.commercetools.importapi.models.common;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class MoneyBuilder {

    @Nullable
    private Integer fractionDigits;

    private Long centAmount;

    private String currencyCode;

    public MoneyBuilder fractionDigits(@Nullable final Integer fractionDigits) {
        this.fractionDigits = fractionDigits;
        return this;
    }

    public MoneyBuilder centAmount(final Long centAmount) {
        this.centAmount = centAmount;
        return this;
    }

    public MoneyBuilder currencyCode(final String currencyCode) {
        this.currencyCode = currencyCode;
        return this;
    }

    @Nullable
    public Integer getFractionDigits() {
        return this.fractionDigits;
    }

    public Long getCentAmount() {
        return this.centAmount;
    }

    public String getCurrencyCode() {
        return this.currencyCode;
    }

    public Money build() {
        return new MoneyImpl(fractionDigits, centAmount, currencyCode);
    }

    public static MoneyBuilder of() {
        return new MoneyBuilder();
    }

    public static MoneyBuilder of(final Money template) {
        MoneyBuilder builder = new MoneyBuilder();
        builder.fractionDigits = template.getFractionDigits();
        builder.centAmount = template.getCentAmount();
        builder.currencyCode = template.getCurrencyCode();
        return builder;
    }

}
