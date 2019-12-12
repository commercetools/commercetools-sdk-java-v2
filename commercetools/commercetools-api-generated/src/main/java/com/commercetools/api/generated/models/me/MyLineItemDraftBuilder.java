package com.commercetools.api.generated.models.me;

import com.commercetools.api.generated.models.cart.ItemShippingDetailsDraft;
import com.commercetools.api.generated.models.channel.ChannelResourceIdentifier;
import com.commercetools.api.generated.models.type.CustomFieldsDraft;
import com.commercetools.api.generated.models.me.MyLineItemDraft;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.databind.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class MyLineItemDraftBuilder {
   
   
   private Integer quantity;
   
   @Nullable
   private com.commercetools.api.generated.models.cart.ItemShippingDetailsDraft shippingDetails;
   
   
   private String productId;
   
   @Nullable
   private com.commercetools.api.generated.models.type.CustomFieldsDraft custom;
   
   @Nullable
   private com.commercetools.api.generated.models.channel.ChannelResourceIdentifier supplyChannel;
   
   
   private Long variantId;
   
   @Nullable
   private String sku;
   
   @Nullable
   private com.commercetools.api.generated.models.channel.ChannelResourceIdentifier distributionChannel;
   
   public MyLineItemDraftBuilder quantity( final Integer quantity) {
      this.quantity = quantity;
      return this;
   }
   
   public MyLineItemDraftBuilder shippingDetails(@Nullable final com.commercetools.api.generated.models.cart.ItemShippingDetailsDraft shippingDetails) {
      this.shippingDetails = shippingDetails;
      return this;
   }
   
   public MyLineItemDraftBuilder productId( final String productId) {
      this.productId = productId;
      return this;
   }
   
   public MyLineItemDraftBuilder custom(@Nullable final com.commercetools.api.generated.models.type.CustomFieldsDraft custom) {
      this.custom = custom;
      return this;
   }
   
   public MyLineItemDraftBuilder supplyChannel(@Nullable final com.commercetools.api.generated.models.channel.ChannelResourceIdentifier supplyChannel) {
      this.supplyChannel = supplyChannel;
      return this;
   }
   
   public MyLineItemDraftBuilder variantId( final Long variantId) {
      this.variantId = variantId;
      return this;
   }
   
   public MyLineItemDraftBuilder sku(@Nullable final String sku) {
      this.sku = sku;
      return this;
   }
   
   public MyLineItemDraftBuilder distributionChannel(@Nullable final com.commercetools.api.generated.models.channel.ChannelResourceIdentifier distributionChannel) {
      this.distributionChannel = distributionChannel;
      return this;
   }
   
   
   public Integer getQuantity(){
      return this.quantity;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.cart.ItemShippingDetailsDraft getShippingDetails(){
      return this.shippingDetails;
   }
   
   
   public String getProductId(){
      return this.productId;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.type.CustomFieldsDraft getCustom(){
      return this.custom;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.channel.ChannelResourceIdentifier getSupplyChannel(){
      return this.supplyChannel;
   }
   
   
   public Long getVariantId(){
      return this.variantId;
   }
   
   @Nullable
   public String getSku(){
      return this.sku;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.channel.ChannelResourceIdentifier getDistributionChannel(){
      return this.distributionChannel;
   }

   public MyLineItemDraft build() {
       return new MyLineItemDraftImpl(quantity, shippingDetails, productId, custom, supplyChannel, variantId, sku, distributionChannel);
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
      builder.sku = template.getSku();
      builder.distributionChannel = template.getDistributionChannel();
      return builder;
   }
   
}