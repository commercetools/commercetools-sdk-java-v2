package com.commercetools.api.generated.models.cart;

import com.commercetools.api.generated.models.cart.Cart;
import com.commercetools.api.generated.models.common.Reference;
import com.commercetools.api.generated.models.common.ReferenceTypeId;
import com.commercetools.api.generated.models.cart.CartReference;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CartReferenceBuilder {
   
   
   private String id;
   
   @Nullable
   private com.commercetools.api.generated.models.cart.Cart obj;
   
   public CartReferenceBuilder id( final String id) {
      this.id = id;
      return this;
   }
   
   public CartReferenceBuilder obj(@Nullable final com.commercetools.api.generated.models.cart.Cart obj) {
      this.obj = obj;
      return this;
   }
   
   
   public String getId(){
      return this.id;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.cart.Cart getObj(){
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