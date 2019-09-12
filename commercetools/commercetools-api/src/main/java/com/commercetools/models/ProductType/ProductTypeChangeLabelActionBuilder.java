package com.commercetools.models.ProductType;

import com.commercetools.models.Common.LocalizedString;
import com.commercetools.models.ProductType.ProductTypeUpdateAction;
import java.lang.String;
import com.commercetools.models.ProductType.ProductTypeChangeLabelAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductTypeChangeLabelActionBuilder {
   
   
   private java.lang.String attributeName;
   
   
   private com.commercetools.models.Common.LocalizedString label;
   
   public ProductTypeChangeLabelActionBuilder attributeName( final java.lang.String attributeName) {
      this.attributeName = attributeName;
      return this;
   }
   
   public ProductTypeChangeLabelActionBuilder label( final com.commercetools.models.Common.LocalizedString label) {
      this.label = label;
      return this;
   }
   
   
   public java.lang.String getAttributeName(){
      return this.attributeName;
   }
   
   
   public com.commercetools.models.Common.LocalizedString getLabel(){
      return this.label;
   }

   public ProductTypeChangeLabelAction build() {
       return new ProductTypeChangeLabelActionImpl(attributeName, label);
   }
   
   public static ProductTypeChangeLabelActionBuilder of() {
      return new ProductTypeChangeLabelActionBuilder();
   }
   
   public static ProductTypeChangeLabelActionBuilder of(final ProductTypeChangeLabelAction template) {
      ProductTypeChangeLabelActionBuilder builder = new ProductTypeChangeLabelActionBuilder();
      builder.attributeName = template.getAttributeName();
      builder.label = template.getLabel();
      return builder;
   }
   
}