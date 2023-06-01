package com.commercetools.api.models.me;

import com.commercetools.api.models.cart.ItemShippingDetailsDraft;
import com.commercetools.api.models.channel.ChannelResourceIdentifier;
import com.commercetools.api.models.type.CustomFieldsDraft;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.ModelBase;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *  <p>For Product Variant identification, either the <code>productId</code> and <code>variantId</code>, or <code>sku</code> must be provided.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class MyLineItemDraftImpl implements MyLineItemDraft, ModelBase {

    
    private String productId;
    
    
    private Long variantId;
    
    
    private String sku;
    
    
    private Long quantity;
    
    
    private java.time.ZonedDateTime addedAt;
    
    
    private com.commercetools.api.models.channel.ChannelResourceIdentifier supplyChannel;
    
    
    private com.commercetools.api.models.channel.ChannelResourceIdentifier distributionChannel;
    
    
    private com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetails;
    
    
    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    /**
     * create instance with all properties
     */
    @JsonCreator
    MyLineItemDraftImpl(@JsonProperty("productId") final String productId, @JsonProperty("variantId") final Long variantId, @JsonProperty("sku") final String sku, @JsonProperty("quantity") final Long quantity, @JsonProperty("addedAt") final java.time.ZonedDateTime addedAt, @JsonProperty("supplyChannel") final com.commercetools.api.models.channel.ChannelResourceIdentifier supplyChannel, @JsonProperty("distributionChannel") final com.commercetools.api.models.channel.ChannelResourceIdentifier distributionChannel, @JsonProperty("shippingDetails") final com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetails, @JsonProperty("custom") final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.productId = productId;
        this.variantId = variantId;
        this.sku = sku;
        this.quantity = quantity;
        this.addedAt = addedAt;
        this.supplyChannel = supplyChannel;
        this.distributionChannel = distributionChannel;
        this.shippingDetails = shippingDetails;
        this.custom = custom;
    }
    /**
     * create empty instance
     */
    public MyLineItemDraftImpl() {
    }

    /**
     *  <p><code>id</code> of the Product.</p>
     */
    
    public String getProductId(){
        return this.productId;
    }
    
    /**
     *  <p><code>id</code> of the ProductVariant in the Product. If not provided, the Master Variant is used.</p>
     */
    
    public Long getVariantId(){
        return this.variantId;
    }
    
    /**
     *  <p><code>sku</code> of the ProductVariant.</p>
     */
    
    public String getSku(){
        return this.sku;
    }
    
    /**
     *  <p>Number of Product Variants to add to the Cart.</p>
     */
    
    public Long getQuantity(){
        return this.quantity;
    }
    
    /**
     *  <p>Date and time (UTC) the Product Variant is added to the Cart. If not set, it defaults to the current date and time.</p>
     *  <p>Optional for backwards compatibility reasons.</p>
     */
    
    public java.time.ZonedDateTime getAddedAt(){
        return this.addedAt;
    }
    
    /**
     *  <p>Used to identify Inventory entries that must be reserved. The Channel must have the <code>InventorySupply</code> ChannelRoleEnum.</p>
     */
    
    public com.commercetools.api.models.channel.ChannelResourceIdentifier getSupplyChannel(){
        return this.supplyChannel;
    }
    
    /**
     *  <p>Used to select a Product Price. The Channel must have the <code>ProductDistribution</code> ChannelRoleEnum.</p>
     *  <p>If the Cart is bound to a Store with <code>distributionChannels</code> set, the Channel must match one of the Store's distribution channels.</p>
     */
    
    public com.commercetools.api.models.channel.ChannelResourceIdentifier getDistributionChannel(){
        return this.distributionChannel;
    }
    
    /**
     *  <p>Container for Line Item-specific addresses.</p>
     */
    
    public com.commercetools.api.models.cart.ItemShippingDetailsDraft getShippingDetails(){
        return this.shippingDetails;
    }
    
    /**
     *  <p>Custom Fields for the Cart.</p>
     */
    
    public com.commercetools.api.models.type.CustomFieldsDraft getCustom(){
        return this.custom;
    }

    
    public void setProductId(final String productId){
        this.productId = productId;
    }
    
    
    public void setVariantId(final Long variantId){
        this.variantId = variantId;
    }
    
    
    public void setSku(final String sku){
        this.sku = sku;
    }
    
    
    public void setQuantity(final Long quantity){
        this.quantity = quantity;
    }
    
    
    public void setAddedAt(final java.time.ZonedDateTime addedAt){
        this.addedAt = addedAt;
    }
    
    
    public void setSupplyChannel(final com.commercetools.api.models.channel.ChannelResourceIdentifier supplyChannel){
        this.supplyChannel = supplyChannel;
    }
    
    
    public void setDistributionChannel(final com.commercetools.api.models.channel.ChannelResourceIdentifier distributionChannel){
        this.distributionChannel = distributionChannel;
    }
    
    
    public void setShippingDetails(final com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetails){
        this.shippingDetails = shippingDetails;
    }
    
    
    public void setCustom(final com.commercetools.api.models.type.CustomFieldsDraft custom){
        this.custom = custom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        MyLineItemDraftImpl that = (MyLineItemDraftImpl) o;
    
        return new EqualsBuilder()
                .append(productId, that.productId)
                .append(variantId, that.variantId)
                .append(sku, that.sku)
                .append(quantity, that.quantity)
                .append(addedAt, that.addedAt)
                .append(supplyChannel, that.supplyChannel)
                .append(distributionChannel, that.distributionChannel)
                .append(shippingDetails, that.shippingDetails)
                .append(custom, that.custom)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(productId)
            .append(variantId)
            .append(sku)
            .append(quantity)
            .append(addedAt)
            .append(supplyChannel)
            .append(distributionChannel)
            .append(shippingDetails)
            .append(custom)
            .toHashCode();
    }

}
