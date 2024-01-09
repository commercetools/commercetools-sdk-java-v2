
package com.commercetools.api.models.tax_category;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * TaxRateDraft
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class TaxRateDraftImpl implements TaxRateDraft, ModelBase {

    private String name;

    private Double amount;

    private Boolean includedInPrice;

    private String country;

    private String state;

    private java.util.List<com.commercetools.api.models.tax_category.SubRate> subRates;

    private String key;

    /**
     * create instance with all properties
     */
    @JsonCreator
    TaxRateDraftImpl(@JsonProperty("name") final String name, @JsonProperty("amount") final Double amount,
            @JsonProperty("includedInPrice") final Boolean includedInPrice,
            @JsonProperty("country") final String country, @JsonProperty("state") final String state,
            @JsonProperty("subRates") final java.util.List<com.commercetools.api.models.tax_category.SubRate> subRates,
            @JsonProperty("key") final String key) {
        this.name = name;
        this.amount = amount;
        this.includedInPrice = includedInPrice;
        this.country = country;
        this.state = state;
        this.subRates = subRates;
        this.key = key;
    }

    /**
     * create empty instance
     */
    public TaxRateDraftImpl() {
    }

    /**
     *  <p>Name of the TaxRate.</p>
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p>Tax rate. Must be supplied if no <code>subRates</code> are specified. If <code>subRates</code> are specified, this field can be omitted or it must be the sum of amounts of all <code>subRates</code>.</p>
     */

    public Double getAmount() {
        return this.amount;
    }

    /**
     *  <p>If <code>true</code>, tax is included in Embedded Prices or Standalone Prices, and the <code>taxedPrice</code> is present on LineItems. In this case, the <code>totalNet</code> price on TaxedPrice includes the TaxRate.</p>
     */

    public Boolean getIncludedInPrice() {
        return this.includedInPrice;
    }

    /**
     *  <p>Country in which the tax rate is applied in ISO 3166-1 alpha-2 format.</p>
     */

    public String getCountry() {
        return this.country;
    }

    /**
     *  <p>State within the country, such as Texas in the United States.</p>
     */

    public String getState() {
        return this.state;
    }

    /**
     *  <p>Used to calculate the taxPortions field in a Cart or Order. It is useful if the total tax of a country (such as the US) is a combination of multiple taxes (such as state and local taxes). The total of all subrates must equal the TaxRate <code>amount</code>.</p>
     */

    public java.util.List<com.commercetools.api.models.tax_category.SubRate> getSubRates() {
        return this.subRates;
    }

    /**
     *  <p>User-defined unique identifier of the TaxRate.</p>
     */

    public String getKey() {
        return this.key;
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

    public void setKey(final String key) {
        this.key = key;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        TaxRateDraftImpl that = (TaxRateDraftImpl) o;

        return new EqualsBuilder().append(name, that.name)
                .append(amount, that.amount)
                .append(includedInPrice, that.includedInPrice)
                .append(country, that.country)
                .append(state, that.state)
                .append(subRates, that.subRates)
                .append(key, that.key)
                .append(name, that.name)
                .append(amount, that.amount)
                .append(includedInPrice, that.includedInPrice)
                .append(country, that.country)
                .append(state, that.state)
                .append(subRates, that.subRates)
                .append(key, that.key)
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
                .append(key)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("name", name)
                .append("amount", amount)
                .append("includedInPrice", includedInPrice)
                .append("country", country)
                .append("state", state)
                .append("subRates", subRates)
                .append("key", key)
                .build();
    }

}
