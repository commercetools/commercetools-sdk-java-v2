package com.commercetools.api.generated.models.product;

import com.commercetools.api.generated.models.product.ProductUpdateAction;
import com.commercetools.api.generated.models.product.ProductUpdate;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.databind.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductUpdateBuilder {
   
   
   private java.util.List<com.commercetools.api.generated.models.product.ProductUpdateAction> actions;
   
   
   private Long version;
   
   public ProductUpdateBuilder actions( final java.util.List<com.commercetools.api.generated.models.product.ProductUpdateAction> actions) {
      this.actions = actions;
      return this;
   }
   
   public ProductUpdateBuilder version( final Long version) {
      this.version = version;
      return this;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.product.ProductUpdateAction> getActions(){
      return this.actions;
   }
   
   
   public Long getVersion(){
      return this.version;
   }

   public ProductUpdate build() {
       return new ProductUpdateImpl(actions, version);
   }
   
   public static ProductUpdateBuilder of() {
      return new ProductUpdateBuilder();
   }
   
   public static ProductUpdateBuilder of(final ProductUpdate template) {
      ProductUpdateBuilder builder = new ProductUpdateBuilder();
      builder.actions = template.getActions();
      builder.version = template.getVersion();
      return builder;
   }
   
}