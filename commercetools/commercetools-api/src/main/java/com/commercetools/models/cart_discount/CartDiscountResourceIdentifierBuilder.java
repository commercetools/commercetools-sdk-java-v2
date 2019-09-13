package com.commercetools.models.cart_discount;

import com.commercetools.models.common.ReferenceTypeId;
import com.commercetools.models.common.ResourceIdentifier;
import com.commercetools.models.cart_discount.CartDiscountResourceIdentifier;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CartDiscountResourceIdentifierBuilder {
   
   @Nullable
   private java.lang.String id;
   
   @Nullable
   private java.lang.String key;
   
   public CartDiscountResourceIdentifierBuilder id(@Nullable final java.lang.String id) {
      this.id = id;
      return this;
   }
   
   public CartDiscountResourceIdentifierBuilder key(@Nullable final java.lang.String key) {
      this.key = key;
      return this;
   }
   
   @Nullable
   public java.lang.String getId(){
      return this.id;
   }
   
   @Nullable
   public java.lang.String getKey(){
      return this.key;
   }

   public CartDiscountResourceIdentifier build() {
       return new CartDiscountResourceIdentifierImpl(id, key);
   }
   
   public static CartDiscountResourceIdentifierBuilder of() {
      return new CartDiscountResourceIdentifierBuilder();
   }
   
   public static CartDiscountResourceIdentifierBuilder of(final CartDiscountResourceIdentifier template) {
      CartDiscountResourceIdentifierBuilder builder = new CartDiscountResourceIdentifierBuilder();
      builder.id = template.getId();
      builder.key = template.getKey();
      return builder;
   }
   
}