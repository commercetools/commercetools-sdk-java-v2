package com.commercetools.api.models.order;

import com.commercetools.api.models.cart.ItemShippingDetailsDraft;
import com.commercetools.api.models.channel.ChannelResourceIdentifier;
import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.common.PriceDraft;
import com.commercetools.api.models.order.ItemState;
import com.commercetools.api.models.order.ProductVariantImportDraft;
import com.commercetools.api.models.tax_category.TaxRate;
import com.commercetools.api.models.type.CustomFieldsDraft;
import com.commercetools.api.models.order.LineItemImportDraft;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class LineItemImportDraftBuilder {

   @Nullable
   private com.commercetools.api.models.tax_category.TaxRate taxRate;


   private Integer quantity;

   @Nullable
   private com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetails;

   @Nullable
   private String productId;


   private com.commercetools.api.models.common.PriceDraft price;

   @Nullable
   private com.commercetools.api.models.type.CustomFieldsDraft custom;


   private com.commercetools.api.models.order.ProductVariantImportDraft variant;


   private com.commercetools.api.models.common.LocalizedString name;

   @Nullable
   private com.commercetools.api.models.channel.ChannelResourceIdentifier supplyChannel;

   @Nullable
   private java.util.List<com.commercetools.api.models.order.ItemState> state;

   @Nullable
   private com.commercetools.api.models.channel.ChannelResourceIdentifier distributionChannel;

   public LineItemImportDraftBuilder taxRate(@Nullable final com.commercetools.api.models.tax_category.TaxRate taxRate) {
      this.taxRate = taxRate;
      return this;
   }

   public LineItemImportDraftBuilder quantity( final Integer quantity) {
      this.quantity = quantity;
      return this;
   }

   public LineItemImportDraftBuilder shippingDetails(@Nullable final com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetails) {
      this.shippingDetails = shippingDetails;
      return this;
   }

   public LineItemImportDraftBuilder productId(@Nullable final String productId) {
      this.productId = productId;
      return this;
   }

   public LineItemImportDraftBuilder price( final com.commercetools.api.models.common.PriceDraft price) {
      this.price = price;
      return this;
   }

   public LineItemImportDraftBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFieldsDraft custom) {
      this.custom = custom;
      return this;
   }

   public LineItemImportDraftBuilder variant( final com.commercetools.api.models.order.ProductVariantImportDraft variant) {
      this.variant = variant;
      return this;
   }

   public LineItemImportDraftBuilder name( final com.commercetools.api.models.common.LocalizedString name) {
      this.name = name;
      return this;
   }

   public LineItemImportDraftBuilder supplyChannel(@Nullable final com.commercetools.api.models.channel.ChannelResourceIdentifier supplyChannel) {
      this.supplyChannel = supplyChannel;
      return this;
   }

   public LineItemImportDraftBuilder state(@Nullable final java.util.List<com.commercetools.api.models.order.ItemState> state) {
      this.state = state;
      return this;
   }

   public LineItemImportDraftBuilder distributionChannel(@Nullable final com.commercetools.api.models.channel.ChannelResourceIdentifier distributionChannel) {
      this.distributionChannel = distributionChannel;
      return this;
   }

   @Nullable
   public com.commercetools.api.models.tax_category.TaxRate getTaxRate(){
      return this.taxRate;
   }


   public Integer getQuantity(){
      return this.quantity;
   }

   @Nullable
   public com.commercetools.api.models.cart.ItemShippingDetailsDraft getShippingDetails(){
      return this.shippingDetails;
   }

   @Nullable
   public String getProductId(){
      return this.productId;
   }


   public com.commercetools.api.models.common.PriceDraft getPrice(){
      return this.price;
   }

   @Nullable
   public com.commercetools.api.models.type.CustomFieldsDraft getCustom(){
      return this.custom;
   }


   public com.commercetools.api.models.order.ProductVariantImportDraft getVariant(){
      return this.variant;
   }


   public com.commercetools.api.models.common.LocalizedString getName(){
      return this.name;
   }

   @Nullable
   public com.commercetools.api.models.channel.ChannelResourceIdentifier getSupplyChannel(){
      return this.supplyChannel;
   }

   @Nullable
   public java.util.List<com.commercetools.api.models.order.ItemState> getState(){
      return this.state;
   }

   @Nullable
   public com.commercetools.api.models.channel.ChannelResourceIdentifier getDistributionChannel(){
      return this.distributionChannel;
   }

   public LineItemImportDraft build() {
       return new LineItemImportDraftImpl(taxRate, quantity, shippingDetails, productId, price, custom, variant, name, supplyChannel, state, distributionChannel);
   }

   public static LineItemImportDraftBuilder of() {
      return new LineItemImportDraftBuilder();
   }

   public static LineItemImportDraftBuilder of(final LineItemImportDraft template) {
      LineItemImportDraftBuilder builder = new LineItemImportDraftBuilder();
      builder.taxRate = template.getTaxRate();
      builder.quantity = template.getQuantity();
      builder.shippingDetails = template.getShippingDetails();
      builder.productId = template.getProductId();
      builder.price = template.getPrice();
      builder.custom = template.getCustom();
      builder.variant = template.getVariant();
      builder.name = template.getName();
      builder.supplyChannel = template.getSupplyChannel();
      builder.state = template.getState();
      builder.distributionChannel = template.getDistributionChannel();
      return builder;
   }

}
