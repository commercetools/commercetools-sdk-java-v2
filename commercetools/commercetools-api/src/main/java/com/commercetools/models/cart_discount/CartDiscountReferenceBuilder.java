package com.commercetools.models.cart_discount;

import com.commercetools.models.cart_discount.CartDiscount;
import com.commercetools.models.common.Reference;
import com.commercetools.models.common.ReferenceTypeId;
import com.commercetools.models.cart_discount.CartDiscountReference;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CartDiscountReferenceBuilder {
   
   
   private java.lang.String id;
   
   @Nullable
   private com.commercetools.models.cart_discount.CartDiscount obj;
   
   public CartDiscountReferenceBuilder id( final java.lang.String id) {
      this.id = id;
      return this;
   }
   
   public CartDiscountReferenceBuilder obj(@Nullable final com.commercetools.models.cart_discount.CartDiscount obj) {
      this.obj = obj;
      return this;
   }
   
   
   public java.lang.String getId(){
      return this.id;
   }
   
   @Nullable
   public com.commercetools.models.cart_discount.CartDiscount getObj(){
      return this.obj;
   }

   public CartDiscountReference build() {
       return new CartDiscountReferenceImpl(id, obj);
   }
   
   public static CartDiscountReferenceBuilder of() {
      return new CartDiscountReferenceBuilder();
   }
   
   public static CartDiscountReferenceBuilder of(final CartDiscountReference template) {
      CartDiscountReferenceBuilder builder = new CartDiscountReferenceBuilder();
      builder.id = template.getId();
      builder.obj = template.getObj();
      return builder;
   }
   
}