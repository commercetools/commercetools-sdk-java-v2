
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.CentPrecisionMoney;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>The tax portions are calculated from the TaxRates. If a Tax Rate has SubRates, they are used and can be identified by name. Tax portions from Line Items with the same <code>rate</code> and <code>name</code> are accumulated to the same tax portion.</p>
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
     *  <p>Name of the tax portion.</p>
     * @return name
     */

    @JsonProperty("name")
    public String getName();

    /**
     *  <p>A number in the range 0-1.</p>
     * @return rate
     */
    @NotNull
    @JsonProperty("rate")
    public Double getRate();

    /**
     *  <p>Money value of the tax portion.</p>
     * @return amount
     */
    @NotNull
    @Valid
    @JsonProperty("amount")
    public CentPrecisionMoney getAmount();

    /**
     *  <p>Name of the tax portion.</p>
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     *  <p>A number in the range 0-1.</p>
     * @param rate value to be set
     */

    public void setRate(final Double rate);

    /**
     *  <p>Money value of the tax portion.</p>
     * @param amount value to be set
     */

    public void setAmount(final CentPrecisionMoney amount);

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

    public TaxPortion copyDeep();

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
        instance.setAmount(com.commercetools.api.models.common.CentPrecisionMoney.deepCopy(template.getAmount()));
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
