package com.commercetools.models.product_type;

import com.commercetools.models.product_type.AttributeConstraintEnumDraft;
import com.commercetools.models.product_type.ProductTypeUpdateAction;
import java.lang.String;
import com.commercetools.models.product_type.ProductTypeChangeAttributeConstraintAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductTypeChangeAttributeConstraintActionBuilder {
   
   
   private com.commercetools.models.product_type.AttributeConstraintEnumDraft newValue;
   
   
   private java.lang.String attributeName;
   
   public ProductTypeChangeAttributeConstraintActionBuilder newValue( final com.commercetools.models.product_type.AttributeConstraintEnumDraft newValue) {
      this.newValue = newValue;
      return this;
   }
   
   public ProductTypeChangeAttributeConstraintActionBuilder attributeName( final java.lang.String attributeName) {
      this.attributeName = attributeName;
      return this;
   }
   
   
   public com.commercetools.models.product_type.AttributeConstraintEnumDraft getNewValue(){
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