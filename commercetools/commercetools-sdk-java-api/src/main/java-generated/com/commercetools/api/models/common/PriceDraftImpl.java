
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

/**
 *  <p>The draft representation for prices to be embedded into ProductVariantDrafts when the ProductPriceMode is <code>Embedded</code>. For the <code>Standalone</code> ProductPriceMode use StandalonePriceDraft.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PriceDraftImpl implements PriceDraft, ModelBase {

    private String key;

    private com.commercetools.api.models.common.Money value;

    private String country;

    private com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier customerGroup;

    private com.commercetools.api.models.channel.ChannelResourceIdentifier channel;

    private java.time.ZonedDateTime validFrom;

    private java.time.ZonedDateTime validUntil;

    private com.commercetools.api.models.common.DiscountedPriceDraft discounted;

    private java.util.List<com.commercetools.api.models.common.PriceTierDraft> tiers;

    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    /**
     * create instance with all properties
     */
    @JsonCreator
    PriceDraftImpl(@JsonProperty("key") final String key,
            @JsonProperty("value") final com.commercetools.api.models.common.Money value,
            @JsonProperty("country") final String country,
            @JsonProperty("customerGroup") final com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier customerGroup,
            @JsonProperty("channel") final com.commercetools.api.models.channel.ChannelResourceIdentifier channel,
            @JsonProperty("validFrom") final java.time.ZonedDateTime validFrom,
            @JsonProperty("validUntil") final java.time.ZonedDateTime validUntil,
            @JsonProperty("discounted") final com.commercetools.api.models.common.DiscountedPriceDraft discounted,
            @JsonProperty("tiers") final java.util.List<com.commercetools.api.models.common.PriceTierDraft> tiers,
            @JsonProperty("custom") final com.commercetools.api.models.type.CustomFieldsDraft custom) {
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
    }

    /**
     * create empty instance
     */
    public PriceDraftImpl() {
    }

    /**
     *  <p>User-defined identifier for the Price. It must be unique per ProductVariant.</p>
     */

    public String getKey() {
        return this.key;
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
     *  <p>Set this field if this Price is only valid for the referenced CustomerGroup.</p>
     */

    public com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier getCustomerGroup() {
        return this.customerGroup;
    }

    /**
     *  <p>Set this field if this Price is only valid for the referenced <code>ProductDistribution</code> Channel.</p>
     */

    public com.commercetools.api.models.channel.ChannelResourceIdentifier getChannel() {
        return this.channel;
    }

    /**
     *  <p>Set this field if this Price is only valid from the specified date and time. Must be at least 1 ms earlier than <code>validUntil</code>.</p>
     */

    public java.time.ZonedDateTime getValidFrom() {
        return this.validFrom;
    }

    /**
     *  <p>Set this field if this Price is only valid until the specified date and time. Must be at least 1 ms later than <code>validFrom</code>. Prices that are no longer valid are not automatically removed, but they can be removed if necessary.</p>
     */

    public java.time.ZonedDateTime getValidUntil() {
        return this.validUntil;
    }

    /**
     *  <p>Set this field to add a DiscountedPrice from an <strong>external service</strong>.</p>
     *  <p>Otherwise, Composable Commerce sets this field automatically if at least one ProductDiscount applies. The DiscountedPrice must reference a ProductDiscount with:</p>
     *  <ul>
     *   <li>The <code>isActive</code> flag set to <code>true</code>.</li>
     *   <li>A ProductDiscountValue of type <code>external</code>.</li>
     *   <li>A <code>predicate</code> that matches the ProductVariant the Price is referenced from.</li>
     *  </ul>
     */

    public com.commercetools.api.models.common.DiscountedPriceDraft getDiscounted() {
        return this.discounted;
    }

    /**
     *  <p>Set this field to specify different Prices for certain LineItem quantities.</p>
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

    public void setKey(final String key) {
        this.key = key;
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

        return new EqualsBuilder().append(key, that.key)
                .append(value, that.value)
                .append(country, that.country)
                .append(customerGroup, that.customerGroup)
                .append(channel, that.channel)
                .append(validFrom, that.validFrom)
                .append(validUntil, that.validUntil)
                .append(discounted, that.discounted)
                .append(tiers, that.tiers)
                .append(custom, that.custom)
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
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(key)
                .append(value)
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
