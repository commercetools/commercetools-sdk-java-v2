package com.commercetools.api.generated.models.product;

import com.commercetools.api.generated.models.product.ProductUpdateAction;
import com.fasterxml.jackson.databind.JsonNode;
import com.commercetools.api.generated.models.product.ProductSetAttributeInAllVariantsAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductSetAttributeInAllVariantsActionBuilder {
   
   
   private String name;
   
   @Nullable
   private Boolean staged;
   
   @Nullable
   private com.fasterxml.jackson.databind.JsonNode value;
   
   public ProductSetAttributeInAllVariantsActionBuilder name( final String name) {
      this.name = name;
      return this;
   }
   
   public ProductSetAttributeInAllVariantsActionBuilder staged(@Nullable final Boolean staged) {
      this.staged = staged;
      return this;
   }
   
   public ProductSetAttributeInAllVariantsActionBuilder value(@Nullable final com.fasterxml.jackson.databind.JsonNode value) {
      this.value = value;
      return this;
   }
   
   
   public String getName(){
      return this.name;
   }
   
   @Nullable
   public Boolean getStaged(){
      return this.staged;
   }
   
   @Nullable
   public com.fasterxml.jackson.databind.JsonNode getValue(){
      return this.value;
   }

   public ProductSetAttributeInAllVariantsAction build() {
       return new ProductSetAttributeInAllVariantsActionImpl(name, staged, value);
   }
   
   public static ProductSetAttributeInAllVariantsActionBuilder of() {
      return new ProductSetAttributeInAllVariantsActionBuilder();
   }
   
   public static ProductSetAttributeInAllVariantsActionBuilder of(final ProductSetAttributeInAllVariantsAction template) {
      ProductSetAttributeInAllVariantsActionBuilder builder = new ProductSetAttributeInAllVariantsActionBuilder();
      builder.name = template.getName();
      builder.staged = template.getStaged();
      builder.value = template.getValue();
      return builder;
   }
   
}