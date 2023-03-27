
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

/**
 *  <p>Controls calculation of taxed prices for Line Items, Custom Line Items, and Shipping Methods as explained in Cart tax calculation.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ExternalTaxRateDraftImpl implements ExternalTaxRateDraft, ModelBase {

    private String name;

    private Double amount;

    private Boolean includedInPrice;

    private String country;

    private String state;

    private java.util.List<com.commercetools.api.models.tax_category.SubRate> subRates;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ExternalTaxRateDraftImpl(@JsonProperty("name") final String name, @JsonProperty("amount") final Double amount,
            @JsonProperty("includedInPrice") final Boolean includedInPrice,
            @JsonProperty("country") final String country, @JsonProperty("state") final String state,
            @JsonProperty("subRates") final java.util.List<com.commercetools.api.models.tax_category.SubRate> subRates) {
        this.name = name;
        this.amount = amount;
        this.includedInPrice = includedInPrice;
        this.country = country;
        this.state = state;
        this.subRates = subRates;
    }

    /**
     * create empty instance
     */
    public ExternalTaxRateDraftImpl() {
    }

    /**
     *  <p>Name of the Tax Rate.</p>
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p>Percentage in the range of 0-1.</p>
     *  <ul>
     *   <li>If no <code>subRates</code> are specified, a value must be defined.</li>
     *   <li>If <code>subRates</code> are specified, this can be omitted or its value must be the sum of all <code>subRates</code> amounts.</li>
     *  </ul>
     */

    public Double getAmount() {
        return this.amount;
    }

    /**
     *  <ul>
     *   <li>If set to <code>false</code>, the related price is considered the net price and the provided <code>amount</code> is applied to calculate the gross price.</li>
     *   <li>If set to <code>true</code>, the related price is considered the gross price, and the provided <code>amount</code> is applied to calculate the net price.</li>
     *  </ul>
     */

    public Boolean getIncludedInPrice() {
        return this.includedInPrice;
    }

    /**
     *  <p>Country for which the tax applies.</p>
     */

    public String getCountry() {
        return this.country;
    }

    /**
     *  <p>State within the specified country.</p>
     */

    public String getState() {
        return this.state;
    }

    /**
     *  <p>For countries (such as the US) where the total tax is a combination of multiple taxes (such as state and local taxes).</p>
     */

    public java.util.List<com.commercetools.api.models.tax_category.SubRate> getSubRates() {
        return this.subRates;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setAmount(final Double amount) {
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

    public void setSubRates(final com.commercetools.api.models.tax_category.SubRate... subRates) {
        this.subRates = new ArrayList<>(Arrays.asList(subRates));
    }

    public void setSubRates(final java.util.List<com.commercetools.api.models.tax_category.SubRate> subRates) {
        this.subRates = subRates;
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
                .append(includedInPrice, that.includedInPrice)
                .append(country, that.country)
                .append(state, that.state)
                .append(subRates, that.subRates)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(name)
                .append(amount)
                .append(includedInPrice)
                .append(country)
                .append(state)
                .append(subRates)
                .toHashCode();
    }

}
