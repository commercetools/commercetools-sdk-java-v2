package com.commercetools.api.generated.models.cart_discount;

import com.commercetools.api.generated.models.cart_discount.CartDiscount;
import com.commercetools.api.generated.models.common.Reference;
import com.commercetools.api.generated.models.common.ReferenceTypeId;
import com.commercetools.api.generated.models.cart_discount.CartDiscountReference;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CartDiscountReferenceBuilder {
   
   
   private String id;
   
   @Nullable
   private com.commercetools.api.generated.models.cart_discount.CartDiscount obj;
   
   public CartDiscountReferenceBuilder id( final String id) {
      this.id = id;
      return this;
   }
   
   public CartDiscountReferenceBuilder obj(@Nullable final com.commercetools.api.generated.models.cart_discount.CartDiscount obj) {
      this.obj = obj;
      return this;
   }
   
   
   public String getId(){
      return this.id;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.cart_discount.CartDiscount getObj(){
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