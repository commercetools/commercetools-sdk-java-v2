
package com.commercetools.importapi.models.prices;

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
 *  <p>The data representation for a price to be imported that is persisted as a Price in the Project.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PriceImportImpl implements PriceImport, ModelBase {

    private String key;

    private com.commercetools.importapi.models.common.TypedMoney value;

    private String country;

    private java.time.ZonedDateTime validFrom;

    private java.time.ZonedDateTime validUntil;

    private com.commercetools.importapi.models.common.CustomerGroupKeyReference customerGroup;

    private com.commercetools.importapi.models.common.ChannelKeyReference channel;

    private com.commercetools.importapi.models.common.DiscountedPrice discounted;

    private Boolean staged;

    private java.util.List<com.commercetools.importapi.models.common.PriceTier> tiers;

    private com.commercetools.importapi.models.customfields.Custom custom;

    private com.commercetools.importapi.models.common.ProductVariantKeyReference productVariant;

    private com.commercetools.importapi.models.common.ProductKeyReference product;

    /**
     * create instance with all properties
     */
    @JsonCreator
    PriceImportImpl(@JsonProperty("key") final String key,
            @JsonProperty("value") final com.commercetools.importapi.models.common.TypedMoney value,
            @JsonProperty("country") final String country,
            @JsonProperty("validFrom") final java.time.ZonedDateTime validFrom,
            @JsonProperty("validUntil") final java.time.ZonedDateTime validUntil,
            @JsonProperty("customerGroup") final com.commercetools.importapi.models.common.CustomerGroupKeyReference customerGroup,
            @JsonProperty("channel") final com.commercetools.importapi.models.common.ChannelKeyReference channel,
            @JsonProperty("discounted") final com.commercetools.importapi.models.common.DiscountedPrice discounted,
            @JsonProperty("staged") final Boolean staged,
            @JsonProperty("tiers") final java.util.List<com.commercetools.importapi.models.common.PriceTier> tiers,
            @JsonProperty("custom") final com.commercetools.importapi.models.customfields.Custom custom,
            @JsonProperty("productVariant") final com.commercetools.importapi.models.common.ProductVariantKeyReference productVariant,
            @JsonProperty("product") final com.commercetools.importapi.models.common.ProductKeyReference product) {
        this.key = key;
        this.value = value;
        this.country = country;
        this.validFrom = validFrom;
        this.validUntil = validUntil;
        this.customerGroup = customerGroup;
        this.channel = channel;
        this.discounted = discounted;
        this.staged = staged;
        this.tiers = tiers;
        this.custom = custom;
        this.productVariant = productVariant;
        this.product = product;
    }

    /**
     * create empty instance
     */
    public PriceImportImpl() {
    }

    /**
     *  <p>User-defined unique identifier for the Embedded Price. If a Price with this <code>key</code> exists on the specified <code>productVariant</code>, it will be updated with the imported data.</p>
     */

    public String getKey() {
        return this.key;
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
     *  <p>The Reference to the CustomerGroup with which the Price is associated. If referenced CustomerGroup does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the necessary CustomerGroup is created.</p>
     */

    public com.commercetools.importapi.models.common.CustomerGroupKeyReference getCustomerGroup() {
        return this.customerGroup;
    }

    /**
     *  <p>The Reference to the Channel with which the Price is associated. If referenced Channel does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the necessary Channel is created.</p>
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
     *  <ul>
     *   <li>Set to <code>false</code> to update both the current and staged projections of the Product with the new Price data.</li>
     *   <li>Leave empty or set to <code>true</code> to only update the staged projection.</li>
     *  </ul>
     */

    public Boolean getStaged() {
        return this.staged;
    }

    /**
     *  <p>The tiered prices for this price.</p>
     */

    public java.util.List<com.commercetools.importapi.models.common.PriceTier> getTiers() {
        return this.tiers;
    }

    /**
     *  <p>The custom fields for this price.</p>
     */

    public com.commercetools.importapi.models.customfields.Custom getCustom() {
        return this.custom;
    }

    /**
     *  <p>The ProductVariant in which this Embedded Price is contained. The Reference to the ProductVariant with which the Price is associated. If referenced ProductVariant does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the necessary ProductVariant is created.</p>
     */

    public com.commercetools.importapi.models.common.ProductVariantKeyReference getProductVariant() {
        return this.productVariant;
    }

    /**
     *  <p>The Product in which the Product Variant containing this Embedded Price is contained. Maps to <code>ProductVariant.product</code>. The Reference to the Product with which the Price is associated. If referenced Product does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the necessary Product is created.</p>
     */

    public com.commercetools.importapi.models.common.ProductKeyReference getProduct() {
        return this.product;
    }

    public void setKey(final String key) {
        this.key = key;
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

    public void setStaged(final Boolean staged) {
        this.staged = staged;
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

    public void setProductVariant(
            final com.commercetools.importapi.models.common.ProductVariantKeyReference productVariant) {
        this.productVariant = productVariant;
    }

    public void setProduct(final com.commercetools.importapi.models.common.ProductKeyReference product) {
        this.product = product;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        PriceImportImpl that = (PriceImportImpl) o;

        return new EqualsBuilder().append(key, that.key)
                .append(value, that.value)
                .append(country, that.country)
                .append(validFrom, that.validFrom)
                .append(validUntil, that.validUntil)
                .append(customerGroup, that.customerGroup)
                .append(channel, that.channel)
                .append(discounted, that.discounted)
                .append(staged, that.staged)
                .append(tiers, that.tiers)
                .append(custom, that.custom)
                .append(productVariant, that.productVariant)
                .append(product, that.product)
                .append(key, that.key)
                .append(value, that.value)
                .append(country, that.country)
                .append(validFrom, that.validFrom)
                .append(validUntil, that.validUntil)
                .append(customerGroup, that.customerGroup)
                .append(channel, that.channel)
                .append(discounted, that.discounted)
                .append(staged, that.staged)
                .append(tiers, that.tiers)
                .append(custom, that.custom)
                .append(productVariant, that.productVariant)
                .append(product, that.product)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(key)
                .append(value)
                .append(country)
                .append(validFrom)
                .append(validUntil)
                .append(customerGroup)
                .append(channel)
                .append(discounted)
                .append(staged)
                .append(tiers)
                .append(custom)
                .append(productVariant)
                .append(product)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("key", key)
                .append("value", value)
                .append("country", country)
                .append("validFrom", validFrom)
                .append("validUntil", validUntil)
                .append("customerGroup", customerGroup)
                .append("channel", channel)
                .append("discounted", discounted)
                .append("staged", staged)
                .append("tiers", tiers)
                .append("custom", custom)
                .append("productVariant", productVariant)
                .append("product", product)
                .build();
    }

}
