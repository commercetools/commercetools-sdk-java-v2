package com.commercetools.api.generated.models.product_type;

import com.commercetools.api.generated.models.product_type.ProductTypeUpdateAction;
import com.commercetools.api.generated.models.product_type.ProductTypeUpdate;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import javax.annotation.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductTypeUpdateBuilder {
   
   
   private java.util.List<com.commercetools.api.generated.models.product_type.ProductTypeUpdateAction> actions;
   
   
   private Long version;
   
   public ProductTypeUpdateBuilder actions( final java.util.List<com.commercetools.api.generated.models.product_type.ProductTypeUpdateAction> actions) {
      this.actions = actions;
      return this;
   }
   
   public ProductTypeUpdateBuilder version( final Long version) {
      this.version = version;
      return this;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.product_type.ProductTypeUpdateAction> getActions(){
      return this.actions;
   }
   
   
   public Long getVersion(){
      return this.version;
   }

   public ProductTypeUpdate build() {
       return new ProductTypeUpdateImpl(actions, version);
   }
   
   public static ProductTypeUpdateBuilder of() {
      return new ProductTypeUpdateBuilder();
   }
   
   public static ProductTypeUpdateBuilder of(final ProductTypeUpdate template) {
      ProductTypeUpdateBuilder builder = new ProductTypeUpdateBuilder();
      builder.actions = template.getActions();
      builder.version = template.getVersion();
      return builder;
   }
   
}