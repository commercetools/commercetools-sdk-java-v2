
package com.commercetools.ml.models.common;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class MoneyBuilder implements Builder<Money> {

    private Long centAmount;

    private String currencyCode;

    public MoneyBuilder centAmount(final Long centAmount) {
        this.centAmount = centAmount;
        return this;
    }

    public MoneyBuilder currencyCode(final String currencyCode) {
        this.currencyCode = currencyCode;
        return this;
    }

    public Long getCentAmount() {
        return this.centAmount;
    }

    public String getCurrencyCode() {
        return this.currencyCode;
    }

    public Money build() {
        Objects.requireNonNull(centAmount, Money.class + ": centAmount is missing");
        Objects.requireNonNull(currencyCode, Money.class + ": currencyCode is missing");
        return new MoneyImpl(centAmount, currencyCode);
    }

    /**
     * builds Money without checking for non null required values
     */
    public Money buildUnchecked() {
        return new MoneyImpl(centAmount, currencyCode);
    }

    public static MoneyBuilder of() {
        return new MoneyBuilder();
    }

    public static MoneyBuilder of(final Money template) {
        MoneyBuilder builder = new MoneyBuilder();
        builder.centAmount = template.getCentAmount();
        builder.currencyCode = template.getCurrencyCode();
        return builder;
    }

}
