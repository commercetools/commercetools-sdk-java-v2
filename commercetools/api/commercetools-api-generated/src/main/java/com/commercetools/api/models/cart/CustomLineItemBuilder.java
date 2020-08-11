package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity;
import com.commercetools.api.models.cart.ItemShippingDetails;
import com.commercetools.api.models.cart.TaxedItemPrice;
import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.common.TypedMoney;
import com.commercetools.api.models.order.ItemState;
import com.commercetools.api.models.tax_category.TaxCategoryReference;
import com.commercetools.api.models.tax_category.TaxRate;
import com.commercetools.api.models.type.CustomFields;
import com.commercetools.api.models.cart.CustomLineItem;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CustomLineItemBuilder {

   @Nullable
   private com.commercetools.api.models.tax_category.TaxRate taxRate;


   private Integer quantity;

   @Nullable
   private com.commercetools.api.models.cart.ItemShippingDetails shippingDetails;


   private com.commercetools.api.models.common.TypedMoney money;


   private com.commercetools.api.models.common.TypedMoney totalPrice;

   @Nullable
   private com.commercetools.api.models.cart.TaxedItemPrice taxedPrice;

   @Nullable
   private com.commercetools.api.models.type.CustomFields custom;


   private com.commercetools.api.models.common.LocalizedString name;


   private java.util.List<com.commercetools.api.models.order.ItemState> state;


   private String id;


   private java.util.List<com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity> discountedPricePerQuantity;


   private String slug;

   @Nullable
   private com.commercetools.api.models.tax_category.TaxCategoryReference taxCategory;

   public CustomLineItemBuilder taxRate(@Nullable final com.commercetools.api.models.tax_category.TaxRate taxRate) {
      this.taxRate = taxRate;
      return this;
   }

   public CustomLineItemBuilder quantity( final Integer quantity) {
      this.quantity = quantity;
      return this;
   }

   public CustomLineItemBuilder shippingDetails(@Nullable final com.commercetools.api.models.cart.ItemShippingDetails shippingDetails) {
      this.shippingDetails = shippingDetails;
      return this;
   }

   public CustomLineItemBuilder money( final com.commercetools.api.models.common.TypedMoney money) {
      this.money = money;
      return this;
   }

   public CustomLineItemBuilder totalPrice( final com.commercetools.api.models.common.TypedMoney totalPrice) {
      this.totalPrice = totalPrice;
      return this;
   }

   public CustomLineItemBuilder taxedPrice(@Nullable final com.commercetools.api.models.cart.TaxedItemPrice taxedPrice) {
      this.taxedPrice = taxedPrice;
      return this;
   }

   public CustomLineItemBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFields custom) {
      this.custom = custom;
      return this;
   }

   public CustomLineItemBuilder name( final com.commercetools.api.models.common.LocalizedString name) {
      this.name = name;
      return this;
   }

   public CustomLineItemBuilder state( final java.util.List<com.commercetools.api.models.order.ItemState> state) {
      this.state = state;
      return this;
   }

   public CustomLineItemBuilder id( final String id) {
      this.id = id;
      return this;
   }

   public CustomLineItemBuilder discountedPricePerQuantity( final java.util.List<com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity> discountedPricePerQuantity) {
      this.discountedPricePerQuantity = discountedPricePerQuantity;
      return this;
   }

   public CustomLineItemBuilder slug( final String slug) {
      this.slug = slug;
      return this;
   }

   public CustomLineItemBuilder taxCategory(@Nullable final com.commercetools.api.models.tax_category.TaxCategoryReference taxCategory) {
      this.taxCategory = taxCategory;
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
   public com.commercetools.api.models.cart.ItemShippingDetails getShippingDetails(){
      return this.shippingDetails;
   }


   public com.commercetools.api.models.common.TypedMoney getMoney(){
      return this.money;
   }


   public com.commercetools.api.models.common.TypedMoney getTotalPrice(){
      return this.totalPrice;
   }

   @Nullable
   public com.commercetools.api.models.cart.TaxedItemPrice getTaxedPrice(){
      return this.taxedPrice;
   }

   @Nullable
   public com.commercetools.api.models.type.CustomFields getCustom(){
      return this.custom;
   }


   public com.commercetools.api.models.common.LocalizedString getName(){
      return this.name;
   }


   public java.util.List<com.commercetools.api.models.order.ItemState> getState(){
      return this.state;
   }


   public String getId(){
      return this.id;
   }


   public java.util.List<com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity> getDiscountedPricePerQuantity(){
      return this.discountedPricePerQuantity;
   }


   public String getSlug(){
      return this.slug;
   }

   @Nullable
   public com.commercetools.api.models.tax_category.TaxCategoryReference getTaxCategory(){
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
