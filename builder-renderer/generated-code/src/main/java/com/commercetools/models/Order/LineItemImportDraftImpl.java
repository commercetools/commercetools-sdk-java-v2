package com.commercetools.models.Order;

import com.commercetools.models.Cart.ItemShippingDetailsDraft;
import com.commercetools.models.Channel.ChannelResourceIdentifier;
import com.commercetools.models.Common.LocalizedString;
import com.commercetools.models.Common.PriceDraft;
import com.commercetools.models.Order.ItemState;
import com.commercetools.models.Order.ProductVariantImportDraft;
import com.commercetools.models.TaxCategory.TaxRate;
import com.commercetools.models.Type.CustomFieldsDraft;
import java.lang.Integer;
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
public final class LineItemImportDraftImpl implements LineItemImportDraft {

   private com.commercetools.models.TaxCategory.TaxRate taxRate;
   
   private java.lang.Integer quantity;
   
   private com.commercetools.models.Cart.ItemShippingDetailsDraft shippingDetails;
   
   private java.lang.String productId;
   
   private com.commercetools.models.Common.PriceDraft price;
   
   private com.commercetools.models.Type.CustomFieldsDraft custom;
   
   private com.commercetools.models.Order.ProductVariantImportDraft variant;
   
   private com.commercetools.models.Common.LocalizedString name;
   
   private com.commercetools.models.Channel.ChannelResourceIdentifier supplyChannel;
   
   private java.util.List<com.commercetools.models.Order.ItemState> state;
   
   private com.commercetools.models.Channel.ChannelResourceIdentifier distributionChannel;

   @JsonCreator
   LineItemImportDraftImpl(@JsonProperty("taxRate") final com.commercetools.models.TaxCategory.TaxRate taxRate, @JsonProperty("quantity") final java.lang.Integer quantity, @JsonProperty("shippingDetails") final com.commercetools.models.Cart.ItemShippingDetailsDraft shippingDetails, @JsonProperty("productId") final java.lang.String productId, @JsonProperty("price") final com.commercetools.models.Common.PriceDraft price, @JsonProperty("custom") final com.commercetools.models.Type.CustomFieldsDraft custom, @JsonProperty("variant") final com.commercetools.models.Order.ProductVariantImportDraft variant, @JsonProperty("name") final com.commercetools.models.Common.LocalizedString name, @JsonProperty("supplyChannel") final com.commercetools.models.Channel.ChannelResourceIdentifier supplyChannel, @JsonProperty("state") final java.util.List<com.commercetools.models.Order.ItemState> state, @JsonProperty("distributionChannel") final com.commercetools.models.Channel.ChannelResourceIdentifier distributionChannel) {
      this.taxRate = taxRate;
      this.quantity = quantity;
      this.shippingDetails = shippingDetails;
      this.productId = productId;
      this.price = price;
      this.custom = custom;
      this.variant = variant;
      this.name = name;
      this.supplyChannel = supplyChannel;
      this.state = state;
      this.distributionChannel = distributionChannel;
   }
   public LineItemImportDraftImpl() {
      
   }
   
   
   public com.commercetools.models.TaxCategory.TaxRate getTaxRate(){
      return this.taxRate;
   }
   
   
   public java.lang.Integer getQuantity(){
      return this.quantity;
   }
   
   
   public com.commercetools.models.Cart.ItemShippingDetailsDraft getShippingDetails(){
      return this.shippingDetails;
   }
   
   
   public java.lang.String getProductId(){
      return this.productId;
   }
   
   
   public com.commercetools.models.Common.PriceDraft getPrice(){
      return this.price;
   }
   
   
   public com.commercetools.models.Type.CustomFieldsDraft getCustom(){
      return this.custom;
   }
   
   
   public com.commercetools.models.Order.ProductVariantImportDraft getVariant(){
      return this.variant;
   }
   
   
   public com.commercetools.models.Common.LocalizedString getName(){
      return this.name;
   }
   
   
   public com.commercetools.models.Channel.ChannelResourceIdentifier getSupplyChannel(){
      return this.supplyChannel;
   }
   
   
   public java.util.List<com.commercetools.models.Order.ItemState> getState(){
      return this.state;
   }
   
   
   public com.commercetools.models.Channel.ChannelResourceIdentifier getDistributionChannel(){
      return this.distributionChannel;
   }

   public void setTaxRate(final com.commercetools.models.TaxCategory.TaxRate taxRate){
      this.taxRate = taxRate;
   }
   
   public void setQuantity(final java.lang.Integer quantity){
      this.quantity = quantity;
   }
   
   public void setShippingDetails(final com.commercetools.models.Cart.ItemShippingDetailsDraft shippingDetails){
      this.shippingDetails = shippingDetails;
   }
   
   public void setProductId(final java.lang.String productId){
      this.productId = productId;
   }
   
   public void setPrice(final com.commercetools.models.Common.PriceDraft price){
      this.price = price;
   }
   
   public void setCustom(final com.commercetools.models.Type.CustomFieldsDraft custom){
      this.custom = custom;
   }
   
   public void setVariant(final com.commercetools.models.Order.ProductVariantImportDraft variant){
      this.variant = variant;
   }
   
   public void setName(final com.commercetools.models.Common.LocalizedString name){
      this.name = name;
   }
   
   public void setSupplyChannel(final com.commercetools.models.Channel.ChannelResourceIdentifier supplyChannel){
      this.supplyChannel = supplyChannel;
   }
   
   public void setState(final java.util.List<com.commercetools.models.Order.ItemState> state){
      this.state = state;
   }
   
   public void setDistributionChannel(final com.commercetools.models.Channel.ChannelResourceIdentifier distributionChannel){
      this.distributionChannel = distributionChannel;
   }

}