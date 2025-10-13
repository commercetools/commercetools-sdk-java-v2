
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
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *  <p>The representation for prices embedded in <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItems</a> and in <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariants</a> when the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductPriceModeEnum" rel="nofollow">ProductPriceMode</a> is <code>Embedded</code>. For the <code>Standalone</code> ProductPriceMode refer to <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePrice" rel="nofollow">StandalonePrice</a>.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PriceImpl implements Price, ModelBase {

    private String id;

    private String key;

    private com.commercetools.api.models.common.TypedMoney value;

    private String country;

    private com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup;

    private com.commercetools.api.models.channel.ChannelReference channel;

    private java.time.ZonedDateTime validFrom;

    private java.time.ZonedDateTime validUntil;

    private com.commercetools.api.models.common.DiscountedPrice discounted;

    private java.util.List<com.commercetools.api.models.common.PriceTier> tiers;

    private com.commercetools.api.models.type.CustomFields custom;

    private com.commercetools.api.models.recurrence_policy.RecurrencePolicyReference recurrencePolicy;

    /**
     * create instance with all properties
     */
    @JsonCreator
    PriceImpl(@JsonProperty("id") final String id, @JsonProperty("key") final String key,
            @JsonProperty("value") final com.commercetools.api.models.common.TypedMoney value,
            @JsonProperty("country") final String country,
            @JsonProperty("customerGroup") final com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup,
            @JsonProperty("channel") final com.commercetools.api.models.channel.ChannelReference channel,
            @JsonProperty("validFrom") final java.time.ZonedDateTime validFrom,
            @JsonProperty("validUntil") final java.time.ZonedDateTime validUntil,
            @JsonProperty("discounted") final com.commercetools.api.models.common.DiscountedPrice discounted,
            @JsonProperty("tiers") final java.util.List<com.commercetools.api.models.common.PriceTier> tiers,
            @JsonProperty("custom") final com.commercetools.api.models.type.CustomFields custom,
            @JsonProperty("recurrencePolicy") final com.commercetools.api.models.recurrence_policy.RecurrencePolicyReference recurrencePolicy) {
        this.id = id;
        this.key = key;
        this.value = value;
        this.country = country;
        this.customerGroup = customerGroup;
        this.channel = channel;
        this.validFrom = validFrom;
        this.validUntil = validUntil;
        this.discounted = discounted;
        this.tiers = tiers;
        this.custom = custom;
        this.recurrencePolicy = recurrencePolicy;
    }

    /**
     * create empty instance
     */
    public PriceImpl() {
    }

    /**
     *  <p>Unique identifier of this Price.</p>
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>User-defined identifier of the Price. It is unique per <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a>.</p>
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Money value of this Price.</p>
     */

    public com.commercetools.api.models.common.TypedMoney getValue() {
        return this.value;
    }

    /**
     *  <p>Country for which this Price is valid.</p>
     */

    public String getCountry() {
        return this.country;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerGroup" rel="nofollow">CustomerGroup</a> for which this Price is valid.</p>
     */

    public com.commercetools.api.models.customer_group.CustomerGroupReference getCustomerGroup() {
        return this.customerGroup;
    }

    /**
     *  <p><code>ProductDistribution</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:Channel" rel="nofollow">Channel</a> for which this Price is valid.</p>
     */

    public com.commercetools.api.models.channel.ChannelReference getChannel() {
        return this.channel;
    }

    /**
     *  <p>Date and time from which this Price is valid.</p>
     */

    public java.time.ZonedDateTime getValidFrom() {
        return this.validFrom;
    }

    /**
     *  <p>Date and time until this Price is valid. Prices that are no longer valid are not automatically removed, but they can be <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductRemovePriceAction" rel="nofollow">removed</a> if necessary.</p>
     */

    public java.time.ZonedDateTime getValidUntil() {
        return this.validUntil;
    }

    /**
     *  <p>Is set if a <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductDiscount" rel="nofollow">ProductDiscount</a> has been applied. If set, the API uses the DiscountedPrice value for the <span>Line Item price selection</span>. When a <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductDiscountValueRelative" rel="nofollow">relative discount</a> has been applied and the fraction part of the DiscountedPrice <code>value</code> is 0.5, the <code>value</code> is rounded in favor of the customer with <span>half-down rounding</span>.</p>
     *  <p>If an <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductDiscountValueAbsolute" rel="nofollow">absolute discount</a> value exceeds the price of the Product Variant, the discounted price is a negative value.</p>
     */

    public com.commercetools.api.models.common.DiscountedPrice getDiscounted() {
        return this.discounted;
    }

    /**
     *  <p>Present if different Prices for certain <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a> quantities have been specified.</p>
     *  <p>If <code>discounted</code> is present, the tiered Price is ignored for a Product Variant.</p>
     */

    public java.util.List<com.commercetools.api.models.common.PriceTier> getTiers() {
        return this.tiers;
    }

    /**
     *  <p>Custom Fields defined for the Price.</p>
     */

    public com.commercetools.api.models.type.CustomFields getCustom() {
        return this.custom;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:RecurrencePolicy" rel="nofollow">Recurrence Policy</a> for which this Price is valid.</p>
     */

    public com.commercetools.api.models.recurrence_policy.RecurrencePolicyReference getRecurrencePolicy() {
        return this.recurrencePolicy;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public void setValue(final com.commercetools.api.models.common.TypedMoney value) {
        this.value = value;
    }

    public void setCountry(final String country) {
        this.country = country;
    }

    public void setCustomerGroup(
            final com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup) {
        this.customerGroup = customerGroup;
    }

    public void setChannel(final com.commercetools.api.models.channel.ChannelReference channel) {
        this.channel = channel;
    }

    public void setValidFrom(final java.time.ZonedDateTime validFrom) {
        this.validFrom = validFrom;
    }

    public void setValidUntil(final java.time.ZonedDateTime validUntil) {
        this.validUntil = validUntil;
    }

    public void setDiscounted(final com.commercetools.api.models.common.DiscountedPrice discounted) {
        this.discounted = discounted;
    }

    public void setTiers(final com.commercetools.api.models.common.PriceTier... tiers) {
        this.tiers = new ArrayList<>(Arrays.asList(tiers));
    }

    public void setTiers(final java.util.List<com.commercetools.api.models.common.PriceTier> tiers) {
        this.tiers = tiers;
    }

    public void setCustom(final com.commercetools.api.models.type.CustomFields custom) {
        this.custom = custom;
    }

    public void setRecurrencePolicy(
            final com.commercetools.api.models.recurrence_policy.RecurrencePolicyReference recurrencePolicy) {
        this.recurrencePolicy = recurrencePolicy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        PriceImpl that = (PriceImpl) o;

        return new EqualsBuilder().append(id, that.id)
                .append(key, that.key)
                .append(value, that.value)
                .append(country, that.country)
                .append(customerGroup, that.customerGroup)
                .append(channel, that.channel)
                .append(validFrom, that.validFrom)
                .append(validUntil, that.validUntil)
                .append(discounted, that.discounted)
                .append(tiers, that.tiers)
                .append(custom, that.custom)
                .append(recurrencePolicy, that.recurrencePolicy)
                .append(id, that.id)
                .append(key, that.key)
                .append(value, that.value)
                .append(country, that.country)
                .append(customerGroup, that.customerGroup)
                .append(channel, that.channel)
                .append(validFrom, that.validFrom)
                .append(validUntil, that.validUntil)
                .append(discounted, that.discounted)
                .append(tiers, that.tiers)
                .append(custom, that.custom)
                .append(recurrencePolicy, that.recurrencePolicy)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(id)
                .append(key)
                .append(value)
                .append(country)
                .append(customerGroup)
                .append(channel)
                .append(validFrom)
                .append(validUntil)
                .append(discounted)
                .append(tiers)
                .append(custom)
                .append(recurrencePolicy)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("id", id)
                .append("key", key)
                .append("value", value)
                .append("country", country)
                .append("customerGroup", customerGroup)
                .append("channel", channel)
                .append("validFrom", validFrom)
                .append("validUntil", validUntil)
                .append("discounted", discounted)
                .append("tiers", tiers)
                .append("custom", custom)
                .append("recurrencePolicy", recurrencePolicy)
                .build();
    }

    @Override
    public Price copyDeep() {
        return Price.deepCopy(this);
    }
}
