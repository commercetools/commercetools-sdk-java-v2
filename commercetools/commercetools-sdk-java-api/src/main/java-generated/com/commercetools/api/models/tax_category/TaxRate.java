
package com.commercetools.api.models.tax_category;

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
 * TaxRate
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TaxRate taxRate = TaxRate.builder()
 *             .name("{name}")
 *             .amount(0.3)
 *             .includedInPrice(true)
 *             .country("{country}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = TaxRateImpl.class)
public interface TaxRate {

    /**
     *  <p>Present if the TaxRate is part of a TaxCategory. Absent for external TaxRates in LineItem, CustomLineItem, and ShippingInfo.</p>
     * @return id
     */

    @JsonProperty("id")
    public String getId();

    /**
     *  <p>User-defined unique identifier of the TaxRate. Present when set using TaxRateDraft. Not available for external TaxRates created using ExternalTaxRateDraft.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Name of the TaxRate.</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p>Tax rate. If subrates are used, the amount is the sum of all rates in <code>subRates</code>.</p>
     * @return amount
     */
    @NotNull
    @JsonProperty("amount")
    public Double getAmount();

    /**
     *  <p>If <code>true</code>, tax is included in Embedded Prices or Standalone Prices, and the <code>taxedPrice</code> is present on LineItems. In this case, the <code>totalNet</code> price on TaxedPrice includes the TaxRate.</p>
     * @return includedInPrice
     */
    @NotNull
    @JsonProperty("includedInPrice")
    public Boolean getIncludedInPrice();

    /**
     *  <p>Country in which the tax rate is applied in ISO 3166-1 alpha-2 format.</p>
     * @return country
     */
    @NotNull
    @JsonProperty("country")
    public String getCountry();

    /**
     *  <p>State within the country, such as Texas in the United States.</p>
     * @return state
     */

    @JsonProperty("state")
    public String getState();

    /**
     *  <p>Used to calculate the taxPortions field in a Cart or Order. It is useful if the total tax of a country (such as the US) is a combination of multiple taxes (such as state and local taxes). The total of all subrates equals the TaxRate <code>amount</code>.</p>
     * @return subRates
     */
    @Valid
    @JsonProperty("subRates")
    public List<SubRate> getSubRates();

    /**
     *  <p>Present if the TaxRate is part of a TaxCategory. Absent for external TaxRates in LineItem, CustomLineItem, and ShippingInfo.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     *  <p>User-defined unique identifier of the TaxRate. Present when set using TaxRateDraft. Not available for external TaxRates created using ExternalTaxRateDraft.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p>Name of the TaxRate.</p>
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     *  <p>Tax rate. If subrates are used, the amount is the sum of all rates in <code>subRates</code>.</p>
     * @param amount value to be set
     */

    public void setAmount(final Double amount);

    /**
     *  <p>If <code>true</code>, tax is included in Embedded Prices or Standalone Prices, and the <code>taxedPrice</code> is present on LineItems. In this case, the <code>totalNet</code> price on TaxedPrice includes the TaxRate.</p>
     * @param includedInPrice value to be set
     */

    public void setIncludedInPrice(final Boolean includedInPrice);

    /**
     *  <p>Country in which the tax rate is applied in ISO 3166-1 alpha-2 format.</p>
     * @param country value to be set
     */

    public void setCountry(final String country);

    /**
     *  <p>State within the country, such as Texas in the United States.</p>
     * @param state value to be set
     */

    public void setState(final String state);

    /**
     *  <p>Used to calculate the taxPortions field in a Cart or Order. It is useful if the total tax of a country (such as the US) is a combination of multiple taxes (such as state and local taxes). The total of all subrates equals the TaxRate <code>amount</code>.</p>
     * @param subRates values to be set
     */

    @JsonIgnore
    public void setSubRates(final SubRate... subRates);

    /**
     *  <p>Used to calculate the taxPortions field in a Cart or Order. It is useful if the total tax of a country (such as the US) is a combination of multiple taxes (such as state and local taxes). The total of all subrates equals the TaxRate <code>amount</code>.</p>
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
        instance.setKey(template.getKey());
        instance.setName(template.getName());
        instance.setAmount(template.getAmount());
        instance.setIncludedInPrice(template.getIncludedInPrice());
        instance.setCountry(template.getCountry());
        instance.setState(template.getState());
        instance.setSubRates(template.getSubRates());
        return instance;
    }

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
        instance.setKey(template.getKey());
        instance.setName(template.getName());
        instance.setAmount(template.getAmount());
        instance.setIncludedInPrice(template.getIncludedInPrice());
        instance.setCountry(template.getCountry());
        instance.setState(template.getState());
        instance.setSubRates(Optional.ofNullable(template.getSubRates())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.tax_category.SubRate::deepCopy)
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
