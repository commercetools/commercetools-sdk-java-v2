package com.commercetools.models.cart;

import com.commercetools.models.cart.CartUpdateAction;
import com.commercetools.models.cart.ExternalTaxRateDraft;
import com.commercetools.models.shipping_method.ShippingRateDraft;
import com.commercetools.models.tax_category.TaxCategoryResourceIdentifier;
import java.lang.String;
import com.commercetools.models.cart.CartSetCustomShippingMethodAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CartSetCustomShippingMethodActionBuilder {
   
   
   private com.commercetools.models.shipping_method.ShippingRateDraft shippingRate;
   
   @Nullable
   private com.commercetools.models.cart.ExternalTaxRateDraft externalTaxRate;
   
   
   private java.lang.String shippingMethodName;
   
   @Nullable
   private com.commercetools.models.tax_category.TaxCategoryResourceIdentifier taxCategory;
   
   public CartSetCustomShippingMethodActionBuilder shippingRate( final com.commercetools.models.shipping_method.ShippingRateDraft shippingRate) {
      this.shippingRate = shippingRate;
      return this;
   }
   
   public CartSetCustomShippingMethodActionBuilder externalTaxRate(@Nullable final com.commercetools.models.cart.ExternalTaxRateDraft externalTaxRate) {
      this.externalTaxRate = externalTaxRate;
      return this;
   }
   
   public CartSetCustomShippingMethodActionBuilder shippingMethodName( final java.lang.String shippingMethodName) {
      this.shippingMethodName = shippingMethodName;
      return this;
   }
   
   public CartSetCustomShippingMethodActionBuilder taxCategory(@Nullable final com.commercetools.models.tax_category.TaxCategoryResourceIdentifier taxCategory) {
      this.taxCategory = taxCategory;
      return this;
   }
   
   
   public com.commercetools.models.shipping_method.ShippingRateDraft getShippingRate(){
      return this.shippingRate;
   }
   
   @Nullable
   public com.commercetools.models.cart.ExternalTaxRateDraft getExternalTaxRate(){
      return this.externalTaxRate;
   }
   
   
   public java.lang.String getShippingMethodName(){
      return this.shippingMethodName;
   }
   
   @Nullable
   public com.commercetools.models.tax_category.TaxCategoryResourceIdentifier getTaxCategory(){
      return this.taxCategory;
   }

   public CartSetCustomShippingMethodAction build() {
       return new CartSetCustomShippingMethodActionImpl(shippingRate, externalTaxRate, shippingMethodName, taxCategory);
   }
   
   public static CartSetCustomShippingMethodActionBuilder of() {
      return new CartSetCustomShippingMethodActionBuilder();
   }
   
   public static CartSetCustomShippingMethodActionBuilder of(final CartSetCustomShippingMethodAction template) {
      CartSetCustomShippingMethodActionBuilder builder = new CartSetCustomShippingMethodActionBuilder();
      builder.shippingRate = template.getShippingRate();
      builder.externalTaxRate = template.getExternalTaxRate();
      builder.shippingMethodName = template.getShippingMethodName();
      builder.taxCategory = template.getTaxCategory();
      return builder;
   }
   
}