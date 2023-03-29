
package com.commercetools.importapi.models.orders;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.importapi.models.common.TypedMoney;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * TaxPortion
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TaxPortion taxPortion = TaxPortion.builder()
 *             .rate(0.3)
 *             .amount(amountBuilder -> amountBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = TaxPortionImpl.class)
public interface TaxPortion {

    /**
     *
     * @return name
     */

    @JsonProperty("name")
    public String getName();

    /**
     *
     * @return rate
     */
    @NotNull
    @JsonProperty("rate")
    public Double getRate();

    /**
     *
     * @return amount
     */
    @NotNull
    @Valid
    @JsonProperty("amount")
    public TypedMoney getAmount();

    /**
     * set name
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     * set rate
     * @param rate value to be set
     */

    public void setRate(final Double rate);

    /**
     * set amount
     * @param amount value to be set
     */

    public void setAmount(final TypedMoney amount);

    /**
     * factory method
     * @return instance of TaxPortion
     */
    public static TaxPortion of() {
        return new TaxPortionImpl();
    }

    /**
     * factory method to create a shallow copy TaxPortion
     * @param template instance to be copied
     * @return copy instance
     */
    public static TaxPortion of(final TaxPortion template) {
        TaxPortionImpl instance = new TaxPortionImpl();
        instance.setName(template.getName());
        instance.setRate(template.getRate());
        instance.setAmount(template.getAmount());
        return instance;
    }

    /**
     * factory method to create a deep copy of TaxPortion
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static TaxPortion deepCopy(@Nullable final TaxPortion template) {
        if (template == null) {
            return null;
        }
        TaxPortionImpl instance = new TaxPortionImpl();
        instance.setName(template.getName());
        instance.setRate(template.getRate());
        instance.setAmount(com.commercetools.importapi.models.common.TypedMoney.deepCopy(template.getAmount()));
        return instance;
    }

    /**
     * builder factory method for TaxPortion
     * @return builder
     */
    public static TaxPortionBuilder builder() {
        return TaxPortionBuilder.of();
    }

    /**
     * create builder for TaxPortion instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TaxPortionBuilder builder(final TaxPortion template) {
        return TaxPortionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withTaxPortion(Function<TaxPortion, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<TaxPortion> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<TaxPortion>() {
            @Override
            public String toString() {
                return "TypeReference<TaxPortion>";
            }
        };
    }
}
