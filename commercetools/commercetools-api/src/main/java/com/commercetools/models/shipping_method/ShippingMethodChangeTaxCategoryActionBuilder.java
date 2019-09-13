package com.commercetools.models.shipping_method;

import com.commercetools.models.shipping_method.ShippingMethodUpdateAction;
import com.commercetools.models.tax_category.TaxCategoryResourceIdentifier;
import java.lang.String;
import com.commercetools.models.shipping_method.ShippingMethodChangeTaxCategoryAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ShippingMethodChangeTaxCategoryActionBuilder {
   
   
   private com.commercetools.models.tax_category.TaxCategoryResourceIdentifier taxCategory;
   
   public ShippingMethodChangeTaxCategoryActionBuilder taxCategory( final com.commercetools.models.tax_category.TaxCategoryResourceIdentifier taxCategory) {
      this.taxCategory = taxCategory;
      return this;
   }
   
   
   public com.commercetools.models.tax_category.TaxCategoryResourceIdentifier getTaxCategory(){
      return this.taxCategory;
   }

   public ShippingMethodChangeTaxCategoryAction build() {
       return new ShippingMethodChangeTaxCategoryActionImpl(taxCategory);
   }
   
   public static ShippingMethodChangeTaxCategoryActionBuilder of() {
      return new ShippingMethodChangeTaxCategoryActionBuilder();
   }
   
   public static ShippingMethodChangeTaxCategoryActionBuilder of(final ShippingMethodChangeTaxCategoryAction template) {
      ShippingMethodChangeTaxCategoryActionBuilder builder = new ShippingMethodChangeTaxCategoryActionBuilder();
      builder.taxCategory = template.getTaxCategory();
      return builder;
   }
   
}