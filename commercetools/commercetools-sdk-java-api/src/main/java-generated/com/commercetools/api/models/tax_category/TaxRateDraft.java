
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
@JsonDeserialize(as = TaxRateDraftImpl.class)
public interface TaxRateDraft {

    /**
    *  <p>Name of the TaxRate.</p>
    */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
    *  <p>Tax rate.
    *  Must be supplied if no <code>subRates</code> are specified.
    *  If <code>subRates</code> are specified, this field can be omitted or it must be the sum of amounts of all <code>subRates</code>.</p>
    */

    @JsonProperty("amount")
    public Double getAmount();

    /**
    *  <p>Set to <code>true</code>, if tax should be included in <a href="ctp:api:type:Price">Prices</a> and the <code>taxedPrice</code> should be present on <a href="ctp:api:type:LineItem">Line Items</a>. In this case, the platform calculates the <code>totalNet</code> price based on the TaxRate.</p>
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

    public void setName(final String name);

    public void setAmount(final Double amount);

    public void setIncludedInPrice(final Boolean includedInPrice);

    public void setCountry(final String country);

    public void setState(final String state);

    @JsonIgnore
    public void setSubRates(final SubRate... subRates);

    public void setSubRates(final List<SubRate> subRates);

    public static TaxRateDraft of() {
        return new TaxRateDraftImpl();
    }

    public static TaxRateDraft of(final TaxRateDraft template) {
        TaxRateDraftImpl instance = new TaxRateDraftImpl();
        instance.setName(template.getName());
        instance.setAmount(template.getAmount());
        instance.setIncludedInPrice(template.getIncludedInPrice());
        instance.setCountry(template.getCountry());
        instance.setState(template.getState());
        instance.setSubRates(template.getSubRates());
        return instance;
    }

    public static TaxRateDraftBuilder builder() {
        return TaxRateDraftBuilder.of();
    }

    public static TaxRateDraftBuilder builder(final TaxRateDraft template) {
        return TaxRateDraftBuilder.of(template);
    }

    default <T> T withTaxRateDraft(Function<TaxRateDraft, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<TaxRateDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<TaxRateDraft>() {
            @Override
            public String toString() {
                return "TypeReference<TaxRateDraft>";
            }
        };
    }
}
