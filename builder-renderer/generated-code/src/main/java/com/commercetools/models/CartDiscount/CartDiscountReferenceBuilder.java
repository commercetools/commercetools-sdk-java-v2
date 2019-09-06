package com.commercetools.models.CartDiscount;

import com.commercetools.models.CartDiscount.CartDiscount;
import com.commercetools.models.Common.Reference;
import com.commercetools.models.Common.ReferenceTypeId;
import com.commercetools.models.CartDiscount.CartDiscountReference;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CartDiscountReferenceBuilder {
   
   
   private java.lang.String id;
   
   @Nullable
   private com.commercetools.models.CartDiscount.CartDiscount obj;
   
   public CartDiscountReferenceBuilder id( final java.lang.String id) {
      this.id = id;
      return this;
   }
   
   public CartDiscountReferenceBuilder obj(@Nullable final com.commercetools.models.CartDiscount.CartDiscount obj) {
      this.obj = obj;
      return this;
   }
   
   
   public java.lang.String getId(){
      return this.id;
   }
   
   @Nullable
   public com.commercetools.models.CartDiscount.CartDiscount getObj(){
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