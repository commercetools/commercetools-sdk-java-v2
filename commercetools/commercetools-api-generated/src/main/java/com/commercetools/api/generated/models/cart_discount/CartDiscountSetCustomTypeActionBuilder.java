package com.commercetools.api.generated.models.cart_discount;

import com.commercetools.api.generated.models.cart_discount.CartDiscountUpdateAction;
import com.commercetools.api.generated.models.type.TypeResourceIdentifier;
import com.commercetools.api.generated.models.cart_discount.CartDiscountSetCustomTypeAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import javax.annotation.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CartDiscountSetCustomTypeActionBuilder {
   
   @Nullable
   private Object fields;
   
   @Nullable
   private com.commercetools.api.generated.models.type.TypeResourceIdentifier type;
   
   public CartDiscountSetCustomTypeActionBuilder fields(@Nullable final Object fields) {
      this.fields = fields;
      return this;
   }
   
   public CartDiscountSetCustomTypeActionBuilder type(@Nullable final com.commercetools.api.generated.models.type.TypeResourceIdentifier type) {
      this.type = type;
      return this;
   }
   
   @Nullable
   public Object getFields(){
      return this.fields;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.type.TypeResourceIdentifier getType(){
      return this.type;
   }

   public CartDiscountSetCustomTypeAction build() {
       return new CartDiscountSetCustomTypeActionImpl(fields, type);
   }
   
   public static CartDiscountSetCustomTypeActionBuilder of() {
      return new CartDiscountSetCustomTypeActionBuilder();
   }
   
   public static CartDiscountSetCustomTypeActionBuilder of(final CartDiscountSetCustomTypeAction template) {
      CartDiscountSetCustomTypeActionBuilder builder = new CartDiscountSetCustomTypeActionBuilder();
      builder.fields = template.getFields();
      builder.type = template.getType();
      return builder;
   }
   
}