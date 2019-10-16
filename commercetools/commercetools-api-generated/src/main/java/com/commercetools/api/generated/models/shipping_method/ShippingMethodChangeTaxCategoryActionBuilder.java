package com.commercetools.api.generated.models.shipping_method;

import com.commercetools.api.generated.models.shipping_method.ShippingMethodUpdateAction;
import com.commercetools.api.generated.models.tax_category.TaxCategoryResourceIdentifier;
import com.commercetools.api.generated.models.shipping_method.ShippingMethodChangeTaxCategoryAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ShippingMethodChangeTaxCategoryActionBuilder {
   
   
   private com.commercetools.api.generated.models.tax_category.TaxCategoryResourceIdentifier taxCategory;
   
   public ShippingMethodChangeTaxCategoryActionBuilder taxCategory( final com.commercetools.api.generated.models.tax_category.TaxCategoryResourceIdentifier taxCategory) {
      this.taxCategory = taxCategory;
      return this;
   }
   
   
   public com.commercetools.api.generated.models.tax_category.TaxCategoryResourceIdentifier getTaxCategory(){
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