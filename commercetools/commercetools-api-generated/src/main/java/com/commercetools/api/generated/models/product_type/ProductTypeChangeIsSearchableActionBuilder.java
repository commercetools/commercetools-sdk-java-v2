package com.commercetools.api.generated.models.product_type;

import com.commercetools.api.generated.models.product_type.ProductTypeUpdateAction;
import com.commercetools.api.generated.models.product_type.ProductTypeChangeIsSearchableAction;
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
public final class ProductTypeChangeIsSearchableActionBuilder {
   
   
   private String attributeName;
   
   
   private Boolean isSearchable;
   
   public ProductTypeChangeIsSearchableActionBuilder attributeName( final String attributeName) {
      this.attributeName = attributeName;
      return this;
   }
   
   public ProductTypeChangeIsSearchableActionBuilder isSearchable( final Boolean isSearchable) {
      this.isSearchable = isSearchable;
      return this;
   }
   
   
   public String getAttributeName(){
      return this.attributeName;
   }
   
   
   public Boolean getIsSearchable(){
      return this.isSearchable;
   }

   public ProductTypeChangeIsSearchableAction build() {
       return new ProductTypeChangeIsSearchableActionImpl(attributeName, isSearchable);
   }
   
   public static ProductTypeChangeIsSearchableActionBuilder of() {
      return new ProductTypeChangeIsSearchableActionBuilder();
   }
   
   public static ProductTypeChangeIsSearchableActionBuilder of(final ProductTypeChangeIsSearchableAction template) {
      ProductTypeChangeIsSearchableActionBuilder builder = new ProductTypeChangeIsSearchableActionBuilder();
      builder.attributeName = template.getAttributeName();
      builder.isSearchable = template.getIsSearchable();
      return builder;
   }
   
}