
package com.commercetools.importapi.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

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
@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.common.HighPrecisionMoneyImpl.class, name = HighPrecisionMoney.HIGH_PRECISION),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.common.MoneyImpl.class, name = Money.CENT_PRECISION) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", defaultImpl = TypedMoneyImpl.class, visible = true)
@JsonDeserialize(as = TypedMoneyImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface TypedMoney {

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public MoneyType getType();

    /**
     *
     * @return fractionDigits
     */

    @JsonProperty("fractionDigits")
    public Integer getFractionDigits();

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
     * set fractionDigits
     * @param fractionDigits value to be set
     */

    public void setFractionDigits(final Integer fractionDigits);

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
