
package com.commercetools.api.models.tax_category;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = TaxRateImpl.class)
public interface TaxRate {

    /**
    *  <p>Present if the TaxRate is part of a <a href="ctp:api:type:TaxCategory">TaxCategory</a>.
    *  Absent for external TaxRates in <a href="ctp:api:type:LineItem">LineItem</a>, <a href="ctp:api:type:CustomLineItem">CustomLineItem</a>, and <a href="ctp:api:type:ShippingInfo">ShippingInfo</a>.</p>
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
    *  <p>If <code>true</code>, tax is included in <a href="ctp:api:type:Price">Prices</a> and the <code>taxedPrice</code> is present on <a href="ctp:api:type:LineItem">LineItems</a>. In this case, the platform calculates the <code>totalNet</code> price based on the TaxRate.</p>
    */
    @NotNull
    @JsonProperty("includedInPrice")
    public Boolean getIncludedInPrice();

    /**
    *  <p>Country in which the tax rate is applied in <a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a> format.</p>
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
    *  <p>Used to calculate the <a href="/../api/projects/carts#taxedprice">taxPortions</a> field in a Cart or Order. It is useful if the total tax of a country (such as the US) is a combination of multiple taxes (such as state and local taxes).</p>
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
