package com.commercetools.models.product_type;

import com.commercetools.models.product_type.ProductTypeUpdateAction;
import com.commercetools.models.product_type.TextInputHint;
import java.lang.String;
import com.commercetools.models.product_type.ProductTypeChangeInputHintAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductTypeChangeInputHintActionBuilder {
   
   
   private com.commercetools.models.product_type.TextInputHint newValue;
   
   
   private java.lang.String attributeName;
   
   public ProductTypeChangeInputHintActionBuilder newValue( final com.commercetools.models.product_type.TextInputHint newValue) {
      this.newValue = newValue;
      return this;
   }
   
   public ProductTypeChangeInputHintActionBuilder attributeName( final java.lang.String attributeName) {
      this.attributeName = attributeName;
      return this;
   }
   
   
   public com.commercetools.models.product_type.TextInputHint getNewValue(){
      return this.newValue;
   }
   
   
   public java.lang.String getAttributeName(){
      return this.attributeName;
   }

   public ProductTypeChangeInputHintAction build() {
       return new ProductTypeChangeInputHintActionImpl(newValue, attributeName);
   }
   
   public static ProductTypeChangeInputHintActionBuilder of() {
      return new ProductTypeChangeInputHintActionBuilder();
   }
   
   public static ProductTypeChangeInputHintActionBuilder of(final ProductTypeChangeInputHintAction template) {
      ProductTypeChangeInputHintActionBuilder builder = new ProductTypeChangeInputHintActionBuilder();
      builder.newValue = template.getNewValue();
      builder.attributeName = template.getAttributeName();
      return builder;
   }
   
}