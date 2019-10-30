package com.commercetools.api.generated.models.product_type;

import com.commercetools.api.generated.models.product_type.ProductTypeUpdateAction;
import com.commercetools.api.generated.models.product_type.ProductTypeRemoveEnumValuesAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductTypeRemoveEnumValuesActionBuilder {
   
   
   private java.util.List<String> keys;
   
   
   private String attributeName;
   
   public ProductTypeRemoveEnumValuesActionBuilder keys( final java.util.List<String> keys) {
      this.keys = keys;
      return this;
   }
   
   public ProductTypeRemoveEnumValuesActionBuilder attributeName( final String attributeName) {
      this.attributeName = attributeName;
      return this;
   }
   
   
   public java.util.List<String> getKeys(){
      return this.keys;
   }
   
   
   public String getAttributeName(){
      return this.attributeName;
   }

   public ProductTypeRemoveEnumValuesAction build() {
       return new ProductTypeRemoveEnumValuesActionImpl(keys, attributeName);
   }
   
   public static ProductTypeRemoveEnumValuesActionBuilder of() {
      return new ProductTypeRemoveEnumValuesActionBuilder();
   }
   
   public static ProductTypeRemoveEnumValuesActionBuilder of(final ProductTypeRemoveEnumValuesAction template) {
      ProductTypeRemoveEnumValuesActionBuilder builder = new ProductTypeRemoveEnumValuesActionBuilder();
      builder.keys = template.getKeys();
      builder.attributeName = template.getAttributeName();
      return builder;
   }
   
}