package com.commercetools.models.Cart;

import com.commercetools.models.Cart.ExternalLineItemTotalPrice;
import com.commercetools.models.Cart.ExternalTaxRateDraft;
import com.commercetools.models.Cart.ItemShippingDetailsDraft;
import com.commercetools.models.Channel.ChannelResourceIdentifier;
import com.commercetools.models.Common.Money;
import com.commercetools.models.Type.CustomFieldsDraft;
import java.lang.Long;
import java.lang.String;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import json.CommercetoolsJsonUtils;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class LineItemDraftImpl implements LineItemDraft {

   private com.commercetools.models.Cart.ExternalTaxRateDraft externalTaxRate;
   
   private java.lang.Long quantity;
   
   private com.commercetools.models.Cart.ItemShippingDetailsDraft shippingDetails;
   
   private java.lang.String productId;
   
   private com.commercetools.models.Cart.ExternalLineItemTotalPrice externalTotalPrice;
   
   private com.commercetools.models.Type.CustomFieldsDraft custom;
   
   private com.commercetools.models.Channel.ChannelResourceIdentifier supplyChannel;
   
   private java.lang.Long variantId;
   
   private com.commercetools.models.Channel.ChannelResourceIdentifier distributionChannel;
   
   private java.lang.String sku;
   
   private com.commercetools.models.Common.Money externalPrice;

   @JsonCreator
   LineItemDraftImpl(@JsonProperty("externalTaxRate") final com.commercetools.models.Cart.ExternalTaxRateDraft externalTaxRate, @JsonProperty("quantity") final java.lang.Long quantity, @JsonProperty("shippingDetails") final com.commercetools.models.Cart.ItemShippingDetailsDraft shippingDetails, @JsonProperty("productId") final java.lang.String productId, @JsonProperty("externalTotalPrice") final com.commercetools.models.Cart.ExternalLineItemTotalPrice externalTotalPrice, @JsonProperty("custom") final com.commercetools.models.Type.CustomFieldsDraft custom, @JsonProperty("supplyChannel") final com.commercetools.models.Channel.ChannelResourceIdentifier supplyChannel, @JsonProperty("variantId") final java.lang.Long variantId, @JsonProperty("distributionChannel") final com.commercetools.models.Channel.ChannelResourceIdentifier distributionChannel, @JsonProperty("sku") final java.lang.String sku, @JsonProperty("externalPrice") final com.commercetools.models.Common.Money externalPrice) {
      this.externalTaxRate = externalTaxRate;
      this.quantity = quantity;
      this.shippingDetails = shippingDetails;
      this.productId = productId;
      this.externalTotalPrice = externalTotalPrice;
      this.custom = custom;
      this.supplyChannel = supplyChannel;
      this.variantId = variantId;
      this.distributionChannel = distributionChannel;
      this.sku = sku;
      this.externalPrice = externalPrice;
   }
   public LineItemDraftImpl() {
      
   }
   
   
   public com.commercetools.models.Cart.ExternalTaxRateDraft getExternalTaxRate(){
      return this.externalTaxRate;
   }
   
   
   public java.lang.Long getQuantity(){
      return this.quantity;
   }
   
   
   public com.commercetools.models.Cart.ItemShippingDetailsDraft getShippingDetails(){
      return this.shippingDetails;
   }
   
   
   public java.lang.String getProductId(){
      return this.productId;
   }
   
   
   public com.commercetools.models.Cart.ExternalLineItemTotalPrice getExternalTotalPrice(){
      return this.externalTotalPrice;
   }
   
   
   public com.commercetools.models.Type.CustomFieldsDraft getCustom(){
      return this.custom;
   }
   
   
   public com.commercetools.models.Channel.ChannelResourceIdentifier getSupplyChannel(){
      return this.supplyChannel;
   }
   
   
   public java.lang.Long getVariantId(){
      return this.variantId;
   }
   
   
   public com.commercetools.models.Channel.ChannelResourceIdentifier getDistributionChannel(){
      return this.distributionChannel;
   }
   
   
   public java.lang.String getSku(){
      return this.sku;
   }
   
   
   public com.commercetools.models.Common.Money getExternalPrice(){
      return this.externalPrice;
   }

   public void setExternalTaxRate(final com.commercetools.models.Cart.ExternalTaxRateDraft externalTaxRate){
      this.externalTaxRate = externalTaxRate;
   }
   
   public void setQuantity(final java.lang.Long quantity){
      this.quantity = quantity;
   }
   
   public void setShippingDetails(final com.commercetools.models.Cart.ItemShippingDetailsDraft shippingDetails){
      this.shippingDetails = shippingDetails;
   }
   
   public void setProductId(final java.lang.String productId){
      this.productId = productId;
   }
   
   public void setExternalTotalPrice(final com.commercetools.models.Cart.ExternalLineItemTotalPrice externalTotalPrice){
      this.externalTotalPrice = externalTotalPrice;
   }
   
   public void setCustom(final com.commercetools.models.Type.CustomFieldsDraft custom){
      this.custom = custom;
   }
   
   public void setSupplyChannel(final com.commercetools.models.Channel.ChannelResourceIdentifier supplyChannel){
      this.supplyChannel = supplyChannel;
   }
   
   public void setVariantId(final java.lang.Long variantId){
      this.variantId = variantId;
   }
   
   public void setDistributionChannel(final com.commercetools.models.Channel.ChannelResourceIdentifier distributionChannel){
      this.distributionChannel = distributionChannel;
   }
   
   public void setSku(final java.lang.String sku){
      this.sku = sku;
   }
   
   public void setExternalPrice(final com.commercetools.models.Common.Money externalPrice){
      this.externalPrice = externalPrice;
   }

}