package com.commercetools.models.Me;

import com.commercetools.models.Cart.ItemShippingDetailsDraft;
import com.commercetools.models.Channel.ChannelResourceIdentifier;
import com.commercetools.models.Type.CustomFieldsDraft;
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

import json.CommercetoolsJsonUtils;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class MyLineItemDraftImpl implements MyLineItemDraft {

   private java.lang.Integer quantity;
   
   private com.commercetools.models.Cart.ItemShippingDetailsDraft shippingDetails;
   
   private java.lang.String productId;
   
   private com.commercetools.models.Type.CustomFieldsDraft custom;
   
   private com.commercetools.models.Channel.ChannelResourceIdentifier supplyChannel;
   
   private java.lang.Long variantId;
   
   private com.commercetools.models.Channel.ChannelResourceIdentifier distributionChannel;

   @JsonCreator
   MyLineItemDraftImpl(@JsonProperty("quantity") final java.lang.Integer quantity, @JsonProperty("shippingDetails") final com.commercetools.models.Cart.ItemShippingDetailsDraft shippingDetails, @JsonProperty("productId") final java.lang.String productId, @JsonProperty("custom") final com.commercetools.models.Type.CustomFieldsDraft custom, @JsonProperty("supplyChannel") final com.commercetools.models.Channel.ChannelResourceIdentifier supplyChannel, @JsonProperty("variantId") final java.lang.Long variantId, @JsonProperty("distributionChannel") final com.commercetools.models.Channel.ChannelResourceIdentifier distributionChannel) {
      this.quantity = quantity;
      this.shippingDetails = shippingDetails;
      this.productId = productId;
      this.custom = custom;
      this.supplyChannel = supplyChannel;
      this.variantId = variantId;
      this.distributionChannel = distributionChannel;
   }
   public MyLineItemDraftImpl() {
      
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

   public void setQuantity(final java.lang.Integer quantity){
      this.quantity = quantity;
   }
   
   public void setShippingDetails(final com.commercetools.models.Cart.ItemShippingDetailsDraft shippingDetails){
      this.shippingDetails = shippingDetails;
   }
   
   public void setProductId(final java.lang.String productId){
      this.productId = productId;
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

}