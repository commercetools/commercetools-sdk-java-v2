
package com.commercetools.history.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 * Money
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     Money money = Money.builder()
 *             .currencyCode("{currencyCode}")
 *             .centAmount(1)
 *             .fractionDigits(1)
 *             .type(MoneyType.CENT_PRECISION)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MoneyImpl.class)
public interface Money {

    /**
     *  <p>Currency code compliant to ISO 4217.</p>
     * @return currencyCode
     */
    @NotNull
    @JsonProperty("currencyCode")
    public String getCurrencyCode();

    /**
     *
     * @return centAmount
     */
    @NotNull
    @JsonProperty("centAmount")
    public Integer getCentAmount();

    /**
     *
     * @return fractionDigits
     */
    @NotNull
    @JsonProperty("fractionDigits")
    public Integer getFractionDigits();

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public MoneyType getType();

    /**
     *  <p>Currency code compliant to ISO 4217.</p>
     * @param currencyCode value to be set
     */

    public void setCurrencyCode(final String currencyCode);

    /**
     * set centAmount
     * @param centAmount value to be set
     */

    public void setCentAmount(final Integer centAmount);

    /**
     * set fractionDigits
     * @param fractionDigits value to be set
     */

    public void setFractionDigits(final Integer fractionDigits);

    /**
     * set type
     * @param type value to be set
     */

    public void setType(final MoneyType type);

    /**
     * factory method
     * @return instance of Money
     */
    public static Money of() {
        return new MoneyImpl();
    }

    /**
     * factory method to create a shallow copy Money
     * @param template instance to be copied
     * @return copy instance
     */
    public static Money of(final Money template) {
        MoneyImpl instance = new MoneyImpl();
        instance.setCurrencyCode(template.getCurrencyCode());
        instance.setCentAmount(template.getCentAmount());
        instance.setFractionDigits(template.getFractionDigits());
        instance.setType(template.getType());
        return instance;
    }

    /**
     * factory method to create a deep copy of Money
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static Money deepCopy(@Nullable final Money template) {
        if (template == null) {
            return null;
        }
        MoneyImpl instance = new MoneyImpl();
        instance.setCurrencyCode(template.getCurrencyCode());
        instance.setCentAmount(template.getCentAmount());
        instance.setFractionDigits(template.getFractionDigits());
        instance.setType(template.getType());
        return instance;
    }

    /**
     * builder factory method for Money
     * @return builder
     */
    public static MoneyBuilder builder() {
        return MoneyBuilder.of();
    }

    /**
     * create builder for Money instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MoneyBuilder builder(final Money template) {
        return MoneyBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMoney(Function<Money, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<Money> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<Money>() {
            @Override
            public String toString() {
                return "TypeReference<Money>";
            }
        };
    }
}
