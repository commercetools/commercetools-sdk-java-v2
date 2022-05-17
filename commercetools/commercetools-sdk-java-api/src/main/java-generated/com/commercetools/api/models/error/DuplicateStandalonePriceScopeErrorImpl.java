
package com.commercetools.api.models.error;

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
public class DuplicateStandalonePriceScopeErrorImpl implements DuplicateStandalonePriceScopeError, ModelBase {

    private String code;

    private String message;

    private Map<String, java.lang.Object> values;

    private com.commercetools.api.models.standalone_price.StandalonePriceReference conflictingStandalonePrice;

    private String sku;

    private String currency;

    private String country;

    private com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier customerGroup;

    private com.commercetools.api.models.channel.ChannelResourceIdentifier channel;

    private java.time.ZonedDateTime validFrom;

    private java.time.ZonedDateTime validUntil;

    @JsonCreator
    DuplicateStandalonePriceScopeErrorImpl(@JsonProperty("message") final String message,
            @JsonProperty("values") final Map<String, java.lang.Object> values,
            @JsonProperty("conflictingStandalonePrice") final com.commercetools.api.models.standalone_price.StandalonePriceReference conflictingStandalonePrice,
            @JsonProperty("sku") final String sku, @JsonProperty("currency") final String currency,
            @JsonProperty("country") final String country,
            @JsonProperty("customerGroup") final com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier customerGroup,
            @JsonProperty("channel") final com.commercetools.api.models.channel.ChannelResourceIdentifier channel,
            @JsonProperty("validFrom") final java.time.ZonedDateTime validFrom,
            @JsonProperty("validUntil") final java.time.ZonedDateTime validUntil) {
        this.message = message;
        this.values = values;
        this.conflictingStandalonePrice = conflictingStandalonePrice;
        this.sku = sku;
        this.currency = currency;
        this.country = country;
        this.customerGroup = customerGroup;
        this.channel = channel;
        this.validFrom = validFrom;
        this.validUntil = validUntil;
        this.code = DUPLICATE_STANDALONE_PRICE_SCOPE;
    }

    public DuplicateStandalonePriceScopeErrorImpl() {
        this.code = DUPLICATE_STANDALONE_PRICE_SCOPE;
    }

    public String getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    public Map<String, java.lang.Object> values() {
        return values;
    }

    /**
    *  <p><a href="/../api/types#reference">Reference</a> to a <a href="ctp:api:type:StandalonePrice">StandalonePrice</a>.</p>
    */
    public com.commercetools.api.models.standalone_price.StandalonePriceReference getConflictingStandalonePrice() {
        return this.conflictingStandalonePrice;
    }

    public String getSku() {
        return this.sku;
    }

    public String getCurrency() {
        return this.currency;
    }

    public String getCountry() {
        return this.country;
    }

    /**
    *  <p><a href="ctp:api:type:ResourceIdentifier">ResourceIdentifier</a> to a <a href="ctp:api:type:CustomerGroup">CustomerGroup</a>.</p>
    */
    public com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier getCustomerGroup() {
        return this.customerGroup;
    }

    /**
    *  <p><a href="ctp:api:type:ResourceIdentifier">ResourceIdentifier</a> to a <a href="ctp:api:type:Channel">Channel</a>.</p>
    */
    public com.commercetools.api.models.channel.ChannelResourceIdentifier getChannel() {
        return this.channel;
    }

    public java.time.ZonedDateTime getValidFrom() {
        return this.validFrom;
    }

    public java.time.ZonedDateTime getValidUntil() {
        return this.validUntil;
    }

    public void setMessage(final String message) {
        this.message = message;
    }

    public void setValue(String key, java.lang.Object value) {
        if (values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
    }

    public void setConflictingStandalonePrice(
            final com.commercetools.api.models.standalone_price.StandalonePriceReference conflictingStandalonePrice) {
        this.conflictingStandalonePrice = conflictingStandalonePrice;
    }

    public void setSku(final String sku) {
        this.sku = sku;
    }

    public void setCurrency(final String currency) {
        this.currency = currency;
    }

    public void setCountry(final String country) {
        this.country = country;
    }

    public void setCustomerGroup(
            final com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier customerGroup) {
        this.customerGroup = customerGroup;
    }

    public void setChannel(final com.commercetools.api.models.channel.ChannelResourceIdentifier channel) {
        this.channel = channel;
    }

    public void setValidFrom(final java.time.ZonedDateTime validFrom) {
        this.validFrom = validFrom;
    }

    public void setValidUntil(final java.time.ZonedDateTime validUntil) {
        this.validUntil = validUntil;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        DuplicateStandalonePriceScopeErrorImpl that = (DuplicateStandalonePriceScopeErrorImpl) o;

        return new EqualsBuilder().append(code, that.code)
                .append(message, that.message)
                .append(values, that.values)
                .append(conflictingStandalonePrice, that.conflictingStandalonePrice)
                .append(sku, that.sku)
                .append(currency, that.currency)
                .append(country, that.country)
                .append(customerGroup, that.customerGroup)
                .append(channel, that.channel)
                .append(validFrom, that.validFrom)
                .append(validUntil, that.validUntil)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(code)
                .append(message)
                .append(values)
                .append(conflictingStandalonePrice)
                .append(sku)
                .append(currency)
                .append(country)
                .append(customerGroup)
                .append(channel)
                .append(validFrom)
                .append(validUntil)
                .toHashCode();
    }

}
