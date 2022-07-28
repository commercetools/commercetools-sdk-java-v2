
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
 *  <p>The representation sent to the server when creating a new EmbeddedPrice.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class EmbeddedPriceDraftImpl implements EmbeddedPriceDraft, ModelBase {

    private com.commercetools.api.models.common.Money value;

    private String country;

    private com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier customerGroup;

    private com.commercetools.api.models.channel.ChannelResourceIdentifier channel;

    private com.commercetools.api.models.common.DiscountedPriceDraft discounted;

    private java.time.ZonedDateTime validFrom;

    private java.time.ZonedDateTime validUntil;

    private java.util.List<com.commercetools.api.models.common.PriceTier> tiers;

    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    @JsonCreator
    EmbeddedPriceDraftImpl(@JsonProperty("value") final com.commercetools.api.models.common.Money value,
            @JsonProperty("country") final String country,
            @JsonProperty("customerGroup") final com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier customerGroup,
            @JsonProperty("channel") final com.commercetools.api.models.channel.ChannelResourceIdentifier channel,
            @JsonProperty("discounted") final com.commercetools.api.models.common.DiscountedPriceDraft discounted,
            @JsonProperty("validFrom") final java.time.ZonedDateTime validFrom,
            @JsonProperty("validUntil") final java.time.ZonedDateTime validUntil,
            @JsonProperty("tiers") final java.util.List<com.commercetools.api.models.common.PriceTier> tiers,
            @JsonProperty("custom") final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.value = value;
        this.country = country;
        this.customerGroup = customerGroup;
        this.channel = channel;
        this.discounted = discounted;
        this.validFrom = validFrom;
        this.validUntil = validUntil;
        this.tiers = tiers;
        this.custom = custom;
    }

    public EmbeddedPriceDraftImpl() {
    }

    /**
     *  <p>Sets the money value of the EmbeddedPrice.</p>
     */

    public com.commercetools.api.models.common.Money getValue() {
        return this.value;
    }

    /**
     *  <p>Sets the country for which the EmbeddedPrice is valid. If not set, the Price is valid for any country.</p>
     */

    public String getCountry() {
        return this.country;
    }

    /**
     *  <p>Sets the CustomerGroup for which the EmbeddedPrice is valid.</p>
     */

    public com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier getCustomerGroup() {
        return this.customerGroup;
    }

    /**
     *  <p>Sets the product distribution Channel for which the EmbeddedPrice is valid.</p>
     */

    public com.commercetools.api.models.channel.ChannelResourceIdentifier getChannel() {
        return this.channel;
    }

    /**
     *  <p>Sets a discounted Price from an <strong>external service</strong>. Absolute or relative ProductDiscount prices are automatically added to a Product's EmbeddedPrice when created. The DiscountedPrice must reference a ProductDiscount with:</p>
     *  <ul>
     *   <li>The <code>isActive</code> flag set to <code>true</code>.</li>
     *   <li>An <code>external</code> ProductDiscountValue.</li>
     *   <li>A <code>predicate</code> which matches the ProductVariant the EmbeddedPrice is referenced from.</li>
     *  </ul>
     */

    public com.commercetools.api.models.common.DiscountedPriceDraft getDiscounted() {
        return this.discounted;
    }

    /**
     *  <p>Sets the date from which the EmbeddedPrice is valid.</p>
     */

    public java.time.ZonedDateTime getValidFrom() {
        return this.validFrom;
    }

    /**
     *  <p>Sets the date until the EmbeddedPrice is valid.</p>
     */

    public java.time.ZonedDateTime getValidUntil() {
        return this.validUntil;
    }

    /**
     *  <p>Sets Price tiers.</p>
     */

    public java.util.List<com.commercetools.api.models.common.PriceTier> getTiers() {
        return this.tiers;
    }

    /**
     *  <p>Custom Fields for the EmbeddedPrice.</p>
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

    public void setDiscounted(final com.commercetools.api.models.common.DiscountedPriceDraft discounted) {
        this.discounted = discounted;
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

    public void setCustom(final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        EmbeddedPriceDraftImpl that = (EmbeddedPriceDraftImpl) o;

        return new EqualsBuilder().append(value, that.value)
                .append(country, that.country)
                .append(customerGroup, that.customerGroup)
                .append(channel, that.channel)
                .append(discounted, that.discounted)
                .append(validFrom, that.validFrom)
                .append(validUntil, that.validUntil)
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
                .append(discounted)
                .append(validFrom)
                .append(validUntil)
                .append(tiers)
                .append(custom)
                .toHashCode();
    }

}
