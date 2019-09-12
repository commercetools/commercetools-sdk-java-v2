package com.commercetools.models.Me;

import com.commercetools.models.Cart.ExternalTaxRateDraft;
import com.commercetools.models.Me.MyCartUpdateAction;
import com.commercetools.models.ShippingMethod.ShippingRateDraft;
import com.commercetools.models.TaxCategory.TaxCategoryResourceIdentifier;
import java.lang.String;
import com.commercetools.models.Me.MyCartSetCustomShippingMethodAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class MyCartSetCustomShippingMethodActionBuilder {
   
   
   private com.commercetools.models.ShippingMethod.ShippingRateDraft shippingRate;
   
   @Nullable
   private com.commercetools.models.Cart.ExternalTaxRateDraft externalTaxRate;
   
   
   private java.lang.String shippingMethodName;
   
   @Nullable
   private com.commercetools.models.TaxCategory.TaxCategoryResourceIdentifier taxCategory;
   
   public MyCartSetCustomShippingMethodActionBuilder shippingRate( final com.commercetools.models.ShippingMethod.ShippingRateDraft shippingRate) {
      this.shippingRate = shippingRate;
      return this;
   }
   
   public MyCartSetCustomShippingMethodActionBuilder externalTaxRate(@Nullable final com.commercetools.models.Cart.ExternalTaxRateDraft externalTaxRate) {
      this.externalTaxRate = externalTaxRate;
      return this;
   }
   
   public MyCartSetCustomShippingMethodActionBuilder shippingMethodName( final java.lang.String shippingMethodName) {
      this.shippingMethodName = shippingMethodName;
      return this;
   }
   
   public MyCartSetCustomShippingMethodActionBuilder taxCategory(@Nullable final com.commercetools.models.TaxCategory.TaxCategoryResourceIdentifier taxCategory) {
      this.taxCategory = taxCategory;
      return this;
   }
   
   
   public com.commercetools.models.ShippingMethod.ShippingRateDraft getShippingRate(){
      return this.shippingRate;
   }
   
   @Nullable
   public com.commercetools.models.Cart.ExternalTaxRateDraft getExternalTaxRate(){
      return this.externalTaxRate;
   }
   
   
   public java.lang.String getShippingMethodName(){
      return this.shippingMethodName;
   }
   
   @Nullable
   public com.commercetools.models.TaxCategory.TaxCategoryResourceIdentifier getTaxCategory(){
      return this.taxCategory;
   }

   public MyCartSetCustomShippingMethodAction build() {
       return new MyCartSetCustomShippingMethodActionImpl(shippingRate, externalTaxRate, shippingMethodName, taxCategory);
   }
   
   public static MyCartSetCustomShippingMethodActionBuilder of() {
      return new MyCartSetCustomShippingMethodActionBuilder();
   }
   
   public static MyCartSetCustomShippingMethodActionBuilder of(final MyCartSetCustomShippingMethodAction template) {
      MyCartSetCustomShippingMethodActionBuilder builder = new MyCartSetCustomShippingMethodActionBuilder();
      builder.shippingRate = template.getShippingRate();
      builder.externalTaxRate = template.getExternalTaxRate();
      builder.shippingMethodName = template.getShippingMethodName();
      builder.taxCategory = template.getTaxCategory();
      return builder;
   }
   
}