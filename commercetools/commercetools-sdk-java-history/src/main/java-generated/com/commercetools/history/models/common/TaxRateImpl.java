
package com.commercetools.history.models.common;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
*  <p>Shape of the value for <code>addTaxRate</code> and <code>removeTaxRate</code> actions</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class TaxRateImpl implements TaxRate {

    private String id;

    private String name;

    private Integer amount;

    private Boolean includedInPrice;

    private String country;

    private String state;

    private java.util.List<com.commercetools.history.models.common.SubRate> subRates;

    @JsonCreator
    TaxRateImpl(@JsonProperty("id") final String id, @JsonProperty("name") final String name,
            @JsonProperty("amount") final Integer amount,
            @JsonProperty("includedInPrice") final Boolean includedInPrice,
            @JsonProperty("country") final String country, @JsonProperty("state") final String state,
            @JsonProperty("subRates") final java.util.List<com.commercetools.history.models.common.SubRate> subRates) {
        this.id = id;
        this.name = name;
        this.amount = amount;
        this.includedInPrice = includedInPrice;
        this.country = country;
        this.state = state;
        this.subRates = subRates;
    }

    public TaxRateImpl() {
    }

    /**
    *  <p>The ID is always set if the tax rate is part of a TaxCategory. The external tax rates in a Cart do not contain an <code>id</code>.</p>
    */
    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    /**
    *  <p>Percentage in the range of [0..1]. The sum of the amounts of all <code>subRates</code>, if there are any.</p>
    */
    public Integer getAmount() {
        return this.amount;
    }

    public Boolean getIncludedInPrice() {
        return this.includedInPrice;
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

    public java.util.List<com.commercetools.history.models.common.SubRate> getSubRates() {
        return this.subRates;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setAmount(final Integer amount) {
        this.amount = amount;
    }

    public void setIncludedInPrice(final Boolean includedInPrice) {
        this.includedInPrice = includedInPrice;
    }

    public void setCountry(final String country) {
        this.country = country;
    }

    public void setState(final String state) {
        this.state = state;
    }

    public void setSubRates(final com.commercetools.history.models.common.SubRate... subRates) {
        this.subRates = new ArrayList<>(Arrays.asList(subRates));
    }

    public void setSubRates(final java.util.List<com.commercetools.history.models.common.SubRate> subRates) {
        this.subRates = subRates;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        TaxRateImpl that = (TaxRateImpl) o;

        return new EqualsBuilder().append(id, that.id)
                .append(name, that.name)
                .append(amount, that.amount)
                .append(includedInPrice, that.includedInPrice)
                .append(country, that.country)
                .append(state, that.state)
                .append(subRates, that.subRates)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(id)
                .append(name)
                .append(amount)
                .append(includedInPrice)
                .append(country)
                .append(state)
                .append(subRates)
                .toHashCode();
    }

}
