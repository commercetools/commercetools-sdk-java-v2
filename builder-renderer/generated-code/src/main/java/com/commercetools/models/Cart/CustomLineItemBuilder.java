package com.commercetools.models.Cart;

import com.commercetools.models.Cart.DiscountedLineItemPriceForQuantity;
import com.commercetools.models.Cart.ItemShippingDetails;
import com.commercetools.models.Cart.TaxedItemPrice;
import com.commercetools.models.Common.LocalizedString;
import com.commercetools.models.Common.TypedMoney;
import com.commercetools.models.Order.ItemState;
import com.commercetools.models.TaxCategory.TaxCategoryReference;
import com.commercetools.models.TaxCategory.TaxRate;
import com.commercetools.models.Type.CustomFields;
import java.lang.Integer;
import java.lang.String;
import com.commercetools.models.Cart.CustomLineItem;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CustomLineItemBuilder {
   
   @Nullable
   private com.commercetools.models.TaxCategory.TaxRate taxRate;
   
   
   private java.lang.Integer quantity;
   
   @Nullable
   private com.commercetools.models.Cart.ItemShippingDetails shippingDetails;
   
   
   private com.commercetools.models.Common.TypedMoney money;
   
   
   private com.commercetools.models.Common.TypedMoney totalPrice;
   
   @Nullable
   private com.commercetools.models.Cart.TaxedItemPrice taxedPrice;
   
   @Nullable
   private com.commercetools.models.Type.CustomFields custom;
   
   
   private com.commercetools.models.Common.LocalizedString name;
   
   
   private java.util.List<com.commercetools.models.Order.ItemState> state;
   
   
   private java.lang.String id;
   
   
   private java.util.List<com.commercetools.models.Cart.DiscountedLineItemPriceForQuantity> discountedPricePerQuantity;
   
   
   private java.lang.String slug;
   
   @Nullable
   private com.commercetools.models.TaxCategory.TaxCategoryReference taxCategory;
   
   public CustomLineItemBuilder taxRate(@Nullable final com.commercetools.models.TaxCategory.TaxRate taxRate) {
      this.taxRate = taxRate;
      return this;
   }
   
   public CustomLineItemBuilder quantity( final java.lang.Integer quantity) {
      this.quantity = quantity;
      return this;
   }
   
   public CustomLineItemBuilder shippingDetails(@Nullable final com.commercetools.models.Cart.ItemShippingDetails shippingDetails) {
      this.shippingDetails = shippingDetails;
      return this;
   }
   
   public CustomLineItemBuilder money( final com.commercetools.models.Common.TypedMoney money) {
      this.money = money;
      return this;
   }
   
   public CustomLineItemBuilder totalPrice( final com.commercetools.models.Common.TypedMoney totalPrice) {
      this.totalPrice = totalPrice;
      return this;
   }
   
   public CustomLineItemBuilder taxedPrice(@Nullable final com.commercetools.models.Cart.TaxedItemPrice taxedPrice) {
      this.taxedPrice = taxedPrice;
      return this;
   }
   
   public CustomLineItemBuilder custom(@Nullable final com.commercetools.models.Type.CustomFields custom) {
      this.custom = custom;
      return this;
   }
   
   public CustomLineItemBuilder name( final com.commercetools.models.Common.LocalizedString name) {
      this.name = name;
      return this;
   }
   
   public CustomLineItemBuilder state( final java.util.List<com.commercetools.models.Order.ItemState> state) {
      this.state = state;
      return this;
   }
   
   public CustomLineItemBuilder id( final java.lang.String id) {
      this.id = id;
      return this;
   }
   
   public CustomLineItemBuilder discountedPricePerQuantity( final java.util.List<com.commercetools.models.Cart.DiscountedLineItemPriceForQuantity> discountedPricePerQuantity) {
      this.discountedPricePerQuantity = discountedPricePerQuantity;
      return this;
   }
   
   public CustomLineItemBuilder slug( final java.lang.String slug) {
      this.slug = slug;
      return this;
   }
   
   public CustomLineItemBuilder taxCategory(@Nullable final com.commercetools.models.TaxCategory.TaxCategoryReference taxCategory) {
      this.taxCategory = taxCategory;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.TaxCategory.TaxRate getTaxRate(){
      return this.taxRate;
   }
   
   
   public java.lang.Integer getQuantity(){
      return this.quantity;
   }
   
   @Nullable
   public com.commercetools.models.Cart.ItemShippingDetails getShippingDetails(){
      return this.shippingDetails;
   }
   
   
   public com.commercetools.models.Common.TypedMoney getMoney(){
      return this.money;
   }
   
   
   public com.commercetools.models.Common.TypedMoney getTotalPrice(){
      return this.totalPrice;
   }
   
   @Nullable
   public com.commercetools.models.Cart.TaxedItemPrice getTaxedPrice(){
      return this.taxedPrice;
   }
   
   @Nullable
   public com.commercetools.models.Type.CustomFields getCustom(){
      return this.custom;
   }
   
   
   public com.commercetools.models.Common.LocalizedString getName(){
      return this.name;
   }
   
   
   public java.util.List<com.commercetools.models.Order.ItemState> getState(){
      return this.state;
   }
   
   
   public java.lang.String getId(){
      return this.id;
   }
   
   
   public java.util.List<com.commercetools.models.Cart.DiscountedLineItemPriceForQuantity> getDiscountedPricePerQuantity(){
      return this.discountedPricePerQuantity;
   }
   
   
   public java.lang.String getSlug(){
      return this.slug;
   }
   
   @Nullable
   public com.commercetools.models.TaxCategory.TaxCategoryReference getTaxCategory(){
      return this.taxCategory;
   }

   public CustomLineItem build() {
       return new CustomLineItemImpl(taxRate, quantity, shippingDetails, money, totalPrice, taxedPrice, custom, name, state, id, discountedPricePerQuantity, slug, taxCategory);
   }
   
   public static CustomLineItemBuilder of() {
      return new CustomLineItemBuilder();
   }
   
   public static CustomLineItemBuilder of(final CustomLineItem template) {
      CustomLineItemBuilder builder = new CustomLineItemBuilder();
      builder.taxRate = template.getTaxRate();
      builder.quantity = template.getQuantity();
      builder.shippingDetails = template.getShippingDetails();
      builder.money = template.getMoney();
      builder.totalPrice = template.getTotalPrice();
      builder.taxedPrice = template.getTaxedPrice();
      builder.custom = template.getCustom();
      builder.name = template.getName();
      builder.state = template.getState();
      builder.id = template.getId();
      builder.discountedPricePerQuantity = template.getDiscountedPricePerQuantity();
      builder.slug = template.getSlug();
      builder.taxCategory = template.getTaxCategory();
      return builder;
   }
   
}