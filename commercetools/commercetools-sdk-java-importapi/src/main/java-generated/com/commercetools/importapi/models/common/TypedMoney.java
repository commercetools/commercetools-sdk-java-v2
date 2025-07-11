
package com.commercetools.importapi.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 * TypedMoney
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TypedMoney typedMoney = TypedMoney.highPrecisionBuilder()
 *             centAmount(0.3)
 *             currencyCode("{currencyCode}")
 *             preciseAmount(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", defaultImpl = TypedMoneyImpl.class, visible = true)
@JsonDeserialize(as = TypedMoneyImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface TypedMoney {

    /**
     *  <p>The type of money. The <code>centPrecision</code> type is used for currencies with minor units, such as EUR and USD. The <code>highPrecision</code> type is used for currencies without minor units, such as JPY.</p>
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public MoneyType getType();

    /**
     *  <p>The number of fraction digits of the money value. This is used to determine how many digits are after the decimal point. For example, for EUR and USD, this is <code>2</code>, and for JPY, this is <code>0</code>.</p>
     * @return fractionDigits
     */

    @JsonProperty("fractionDigits")
    public Integer getFractionDigits();

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
    public Long getCentAmount();

    /**
     *  <p>The currency code compliant to ISO 4217.</p>
     * @return currencyCode
     */
    @NotNull
    @JsonProperty("currencyCode")
    public String getCurrencyCode();

    /**
     *  <p>The number of fraction digits of the money value. This is used to determine how many digits are after the decimal point. For example, for EUR and USD, this is <code>2</code>, and for JPY, this is <code>0</code>.</p>
     * @param fractionDigits value to be set
     */

    public void setFractionDigits(final Integer fractionDigits);

    /**
     *  <p>Amount in the smallest indivisible unit of a currency, such as:</p>
     *  <ul>
     *   <li>Cents for EUR and USD, pence for GBP, or centime for CHF (5 CHF is specified as <code>500</code>).</li>
     *   <li>The value in the major unit for currencies without minor units, like JPY (5 JPY is specified as <code>5</code>).</li>
     *  </ul>
     * @param centAmount value to be set
     */

    public void setCentAmount(final Long centAmount);

    /**
     *  <p>The currency code compliant to ISO 4217.</p>
     * @param currencyCode value to be set
     */

    public void setCurrencyCode(final String currencyCode);

    public TypedMoney copyDeep();

    /**
     * factory method to create a deep copy of TypedMoney
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static TypedMoney deepCopy(@Nullable final TypedMoney template) {
        if (template == null) {
            return null;
        }

        if (!(template instanceof TypedMoneyImpl)) {
            return template.copyDeep();
        }
        TypedMoneyImpl instance = new TypedMoneyImpl();
        instance.setFractionDigits(template.getFractionDigits());
        instance.setCentAmount(template.getCentAmount());
        instance.setCurrencyCode(template.getCurrencyCode());
        return instance;
    }

    /**
     * builder for highPrecision subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.common.HighPrecisionMoneyBuilder highPrecisionBuilder() {
        return com.commercetools.importapi.models.common.HighPrecisionMoneyBuilder.of();
    }

    /**
     * builder for centPrecision subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.common.MoneyBuilder centPrecisionBuilder() {
        return com.commercetools.importapi.models.common.MoneyBuilder.of();
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withTypedMoney(Function<TypedMoney, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<TypedMoney> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<TypedMoney>() {
            @Override
            public String toString() {
                return "TypeReference<TypedMoney>";
            }
        };
    }
}
