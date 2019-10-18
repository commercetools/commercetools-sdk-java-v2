package com.commercetools.api.generated.models.product_type;

import com.commercetools.api.generated.models.product_type.AttributePlainEnumValue;
import com.commercetools.api.generated.models.product_type.ProductTypeUpdateAction;
import com.commercetools.api.generated.models.product_type.ProductTypeChangePlainEnumValueLabelAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import javax.annotation.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductTypeChangePlainEnumValueLabelActionBuilder {
   
   
   private com.commercetools.api.generated.models.product_type.AttributePlainEnumValue newValue;
   
   
   private String attributeName;
   
   public ProductTypeChangePlainEnumValueLabelActionBuilder newValue( final com.commercetools.api.generated.models.product_type.AttributePlainEnumValue newValue) {
      this.newValue = newValue;
      return this;
   }
   
   public ProductTypeChangePlainEnumValueLabelActionBuilder attributeName( final String attributeName) {
      this.attributeName = attributeName;
      return this;
   }
   
   
   public com.commercetools.api.generated.models.product_type.AttributePlainEnumValue getNewValue(){
      return this.newValue;
   }
   
   
   public String getAttributeName(){
      return this.attributeName;
   }

   public ProductTypeChangePlainEnumValueLabelAction build() {
       return new ProductTypeChangePlainEnumValueLabelActionImpl(newValue, attributeName);
   }
   
   public static ProductTypeChangePlainEnumValueLabelActionBuilder of() {
      return new ProductTypeChangePlainEnumValueLabelActionBuilder();
   }
   
   public static ProductTypeChangePlainEnumValueLabelActionBuilder of(final ProductTypeChangePlainEnumValueLabelAction template) {
      ProductTypeChangePlainEnumValueLabelActionBuilder builder = new ProductTypeChangePlainEnumValueLabelActionBuilder();
      builder.newValue = template.getNewValue();
      builder.attributeName = template.getAttributeName();
      return builder;
   }
   
}