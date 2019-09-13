package com.commercetools.models.me;

import com.commercetools.models.cart.ItemShippingDetailsDraft;
import com.commercetools.models.channel.ChannelResourceIdentifier;
import com.commercetools.models.type.CustomFieldsDraft;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import com.commercetools.models.me.MyLineItemDraft;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class MyLineItemDraftBuilder {
   
   
   private java.lang.Integer quantity;
   
   @Nullable
   private com.commercetools.models.cart.ItemShippingDetailsDraft shippingDetails;
   
   
   private java.lang.String productId;
   
   @Nullable
   private com.commercetools.models.type.CustomFieldsDraft custom;
   
   @Nullable
   private com.commercetools.models.channel.ChannelResourceIdentifier supplyChannel;
   
   
   private java.lang.Long variantId;
   
   @Nullable
   private com.commercetools.models.channel.ChannelResourceIdentifier distributionChannel;
   
   public MyLineItemDraftBuilder quantity( final java.lang.Integer quantity) {
      this.quantity = quantity;
      return this;
   }
   
   public MyLineItemDraftBuilder shippingDetails(@Nullable final com.commercetools.models.cart.ItemShippingDetailsDraft shippingDetails) {
      this.shippingDetails = shippingDetails;
      return this;
   }
   
   public MyLineItemDraftBuilder productId( final java.lang.String productId) {
      this.productId = productId;
      return this;
   }
   
   public MyLineItemDraftBuilder custom(@Nullable final com.commercetools.models.type.CustomFieldsDraft custom) {
      this.custom = custom;
      return this;
   }
   
   public MyLineItemDraftBuilder supplyChannel(@Nullable final com.commercetools.models.channel.ChannelResourceIdentifier supplyChannel) {
      this.supplyChannel = supplyChannel;
      return this;
   }
   
   public MyLineItemDraftBuilder variantId( final java.lang.Long variantId) {
      this.variantId = variantId;
      return this;
   }
   
   public MyLineItemDraftBuilder distributionChannel(@Nullable final com.commercetools.models.channel.ChannelResourceIdentifier distributionChannel) {
      this.distributionChannel = distributionChannel;
      return this;
   }
   
   
   public java.lang.Integer getQuantity(){
      return this.quantity;
   }
   
   @Nullable
   public com.commercetools.models.cart.ItemShippingDetailsDraft getShippingDetails(){
      return this.shippingDetails;
   }
   
   
   public java.lang.String getProductId(){
      return this.productId;
   }
   
   @Nullable
   public com.commercetools.models.type.CustomFieldsDraft getCustom(){
      return this.custom;
   }
   
   @Nullable
   public com.commercetools.models.channel.ChannelResourceIdentifier getSupplyChannel(){
      return this.supplyChannel;
   }
   
   
   public java.lang.Long getVariantId(){
      return this.variantId;
   }
   
   @Nullable
   public com.commercetools.models.channel.ChannelResourceIdentifier getDistributionChannel(){
      return this.distributionChannel;
   }

   public MyLineItemDraft build() {
       return new MyLineItemDraftImpl(quantity, shippingDetails, productId, custom, supplyChannel, variantId, distributionChannel);
   }
   
   public static MyLineItemDraftBuilder of() {
      return new MyLineItemDraftBuilder();
   }
   
   public static MyLineItemDraftBuilder of(final MyLineItemDraft template) {
      MyLineItemDraftBuilder builder = new MyLineItemDraftBuilder();
      builder.quantity = template.getQuantity();
      builder.shippingDetails = template.getShippingDetails();
      builder.productId = template.getProductId();
      builder.custom = template.getCustom();
      builder.supplyChannel = template.getSupplyChannel();
      builder.variantId = template.getVariantId();
      builder.distributionChannel = template.getDistributionChannel();
      return builder;
   }
   
}