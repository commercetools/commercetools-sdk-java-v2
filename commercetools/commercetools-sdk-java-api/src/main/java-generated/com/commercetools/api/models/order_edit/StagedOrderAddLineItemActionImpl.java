package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.cart.ExternalLineItemTotalPrice;
import com.commercetools.api.models.cart.ExternalTaxRateDraft;
import com.commercetools.api.models.cart.ItemShippingDetailsDraft;
import com.commercetools.api.models.channel.ChannelResourceIdentifier;
import com.commercetools.api.models.common.Money;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
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
 * StagedOrderAddLineItemAction
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class StagedOrderAddLineItemActionImpl implements StagedOrderAddLineItemAction, ModelBase {

    
    private String action;
    
    
    private com.commercetools.api.models.type.CustomFieldsDraft custom;
    
    
    private com.commercetools.api.models.channel.ChannelResourceIdentifier distributionChannel;
    
    
    private com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate;
    
    
    private String productId;
    
    
    private Long variantId;
    
    
    private String sku;
    
    
    private Long quantity;
    
    
    private java.time.ZonedDateTime addedAt;
    
    
    private com.commercetools.api.models.channel.ChannelResourceIdentifier supplyChannel;
    
    
    private com.commercetools.api.models.common.Money externalPrice;
    
    
    private com.commercetools.api.models.cart.ExternalLineItemTotalPrice externalTotalPrice;
    
    
    private com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetails;

    /**
     * create instance with all properties
     */
    @JsonCreator
    StagedOrderAddLineItemActionImpl(@JsonProperty("custom") final com.commercetools.api.models.type.CustomFieldsDraft custom, @JsonProperty("distributionChannel") final com.commercetools.api.models.channel.ChannelResourceIdentifier distributionChannel, @JsonProperty("externalTaxRate") final com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate, @JsonProperty("productId") final String productId, @JsonProperty("variantId") final Long variantId, @JsonProperty("sku") final String sku, @JsonProperty("quantity") final Long quantity, @JsonProperty("addedAt") final java.time.ZonedDateTime addedAt, @JsonProperty("supplyChannel") final com.commercetools.api.models.channel.ChannelResourceIdentifier supplyChannel, @JsonProperty("externalPrice") final com.commercetools.api.models.common.Money externalPrice, @JsonProperty("externalTotalPrice") final com.commercetools.api.models.cart.ExternalLineItemTotalPrice externalTotalPrice, @JsonProperty("shippingDetails") final com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetails) {
        this.custom = custom;
        this.distributionChannel = distributionChannel;
        this.externalTaxRate = externalTaxRate;
        this.productId = productId;
        this.variantId = variantId;
        this.sku = sku;
        this.quantity = quantity;
        this.addedAt = addedAt;
        this.supplyChannel = supplyChannel;
        this.externalPrice = externalPrice;
        this.externalTotalPrice = externalTotalPrice;
        this.shippingDetails = shippingDetails;
        this.action =  ADD_LINE_ITEM;
    }
    /**
     * create empty instance
     */
    public StagedOrderAddLineItemActionImpl() {
        this.action =  ADD_LINE_ITEM;
    }

    /**
     *
     */
    
    public String getAction(){
        return this.action;
    }
    
    /**
     *  <p>The representation used when creating or updating a customizable data type with Custom Fields.</p>
     */
    
    public com.commercetools.api.models.type.CustomFieldsDraft getCustom(){
        return this.custom;
    }
    
    /**
     *  <p>ResourceIdentifier to a Channel.</p>
     */
    
    public com.commercetools.api.models.channel.ChannelResourceIdentifier getDistributionChannel(){
        return this.distributionChannel;
    }
    
    /**
     *  <p>Controls calculation of taxed prices for Line Items, Custom Line Items, and Shipping Methods as explained in Cart tax calculation.</p>
     */
    
    public com.commercetools.api.models.cart.ExternalTaxRateDraft getExternalTaxRate(){
        return this.externalTaxRate;
    }
    
    /**
     *
     */
    
    public String getProductId(){
        return this.productId;
    }
    
    /**
     *
     */
    
    public Long getVariantId(){
        return this.variantId;
    }
    
    /**
     *
     */
    
    public String getSku(){
        return this.sku;
    }
    
    /**
     *
     */
    
    public Long getQuantity(){
        return this.quantity;
    }
    
    /**
     *
     */
    
    public java.time.ZonedDateTime getAddedAt(){
        return this.addedAt;
    }
    
    /**
     *  <p>ResourceIdentifier to a Channel.</p>
     */
    
    public com.commercetools.api.models.channel.ChannelResourceIdentifier getSupplyChannel(){
        return this.supplyChannel;
    }
    
    /**
     *  <p>Draft type that stores amounts only in cent precision for the specified currency.</p>
     */
    
    public com.commercetools.api.models.common.Money getExternalPrice(){
        return this.externalPrice;
    }
    
    /**
     *
     */
    
    public com.commercetools.api.models.cart.ExternalLineItemTotalPrice getExternalTotalPrice(){
        return this.externalTotalPrice;
    }
    
    /**
     *  <p>For order creation and updates, the sum of the <code>targets</code> must match the quantity of the Line Items or Custom Line Items.</p>
     */
    
    public com.commercetools.api.models.cart.ItemShippingDetailsDraft getShippingDetails(){
        return this.shippingDetails;
    }

    
    public void setCustom(final com.commercetools.api.models.type.CustomFieldsDraft custom){
        this.custom = custom;
    }
    
    
    public void setDistributionChannel(final com.commercetools.api.models.channel.ChannelResourceIdentifier distributionChannel){
        this.distributionChannel = distributionChannel;
    }
    
    
    public void setExternalTaxRate(final com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate){
        this.externalTaxRate = externalTaxRate;
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
    
    
    public void setExternalPrice(final com.commercetools.api.models.common.Money externalPrice){
        this.externalPrice = externalPrice;
    }
    
    
    public void setExternalTotalPrice(final com.commercetools.api.models.cart.ExternalLineItemTotalPrice externalTotalPrice){
        this.externalTotalPrice = externalTotalPrice;
    }
    
    
    public void setShippingDetails(final com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetails){
        this.shippingDetails = shippingDetails;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        StagedOrderAddLineItemActionImpl that = (StagedOrderAddLineItemActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(custom, that.custom)
                .append(distributionChannel, that.distributionChannel)
                .append(externalTaxRate, that.externalTaxRate)
                .append(productId, that.productId)
                .append(variantId, that.variantId)
                .append(sku, that.sku)
                .append(quantity, that.quantity)
                .append(addedAt, that.addedAt)
                .append(supplyChannel, that.supplyChannel)
                .append(externalPrice, that.externalPrice)
                .append(externalTotalPrice, that.externalTotalPrice)
                .append(shippingDetails, that.shippingDetails)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(custom)
            .append(distributionChannel)
            .append(externalTaxRate)
            .append(productId)
            .append(variantId)
            .append(sku)
            .append(quantity)
            .append(addedAt)
            .append(supplyChannel)
            .append(externalPrice)
            .append(externalTotalPrice)
            .append(shippingDetails)
            .toHashCode();
    }

}
