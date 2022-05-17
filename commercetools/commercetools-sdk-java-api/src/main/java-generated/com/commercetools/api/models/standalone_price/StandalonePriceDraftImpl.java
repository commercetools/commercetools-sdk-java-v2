
package com.commercetools.api.models.standalone_price;

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
*  <p>Standalone Prices are defined with a scope consisting of <code>currency</code> and optionally <code>country</code>, <code>customerGroup</code>, and <code>channel</code> and/or a validity period (<code>validFrom</code> and/or <code>validTo</code>). For more information see <a href="/../api/projects/products#price-selection">price selection</a>.
*  Creating a Standalone Price is rejected if there already exists a Standalone Price for the same SKU with exactly the same price scope, or with overlapping validity periods within the same price scope. A Price without validity period does not conflict with a Price defined for a time period.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class StandalonePriceDraftImpl implements StandalonePriceDraft, ModelBase {

    private String key;

    private String sku;

    private com.commercetools.api.models.common.Money value;

    private String country;

    private com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier customerGroup;

    private com.commercetools.api.models.channel.ChannelResourceIdentifier channel;

    private java.time.ZonedDateTime validFrom;

    private java.time.ZonedDateTime validUntil;

    private java.util.List<com.commercetools.api.models.common.PriceTierDraft> tiers;

    private com.commercetools.api.models.common.DiscountedPriceDraft discounted;

    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    @JsonCreator
    StandalonePriceDraftImpl(@JsonProperty("key") final String key, @JsonProperty("sku") final String sku,
            @JsonProperty("value") final com.commercetools.api.models.common.Money value,
            @JsonProperty("country") final String country,
            @JsonProperty("customerGroup") final com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier customerGroup,
            @JsonProperty("channel") final com.commercetools.api.models.channel.ChannelResourceIdentifier channel,
            @JsonProperty("validFrom") final java.time.ZonedDateTime validFrom,
            @JsonProperty("validUntil") final java.time.ZonedDateTime validUntil,
            @JsonProperty("tiers") final java.util.List<com.commercetools.api.models.common.PriceTierDraft> tiers,
            @JsonProperty("discounted") final com.commercetools.api.models.common.DiscountedPriceDraft discounted,
            @JsonProperty("custom") final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.key = key;
        this.sku = sku;
        this.value = value;
        this.country = country;
        this.customerGroup = customerGroup;
        this.channel = channel;
        this.validFrom = validFrom;
        this.validUntil = validUntil;
        this.tiers = tiers;
        this.discounted = discounted;
        this.custom = custom;
    }

    public StandalonePriceDraftImpl() {
    }

    /**
    *  <p>User-defined unique identifier for the StandalonePrice.</p>
    */
    public String getKey() {
        return this.key;
    }

    /**
    *  <p>Specifies to which <a href="ctp:api:type:ProductVariant">ProductVariant</a> the Platform associates this Price.
    *  It is not validated to exist in product variants.</p>
    */
    public String getSku() {
        return this.sku;
    }

    /**
    *  <p>Sets the money value of this Price.</p>
    */
    public com.commercetools.api.models.common.Money getValue() {
        return this.value;
    }

    /**
    *  <p>Sets the country for which this Price is valid.</p>
    */
    public String getCountry() {
        return this.country;
    }

    /**
    *  <p>Sets the <a href="ctp:api:type:CustomerGroup">CustomerGroup</a> for which this Price is valid.</p>
    */
    public com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier getCustomerGroup() {
        return this.customerGroup;
    }

    /**
    *  <p>Sets the product distribution <a href="ctp:api:type:Channel">Channel</a> for which this Price is valid.</p>
    */
    public com.commercetools.api.models.channel.ChannelResourceIdentifier getChannel() {
        return this.channel;
    }

    /**
    *  <p>Sets the date from which the Price is valid.</p>
    */
    public java.time.ZonedDateTime getValidFrom() {
        return this.validFrom;
    }

    /**
    *  <p>Sets the date until the Price is valid.</p>
    */
    public java.time.ZonedDateTime getValidUntil() {
        return this.validUntil;
    }

    /**
    *  <p>Sets price tiers.</p>
    */
    public java.util.List<com.commercetools.api.models.common.PriceTierDraft> getTiers() {
        return this.tiers;
    }

    /**
    *  <p>Sets a discounted price for this Price that is different from the base price with <code>value</code>.</p>
    */
    public com.commercetools.api.models.common.DiscountedPriceDraft getDiscounted() {
        return this.discounted;
    }

    /**
    *  <p>Custom Fields for the StandalonePrice.</p>
    */
    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public void setSku(final String sku) {
        this.sku = sku;
    }

    public void setValue(final com.commercetools.api.models.common.Money value) {
        this.value = value;
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

    public void setTiers(final com.commercetools.api.models.common.PriceTierDraft... tiers) {
        this.tiers = new ArrayList<>(Arrays.asList(tiers));
    }

    public void setTiers(final java.util.List<com.commercetools.api.models.common.PriceTierDraft> tiers) {
        this.tiers = tiers;
    }

    public void setDiscounted(final com.commercetools.api.models.common.DiscountedPriceDraft discounted) {
        this.discounted = discounted;
    }

    public void setCustom(final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        StandalonePriceDraftImpl that = (StandalonePriceDraftImpl) o;

        return new EqualsBuilder().append(key, that.key)
                .append(sku, that.sku)
                .append(value, that.value)
                .append(country, that.country)
                .append(customerGroup, that.customerGroup)
                .append(channel, that.channel)
                .append(validFrom, that.validFrom)
                .append(validUntil, that.validUntil)
                .append(tiers, that.tiers)
                .append(discounted, that.discounted)
                .append(custom, that.custom)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(key)
                .append(sku)
                .append(value)
                .append(country)
                .append(customerGroup)
                .append(channel)
                .append(validFrom)
                .append(validUntil)
                .append(tiers)
                .append(discounted)
                .append(custom)
                .toHashCode();
    }

}
