package com.commercetools.api.models.me;

import com.commercetools.api.models.cart.ExternalTaxRateDraft;
import com.commercetools.api.models.me.MyCartUpdateAction;
import com.commercetools.api.models.shipping_method.ShippingRateDraft;
import com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier;
import com.commercetools.api.models.me.MyCartSetCustomShippingMethodAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class MyCartSetCustomShippingMethodActionBuilder {


   private com.commercetools.api.models.shipping_method.ShippingRateDraft shippingRate;

   @Nullable
   private com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate;


   private String shippingMethodName;

   @Nullable
   private com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier taxCategory;

   public MyCartSetCustomShippingMethodActionBuilder shippingRate( final com.commercetools.api.models.shipping_method.ShippingRateDraft shippingRate) {
      this.shippingRate = shippingRate;
      return this;
   }

   public MyCartSetCustomShippingMethodActionBuilder externalTaxRate(@Nullable final com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate) {
      this.externalTaxRate = externalTaxRate;
      return this;
   }

   public MyCartSetCustomShippingMethodActionBuilder shippingMethodName( final String shippingMethodName) {
      this.shippingMethodName = shippingMethodName;
      return this;
   }

   public MyCartSetCustomShippingMethodActionBuilder taxCategory(@Nullable final com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier taxCategory) {
      this.taxCategory = taxCategory;
      return this;
   }


   public com.commercetools.api.models.shipping_method.ShippingRateDraft getShippingRate(){
      return this.shippingRate;
   }

   @Nullable
   public com.commercetools.api.models.cart.ExternalTaxRateDraft getExternalTaxRate(){
      return this.externalTaxRate;
   }


   public String getShippingMethodName(){
      return this.shippingMethodName;
   }

   @Nullable
   public com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier getTaxCategory(){
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
