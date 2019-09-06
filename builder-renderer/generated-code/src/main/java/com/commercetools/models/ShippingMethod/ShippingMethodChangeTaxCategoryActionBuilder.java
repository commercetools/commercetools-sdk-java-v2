package com.commercetools.models.ShippingMethod;

import com.commercetools.models.ShippingMethod.ShippingMethodUpdateAction;
import com.commercetools.models.TaxCategory.TaxCategoryResourceIdentifier;
import java.lang.String;
import com.commercetools.models.ShippingMethod.ShippingMethodChangeTaxCategoryAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ShippingMethodChangeTaxCategoryActionBuilder {
   
   
   private com.commercetools.models.TaxCategory.TaxCategoryResourceIdentifier taxCategory;
   
   public ShippingMethodChangeTaxCategoryActionBuilder taxCategory( final com.commercetools.models.TaxCategory.TaxCategoryResourceIdentifier taxCategory) {
      this.taxCategory = taxCategory;
      return this;
   }
   
   
   public com.commercetools.models.TaxCategory.TaxCategoryResourceIdentifier getTaxCategory(){
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