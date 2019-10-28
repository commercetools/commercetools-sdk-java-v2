package com.commercetools.api.generated.models.product;

import com.commercetools.api.generated.models.product.ProductUpdateAction;
import com.commercetools.api.generated.models.product.ProductSetAttributeAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductSetAttributeActionBuilder {
   
   
   private String name;
   
   @Nullable
   private Boolean staged;
   
   @Nullable
   private Long variantId;
   
   @Nullable
   private String sku;
   
   @Nullable
   private Object value;
   
   public ProductSetAttributeActionBuilder name( final String name) {
      this.name = name;
      return this;
   }
   
   public ProductSetAttributeActionBuilder staged(@Nullable final Boolean staged) {
      this.staged = staged;
      return this;
   }
   
   public ProductSetAttributeActionBuilder variantId(@Nullable final Long variantId) {
      this.variantId = variantId;
      return this;
   }
   
   public ProductSetAttributeActionBuilder sku(@Nullable final String sku) {
      this.sku = sku;
      return this;
   }
   
   public ProductSetAttributeActionBuilder value(@Nullable final Object value) {
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
   public Long getVariantId(){
      return this.variantId;
   }
   
   @Nullable
   public String getSku(){
      return this.sku;
   }
   
   @Nullable
   public Object getValue(){
      return this.value;
   }

   public ProductSetAttributeAction build() {
       return new ProductSetAttributeActionImpl(name, staged, variantId, sku, value);
   }
   
   public static ProductSetAttributeActionBuilder of() {
      return new ProductSetAttributeActionBuilder();
   }
   
   public static ProductSetAttributeActionBuilder of(final ProductSetAttributeAction template) {
      ProductSetAttributeActionBuilder builder = new ProductSetAttributeActionBuilder();
      builder.name = template.getName();
      builder.staged = template.getStaged();
      builder.variantId = template.getVariantId();
      builder.sku = template.getSku();
      builder.value = template.getValue();
      return builder;
   }
   
}