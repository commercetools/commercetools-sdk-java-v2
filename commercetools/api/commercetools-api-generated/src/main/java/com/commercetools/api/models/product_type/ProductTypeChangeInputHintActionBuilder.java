package com.commercetools.api.models.product_type;

import com.commercetools.api.models.product_type.ProductTypeUpdateAction;
import com.commercetools.api.models.product_type.TextInputHint;
import com.commercetools.api.models.product_type.ProductTypeChangeInputHintAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductTypeChangeInputHintActionBuilder {


   private com.commercetools.api.models.product_type.TextInputHint newValue;


   private String attributeName;

   public ProductTypeChangeInputHintActionBuilder newValue( final com.commercetools.api.models.product_type.TextInputHint newValue) {
      this.newValue = newValue;
      return this;
   }

   public ProductTypeChangeInputHintActionBuilder attributeName( final String attributeName) {
      this.attributeName = attributeName;
      return this;
   }


   public com.commercetools.api.models.product_type.TextInputHint getNewValue(){
      return this.newValue;
   }


   public String getAttributeName(){
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
