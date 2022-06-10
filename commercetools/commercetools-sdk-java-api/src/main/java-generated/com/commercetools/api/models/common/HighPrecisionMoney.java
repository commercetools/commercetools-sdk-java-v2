
package com.commercetools.api.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Money object that stores an amount of a fraction of the smallest indivisible unit of the specified currency.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     HighPrecisionMoney highPrecisionMoney = HighPrecisionMoney.builder()
 *             .centAmount(0.3)
 *             .currencyCode("{currencyCode}")
 *             .fractionDigits(0.3)
 *             .preciseAmount(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = HighPrecisionMoneyImpl.class)
public interface HighPrecisionMoney extends TypedMoney {

    String HIGH_PRECISION = "highPrecision";

    /**
     *  <p>Amount in 1 / (10 ^ <code>fractionDigits</code>) of a currency.</p>
     */
    @NotNull
    @JsonProperty("preciseAmount")
    public Long getPreciseAmount();

    /**
     *  <p>Number of digits after the decimal separator, greater than the default number of fraction digits for a currency.</p>
     */
    @NotNull
    @JsonProperty("fractionDigits")
    public Integer getFractionDigits();

    public void setPreciseAmount(final Long preciseAmount);

    public void setFractionDigits(final Integer fractionDigits);

    public static HighPrecisionMoney of() {
        return new HighPrecisionMoneyImpl();
    }

    public static HighPrecisionMoney of(final HighPrecisionMoney template) {
        HighPrecisionMoneyImpl instance = new HighPrecisionMoneyImpl();
        instance.setCentAmount(template.getCentAmount());
        instance.setCurrencyCode(template.getCurrencyCode());
        instance.setFractionDigits(template.getFractionDigits());
        instance.setPreciseAmount(template.getPreciseAmount());
        return instance;
    }

    public static HighPrecisionMoneyBuilder builder() {
        return HighPrecisionMoneyBuilder.of();
    }

    public static HighPrecisionMoneyBuilder builder(final HighPrecisionMoney template) {
        return HighPrecisionMoneyBuilder.of(template);
    }

    default <T> T withHighPrecisionMoney(Function<HighPrecisionMoney, T> helper) {
        return helper.apply(this);
    }

    public static HighPrecisionMoney of(final javax.money.MonetaryAmount monetaryAmount, final int fractionDigits) {
        return MoneyUtil.of(monetaryAmount, fractionDigits);
    }

    public default HighPrecisionMoneyDraft toDraft() {
        return HighPrecisionMoneyDraft.of(this);
    }

    @Override
    default javax.money.MonetaryOperator createMoneyOperator() {
        return amount -> MoneyUtil.of(amount, getFractionDigits());
    }

    public static com.fasterxml.jackson.core.type.TypeReference<HighPrecisionMoney> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<HighPrecisionMoney>() {
            @Override
            public String toString() {
                return "TypeReference<HighPrecisionMoney>";
            }
        };
    }
}
