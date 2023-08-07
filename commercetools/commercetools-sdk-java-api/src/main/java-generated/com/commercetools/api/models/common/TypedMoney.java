
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
 *  <p>Base polymorphic read-only money type that stores currency in cent precision or high precision, that is in sub-cents.</p>
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TypedMoney typedMoney = TypedMoney.centPrecisionBuilder()
 *             centAmount(0.3)
 *             currencyCode("{currencyCode}")
 *             fractionDigits(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.api.models.common.CentPrecisionMoneyImpl.class, name = CentPrecisionMoney.CENT_PRECISION),
        @JsonSubTypes.Type(value = com.commercetools.api.models.common.HighPrecisionMoneyImpl.class, name = HighPrecisionMoney.HIGH_PRECISION) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", defaultImpl = TypedMoneyImpl.class, visible = true)
@JsonDeserialize(as = TypedMoneyImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface TypedMoney extends Money {

    /**
     *  <p>Type of money used.</p>
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public MoneyType getType();

    /**
     *  <p>Number of digits after the decimal separator.</p>
     *  <ul>
     *   <li>For CentPrecisionMoney, it is equal to the default number of fraction digits for a currency.</li>
     *   <li>For HighPrecisionMoney, it is greater than the default number of fraction digits for a currency.</li>
     *  </ul>
     * @return fractionDigits
     */
    @NotNull
    @JsonProperty("fractionDigits")
    public Integer getFractionDigits();

    /**
     *  <p>Number of digits after the decimal separator.</p>
     *  <ul>
     *   <li>For CentPrecisionMoney, it is equal to the default number of fraction digits for a currency.</li>
     *   <li>For HighPrecisionMoney, it is greater than the default number of fraction digits for a currency.</li>
     *  </ul>
     * @param fractionDigits value to be set
     */

    public void setFractionDigits(final Integer fractionDigits);

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
        if (template instanceof com.commercetools.api.models.common.CentPrecisionMoney) {
            return com.commercetools.api.models.common.CentPrecisionMoney
                    .deepCopy((com.commercetools.api.models.common.CentPrecisionMoney) template);
        }
        if (template instanceof com.commercetools.api.models.common.HighPrecisionMoney) {
            return com.commercetools.api.models.common.HighPrecisionMoney
                    .deepCopy((com.commercetools.api.models.common.HighPrecisionMoney) template);
        }
        TypedMoneyImpl instance = new TypedMoneyImpl();
        instance.setCentAmount(template.getCentAmount());
        instance.setCurrencyCode(template.getCurrencyCode());
        instance.setFractionDigits(template.getFractionDigits());
        return instance;
    }

    /**
     * builder for centPrecision subtype
     * @return builder
     */
    public static com.commercetools.api.models.common.CentPrecisionMoneyBuilder centPrecisionBuilder() {
        return com.commercetools.api.models.common.CentPrecisionMoneyBuilder.of();
    }

    /**
     * builder for highPrecision subtype
     * @return builder
     */
    public static com.commercetools.api.models.common.HighPrecisionMoneyBuilder highPrecisionBuilder() {
        return com.commercetools.api.models.common.HighPrecisionMoneyBuilder.of();
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

    @Override
    default javax.money.MonetaryOperator createMoneyOperator() {
        return MoneyUtil::of;
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
