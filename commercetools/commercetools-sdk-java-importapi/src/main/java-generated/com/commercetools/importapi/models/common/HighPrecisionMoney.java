
package com.commercetools.importapi.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * HighPrecisionMoney
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     HighPrecisionMoney highPrecisionMoney = HighPrecisionMoney.builder()
 *             .centAmount(0.3)
 *             .currencyCode("{currencyCode}")
 *             .preciseAmount(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = HighPrecisionMoneyImpl.class)
public interface HighPrecisionMoney extends TypedMoney {

    /**
     * discriminator value for HighPrecisionMoney
     */
    String HIGH_PRECISION = "highPrecision";

    /**
     *
     * @return preciseAmount
     */
    @NotNull
    @JsonProperty("preciseAmount")
    public Long getPreciseAmount();

    /**
     * set preciseAmount
     * @param preciseAmount value to be set
     */

    public void setPreciseAmount(final Long preciseAmount);

    /**
     * factory method
     * @return instance of HighPrecisionMoney
     */
    public static HighPrecisionMoney of() {
        return new HighPrecisionMoneyImpl();
    }

    /**
     * factory method to copy an instance of HighPrecisionMoney
     * @param template instance to be copied
     * @return copy instance
     */
    public static HighPrecisionMoney of(final HighPrecisionMoney template) {
        HighPrecisionMoneyImpl instance = new HighPrecisionMoneyImpl();
        instance.setFractionDigits(template.getFractionDigits());
        instance.setCentAmount(template.getCentAmount());
        instance.setCurrencyCode(template.getCurrencyCode());
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
