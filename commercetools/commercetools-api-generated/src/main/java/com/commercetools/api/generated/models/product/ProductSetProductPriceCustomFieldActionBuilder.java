package com.commercetools.api.generated.models.product;

import com.commercetools.api.generated.models.product.ProductUpdateAction;
import com.commercetools.api.generated.models.product.ProductSetProductPriceCustomFieldAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import javax.annotation.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductSetProductPriceCustomFieldActionBuilder {
   
   
   private String name;
   
   @Nullable
   private Boolean staged;
   
   
   private String priceId;
   
   @Nullable
   private Object value;
   
   public ProductSetProductPriceCustomFieldActionBuilder name( final String name) {
      this.name = name;
      return this;
   }
   
   public ProductSetProductPriceCustomFieldActionBuilder staged(@Nullable final Boolean staged) {
      this.staged = staged;
      return this;
   }
   
   public ProductSetProductPriceCustomFieldActionBuilder priceId( final String priceId) {
      this.priceId = priceId;
      return this;
   }
   
   public ProductSetProductPriceCustomFieldActionBuilder value(@Nullable final Object value) {
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
   
   
   public String getPriceId(){
      return this.priceId;
   }
   
   @Nullable
   public Object getValue(){
      return this.value;
   }

   public ProductSetProductPriceCustomFieldAction build() {
       return new ProductSetProductPriceCustomFieldActionImpl(name, staged, priceId, value);
   }
   
   public static ProductSetProductPriceCustomFieldActionBuilder of() {
      return new ProductSetProductPriceCustomFieldActionBuilder();
   }
   
   public static ProductSetProductPriceCustomFieldActionBuilder of(final ProductSetProductPriceCustomFieldAction template) {
      ProductSetProductPriceCustomFieldActionBuilder builder = new ProductSetProductPriceCustomFieldActionBuilder();
      builder.name = template.getName();
      builder.staged = template.getStaged();
      builder.priceId = template.getPriceId();
      builder.value = template.getValue();
      return builder;
   }
   
}