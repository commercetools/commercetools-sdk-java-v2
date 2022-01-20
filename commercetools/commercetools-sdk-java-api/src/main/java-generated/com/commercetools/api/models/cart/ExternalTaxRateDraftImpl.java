
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ExternalTaxRateDraftImpl implements ExternalTaxRateDraft, ModelBase {

    private String name;

    private Double amount;

    private String country;

    private String state;

    private java.util.List<com.commercetools.api.models.tax_category.SubRate> subRates;

    private Boolean includedInPrice;

    @JsonCreator
    ExternalTaxRateDraftImpl(@JsonProperty("name") final String name, @JsonProperty("amount") final Double amount,
            @JsonProperty("country") final String country, @JsonProperty("state") final String state,
            @JsonProperty("subRates") final java.util.List<com.commercetools.api.models.tax_category.SubRate> subRates,
            @JsonProperty("includedInPrice") final Boolean includedInPrice) {
        this.name = name;
        this.amount = amount;
        this.country = country;
        this.state = state;
        this.subRates = subRates;
        this.includedInPrice = includedInPrice;
    }

    public ExternalTaxRateDraftImpl() {
    }

    public String getName() {
        return this.name;
    }

    /**
    *  <p>Percentage in the range of [0..1].
    *  Must be supplied if no <code>subRates</code> are specified.
    *  If <code>subRates</code> are specified
    *  then the <code>amount</code> can be omitted or it must be the sum of the amounts of all <code>subRates</code>.</p>
    */
    public Double getAmount() {
        return this.amount;
    }

    /**
    *  <p>A two-digit country code as per <a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>.</p>
    */
    public String getCountry() {
        return this.country;
    }

    /**
    *  <p>The state in the country</p>
    */
    public String getState() {
        return this.state;
    }

    /**
    *  <p>For countries (e.g.
    *  the US) where the total tax is a combination of multiple taxes (e.g.
    *  state and local taxes).</p>
    */
    public java.util.List<com.commercetools.api.models.tax_category.SubRate> getSubRates() {
        return this.subRates;
    }

    /**
    *  <p>The default value for <code>includedInPrice</code> is FALSE.</p>
    */
    public Boolean getIncludedInPrice() {
        return this.includedInPrice;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setAmount(final Double amount) {
        this.amount = amount;
    }

    public void setCountry(final String country) {
        this.country = country;
    }

    public void setState(final String state) {
        this.state = state;
    }

    public void setSubRates(final com.commercetools.api.models.tax_category.SubRate... subRates) {
        this.subRates = new ArrayList<>(Arrays.asList(subRates));
    }

    public void setSubRates(final java.util.List<com.commercetools.api.models.tax_category.SubRate> subRates) {
        this.subRates = subRates;
    }

    public void setIncludedInPrice(final Boolean includedInPrice) {
        this.includedInPrice = includedInPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ExternalTaxRateDraftImpl that = (ExternalTaxRateDraftImpl) o;

        return new EqualsBuilder().append(name, that.name)
                .append(amount, that.amount)
                .append(country, that.country)
                .append(state, that.state)
                .append(subRates, that.subRates)
                .append(includedInPrice, that.includedInPrice)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(name)
                .append(amount)
                .append(country)
                .append(state)
                .append(subRates)
                .append(includedInPrice)
                .toHashCode();
    }

}
