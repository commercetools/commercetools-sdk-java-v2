
package com.commercetools.history.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Shape of the value for <code>addTaxRate</code> and <code>removeTaxRate</code> actions</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TaxRate taxRate = TaxRate.builder()
 *             .id("{id}")
 *             .name("{name}")
 *             .amount(1)
 *             .includedInPrice(true)
 *             .country("{country}")
 *             .state("{state}")
 *             .plusSubRates(subRatesBuilder -> subRatesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = TaxRateImpl.class)
public interface TaxRate {

    /**
     *  <p>The ID is always set if the tax rate is part of a TaxCategory. The external tax rates in a Cart do not contain an <code>id</code>.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p>Percentage in the range of [0..1]. The sum of the amounts of all <code>subRates</code>, if there are any.</p>
     * @return amount
     */
    @NotNull
    @JsonProperty("amount")
    public Integer getAmount();

    /**
     *
     * @return includedInPrice
     */
    @NotNull
    @JsonProperty("includedInPrice")
    public Boolean getIncludedInPrice();

    /**
     *  <p>Two-digit country code as per <span>ISO 3166-1 alpha-2</span>.</p>
     * @return country
     */
    @NotNull
    @JsonProperty("country")
    public String getCountry();

    /**
     *  <p>The state in the country</p>
     * @return state
     */
    @NotNull
    @JsonProperty("state")
    public String getState();

    /**
     *
     * @return subRates
     */
    @NotNull
    @Valid
    @JsonProperty("subRates")
    public List<SubRate> getSubRates();

    /**
     *  <p>The ID is always set if the tax rate is part of a TaxCategory. The external tax rates in a Cart do not contain an <code>id</code>.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     * set name
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     *  <p>Percentage in the range of [0..1]. The sum of the amounts of all <code>subRates</code>, if there are any.</p>
     * @param amount value to be set
     */

    public void setAmount(final Integer amount);

    /**
     * set includedInPrice
     * @param includedInPrice value to be set
     */

    public void setIncludedInPrice(final Boolean includedInPrice);

    /**
     *  <p>Two-digit country code as per <span>ISO 3166-1 alpha-2</span>.</p>
     * @param country value to be set
     */

    public void setCountry(final String country);

    /**
     *  <p>The state in the country</p>
     * @param state value to be set
     */

    public void setState(final String state);

    /**
     * set subRates
     * @param subRates values to be set
     */

    @JsonIgnore
    public void setSubRates(final SubRate... subRates);

    /**
     * set subRates
     * @param subRates values to be set
     */

    public void setSubRates(final List<SubRate> subRates);

    /**
     * factory method
     * @return instance of TaxRate
     */
    public static TaxRate of() {
        return new TaxRateImpl();
    }

    /**
     * factory method to create a shallow copy TaxRate
     * @param template instance to be copied
     * @return copy instance
     */
    public static TaxRate of(final TaxRate template) {
        TaxRateImpl instance = new TaxRateImpl();
        instance.setId(template.getId());
        instance.setName(template.getName());
        instance.setAmount(template.getAmount());
        instance.setIncludedInPrice(template.getIncludedInPrice());
        instance.setCountry(template.getCountry());
        instance.setState(template.getState());
        instance.setSubRates(template.getSubRates());
        return instance;
    }

    public TaxRate copyDeep();

    /**
     * factory method to create a deep copy of TaxRate
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static TaxRate deepCopy(@Nullable final TaxRate template) {
        if (template == null) {
            return null;
        }
        TaxRateImpl instance = new TaxRateImpl();
        instance.setId(template.getId());
        instance.setName(template.getName());
        instance.setAmount(template.getAmount());
        instance.setIncludedInPrice(template.getIncludedInPrice());
        instance.setCountry(template.getCountry());
        instance.setState(template.getState());
        instance.setSubRates(Optional.ofNullable(template.getSubRates())
                .map(t -> t.stream()
                        .map(com.commercetools.history.models.common.SubRate::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for TaxRate
     * @return builder
     */
    public static TaxRateBuilder builder() {
        return TaxRateBuilder.of();
    }

    /**
     * create builder for TaxRate instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TaxRateBuilder builder(final TaxRate template) {
        return TaxRateBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withTaxRate(Function<TaxRate, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<TaxRate> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<TaxRate>() {
            @Override
            public String toString() {
                return "TypeReference<TaxRate>";
            }
        };
    }
}
