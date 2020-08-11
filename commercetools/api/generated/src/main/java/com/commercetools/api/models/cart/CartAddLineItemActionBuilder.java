package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.CartUpdateAction;
import com.commercetools.api.models.cart.ExternalLineItemTotalPrice;
import com.commercetools.api.models.cart.ExternalTaxRateDraft;
import com.commercetools.api.models.cart.ItemShippingDetailsDraft;
import com.commercetools.api.models.channel.ChannelResourceIdentifier;
import com.commercetools.api.models.common.Money;
import com.commercetools.api.models.type.CustomFieldsDraft;
import com.commercetools.api.models.cart.CartAddLineItemAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CartAddLineItemActionBuilder {
   
   @Nullable
   private Integer quantity;
   
   @Nullable
   private com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate;
   
   @Nullable
   private com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetails;
   
   @Nullable
   private String productId;
   
   @Nullable
   private com.commercetools.api.models.cart.ExternalLineItemTotalPrice externalTotalPrice;
   
   @Nullable
   private com.commercetools.api.models.type.CustomFieldsDraft custom;
   
   @Nullable
   private com.commercetools.api.models.channel.ChannelResourceIdentifier supplyChannel;
   
   @Nullable
   private Long variantId;
   
   @Nullable
   private String sku;
   
   @Nullable
   private com.commercetools.api.models.channel.ChannelResourceIdentifier distributionChannel;
   
   @Nullable
   private com.commercetools.api.models.common.Money externalPrice;
   
   public CartAddLineItemActionBuilder quantity(@Nullable final Integer quantity) {
      this.quantity = quantity;
      return this;
   }
   
   public CartAddLineItemActionBuilder externalTaxRate(@Nullable final com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate) {
      this.externalTaxRate = externalTaxRate;
      return this;
   }
   
   public CartAddLineItemActionBuilder shippingDetails(@Nullable final com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetails) {
      this.shippingDetails = shippingDetails;
      return this;
   }
   
   public CartAddLineItemActionBuilder productId(@Nullable final String productId) {
      this.productId = productId;
      return this;
   }
   
   public CartAddLineItemActionBuilder externalTotalPrice(@Nullable final com.commercetools.api.models.cart.ExternalLineItemTotalPrice externalTotalPrice) {
      this.externalTotalPrice = externalTotalPrice;
      return this;
   }
   
   public CartAddLineItemActionBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFieldsDraft custom) {
      this.custom = custom;
      return this;
   }
   
   public CartAddLineItemActionBuilder supplyChannel(@Nullable final com.commercetools.api.models.channel.ChannelResourceIdentifier supplyChannel) {
      this.supplyChannel = supplyChannel;
      return this;
   }
   
   public CartAddLineItemActionBuilder variantId(@Nullable final Long variantId) {
      this.variantId = variantId;
      return this;
   }
   
   public CartAddLineItemActionBuilder sku(@Nullable final String sku) {
      this.sku = sku;
      return this;
   }
   
   public CartAddLineItemActionBuilder distributionChannel(@Nullable final com.commercetools.api.models.channel.ChannelResourceIdentifier distributionChannel) {
      this.distributionChannel = distributionChannel;
      return this;
   }
   
   public CartAddLineItemActionBuilder externalPrice(@Nullable final com.commercetools.api.models.common.Money externalPrice) {
      this.externalPrice = externalPrice;
      return this;
   }
   
   @Nullable
   public Integer getQuantity(){
      return this.quantity;
   }
   
   @Nullable
   public com.commercetools.api.models.cart.ExternalTaxRateDraft getExternalTaxRate(){
      return this.externalTaxRate;
   }
   
   @Nullable
   public com.commercetools.api.models.cart.ItemShippingDetailsDraft getShippingDetails(){
      return this.shippingDetails;
   }
   
   @Nullable
   public String getProductId(){
      return this.productId;
   }
   
   @Nullable
   public com.commercetools.api.models.cart.ExternalLineItemTotalPrice getExternalTotalPrice(){
      return this.externalTotalPrice;
   }
   
   @Nullable
   public com.commercetools.api.models.type.CustomFieldsDraft getCustom(){
      return this.custom;
   }
   
   @Nullable
   public com.commercetools.api.models.channel.ChannelResourceIdentifier getSupplyChannel(){
      return this.supplyChannel;
   }
   
   @Nullable
   public Long getVariantId(){
      return this.variantId;
   }
   
   @Nullable
   public String getSku(){
      return this.sku;
   }
   
   @Nullable
   public com.commercetools.api.models.channel.ChannelResourceIdentifier getDistributionChannel(){
      return this.distributionChannel;
   }
   
   @Nullable
   public com.commercetools.api.models.common.Money getExternalPrice(){
      return this.externalPrice;
   }

   public CartAddLineItemAction build() {
       return new CartAddLineItemActionImpl(quantity, externalTaxRate, shippingDetails, productId, externalTotalPrice, custom, supplyChannel, variantId, sku, distributionChannel, externalPrice);
   }
   
   public static CartAddLineItemActionBuilder of() {
      return new CartAddLineItemActionBuilder();
   }
   
   public static CartAddLineItemActionBuilder of(final CartAddLineItemAction template) {
      CartAddLineItemActionBuilder builder = new CartAddLineItemActionBuilder();
      builder.quantity = template.getQuantity();
      builder.externalTaxRate = template.getExternalTaxRate();
      builder.shippingDetails = template.getShippingDetails();
      builder.productId = template.getProductId();
      builder.externalTotalPrice = template.getExternalTotalPrice();
      builder.custom = template.getCustom();
      builder.supplyChannel = template.getSupplyChannel();
      builder.variantId = template.getVariantId();
      builder.sku = template.getSku();
      builder.distributionChannel = template.getDistributionChannel();
      builder.externalPrice = template.getExternalPrice();
      return builder;
   }
   
}
