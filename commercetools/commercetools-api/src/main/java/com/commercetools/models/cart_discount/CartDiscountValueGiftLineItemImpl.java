package com.commercetools.models.cart_discount;

import com.commercetools.models.cart_discount.CartDiscountValue;
import com.commercetools.models.channel.ChannelReference;
import com.commercetools.models.product.ProductReference;
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
public final class CartDiscountValueGiftLineItemImpl implements CartDiscountValueGiftLineItem {

   private java.lang.String type;
   
   private com.commercetools.models.product.ProductReference product;
   
   private com.commercetools.models.channel.ChannelReference supplyChannel;
   
   private java.lang.Long variantId;
   
   private com.commercetools.models.channel.ChannelReference distributionChannel;

   @JsonCreator
   CartDiscountValueGiftLineItemImpl(@JsonProperty("product") final com.commercetools.models.product.ProductReference product, @JsonProperty("supplyChannel") final com.commercetools.models.channel.ChannelReference supplyChannel, @JsonProperty("variantId") final java.lang.Long variantId, @JsonProperty("distributionChannel") final com.commercetools.models.channel.ChannelReference distributionChannel) {
      this.product = product;
      this.supplyChannel = supplyChannel;
      this.variantId = variantId;
      this.distributionChannel = distributionChannel;
      this.type = "giftLineItem";
   }
   public CartDiscountValueGiftLineItemImpl() {
      
   }
   
   
   public java.lang.String getType(){
      return this.type;
   }
   
   
   public com.commercetools.models.product.ProductReference getProduct(){
      return this.product;
   }
   
   
   public com.commercetools.models.channel.ChannelReference getSupplyChannel(){
      return this.supplyChannel;
   }
   
   
   public java.lang.Long getVariantId(){
      return this.variantId;
   }
   
   
   public com.commercetools.models.channel.ChannelReference getDistributionChannel(){
      return this.distributionChannel;
   }

   public void setProduct(final com.commercetools.models.product.ProductReference product){
      this.product = product;
   }
   
   public void setSupplyChannel(final com.commercetools.models.channel.ChannelReference supplyChannel){
      this.supplyChannel = supplyChannel;
   }
   
   public void setVariantId(final java.lang.Long variantId){
      this.variantId = variantId;
   }
   
   public void setDistributionChannel(final com.commercetools.models.channel.ChannelReference distributionChannel){
      this.distributionChannel = distributionChannel;
   }

}