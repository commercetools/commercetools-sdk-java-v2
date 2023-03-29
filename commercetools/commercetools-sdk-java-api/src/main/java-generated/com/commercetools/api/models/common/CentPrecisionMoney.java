
package com.commercetools.api.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Object that stores cent amounts in a specific currency.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CentPrecisionMoney centPrecisionMoney = CentPrecisionMoney.builder()
 *             .centAmount(0.3)
 *             .currencyCode("{currencyCode}")
 *             .fractionDigits(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CentPrecisionMoneyImpl.class)
public interface CentPrecisionMoney extends TypedMoney {

    /**
     * discriminator value for CentPrecisionMoney
     */
    String CENT_PRECISION = "centPrecision";

    /**
     *  <p>The number of default fraction digits for the given currency, like <code>2</code> for EUR or <code>0</code> for JPY.</p>
     * @return fractionDigits
     */
    @NotNull
    @JsonProperty("fractionDigits")
    public Integer getFractionDigits();

    /**
     *  <p>The number of default fraction digits for the given currency, like <code>2</code> for EUR or <code>0</code> for JPY.</p>
     * @param fractionDigits value to be set
     */

    public void setFractionDigits(final Integer fractionDigits);

    /**
     * factory method
     * @return instance of CentPrecisionMoney
     */
    public static CentPrecisionMoney of() {
        return new CentPrecisionMoneyImpl();
    }

    /**
     * factory method to create a shallow copy CentPrecisionMoney
     * @param template instance to be copied
     * @return copy instance
     */
    public static CentPrecisionMoney of(final CentPrecisionMoney template) {
        CentPrecisionMoneyImpl instance = new CentPrecisionMoneyImpl();
        instance.setCentAmount(template.getCentAmount());
        instance.setCurrencyCode(template.getCurrencyCode());
        instance.setFractionDigits(template.getFractionDigits());
        return instance;
    }

    /**
     * factory method to create a deep copy of CentPrecisionMoney
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CentPrecisionMoney deepCopy(@Nullable final CentPrecisionMoney template) {
        if (template == null) {
            return null;
        }
        CentPrecisionMoneyImpl instance = new CentPrecisionMoneyImpl();
        instance.setCentAmount(template.getCentAmount());
        instance.setCurrencyCode(template.getCurrencyCode());
        instance.setFractionDigits(template.getFractionDigits());
        return instance;
    }

    /**
     * builder factory method for CentPrecisionMoney
     * @return builder
     */
    public static CentPrecisionMoneyBuilder builder() {
        return CentPrecisionMoneyBuilder.of();
    }

    /**
     * create builder for CentPrecisionMoney instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CentPrecisionMoneyBuilder builder(final CentPrecisionMoney template) {
        return CentPrecisionMoneyBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCentPrecisionMoney(Function<CentPrecisionMoney, T> helper) {
        return helper.apply(this);
    }

    public static CentPrecisionMoney of(final javax.money.MonetaryAmount monetaryAmount) {
        return MoneyUtil.of(monetaryAmount);
    }

    public default CentPrecisionMoneyDraft toDraft() {
        return CentPrecisionMoneyDraft.of(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CentPrecisionMoney> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CentPrecisionMoney>() {
            @Override
            public String toString() {
                return "TypeReference<CentPrecisionMoney>";
            }
        };
    }
}
