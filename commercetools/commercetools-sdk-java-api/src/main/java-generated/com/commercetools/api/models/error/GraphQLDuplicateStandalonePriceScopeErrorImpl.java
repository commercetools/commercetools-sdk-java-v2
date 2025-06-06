
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonAnySetter;
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
 *  <p>Returned when the given Price scope conflicts with the Price scope of an existing Standalone Price. Every Standalone Price associated with the same SKU must have a distinct combination of currency, country, Customer Group, Channel, and validity periods (<code>validFrom</code> and <code>validUntil</code>).</p>
 *  <p>The error is returned as a failed response to the Create StandalonePrice request.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GraphQLDuplicateStandalonePriceScopeErrorImpl
        implements GraphQLDuplicateStandalonePriceScopeError, ModelBase {

    private String code;

    private Map<String, java.lang.Object> values;

    private com.commercetools.api.models.standalone_price.StandalonePriceReference conflictingStandalonePrice;

    private String sku;

    private String currency;

    private String country;

    private com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier customerGroup;

    private com.commercetools.api.models.channel.ChannelResourceIdentifier channel;

    private java.time.ZonedDateTime validFrom;

    private java.time.ZonedDateTime validUntil;

    /**
     * create instance with all properties
     */
    @JsonCreator
    GraphQLDuplicateStandalonePriceScopeErrorImpl(
            @JsonAnySetter @JsonProperty("values") final Map<String, java.lang.Object> values,
            @JsonProperty("conflictingStandalonePrice") final com.commercetools.api.models.standalone_price.StandalonePriceReference conflictingStandalonePrice,
            @JsonProperty("sku") final String sku, @JsonProperty("currency") final String currency,
            @JsonProperty("country") final String country,
            @JsonProperty("customerGroup") final com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier customerGroup,
            @JsonProperty("channel") final com.commercetools.api.models.channel.ChannelResourceIdentifier channel,
            @JsonProperty("validFrom") final java.time.ZonedDateTime validFrom,
            @JsonProperty("validUntil") final java.time.ZonedDateTime validUntil) {
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

    /**
     * create empty instance
     */
    public GraphQLDuplicateStandalonePriceScopeErrorImpl() {
        this.code = DUPLICATE_STANDALONE_PRICE_SCOPE;
    }

    /**
     *
     */

    public String getCode() {
        return this.code;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     */

    public Map<String, java.lang.Object> values() {
        return values;
    }

    /**
     *  <p>Reference to the conflicting Standalone Price.</p>
     */

    public com.commercetools.api.models.standalone_price.StandalonePriceReference getConflictingStandalonePrice() {
        return this.conflictingStandalonePrice;
    }

    /**
     *  <p>SKU of the ProductVariant to which the conflicting Standalone Price is associated.</p>
     */

    public String getSku() {
        return this.sku;
    }

    /**
     *  <p>Currency code of the country.</p>
     */

    public String getCurrency() {
        return this.currency;
    }

    /**
     *  <p>Country code of the geographic location.</p>
     */

    public String getCountry() {
        return this.country;
    }

    /**
     *  <p>CustomerGroup for which the Standalone Price is valid.</p>
     */

    public com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier getCustomerGroup() {
        return this.customerGroup;
    }

    /**
     *  <p>Channel for which the Standalone Price is valid.</p>
     */

    public com.commercetools.api.models.channel.ChannelResourceIdentifier getChannel() {
        return this.channel;
    }

    /**
     *  <p>Date and time (UTC) from which the Standalone Price is valid.</p>
     */

    public java.time.ZonedDateTime getValidFrom() {
        return this.validFrom;
    }

    /**
     *  <p>Date and time (UTC) until which the Standalone Price is valid.</p>
     */

    public java.time.ZonedDateTime getValidUntil() {
        return this.validUntil;
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

        GraphQLDuplicateStandalonePriceScopeErrorImpl that = (GraphQLDuplicateStandalonePriceScopeErrorImpl) o;

        return new EqualsBuilder().append(code, that.code)
                .append(values, that.values)
                .append(conflictingStandalonePrice, that.conflictingStandalonePrice)
                .append(sku, that.sku)
                .append(currency, that.currency)
                .append(country, that.country)
                .append(customerGroup, that.customerGroup)
                .append(channel, that.channel)
                .append(validFrom, that.validFrom)
                .append(validUntil, that.validUntil)
                .append(code, that.code)
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

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("code", code)
                .append("values", values)
                .append("conflictingStandalonePrice", conflictingStandalonePrice)
                .append("sku", sku)
                .append("currency", currency)
                .append("country", country)
                .append("customerGroup", customerGroup)
                .append("channel", channel)
                .append("validFrom", validFrom)
                .append("validUntil", validUntil)
                .build();
    }

    @Override
    public GraphQLDuplicateStandalonePriceScopeError copyDeep() {
        return GraphQLDuplicateStandalonePriceScopeError.deepCopy(this);
    }
}
