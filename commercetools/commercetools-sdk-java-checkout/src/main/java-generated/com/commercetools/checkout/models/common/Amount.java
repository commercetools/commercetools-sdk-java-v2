
package com.commercetools.checkout.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Money in cent amounts for a specific currency.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     Amount amount = Amount.builder()
 *             .centAmount(1)
 *             .currencyCode("{currencyCode}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AmountImpl.class)
public interface Amount {

    /**
     *  <p>Amount in the smallest indivisible unit of a currency, such as:</p>
     *  <ul>
     *   <li>Cents for EUR and USD, pence for GBP, or centime for CHF (5 CHF is specified as <code>500</code>).</li>
     *   <li>The value in the major unit for currencies without minor units, like JPY (5 JPY is specified as <code>5</code>).</li>
     *  </ul>
     * @return centAmount
     */
    @NotNull
    @JsonProperty("centAmount")
    public Integer getCentAmount();

    /**
     *  <p>Currency code compliant to <span>ISO 4217</span>.</p>
     * @return currencyCode
     */
    @NotNull
    @JsonProperty("currencyCode")
    public String getCurrencyCode();

    /**
     *  <p>Amount in the smallest indivisible unit of a currency, such as:</p>
     *  <ul>
     *   <li>Cents for EUR and USD, pence for GBP, or centime for CHF (5 CHF is specified as <code>500</code>).</li>
     *   <li>The value in the major unit for currencies without minor units, like JPY (5 JPY is specified as <code>5</code>).</li>
     *  </ul>
     * @param centAmount value to be set
     */

    public void setCentAmount(final Integer centAmount);

    /**
     *  <p>Currency code compliant to <span>ISO 4217</span>.</p>
     * @param currencyCode value to be set
     */

    public void setCurrencyCode(final String currencyCode);

    /**
     * factory method
     * @return instance of Amount
     */
    public static Amount of() {
        return new AmountImpl();
    }

    /**
     * factory method to create a shallow copy Amount
     * @param template instance to be copied
     * @return copy instance
     */
    public static Amount of(final Amount template) {
        AmountImpl instance = new AmountImpl();
        instance.setCentAmount(template.getCentAmount());
        instance.setCurrencyCode(template.getCurrencyCode());
        return instance;
    }

    public Amount copyDeep();

    /**
     * factory method to create a deep copy of Amount
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static Amount deepCopy(@Nullable final Amount template) {
        if (template == null) {
            return null;
        }
        AmountImpl instance = new AmountImpl();
        instance.setCentAmount(template.getCentAmount());
        instance.setCurrencyCode(template.getCurrencyCode());
        return instance;
    }

    /**
     * builder factory method for Amount
     * @return builder
     */
    public static AmountBuilder builder() {
        return AmountBuilder.of();
    }

    /**
     * create builder for Amount instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AmountBuilder builder(final Amount template) {
        return AmountBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAmount(Function<Amount, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<Amount> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<Amount>() {
            @Override
            public String toString() {
                return "TypeReference<Amount>";
            }
        };
    }
}
