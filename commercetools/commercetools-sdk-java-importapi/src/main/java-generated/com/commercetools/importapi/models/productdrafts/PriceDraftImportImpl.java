
package com.commercetools.importapi.models.productdrafts;

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
 *  <p>The representation of a Price Draft for the import purpose.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PriceDraftImportImpl implements PriceDraftImport, ModelBase {

    private com.commercetools.importapi.models.common.TypedMoney value;

    private String country;

    private com.commercetools.importapi.models.common.CustomerGroupKeyReference customerGroup;

    private com.commercetools.importapi.models.common.ChannelKeyReference channel;

    private java.time.ZonedDateTime validFrom;

    private java.time.ZonedDateTime validUntil;

    private com.commercetools.importapi.models.customfields.Custom custom;

    private com.commercetools.importapi.models.common.DiscountedPrice discounted;

    private java.util.List<com.commercetools.importapi.models.common.PriceTier> tiers;

    private String key;

    /**
     * create instance with all properties
     */
    @JsonCreator
    PriceDraftImportImpl(@JsonProperty("value") final com.commercetools.importapi.models.common.TypedMoney value,
            @JsonProperty("country") final String country,
            @JsonProperty("customerGroup") final com.commercetools.importapi.models.common.CustomerGroupKeyReference customerGroup,
            @JsonProperty("channel") final com.commercetools.importapi.models.common.ChannelKeyReference channel,
            @JsonProperty("validFrom") final java.time.ZonedDateTime validFrom,
            @JsonProperty("validUntil") final java.time.ZonedDateTime validUntil,
            @JsonProperty("custom") final com.commercetools.importapi.models.customfields.Custom custom,
            @JsonProperty("discounted") final com.commercetools.importapi.models.common.DiscountedPrice discounted,
            @JsonProperty("tiers") final java.util.List<com.commercetools.importapi.models.common.PriceTier> tiers,
            @JsonProperty("key") final String key) {
        this.value = value;
        this.country = country;
        this.customerGroup = customerGroup;
        this.channel = channel;
        this.validFrom = validFrom;
        this.validUntil = validUntil;
        this.custom = custom;
        this.discounted = discounted;
        this.tiers = tiers;
        this.key = key;
    }

    /**
     * create empty instance
     */
    public PriceDraftImportImpl() {
    }

    /**
     *  <p>Money value of this Price.</p>
     */

    public com.commercetools.importapi.models.common.TypedMoney getValue() {
        return this.value;
    }

    /**
     *  <p>Set this field if this Price is only valid for the specified country.</p>
     */

    public String getCountry() {
        return this.country;
    }

    /**
     *  <p>Set this field if this Price is only valid for the referenced CustomerGroup. If the referenced CustomerGroup does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the referenced CustomerGroup is created.</p>
     */

    public com.commercetools.importapi.models.common.CustomerGroupKeyReference getCustomerGroup() {
        return this.customerGroup;
    }

    /**
     *  <p>Set this field if this Price is only valid for the referenced <code>ProductDistribution</code> Channel. If the referenced Channel does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the referenced Channel is created.</p>
     */

    public com.commercetools.importapi.models.common.ChannelKeyReference getChannel() {
        return this.channel;
    }

    /**
     *  <p>Set this field if this Price is only valid from the specified date and time. Must be at least 1 ms earlier than <code>validUntil</code>.</p>
     */

    public java.time.ZonedDateTime getValidFrom() {
        return this.validFrom;
    }

    /**
     *  <p>Set this field if this Price is only valid until the specified date and time. Must be at least 1 ms later than <code>validFrom</code>.</p>
     */

    public java.time.ZonedDateTime getValidUntil() {
        return this.validUntil;
    }

    /**
     *  <p>Custom Fields for the Embedded Price.</p>
     */

    public com.commercetools.importapi.models.customfields.Custom getCustom() {
        return this.custom;
    }

    /**
     *  <p>Set this field to add a DiscountedPrice from an <strong>external service</strong>.</p>
     */

    public com.commercetools.importapi.models.common.DiscountedPrice getDiscounted() {
        return this.discounted;
    }

    /**
     *  <p>The tiered prices for this price.</p>
     */

    public java.util.List<com.commercetools.importapi.models.common.PriceTier> getTiers() {
        return this.tiers;
    }

    /**
     *  <p>User-defined unique identifier for the Embedded Price.</p>
     */

    public String getKey() {
        return this.key;
    }

    public void setValue(final com.commercetools.importapi.models.common.TypedMoney value) {
        this.value = value;
    }

    public void setCountry(final String country) {
        this.country = country;
    }

    public void setCustomerGroup(
            final com.commercetools.importapi.models.common.CustomerGroupKeyReference customerGroup) {
        this.customerGroup = customerGroup;
    }

    public void setChannel(final com.commercetools.importapi.models.common.ChannelKeyReference channel) {
        this.channel = channel;
    }

    public void setValidFrom(final java.time.ZonedDateTime validFrom) {
        this.validFrom = validFrom;
    }

    public void setValidUntil(final java.time.ZonedDateTime validUntil) {
        this.validUntil = validUntil;
    }

    public void setCustom(final com.commercetools.importapi.models.customfields.Custom custom) {
        this.custom = custom;
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

    public void setKey(final String key) {
        this.key = key;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        PriceDraftImportImpl that = (PriceDraftImportImpl) o;

        return new EqualsBuilder().append(value, that.value)
                .append(country, that.country)
                .append(customerGroup, that.customerGroup)
                .append(channel, that.channel)
                .append(validFrom, that.validFrom)
                .append(validUntil, that.validUntil)
                .append(custom, that.custom)
                .append(discounted, that.discounted)
                .append(tiers, that.tiers)
                .append(key, that.key)
                .append(value, that.value)
                .append(country, that.country)
                .append(customerGroup, that.customerGroup)
                .append(channel, that.channel)
                .append(validFrom, that.validFrom)
                .append(validUntil, that.validUntil)
                .append(custom, that.custom)
                .append(discounted, that.discounted)
                .append(tiers, that.tiers)
                .append(key, that.key)
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
                .append(custom)
                .append(discounted)
                .append(tiers)
                .append(key)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("value", value)
                .append("country", country)
                .append("customerGroup", customerGroup)
                .append("channel", channel)
                .append("validFrom", validFrom)
                .append("validUntil", validUntil)
                .append("custom", custom)
                .append("discounted", discounted)
                .append("tiers", tiers)
                .append("key", key)
                .build();
    }

    @Override
    public PriceDraftImport copyDeep() {
        return PriceDraftImport.deepCopy(this);
    }
}
