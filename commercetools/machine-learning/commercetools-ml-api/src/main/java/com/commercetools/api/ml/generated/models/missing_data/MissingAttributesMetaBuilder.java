package com.commercetools.api.ml.generated.models.missing_data;

import com.commercetools.api.ml.generated.models.missing_data.MissingAttributesDetails;
import com.commercetools.api.ml.generated.models.missing_data.MissingAttributesMeta;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class MissingAttributesMetaBuilder {
   
   
   private com.commercetools.api.ml.generated.models.missing_data.MissingAttributesDetails productLevel;
   
   
   private com.commercetools.api.ml.generated.models.missing_data.MissingAttributesDetails variantLevel;
   
   @Nullable
   private java.util.List<String> productTypeIds;
   
   public MissingAttributesMetaBuilder productLevel( final com.commercetools.api.ml.generated.models.missing_data.MissingAttributesDetails productLevel) {
      this.productLevel = productLevel;
      return this;
   }
   
   public MissingAttributesMetaBuilder variantLevel( final com.commercetools.api.ml.generated.models.missing_data.MissingAttributesDetails variantLevel) {
      this.variantLevel = variantLevel;
      return this;
   }
   
   public MissingAttributesMetaBuilder productTypeIds(@Nullable final java.util.List<String> productTypeIds) {
      this.productTypeIds = productTypeIds;
      return this;
   }
   
   
   public com.commercetools.api.ml.generated.models.missing_data.MissingAttributesDetails getProductLevel(){
      return this.productLevel;
   }
   
   
   public com.commercetools.api.ml.generated.models.missing_data.MissingAttributesDetails getVariantLevel(){
      return this.variantLevel;
   }
   
   @Nullable
   public java.util.List<String> getProductTypeIds(){
      return this.productTypeIds;
   }

   public MissingAttributesMeta build() {
       return new MissingAttributesMetaImpl(productLevel, variantLevel, productTypeIds);
   }
   
   public static MissingAttributesMetaBuilder of() {
      return new MissingAttributesMetaBuilder();
   }
   
   public static MissingAttributesMetaBuilder of(final MissingAttributesMeta template) {
      MissingAttributesMetaBuilder builder = new MissingAttributesMetaBuilder();
      builder.productLevel = template.getProductLevel();
      builder.variantLevel = template.getVariantLevel();
      builder.productTypeIds = template.getProductTypeIds();
      return builder;
   }
   
}
