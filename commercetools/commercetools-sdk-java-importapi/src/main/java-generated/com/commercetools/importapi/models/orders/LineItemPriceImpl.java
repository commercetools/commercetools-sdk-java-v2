
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
 * LineItemPrice
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class LineItemPriceImpl implements LineItemPrice, ModelBase {

    private com.commercetools.importapi.models.common.TypedMoney value;

    private String country;

    private java.time.ZonedDateTime validFrom;

    private java.time.ZonedDateTime validUntil;

    private com.commercetools.importapi.models.common.CustomerGroupKeyReference customerGroup;

    private com.commercetools.importapi.models.common.ChannelKeyReference channel;

    private com.commercetools.importapi.models.common.DiscountedPrice discounted;

    private java.util.List<com.commercetools.importapi.models.common.PriceTier> tiers;

    private com.commercetools.importapi.models.customfields.Custom custom;

    /**
     * create instance with all properties
     */
    @JsonCreator
    LineItemPriceImpl(@JsonProperty("value") final com.commercetools.importapi.models.common.TypedMoney value,
            @JsonProperty("country") final String country,
            @JsonProperty("validFrom") final java.time.ZonedDateTime validFrom,
            @JsonProperty("validUntil") final java.time.ZonedDateTime validUntil,
            @JsonProperty("customerGroup") final com.commercetools.importapi.models.common.CustomerGroupKeyReference customerGroup,
            @JsonProperty("channel") final com.commercetools.importapi.models.common.ChannelKeyReference channel,
            @JsonProperty("discounted") final com.commercetools.importapi.models.common.DiscountedPrice discounted,
            @JsonProperty("tiers") final java.util.List<com.commercetools.importapi.models.common.PriceTier> tiers,
            @JsonProperty("custom") final com.commercetools.importapi.models.customfields.Custom custom) {
        this.value = value;
        this.country = country;
        this.validFrom = validFrom;
        this.validUntil = validUntil;
        this.customerGroup = customerGroup;
        this.channel = channel;
        this.discounted = discounted;
        this.tiers = tiers;
        this.custom = custom;
    }

    /**
     * create empty instance
     */
    public LineItemPriceImpl() {
    }

    /**
     *  <p>Maps to <code>Price.value</code>.</p>
     */

    public com.commercetools.importapi.models.common.TypedMoney getValue() {
        return this.value;
    }

    /**
     *  <p>Maps to <code>Price.county</code>.</p>
     */

    public String getCountry() {
        return this.country;
    }

    /**
     *  <p>Maps to <code>Price.validFrom</code>.</p>
     */

    public java.time.ZonedDateTime getValidFrom() {
        return this.validFrom;
    }

    /**
     *  <p>Maps to <code>Price.validUntil</code>.</p>
     */

    public java.time.ZonedDateTime getValidUntil() {
        return this.validUntil;
    }

    /**
     *  <p>Maps to <code>Price.customerGroup</code>. References a customer group by key. If the referenced CustomerGroup does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the referenced CustomerGroup is created.</p>
     */

    public com.commercetools.importapi.models.common.CustomerGroupKeyReference getCustomerGroup() {
        return this.customerGroup;
    }

    /**
     *  <p>Maps to <code>Price.channel</code>. References a channel by key. If the referenced Channel does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the referenced Channel is created.</p>
     */

    public com.commercetools.importapi.models.common.ChannelKeyReference getChannel() {
        return this.channel;
    }

    /**
     *  <p>Sets a discounted price from an external service.</p>
     */

    public com.commercetools.importapi.models.common.DiscountedPrice getDiscounted() {
        return this.discounted;
    }

    /**
     *  <p>Maps to <code>Price.tiers</code>.</p>
     */

    public java.util.List<com.commercetools.importapi.models.common.PriceTier> getTiers() {
        return this.tiers;
    }

    /**
     *  <p>Maps to <code>Price.custom</code>.</p>
     */

    public com.commercetools.importapi.models.customfields.Custom getCustom() {
        return this.custom;
    }

    public void setValue(final com.commercetools.importapi.models.common.TypedMoney value) {
        this.value = value;
    }

    public void setCountry(final String country) {
        this.country = country;
    }

    public void setValidFrom(final java.time.ZonedDateTime validFrom) {
        this.validFrom = validFrom;
    }

    public void setValidUntil(final java.time.ZonedDateTime validUntil) {
        this.validUntil = validUntil;
    }

    public void setCustomerGroup(
            final com.commercetools.importapi.models.common.CustomerGroupKeyReference customerGroup) {
        this.customerGroup = customerGroup;
    }

    public void setChannel(final com.commercetools.importapi.models.common.ChannelKeyReference channel) {
        this.channel = channel;
    }

    public void setDiscounted(final com.commercetools.importapi.models.common.DiscountedPrice discounted) {
        this.discounted = discounted;
    }

    public void setTiers(final com.commercetools.importapi.models.common.PriceTier... tiers) {
        this.tiers = new ArrayList<>(Arrays.asList(tiers));
    }

    public void setTiers(final java.util.List<com.commercetools.importapi.models.common.PriceTier> tiers) {
        this.tiers = tiers;
    }

    public void setCustom(final com.commercetools.importapi.models.customfields.Custom custom) {
        this.custom = custom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        LineItemPriceImpl that = (LineItemPriceImpl) o;

        return new EqualsBuilder().append(value, that.value)
                .append(country, that.country)
                .append(validFrom, that.validFrom)
                .append(validUntil, that.validUntil)
                .append(customerGroup, that.customerGroup)
                .append(channel, that.channel)
                .append(discounted, that.discounted)
                .append(tiers, that.tiers)
                .append(custom, that.custom)
                .append(value, that.value)
                .append(country, that.country)
                .append(validFrom, that.validFrom)
                .append(validUntil, that.validUntil)
                .append(customerGroup, that.customerGroup)
                .append(channel, that.channel)
                .append(discounted, that.discounted)
                .append(tiers, that.tiers)
                .append(custom, that.custom)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(value)
                .append(country)
                .append(validFrom)
                .append(validUntil)
                .append(customerGroup)
                .append(channel)
                .append(discounted)
                .append(tiers)
                .append(custom)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("value", value)
                .append("country", country)
                .append("validFrom", validFrom)
                .append("validUntil", validUntil)
                .append("customerGroup", customerGroup)
                .append("channel", channel)
                .append("discounted", discounted)
                .append("tiers", tiers)
                .append("custom", custom)
                .build();
    }

    @Override
    public LineItemPrice copyDeep() {
        return LineItemPrice.deepCopy(this);
    }
}
