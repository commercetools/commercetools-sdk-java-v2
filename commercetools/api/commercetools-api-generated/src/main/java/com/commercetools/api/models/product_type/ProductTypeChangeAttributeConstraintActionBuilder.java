package com.commercetools.api.models.product_type;

import com.commercetools.api.models.product_type.AttributeConstraintEnumDraft;
import com.commercetools.api.models.product_type.ProductTypeUpdateAction;
import com.commercetools.api.models.product_type.ProductTypeChangeAttributeConstraintAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductTypeChangeAttributeConstraintActionBuilder {


   private com.commercetools.api.models.product_type.AttributeConstraintEnumDraft newValue;


   private String attributeName;

   public ProductTypeChangeAttributeConstraintActionBuilder newValue( final com.commercetools.api.models.product_type.AttributeConstraintEnumDraft newValue) {
      this.newValue = newValue;
      return this;
   }

   public ProductTypeChangeAttributeConstraintActionBuilder attributeName( final String attributeName) {
      this.attributeName = attributeName;
      return this;
   }


   public com.commercetools.api.models.product_type.AttributeConstraintEnumDraft getNewValue(){
      return this.newValue;
   }


   public String getAttributeName(){
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
