
package com.commercetools.api.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Object that stores money as a fraction of the smallest indivisible unit of a specific currency.</p>
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
@io.vrap.rmf.base.client.utils.json.SubType("highPrecision")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = HighPrecisionMoneyImpl.class)
public interface HighPrecisionMoney extends TypedMoney {

    /**
     * discriminator value for HighPrecisionMoney
     */
    String HIGH_PRECISION = "highPrecision";

    /**
     *  <p>Amount in 1 / (10 ^ <code>fractionDigits</code>) of a currency.</p>
     * @return preciseAmount
     */
    @NotNull
    @JsonProperty("preciseAmount")
    public Long getPreciseAmount();

    /**
     *  <p>Number of digits after the decimal separator, greater than the default number of fraction digits for a currency.</p>
     * @return fractionDigits
     */
    @NotNull
    @JsonProperty("fractionDigits")
    public Integer getFractionDigits();

    /**
     *  <p>Amount in 1 / (10 ^ <code>fractionDigits</code>) of a currency.</p>
     * @param preciseAmount value to be set
     */

    public void setPreciseAmount(final Long preciseAmount);

    /**
     *  <p>Number of digits after the decimal separator, greater than the default number of fraction digits for a currency.</p>
     * @param fractionDigits value to be set
     */

    public void setFractionDigits(final Integer fractionDigits);

    /**
     * factory method
     * @return instance of HighPrecisionMoney
     */
    public static HighPrecisionMoney of() {
        return new HighPrecisionMoneyImpl();
    }

    /**
     * factory method to create a shallow copy HighPrecisionMoney
     * @param template instance to be copied
     * @return copy instance
     */
    public static HighPrecisionMoney of(final HighPrecisionMoney template) {
        HighPrecisionMoneyImpl instance = new HighPrecisionMoneyImpl();
        instance.setCentAmount(template.getCentAmount());
        instance.setCurrencyCode(template.getCurrencyCode());
        instance.setFractionDigits(template.getFractionDigits());
        instance.setPreciseAmount(template.getPreciseAmount());
        return instance;
    }

    public HighPrecisionMoney copyDeep();

    /**
     * factory method to create a deep copy of HighPrecisionMoney
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static HighPrecisionMoney deepCopy(@Nullable final HighPrecisionMoney template) {
        if (template == null) {
            return null;
        }
        HighPrecisionMoneyImpl instance = new HighPrecisionMoneyImpl();
        instance.setCentAmount(template.getCentAmount());
        instance.setCurrencyCode(template.getCurrencyCode());
        instance.setFractionDigits(template.getFractionDigits());
        instance.setPreciseAmount(template.getPreciseAmount());
        return instance;
    }

    /**
     * builder factory method for HighPrecisionMoney
     * @return builder
     */
    public static HighPrecisionMoneyBuilder builder() {
        return HighPrecisionMoneyBuilder.of();
    }

    /**
     * create builder for HighPrecisionMoney instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static HighPrecisionMoneyBuilder builder(final HighPrecisionMoney template) {
        return HighPrecisionMoneyBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
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

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<HighPrecisionMoney> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<HighPrecisionMoney>() {
            @Override
            public String toString() {
                return "TypeReference<HighPrecisionMoney>";
            }
        };
    }
}
