
package com.commercetools.ml.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * Money
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     Money money = Money.builder()
 *             .centAmount(0.3)
 *             .currencyCode("{currencyCode}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MoneyImpl.class)
public interface Money {

    /**
     *
     * @return centAmount
     */
    @NotNull
    @JsonProperty("centAmount")
    public Long getCentAmount();

    /**
     *  <p>The currency code compliant to ISO 4217.</p>
     * @return currencyCode
     */
    @NotNull
    @JsonProperty("currencyCode")
    public String getCurrencyCode();

    /**
     * set centAmount
     * @param centAmount value to be set
     */

    public void setCentAmount(final Long centAmount);

    /**
     *  <p>The currency code compliant to ISO 4217.</p>
     * @param currencyCode value to be set
     */

    public void setCurrencyCode(final String currencyCode);

    /**
     * factory method
     * @return instance of Money
     */
    public static Money of() {
        return new MoneyImpl();
    }

    /**
     * factory method to copy an instance of Money
     * @param template instance to be copied
     * @return copy instance
     */
    public static Money of(final Money template) {
        MoneyImpl instance = new MoneyImpl();
        instance.setCentAmount(template.getCentAmount());
        instance.setCurrencyCode(template.getCurrencyCode());
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
