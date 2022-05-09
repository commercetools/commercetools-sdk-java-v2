
package com.commercetools.api.models.common;

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
public class PriceDraftImpl implements PriceDraft, ModelBase {

    private com.commercetools.api.models.common.Money value;

    private String country;

    private com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier customerGroup;

    private com.commercetools.api.models.channel.ChannelResourceIdentifier channel;

    private java.time.ZonedDateTime validFrom;

    private java.time.ZonedDateTime validUntil;

    private com.commercetools.api.models.common.DiscountedPriceDraft discounted;

    private java.util.List<com.commercetools.api.models.common.PriceTierDraft> tiers;

    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    @JsonCreator
    PriceDraftImpl(@JsonProperty("value") final com.commercetools.api.models.common.Money value,
            @JsonProperty("country") final String country,
            @JsonProperty("customerGroup") final com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier customerGroup,
            @JsonProperty("channel") final com.commercetools.api.models.channel.ChannelResourceIdentifier channel,
            @JsonProperty("validFrom") final java.time.ZonedDateTime validFrom,
            @JsonProperty("validUntil") final java.time.ZonedDateTime validUntil,
            @JsonProperty("discounted") final com.commercetools.api.models.common.DiscountedPriceDraft discounted,
            @JsonProperty("tiers") final java.util.List<com.commercetools.api.models.common.PriceTierDraft> tiers,
            @JsonProperty("custom") final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.value = value;
        this.country = country;
        this.customerGroup = customerGroup;
        this.channel = channel;
        this.validFrom = validFrom;
        this.validUntil = validUntil;
        this.discounted = discounted;
        this.tiers = tiers;
        this.custom = custom;
    }

    public PriceDraftImpl() {
    }

    /**
    *  <p>Money value of this Price.</p>
    */
    public com.commercetools.api.models.common.Money getValue() {
        return this.value;
    }

    /**
    *  <p>Set this field if this Price is only valid for the specified country.</p>
    */
    public String getCountry() {
        return this.country;
    }

    /**
    *  <p>Set this field if this Price is only valid for the referenced <a href="ctp:api:type:CustomerGroup">CustomerGroup</a>.</p>
    */
    public com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier getCustomerGroup() {
        return this.customerGroup;
    }

    /**
    *  <p>Set this field if this Price is only valid for the referenced <code>ProductDistribution</code> <a href="ctp:api:type:Channel">Channel</a>.</p>
    */
    public com.commercetools.api.models.channel.ChannelResourceIdentifier getChannel() {
        return this.channel;
    }

    /**
    *  <p>Set this field if this Price is valid only valid from the specified date and time.</p>
    */
    public java.time.ZonedDateTime getValidFrom() {
        return this.validFrom;
    }

    /**
    *  <p>Set this field if this Price is valid only valid until the specified date and time.</p>
    */
    public java.time.ZonedDateTime getValidUntil() {
        return this.validUntil;
    }

    /**
    *  <p>Set this field to add a DiscountedPrice from an external service.</p>
    *  <p>The commercetools Platform sets this field automatically if at least one <a href="ctp:api:type:ProductDiscount">ProductDiscount</a> applies.
    *  The DiscountedPrice must reference a ProductDiscount with:</p>
    *  <ul>
    *  <li>The <code>isActive</code> flag set to <code>true</code>.</li>
    *  <li>A <a href="ctp:api:type:ProductDiscountValueExternal">ProductDiscountValue</a> of type <code>external</code>.</li>
    *  <li>A <code>predicate</code> that matches the <a href="ctp:api:type:ProductVariant">ProductVariant</a> the Price is referenced from.</li>
    *  </ul>
    */
    public com.commercetools.api.models.common.DiscountedPriceDraft getDiscounted() {
        return this.discounted;
    }

    /**
    *  <p>Set this field to specify different Prices for certain <a href="ctp:api:type:LineItem">LineItem</a> quantities.</p>
    */
    public java.util.List<com.commercetools.api.models.common.PriceTierDraft> getTiers() {
        return this.tiers;
    }

    /**
    *  <p>Custom Fields for the Price.</p>
    */
    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
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

    public void setDiscounted(final com.commercetools.api.models.common.DiscountedPriceDraft discounted) {
        this.discounted = discounted;
    }

    public void setTiers(final com.commercetools.api.models.common.PriceTierDraft... tiers) {
        this.tiers = new ArrayList<>(Arrays.asList(tiers));
    }

    public void setTiers(final java.util.List<com.commercetools.api.models.common.PriceTierDraft> tiers) {
        this.tiers = tiers;
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

        PriceDraftImpl that = (PriceDraftImpl) o;

        return new EqualsBuilder().append(value, that.value)
                .append(country, that.country)
                .append(customerGroup, that.customerGroup)
                .append(channel, that.channel)
                .append(validFrom, that.validFrom)
                .append(validUntil, that.validUntil)
                .append(discounted, that.discounted)
                .append(tiers, that.tiers)
                .append(custom, that.custom)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(value)
                .append(country)
                .append(customerGroup)
                .append(channel)
                .append(validFrom)
                .append(validUntil)
                .append(discounted)
                .append(tiers)
                .append(custom)
                .toHashCode();
    }

}
