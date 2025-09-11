
package com.commercetools.api.models.order;

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
 *  <p>Represents a snapshot of a Product Variant at the time it was imported with the Order. The Product Variant can be specified by providing a <code>productId</code> and <code>variant.id</code>, or by providing a <code>variant.sku</code>.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class LineItemImportDraftImpl implements LineItemImportDraft, ModelBase {

    private com.commercetools.api.models.common.LocalizedString name;

    private String key;

    private com.commercetools.api.models.order.ProductVariantImportDraft variant;

    private String productId;

    private Long quantity;

    private com.commercetools.api.models.common.PriceDraft price;

    private com.commercetools.api.models.tax_category.TaxRate taxRate;

    private com.commercetools.api.models.channel.ChannelResourceIdentifier distributionChannel;

    private com.commercetools.api.models.channel.ChannelResourceIdentifier supplyChannel;

    private com.commercetools.api.models.cart.InventoryMode inventoryMode;

    private com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetails;

    private java.util.List<com.commercetools.api.models.order.ItemState> state;

    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    /**
     * create instance with all properties
     */
    @JsonCreator
    LineItemImportDraftImpl(@JsonProperty("name") final com.commercetools.api.models.common.LocalizedString name,
            @JsonProperty("key") final String key,
            @JsonProperty("variant") final com.commercetools.api.models.order.ProductVariantImportDraft variant,
            @JsonProperty("productId") final String productId, @JsonProperty("quantity") final Long quantity,
            @JsonProperty("price") final com.commercetools.api.models.common.PriceDraft price,
            @JsonProperty("taxRate") final com.commercetools.api.models.tax_category.TaxRate taxRate,
            @JsonProperty("distributionChannel") final com.commercetools.api.models.channel.ChannelResourceIdentifier distributionChannel,
            @JsonProperty("supplyChannel") final com.commercetools.api.models.channel.ChannelResourceIdentifier supplyChannel,
            @JsonProperty("inventoryMode") final com.commercetools.api.models.cart.InventoryMode inventoryMode,
            @JsonProperty("shippingDetails") final com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetails,
            @JsonProperty("state") final java.util.List<com.commercetools.api.models.order.ItemState> state,
            @JsonProperty("custom") final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.name = name;
        this.key = key;
        this.variant = variant;
        this.productId = productId;
        this.quantity = quantity;
        this.price = price;
        this.taxRate = taxRate;
        this.distributionChannel = distributionChannel;
        this.supplyChannel = supplyChannel;
        this.inventoryMode = inventoryMode;
        this.shippingDetails = shippingDetails;
        this.state = state;
        this.custom = custom;
    }

    /**
     * create empty instance
     */
    public LineItemImportDraftImpl() {
    }

    /**
     *  <p>Name of the Line Item.</p>
     */

    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    /**
     *  <p>User-defined unique identifier of the Line Item.</p>
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p>The Product Variant to use as a <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">Line Item</a>.</p>
     */

    public com.commercetools.api.models.order.ProductVariantImportDraft getVariant() {
        return this.variant;
    }

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> the Product Variant belongs to.</p>
     *  <p>If provided, you must also set <code>variant.id</code>.</p>
     */

    public String getProductId() {
        return this.productId;
    }

    /**
     *  <p>The number of Product Variants in the LineItem. Can be a negative value.</p>
     */

    public Long getQuantity() {
        return this.quantity;
    }

    /**
     *  <p>The Line Item price for <code>quantity</code> = <code>1</code>. The amount can be negative.</p>
     */

    public com.commercetools.api.models.common.PriceDraft getPrice() {
        return this.price;
    }

    /**
     *  <p>The tax rate used to calculate the <code>taxedPrice</code> of the Order.</p>
     */

    public com.commercetools.api.models.tax_category.TaxRate getTaxRate() {
        return this.taxRate;
    }

    /**
     *  <p>The Channel used to <span>select a Price</span>. This Channel must have the <code>ProductDistribution</code> role.</p>
     */

    public com.commercetools.api.models.channel.ChannelResourceIdentifier getDistributionChannel() {
        return this.distributionChannel;
    }

    /**
     *  <p>The Channel used to supply Line Items. By providing supply Channel information, you can uniquely identify <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">Inventory entries</a> that should be reserved. This Channel must have the <code>InventorySupply</code> role.</p>
     */

    public com.commercetools.api.models.channel.ChannelResourceIdentifier getSupplyChannel() {
        return this.supplyChannel;
    }

    /**
     *  <p>Inventory mode specific to the LineItem, valid for the entire <code>quantity</code> of the LineItem. Set only if Inventory mode should be different from the <code>inventoryMode</code> specified on the <a href="https://docs.commercetools.com/apis/ctp:api:type:OrderImportDraft" rel="nofollow">OrderImportDraft</a>.</p>
     */

    public com.commercetools.api.models.cart.InventoryMode getInventoryMode() {
        return this.inventoryMode;
    }

    /**
     *  <p>Container for Line Item-specific addresses.</p>
     */

    public com.commercetools.api.models.cart.ItemShippingDetailsDraft getShippingDetails() {
        return this.shippingDetails;
    }

    /**
     *  <p>States of the Line Item.</p>
     */

    public java.util.List<com.commercetools.api.models.order.ItemState> getState() {
        return this.state;
    }

    /**
     *  <p>Custom Fields of the LineItem.</p>
     */

    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    public void setName(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public void setVariant(final com.commercetools.api.models.order.ProductVariantImportDraft variant) {
        this.variant = variant;
    }

    public void setProductId(final String productId) {
        this.productId = productId;
    }

    public void setQuantity(final Long quantity) {
        this.quantity = quantity;
    }

    public void setPrice(final com.commercetools.api.models.common.PriceDraft price) {
        this.price = price;
    }

    public void setTaxRate(final com.commercetools.api.models.tax_category.TaxRate taxRate) {
        this.taxRate = taxRate;
    }

    public void setDistributionChannel(
            final com.commercetools.api.models.channel.ChannelResourceIdentifier distributionChannel) {
        this.distributionChannel = distributionChannel;
    }

    public void setSupplyChannel(final com.commercetools.api.models.channel.ChannelResourceIdentifier supplyChannel) {
        this.supplyChannel = supplyChannel;
    }

    public void setInventoryMode(final com.commercetools.api.models.cart.InventoryMode inventoryMode) {
        this.inventoryMode = inventoryMode;
    }

    public void setShippingDetails(final com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetails) {
        this.shippingDetails = shippingDetails;
    }

    public void setState(final com.commercetools.api.models.order.ItemState... state) {
        this.state = new ArrayList<>(Arrays.asList(state));
    }

    public void setState(final java.util.List<com.commercetools.api.models.order.ItemState> state) {
        this.state = state;
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

        LineItemImportDraftImpl that = (LineItemImportDraftImpl) o;

        return new EqualsBuilder().append(name, that.name)
                .append(key, that.key)
                .append(variant, that.variant)
                .append(productId, that.productId)
                .append(quantity, that.quantity)
                .append(price, that.price)
                .append(taxRate, that.taxRate)
                .append(distributionChannel, that.distributionChannel)
                .append(supplyChannel, that.supplyChannel)
                .append(inventoryMode, that.inventoryMode)
                .append(shippingDetails, that.shippingDetails)
                .append(state, that.state)
                .append(custom, that.custom)
                .append(name, that.name)
                .append(key, that.key)
                .append(variant, that.variant)
                .append(productId, that.productId)
                .append(quantity, that.quantity)
                .append(price, that.price)
                .append(taxRate, that.taxRate)
                .append(distributionChannel, that.distributionChannel)
                .append(supplyChannel, that.supplyChannel)
                .append(inventoryMode, that.inventoryMode)
                .append(shippingDetails, that.shippingDetails)
                .append(state, that.state)
                .append(custom, that.custom)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(name)
                .append(key)
                .append(variant)
                .append(productId)
                .append(quantity)
                .append(price)
                .append(taxRate)
                .append(distributionChannel)
                .append(supplyChannel)
                .append(inventoryMode)
                .append(shippingDetails)
                .append(state)
                .append(custom)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("name", name)
                .append("key", key)
                .append("variant", variant)
                .append("productId", productId)
                .append("quantity", quantity)
                .append("price", price)
                .append("taxRate", taxRate)
                .append("distributionChannel", distributionChannel)
                .append("supplyChannel", supplyChannel)
                .append("inventoryMode", inventoryMode)
                .append("shippingDetails", shippingDetails)
                .append("state", state)
                .append("custom", custom)
                .build();
    }

    @Override
    public LineItemImportDraft copyDeep() {
        return LineItemImportDraft.deepCopy(this);
    }
}
