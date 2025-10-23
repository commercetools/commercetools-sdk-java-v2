
package com.commercetools.history.models.common;

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
 * TaxRate
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class TaxRateImpl implements TaxRate, ModelBase {

    private String id;

    private String key;

    private String name;

    private Double amount;

    private Boolean includedInPrice;

    private String country;

    private String state;

    private java.util.List<com.commercetools.history.models.common.SubRate> subRates;

    /**
     * create instance with all properties
     */
    @JsonCreator
    TaxRateImpl(@JsonProperty("id") final String id, @JsonProperty("key") final String key,
            @JsonProperty("name") final String name, @JsonProperty("amount") final Double amount,
            @JsonProperty("includedInPrice") final Boolean includedInPrice,
            @JsonProperty("country") final String country, @JsonProperty("state") final String state,
            @JsonProperty("subRates") final java.util.List<com.commercetools.history.models.common.SubRate> subRates) {
        this.id = id;
        this.key = key;
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
    public TaxRateImpl() {
    }

    /**
     *  <p>Present if the TaxRate is part of a <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxCategory" rel="nofollow">TaxCategory</a>. Absent for external TaxRates in <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">CustomLineItem</a>, and <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingInfo" rel="nofollow">ShippingInfo</a>.</p>
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>User-defined unique identifier of the TaxRate. Present when set using <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxRateDraft" rel="nofollow">TaxRateDraft</a>. Not available for external TaxRates created using <a href="https://docs.commercetools.com/apis/ctp:api:type:ExternalTaxRateDraft" rel="nofollow">ExternalTaxRateDraft</a>.</p>
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Name of the TaxRate.</p>
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p>Tax rate. If subrates are used, the amount is the sum of all rates in <code>subRates</code>.</p>
     */

    public Double getAmount() {
        return this.amount;
    }

    /**
     *  <p>If <code>true</code>, tax is included in <a href="https://docs.commercetools.com/apis/ctp:api:type:Price" rel="nofollow">Embedded Prices</a> or <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePrice" rel="nofollow">Standalone Prices</a>, and the <code>taxedPrice</code> is present on <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItems</a>. In this case, the <code>totalNet</code> price on <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxedPrice" rel="nofollow">TaxedPrice</a> includes the TaxRate.</p>
     */

    public Boolean getIncludedInPrice() {
        return this.includedInPrice;
    }

    /**
     *  <p>Country in which the tax rate is applied in <span>ISO 3166-1 alpha-2</span> format.</p>
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
     *  <p>Used when the total tax is a combination of multiple taxes (for example, local, state/provincial, and/or federal taxes). The total of all subrates must equal the TaxRate <code>amount</code>. These subrates are used to calculate the <code>taxPortions</code> field of a <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> or <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Order</a> and the <code>taxedPrice</code> field of <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItems</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">CustomLineItems</a>, and <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingInfo" rel="nofollow">ShippingInfos</a>.</p>
     */

    public java.util.List<com.commercetools.history.models.common.SubRate> getSubRates() {
        return this.subRates;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public void setKey(final String key) {
        this.key = key;
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
                .append(key, that.key)
                .append(name, that.name)
                .append(amount, that.amount)
                .append(includedInPrice, that.includedInPrice)
                .append(country, that.country)
                .append(state, that.state)
                .append(subRates, that.subRates)
                .append(id, that.id)
                .append(key, that.key)
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
                .append(key)
                .append(name)
                .append(amount)
                .append(includedInPrice)
                .append(country)
                .append(state)
                .append(subRates)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("id", id)
                .append("key", key)
                .append("name", name)
                .append("amount", amount)
                .append("includedInPrice", includedInPrice)
                .append("country", country)
                .append("state", state)
                .append("subRates", subRates)
                .build();
    }

    @Override
    public TaxRate copyDeep() {
        return TaxRate.deepCopy(this);
    }
}
