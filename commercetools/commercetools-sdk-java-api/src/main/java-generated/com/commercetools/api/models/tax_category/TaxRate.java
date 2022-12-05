
package com.commercetools.api.models.tax_category;

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
     *  <p>Present if the TaxRate is part of a TaxCategory. Absent for external TaxRates in LineItem, CustomLineItem, and ShippingInfo.</p>
     */

    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Name of the TaxRate.</p>
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p>Tax rate. If subrates are used, the amount must be the sum of all subrates.</p>
     */
    @NotNull
    @JsonProperty("amount")
    public Double getAmount();

    /**
     *  <p>If <code>true</code>, tax is included in Embedded Prices or Standalone Prices, and the <code>taxedPrice</code> is present on LineItems. In this case, the <code>totalNet</code> price on TaxedPrice includes the TaxRate.</p>
     */
    @NotNull
    @JsonProperty("includedInPrice")
    public Boolean getIncludedInPrice();

    /**
     *  <p>Country in which the tax rate is applied in ISO 3166-1 alpha-2 format.</p>
     */
    @NotNull
    @JsonProperty("country")
    public String getCountry();

    /**
     *  <p>State within the country, such as Texas in the United States.</p>
     */

    @JsonProperty("state")
    public String getState();

    /**
     *  <p>Used to calculate the taxPortions field in a Cart or Order. It is useful if the total tax of a country (such as the US) is a combination of multiple taxes (such as state and local taxes).</p>
     */
    @Valid
    @JsonProperty("subRates")
    public List<SubRate> getSubRates();

    public void setId(final String id);

    public void setName(final String name);

    public void setAmount(final Double amount);

    public void setIncludedInPrice(final Boolean includedInPrice);

    public void setCountry(final String country);

    public void setState(final String state);

    @JsonIgnore
    public void setSubRates(final SubRate... subRates);

    public void setSubRates(final List<SubRate> subRates);

    public static TaxRate of() {
        return new TaxRateImpl();
    }

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

    public static TaxRateBuilder builder() {
        return TaxRateBuilder.of();
    }

    public static TaxRateBuilder builder(final TaxRate template) {
        return TaxRateBuilder.of(template);
    }

    default <T> T withTaxRate(Function<TaxRate, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<TaxRate> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<TaxRate>() {
            @Override
            public String toString() {
                return "TypeReference<TaxRate>";
            }
        };
    }
}
