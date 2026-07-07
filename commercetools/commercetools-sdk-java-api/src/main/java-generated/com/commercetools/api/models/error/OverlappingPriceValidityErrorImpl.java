
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import tools.jackson.databind.annotation.*;

/**
 *  <p>Returned when a given Price validity period conflicts with an existing one. Every Price of a Product Variant with the same combination of currency, country, Customer Group, and Channel must have non-overlapping validity periods (<code>validFrom</code> and <code>validUntil</code>).</p>
 *  <p>The error is returned as a failed response to the <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/products:POST" rel="nofollow">Create Product</a> or <span>Update Product</span> request.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OverlappingPriceValidityErrorImpl implements OverlappingPriceValidityError, ModelBase {

    private String code;

    private String message;

    private Map<String, java.lang.Object> values;

    private String conflictingPrice;

    private String currency;

    private String country;

    private com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier customerGroup;

    private com.commercetools.api.models.channel.ChannelResourceIdentifier channel;

    private java.time.ZonedDateTime validFrom;

    private java.time.ZonedDateTime validUntil;

    private java.time.ZonedDateTime conflictingValidFrom;

    private java.time.ZonedDateTime conflictingValidUntil;

    /**
     * create instance with all properties
     */
    @JsonCreator
    OverlappingPriceValidityErrorImpl(@JsonProperty("message") final String message,
            @JsonAnySetter @JsonProperty("values") final Map<String, java.lang.Object> values,
            @JsonProperty("conflictingPrice") final String conflictingPrice,
            @JsonProperty("currency") final String currency, @JsonProperty("country") final String country,
            @JsonProperty("customerGroup") final com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier customerGroup,
            @JsonProperty("channel") final com.commercetools.api.models.channel.ChannelResourceIdentifier channel,
            @JsonProperty("validFrom") final java.time.ZonedDateTime validFrom,
            @JsonProperty("validUntil") final java.time.ZonedDateTime validUntil,
            @JsonProperty("conflictingValidFrom") final java.time.ZonedDateTime conflictingValidFrom,
            @JsonProperty("conflictingValidUntil") final java.time.ZonedDateTime conflictingValidUntil) {
        this.message = message;
        this.values = values;
        this.conflictingPrice = conflictingPrice;
        this.currency = currency;
        this.country = country;
        this.customerGroup = customerGroup;
        this.channel = channel;
        this.validFrom = validFrom;
        this.validUntil = validUntil;
        this.conflictingValidFrom = conflictingValidFrom;
        this.conflictingValidUntil = conflictingValidUntil;
        this.code = OVERLAPPING_PRICE_VALIDITY;
    }

    /**
     * create empty instance
     */
    public OverlappingPriceValidityErrorImpl() {
        this.code = OVERLAPPING_PRICE_VALIDITY;
    }

    /**
     *
     */

    public String getCode() {
        return this.code;
    }

    /**
     *  <p><code>"Two prices have overlapping validity periods."</code></p>
     */

    public String getMessage() {
        return this.message;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     */

    public Map<String, java.lang.Object> values() {
        return values;
    }

    /**
     *  <p>Unique identifier of the conflicting Embedded Price.</p>
     */

    public String getConflictingPrice() {
        return this.conflictingPrice;
    }

    /**
     *  <p>Currency code of the Price.</p>
     */

    public String getCurrency() {
        return this.currency;
    }

    /**
     *  <p>Country code of the Price.</p>
     */

    public String getCountry() {
        return this.country;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerGroup" rel="nofollow">CustomerGroup</a> for which the Price is valid.</p>
     */

    public com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier getCustomerGroup() {
        return this.customerGroup;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Channel" rel="nofollow">Channel</a> for which the Price is valid.</p>
     */

    public com.commercetools.api.models.channel.ChannelResourceIdentifier getChannel() {
        return this.channel;
    }

    /**
     *  <p>Date and time (UTC) from which the Embedded Price is valid.</p>
     */

    public java.time.ZonedDateTime getValidFrom() {
        return this.validFrom;
    }

    /**
     *  <p>Date and time (UTC) until which the Embedded Price is valid.</p>
     */

    public java.time.ZonedDateTime getValidUntil() {
        return this.validUntil;
    }

    /**
     *  <p>Date and time (UTC) from which the conflicting Embedded Price is valid.</p>
     */

    public java.time.ZonedDateTime getConflictingValidFrom() {
        return this.conflictingValidFrom;
    }

    /**
     *  <p>Date and time (UTC) until which the conflicting Embedded Price is valid.</p>
     */

    public java.time.ZonedDateTime getConflictingValidUntil() {
        return this.conflictingValidUntil;
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

    public void setConflictingPrice(final String conflictingPrice) {
        this.conflictingPrice = conflictingPrice;
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

    public void setConflictingValidFrom(final java.time.ZonedDateTime conflictingValidFrom) {
        this.conflictingValidFrom = conflictingValidFrom;
    }

    public void setConflictingValidUntil(final java.time.ZonedDateTime conflictingValidUntil) {
        this.conflictingValidUntil = conflictingValidUntil;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        OverlappingPriceValidityErrorImpl that = (OverlappingPriceValidityErrorImpl) o;

        return new EqualsBuilder().append(code, that.code)
                .append(message, that.message)
                .append(values, that.values)
                .append(conflictingPrice, that.conflictingPrice)
                .append(currency, that.currency)
                .append(country, that.country)
                .append(customerGroup, that.customerGroup)
                .append(channel, that.channel)
                .append(validFrom, that.validFrom)
                .append(validUntil, that.validUntil)
                .append(conflictingValidFrom, that.conflictingValidFrom)
                .append(conflictingValidUntil, that.conflictingValidUntil)
                .append(code, that.code)
                .append(message, that.message)
                .append(values, that.values)
                .append(conflictingPrice, that.conflictingPrice)
                .append(currency, that.currency)
                .append(country, that.country)
                .append(customerGroup, that.customerGroup)
                .append(channel, that.channel)
                .append(validFrom, that.validFrom)
                .append(validUntil, that.validUntil)
                .append(conflictingValidFrom, that.conflictingValidFrom)
                .append(conflictingValidUntil, that.conflictingValidUntil)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(code)
                .append(message)
                .append(values)
                .append(conflictingPrice)
                .append(currency)
                .append(country)
                .append(customerGroup)
                .append(channel)
                .append(validFrom)
                .append(validUntil)
                .append(conflictingValidFrom)
                .append(conflictingValidUntil)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("code", code)
                .append("message", message)
                .append("values", values)
                .append("conflictingPrice", conflictingPrice)
                .append("currency", currency)
                .append("country", country)
                .append("customerGroup", customerGroup)
                .append("channel", channel)
                .append("validFrom", validFrom)
                .append("validUntil", validUntil)
                .append("conflictingValidFrom", conflictingValidFrom)
                .append("conflictingValidUntil", conflictingValidUntil)
                .build();
    }

    @Override
    public OverlappingPriceValidityError copyDeep() {
        return OverlappingPriceValidityError.deepCopy(this);
    }
}
