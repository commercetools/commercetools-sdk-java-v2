package com.commercetools.models.cart;

import com.commercetools.models.cart.CartUpdateAction;
import com.commercetools.models.cart.ExternalLineItemTotalPrice;
import com.commercetools.models.cart.ExternalTaxRateDraft;
import com.commercetools.models.cart.ItemShippingDetailsDraft;
import com.commercetools.models.channel.ChannelResourceIdentifier;
import com.commercetools.models.common.Money;
import com.commercetools.models.type.CustomFieldsDraft;
import java.lang.Integer;
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


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CartAddLineItemActionImpl implements CartAddLineItemAction {

   private java.lang.String action;
   
   private java.lang.Integer quantity;
   
   private com.commercetools.models.cart.ExternalTaxRateDraft externalTaxRate;
   
   private com.commercetools.models.cart.ItemShippingDetailsDraft shippingDetails;
   
   private java.lang.String productId;
   
   private com.commercetools.models.cart.ExternalLineItemTotalPrice externalTotalPrice;
   
   private com.commercetools.models.type.CustomFieldsDraft custom;
   
   private com.commercetools.models.channel.ChannelResourceIdentifier supplyChannel;
   
   private java.lang.Long variantId;
   
   private java.lang.String sku;
   
   private com.commercetools.models.channel.ChannelResourceIdentifier distributionChannel;
   
   private com.commercetools.models.common.Money externalPrice;

   @JsonCreator
   CartAddLineItemActionImpl(@JsonProperty("quantity") final java.lang.Integer quantity, @JsonProperty("externalTaxRate") final com.commercetools.models.cart.ExternalTaxRateDraft externalTaxRate, @JsonProperty("shippingDetails") final com.commercetools.models.cart.ItemShippingDetailsDraft shippingDetails, @JsonProperty("productId") final java.lang.String productId, @JsonProperty("externalTotalPrice") final com.commercetools.models.cart.ExternalLineItemTotalPrice externalTotalPrice, @JsonProperty("custom") final com.commercetools.models.type.CustomFieldsDraft custom, @JsonProperty("supplyChannel") final com.commercetools.models.channel.ChannelResourceIdentifier supplyChannel, @JsonProperty("variantId") final java.lang.Long variantId, @JsonProperty("sku") final java.lang.String sku, @JsonProperty("distributionChannel") final com.commercetools.models.channel.ChannelResourceIdentifier distributionChannel, @JsonProperty("externalPrice") final com.commercetools.models.common.Money externalPrice) {
      this.quantity = quantity;
      this.externalTaxRate = externalTaxRate;
      this.shippingDetails = shippingDetails;
      this.productId = productId;
      this.externalTotalPrice = externalTotalPrice;
      this.custom = custom;
      this.supplyChannel = supplyChannel;
      this.variantId = variantId;
      this.sku = sku;
      this.distributionChannel = distributionChannel;
      this.externalPrice = externalPrice;
      this.action = "addLineItem";
   }
   public CartAddLineItemActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public java.lang.Integer getQuantity(){
      return this.quantity;
   }
   
   
   public com.commercetools.models.cart.ExternalTaxRateDraft getExternalTaxRate(){
      return this.externalTaxRate;
   }
   
   
   public com.commercetools.models.cart.ItemShippingDetailsDraft getShippingDetails(){
      return this.shippingDetails;
   }
   
   
   public java.lang.String getProductId(){
      return this.productId;
   }
   
   
   public com.commercetools.models.cart.ExternalLineItemTotalPrice getExternalTotalPrice(){
      return this.externalTotalPrice;
   }
   
   
   public com.commercetools.models.type.CustomFieldsDraft getCustom(){
      return this.custom;
   }
   
   
   public com.commercetools.models.channel.ChannelResourceIdentifier getSupplyChannel(){
      return this.supplyChannel;
   }
   
   
   public java.lang.Long getVariantId(){
      return this.variantId;
   }
   
   
   public java.lang.String getSku(){
      return this.sku;
   }
   
   
   public com.commercetools.models.channel.ChannelResourceIdentifier getDistributionChannel(){
      return this.distributionChannel;
   }
   
   
   public com.commercetools.models.common.Money getExternalPrice(){
      return this.externalPrice;
   }

   public void setQuantity(final java.lang.Integer quantity){
      this.quantity = quantity;
   }
   
   public void setExternalTaxRate(final com.commercetools.models.cart.ExternalTaxRateDraft externalTaxRate){
      this.externalTaxRate = externalTaxRate;
   }
   
   public void setShippingDetails(final com.commercetools.models.cart.ItemShippingDetailsDraft shippingDetails){
      this.shippingDetails = shippingDetails;
   }
   
   public void setProductId(final java.lang.String productId){
      this.productId = productId;
   }
   
   public void setExternalTotalPrice(final com.commercetools.models.cart.ExternalLineItemTotalPrice externalTotalPrice){
      this.externalTotalPrice = externalTotalPrice;
   }
   
   public void setCustom(final com.commercetools.models.type.CustomFieldsDraft custom){
      this.custom = custom;
   }
   
   public void setSupplyChannel(final com.commercetools.models.channel.ChannelResourceIdentifier supplyChannel){
      this.supplyChannel = supplyChannel;
   }
   
   public void setVariantId(final java.lang.Long variantId){
      this.variantId = variantId;
   }
   
   public void setSku(final java.lang.String sku){
      this.sku = sku;
   }
   
   public void setDistributionChannel(final com.commercetools.models.channel.ChannelResourceIdentifier distributionChannel){
      this.distributionChannel = distributionChannel;
   }
   
   public void setExternalPrice(final com.commercetools.models.common.Money externalPrice){
      this.externalPrice = externalPrice;
   }

}