package com.commercetools.models.Cart;

import com.commercetools.models.Cart.Cart;
import com.commercetools.models.Common.Reference;
import com.commercetools.models.Common.ReferenceTypeId;
import com.commercetools.models.Cart.CartReference;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CartReferenceBuilder {
   
   
   private java.lang.String id;
   
   @Nullable
   private com.commercetools.models.Cart.Cart obj;
   
   public CartReferenceBuilder id( final java.lang.String id) {
      this.id = id;
      return this;
   }
   
   public CartReferenceBuilder obj(@Nullable final com.commercetools.models.Cart.Cart obj) {
      this.obj = obj;
      return this;
   }
   
   
   public java.lang.String getId(){
      return this.id;
   }
   
   @Nullable
   public com.commercetools.models.Cart.Cart getObj(){
      return this.obj;
   }

   public CartReference build() {
       return new CartReferenceImpl(id, obj);
   }
   
   public static CartReferenceBuilder of() {
      return new CartReferenceBuilder();
   }
   
   public static CartReferenceBuilder of(final CartReference template) {
      CartReferenceBuilder builder = new CartReferenceBuilder();
      builder.id = template.getId();
      builder.obj = template.getObj();
      return builder;
   }
   
}