package com.commercetools.models.ProductType;

import com.commercetools.models.ProductType.AttributeConstraintEnumDraft;
import com.commercetools.models.ProductType.ProductTypeUpdateAction;
import java.lang.String;
import com.commercetools.models.ProductType.ProductTypeChangeAttributeConstraintAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductTypeChangeAttributeConstraintActionBuilder {
   
   
   private com.commercetools.models.ProductType.AttributeConstraintEnumDraft newValue;
   
   
   private java.lang.String attributeName;
   
   public ProductTypeChangeAttributeConstraintActionBuilder newValue( final com.commercetools.models.ProductType.AttributeConstraintEnumDraft newValue) {
      this.newValue = newValue;
      return this;
   }
   
   public ProductTypeChangeAttributeConstraintActionBuilder attributeName( final java.lang.String attributeName) {
      this.attributeName = attributeName;
      return this;
   }
   
   
   public com.commercetools.models.ProductType.AttributeConstraintEnumDraft getNewValue(){
      return this.newValue;
   }
   
   
   public java.lang.String getAttributeName(){
      return this.attributeName;
   }

   public ProductTypeChangeAttributeConstraintAction build() {
       return new ProductTypeChangeAttributeConstraintActionImpl(newValue, attributeName);
   }
   
   public static ProductTypeChangeAttributeConstraintActionBuilder of() {
      return new ProductTypeChangeAttributeConstraintActionBuilder();
   }
   
   public static ProductTypeChangeAttributeConstraintActionBuilder of(final ProductTypeChangeAttributeConstraintAction template) {
      ProductTypeChangeAttributeConstraintActionBuilder builder = new ProductTypeChangeAttributeConstraintActionBuilder();
      builder.newValue = template.getNewValue();
      builder.attributeName = template.getAttributeName();
      return builder;
   }
   
}