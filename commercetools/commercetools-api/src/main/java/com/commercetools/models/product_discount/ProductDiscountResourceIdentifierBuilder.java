package com.commercetools.models.product_discount;

import com.commercetools.models.common.ReferenceTypeId;
import com.commercetools.models.common.ResourceIdentifier;
import com.commercetools.models.product_discount.ProductDiscountResourceIdentifier;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductDiscountResourceIdentifierBuilder {
   
   @Nullable
   private String id;
   
   @Nullable
   private String key;
   
   public ProductDiscountResourceIdentifierBuilder id(@Nullable final String id) {
      this.id = id;
      return this;
   }
   
   public ProductDiscountResourceIdentifierBuilder key(@Nullable final String key) {
      this.key = key;
      return this;
   }
   
   @Nullable
   public String getId(){
      return this.id;
   }
   
   @Nullable
   public String getKey(){
      return this.key;
   }

   public ProductDiscountResourceIdentifier build() {
       return new ProductDiscountResourceIdentifierImpl(id, key);
   }
   
   public static ProductDiscountResourceIdentifierBuilder of() {
      return new ProductDiscountResourceIdentifierBuilder();
   }
   
   public static ProductDiscountResourceIdentifierBuilder of(final ProductDiscountResourceIdentifier template) {
      ProductDiscountResourceIdentifierBuilder builder = new ProductDiscountResourceIdentifierBuilder();
      builder.id = template.getId();
      builder.key = template.getKey();
      return builder;
   }
   
}