package com.commercetools.api.models.product_type;

import com.commercetools.api.models.product_type.ProductTypeUpdateAction;
import com.commercetools.api.models.product_type.ProductTypeChangeEnumKeyAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductTypeChangeEnumKeyActionBuilder {


   private String newKey;


   private String attributeName;


   private String key;

   public ProductTypeChangeEnumKeyActionBuilder newKey( final String newKey) {
      this.newKey = newKey;
      return this;
   }

   public ProductTypeChangeEnumKeyActionBuilder attributeName( final String attributeName) {
      this.attributeName = attributeName;
      return this;
   }

   public ProductTypeChangeEnumKeyActionBuilder key( final String key) {
      this.key = key;
      return this;
   }


   public String getNewKey(){
      return this.newKey;
   }


   public String getAttributeName(){
      return this.attributeName;
   }


   public String getKey(){
      return this.key;
   }

   public ProductTypeChangeEnumKeyAction build() {
       return new ProductTypeChangeEnumKeyActionImpl(newKey, attributeName, key);
   }

   public static ProductTypeChangeEnumKeyActionBuilder of() {
      return new ProductTypeChangeEnumKeyActionBuilder();
   }

   public static ProductTypeChangeEnumKeyActionBuilder of(final ProductTypeChangeEnumKeyAction template) {
      ProductTypeChangeEnumKeyActionBuilder builder = new ProductTypeChangeEnumKeyActionBuilder();
      builder.newKey = template.getNewKey();
      builder.attributeName = template.getAttributeName();
      builder.key = template.getKey();
      return builder;
   }

}
