package com.commercetools.api.generated.models.product_type;

import com.commercetools.api.generated.models.product_type.AttributeLocalizedEnumValue;
import com.commercetools.api.generated.models.product_type.ProductTypeUpdateAction;
import com.commercetools.api.generated.models.product_type.ProductTypeChangeLocalizedEnumValueLabelAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductTypeChangeLocalizedEnumValueLabelActionBuilder {
   
   
   private com.commercetools.api.generated.models.product_type.AttributeLocalizedEnumValue newValue;
   
   
   private String attributeName;
   
   public ProductTypeChangeLocalizedEnumValueLabelActionBuilder newValue( final com.commercetools.api.generated.models.product_type.AttributeLocalizedEnumValue newValue) {
      this.newValue = newValue;
      return this;
   }
   
   public ProductTypeChangeLocalizedEnumValueLabelActionBuilder attributeName( final String attributeName) {
      this.attributeName = attributeName;
      return this;
   }
   
   
   public com.commercetools.api.generated.models.product_type.AttributeLocalizedEnumValue getNewValue(){
      return this.newValue;
   }
   
   
   public String getAttributeName(){
      return this.attributeName;
   }

   public ProductTypeChangeLocalizedEnumValueLabelAction build() {
       return new ProductTypeChangeLocalizedEnumValueLabelActionImpl(newValue, attributeName);
   }
   
   public static ProductTypeChangeLocalizedEnumValueLabelActionBuilder of() {
      return new ProductTypeChangeLocalizedEnumValueLabelActionBuilder();
   }
   
   public static ProductTypeChangeLocalizedEnumValueLabelActionBuilder of(final ProductTypeChangeLocalizedEnumValueLabelAction template) {
      ProductTypeChangeLocalizedEnumValueLabelActionBuilder builder = new ProductTypeChangeLocalizedEnumValueLabelActionBuilder();
      builder.newValue = template.getNewValue();
      builder.attributeName = template.getAttributeName();
      return builder;
   }
   
}