
package com.commercetools.importapi.models.orders;

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
 * ExternalTaxRateDraft
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ExternalTaxRateDraftImpl implements ExternalTaxRateDraft, ModelBase {

    private String name;

    private Double amount;

    private String country;

    private String state;

    private java.util.List<com.commercetools.importapi.models.prices.SubRate> subRates;

    private Boolean includedInPrice;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ExternalTaxRateDraftImpl(@JsonProperty("name") final String name, @JsonProperty("amount") final Double amount,
            @JsonProperty("country") final String country, @JsonProperty("state") final String state,
            @JsonProperty("subRates") final java.util.List<com.commercetools.importapi.models.prices.SubRate> subRates,
            @JsonProperty("includedInPrice") final Boolean includedInPrice) {
        this.name = name;
        this.amount = amount;
        this.country = country;
        this.state = state;
        this.subRates = subRates;
        this.includedInPrice = includedInPrice;
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
     *  <p>Used when the total tax is a combination of multiple taxes (for example, local, state/provincial, and/or federal taxes). The total of all subrates must equal the TaxRate <code>amount</code>. These subrates are used to calculate the <code>taxPortions</code> field of a Cart or Order and the <code>taxedPrice</code> field of LineItems, CustomLineItems, and ShippingInfos.</p>
     */

    public java.util.List<com.commercetools.importapi.models.prices.SubRate> getSubRates() {
        return this.subRates;
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

    public void setSubRates(final com.commercetools.importapi.models.prices.SubRate... subRates) {
        this.subRates = new ArrayList<>(Arrays.asList(subRates));
    }

    public void setSubRates(final java.util.List<com.commercetools.importapi.models.prices.SubRate> subRates) {
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
                .append(name, that.name)
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

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("name", name)
                .append("amount", amount)
                .append("country", country)
                .append("state", state)
                .append("subRates", subRates)
                .append("includedInPrice", includedInPrice)
                .build();
    }

    @Override
    public ExternalTaxRateDraft copyDeep() {
        return ExternalTaxRateDraft.deepCopy(this);
    }
}
