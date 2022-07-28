
package com.commercetools.api.models.product;

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
 * EmbeddedPrice
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class EmbeddedPriceImpl implements EmbeddedPrice, ModelBase {

    private String id;

    private com.commercetools.api.models.common.TypedMoney value;

    private String country;

    private com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup;

    private com.commercetools.api.models.channel.ChannelReference channel;

    private java.time.ZonedDateTime validFrom;

    private java.time.ZonedDateTime validUntil;

    private java.util.List<com.commercetools.api.models.common.PriceTier> tiers;

    private com.commercetools.api.models.common.DiscountedPrice discounted;

    private com.commercetools.api.models.type.CustomFields custom;

    @JsonCreator
    EmbeddedPriceImpl(@JsonProperty("id") final String id,
            @JsonProperty("value") final com.commercetools.api.models.common.TypedMoney value,
            @JsonProperty("country") final String country,
            @JsonProperty("customerGroup") final com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup,
            @JsonProperty("channel") final com.commercetools.api.models.channel.ChannelReference channel,
            @JsonProperty("validFrom") final java.time.ZonedDateTime validFrom,
            @JsonProperty("validUntil") final java.time.ZonedDateTime validUntil,
            @JsonProperty("tiers") final java.util.List<com.commercetools.api.models.common.PriceTier> tiers,
            @JsonProperty("discounted") final com.commercetools.api.models.common.DiscountedPrice discounted,
            @JsonProperty("custom") final com.commercetools.api.models.type.CustomFields custom) {
        this.id = id;
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

    public EmbeddedPriceImpl() {
    }

    /**
     *  <p>Unique identifier of the EmbeddedPrice.</p>
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>Money value of the EmbeddedPrice.</p>
     */

    public com.commercetools.api.models.common.TypedMoney getValue() {
        return this.value;
    }

    /**
     *  <p>Country for which the EmbeddedPrice is valid.</p>
     */

    public String getCountry() {
        return this.country;
    }

    /**
     *  <p>CustomerGroup for which the EmbeddedPrice is valid.</p>
     */

    public com.commercetools.api.models.customer_group.CustomerGroupReference getCustomerGroup() {
        return this.customerGroup;
    }

    /**
     *  <p>Product distribution Channel for which the EmbeddedPrice is valid.</p>
     */

    public com.commercetools.api.models.channel.ChannelReference getChannel() {
        return this.channel;
    }

    /**
     *  <p>Date from which the EmbeddedPrice is valid.</p>
     */

    public java.time.ZonedDateTime getValidFrom() {
        return this.validFrom;
    }

    /**
     *  <p>Date until the EmbeddedPrice is valid.</p>
     */

    public java.time.ZonedDateTime getValidUntil() {
        return this.validUntil;
    }

    /**
     *  <p>Price tiers if any are defined.</p>
     */

    public java.util.List<com.commercetools.api.models.common.PriceTier> getTiers() {
        return this.tiers;
    }

    /**
     *  <p>Set if a matching ProductDiscount exists. If set, the API uses the <code>discounted</code> value for the LineItem Price selection. When a relative Discount is applied and the fraction part of the <code>discounted</code> price is 0.5, the discounted Price is rounded in favor of the customer with the half down rounding.</p>
     *  <p>The service will unset or replace the value</p>
     *  <ul>
     *   <li>once a matching relative or absolute Product Discount with a higher <code>sortOrder</code> exists,</li>
     *   <li>if the referenced external Product Discount is deactivated, or</li>
     *   <li>if the Product changes and the external Product Discount predicate does not match the discounted Price any more.</li>
     *  </ul>
     */

    public com.commercetools.api.models.common.DiscountedPrice getDiscounted() {
        return this.discounted;
    }

    /**
     *  <p>Custom Fields for the EmbeddedPrice.</p>
     */

    public com.commercetools.api.models.type.CustomFields getCustom() {
        return this.custom;
    }

    public void setId(final String id) {
        this.id = id;
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

    public void setTiers(final com.commercetools.api.models.common.PriceTier... tiers) {
        this.tiers = new ArrayList<>(Arrays.asList(tiers));
    }

    public void setTiers(final java.util.List<com.commercetools.api.models.common.PriceTier> tiers) {
        this.tiers = tiers;
    }

    public void setDiscounted(final com.commercetools.api.models.common.DiscountedPrice discounted) {
        this.discounted = discounted;
    }

    public void setCustom(final com.commercetools.api.models.type.CustomFields custom) {
        this.custom = custom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        EmbeddedPriceImpl that = (EmbeddedPriceImpl) o;

        return new EqualsBuilder().append(id, that.id)
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
        return new HashCodeBuilder(17, 37).append(id)
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
