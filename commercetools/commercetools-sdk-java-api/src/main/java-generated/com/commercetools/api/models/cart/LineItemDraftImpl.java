
package com.commercetools.api.models.cart;

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
 *  <p>For Product Variant identification, either the <code>productId</code> and <code>variantId</code>, or <code>sku</code> must be provided.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class LineItemDraftImpl implements LineItemDraft, ModelBase {

    private String productId;

    private Long variantId;

    private String sku;

    private Long quantity;

    private java.time.ZonedDateTime addedAt;

    private com.commercetools.api.models.channel.ChannelResourceIdentifier distributionChannel;

    private com.commercetools.api.models.channel.ChannelResourceIdentifier supplyChannel;

    private com.commercetools.api.models.common.Money externalPrice;

    private com.commercetools.api.models.cart.ExternalLineItemTotalPrice externalTotalPrice;

    private com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate;

    private com.commercetools.api.models.cart.InventoryMode inventoryMode;

    private com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetails;

    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    /**
     * create instance with all properties
     */
    @JsonCreator
    LineItemDraftImpl(@JsonProperty("productId") final String productId,
            @JsonProperty("variantId") final Long variantId, @JsonProperty("sku") final String sku,
            @JsonProperty("quantity") final Long quantity,
            @JsonProperty("addedAt") final java.time.ZonedDateTime addedAt,
            @JsonProperty("distributionChannel") final com.commercetools.api.models.channel.ChannelResourceIdentifier distributionChannel,
            @JsonProperty("supplyChannel") final com.commercetools.api.models.channel.ChannelResourceIdentifier supplyChannel,
            @JsonProperty("externalPrice") final com.commercetools.api.models.common.Money externalPrice,
            @JsonProperty("externalTotalPrice") final com.commercetools.api.models.cart.ExternalLineItemTotalPrice externalTotalPrice,
            @JsonProperty("externalTaxRate") final com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate,
            @JsonProperty("inventoryMode") final com.commercetools.api.models.cart.InventoryMode inventoryMode,
            @JsonProperty("shippingDetails") final com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetails,
            @JsonProperty("custom") final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.productId = productId;
        this.variantId = variantId;
        this.sku = sku;
        this.quantity = quantity;
        this.addedAt = addedAt;
        this.distributionChannel = distributionChannel;
        this.supplyChannel = supplyChannel;
        this.externalPrice = externalPrice;
        this.externalTotalPrice = externalTotalPrice;
        this.externalTaxRate = externalTaxRate;
        this.inventoryMode = inventoryMode;
        this.shippingDetails = shippingDetails;
        this.custom = custom;
    }

    /**
     * create empty instance
     */
    public LineItemDraftImpl() {
    }

    /**
     *  <p><code>id</code> of a published Product.</p>
     */

    public String getProductId() {
        return this.productId;
    }

    /**
     *  <p><code>id</code> of the ProductVariant in the Product. If not provided, the Master Variant is used.</p>
     */

    public Long getVariantId() {
        return this.variantId;
    }

    /**
     *  <p><code>sku</code> of the ProductVariant.</p>
     */

    public String getSku() {
        return this.sku;
    }

    /**
     *  <p>Quantity of the Product Variant to add to the Cart.</p>
     */

    public Long getQuantity() {
        return this.quantity;
    }

    /**
     *  <p>Date and time (UTC) the Product Variant is added to the Cart. If not set, it defaults to the current date and time.</p>
     *  <p>Optional for backwards compatibility reasons.</p>
     */

    public java.time.ZonedDateTime getAddedAt() {
        return this.addedAt;
    }

    /**
     *  <p>Used to select a Product Price. The referenced Channel must have the <code>ProductDistribution</code> ChannelRoleEnum.</p>
     *  <p>If the Cart is bound to a Store with <code>distributionChannels</code> set, the Channel must match one of the Store's distribution channels.</p>
     */

    public com.commercetools.api.models.channel.ChannelResourceIdentifier getDistributionChannel() {
        return this.distributionChannel;
    }

    /**
     *  <p>Used to identify Inventory entries that must be reserved. The referenced Channel must have the <code>InventorySupply</code> ChannelRoleEnum.</p>
     */

    public com.commercetools.api.models.channel.ChannelResourceIdentifier getSupplyChannel() {
        return this.supplyChannel;
    }

    /**
     *  <p>Sets the LineItem <code>price</code> value, and the <code>priceMode</code> to <code>ExternalPrice</code> LineItemPriceMode.</p>
     */

    public com.commercetools.api.models.common.Money getExternalPrice() {
        return this.externalPrice;
    }

    /**
     *  <p>Sets the LineItem <code>price</code> and <code>totalPrice</code> values, and the <code>priceMode</code> to <code>ExternalTotal</code> LineItemPriceMode.</p>
     */

    public com.commercetools.api.models.cart.ExternalLineItemTotalPrice getExternalTotalPrice() {
        return this.externalTotalPrice;
    }

    /**
     *  <p>External Tax Rate for the Line Item if the Cart has the <code>External</code> TaxMode.</p>
     */

    public com.commercetools.api.models.cart.ExternalTaxRateDraft getExternalTaxRate() {
        return this.externalTaxRate;
    }

    /**
     *  <p>Inventory mode specific to the Line Item only, and valid for the entire <code>quantity</code> of the Line Item. Set only if the inventory mode should be different from the <code>inventoryMode</code> specified on the Cart.</p>
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
     *  <p>Custom Fields for the Line Item.</p>
     */

    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    public void setProductId(final String productId) {
        this.productId = productId;
    }

    public void setVariantId(final Long variantId) {
        this.variantId = variantId;
    }

    public void setSku(final String sku) {
        this.sku = sku;
    }

    public void setQuantity(final Long quantity) {
        this.quantity = quantity;
    }

    public void setAddedAt(final java.time.ZonedDateTime addedAt) {
        this.addedAt = addedAt;
    }

    public void setDistributionChannel(
            final com.commercetools.api.models.channel.ChannelResourceIdentifier distributionChannel) {
        this.distributionChannel = distributionChannel;
    }

    public void setSupplyChannel(final com.commercetools.api.models.channel.ChannelResourceIdentifier supplyChannel) {
        this.supplyChannel = supplyChannel;
    }

    public void setExternalPrice(final com.commercetools.api.models.common.Money externalPrice) {
        this.externalPrice = externalPrice;
    }

    public void setExternalTotalPrice(
            final com.commercetools.api.models.cart.ExternalLineItemTotalPrice externalTotalPrice) {
        this.externalTotalPrice = externalTotalPrice;
    }

    public void setExternalTaxRate(final com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate) {
        this.externalTaxRate = externalTaxRate;
    }

    public void setInventoryMode(final com.commercetools.api.models.cart.InventoryMode inventoryMode) {
        this.inventoryMode = inventoryMode;
    }

    public void setShippingDetails(final com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetails) {
        this.shippingDetails = shippingDetails;
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

        LineItemDraftImpl that = (LineItemDraftImpl) o;

        return new EqualsBuilder().append(productId, that.productId)
                .append(variantId, that.variantId)
                .append(sku, that.sku)
                .append(quantity, that.quantity)
                .append(addedAt, that.addedAt)
                .append(distributionChannel, that.distributionChannel)
                .append(supplyChannel, that.supplyChannel)
                .append(externalPrice, that.externalPrice)
                .append(externalTotalPrice, that.externalTotalPrice)
                .append(externalTaxRate, that.externalTaxRate)
                .append(inventoryMode, that.inventoryMode)
                .append(shippingDetails, that.shippingDetails)
                .append(custom, that.custom)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(productId)
                .append(variantId)
                .append(sku)
                .append(quantity)
                .append(addedAt)
                .append(distributionChannel)
                .append(supplyChannel)
                .append(externalPrice)
                .append(externalTotalPrice)
                .append(externalTaxRate)
                .append(inventoryMode)
                .append(shippingDetails)
                .append(custom)
                .toHashCode();
    }

}
