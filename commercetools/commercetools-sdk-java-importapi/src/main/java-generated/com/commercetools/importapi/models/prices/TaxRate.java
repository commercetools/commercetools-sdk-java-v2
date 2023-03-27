
package com.commercetools.importapi.models.prices;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

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
     *
     * @return id
     */

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
     *
     * @return amount
     */
    @NotNull
    @JsonProperty("amount")
    public Double getAmount();

    /**
     *
     * @return includedInPrice
     */
    @NotNull
    @JsonProperty("includedInPrice")
    public Boolean getIncludedInPrice();

    /**
     *  <p>A two-digit country code as per ISO 3166-1 alpha-2.</p>
     * @return country
     */
    @NotNull
    @JsonProperty("country")
    public String getCountry();

    /**
     *
     * @return state
     */

    @JsonProperty("state")
    public String getState();

    /**
     *
     * @return subRates
     */
    @Valid
    @JsonProperty("subRates")
    public List<SubRate> getSubRates();

    /**
     * set id
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     * set name
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     * set amount
     * @param amount value to be set
     */

    public void setAmount(final Double amount);

    /**
     * set includedInPrice
     * @param includedInPrice value to be set
     */

    public void setIncludedInPrice(final Boolean includedInPrice);

    /**
     *  <p>A two-digit country code as per ISO 3166-1 alpha-2.</p>
     * @param country value to be set
     */

    public void setCountry(final String country);

    /**
     * set state
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
     * factory method to copy an instance of TaxRate
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
