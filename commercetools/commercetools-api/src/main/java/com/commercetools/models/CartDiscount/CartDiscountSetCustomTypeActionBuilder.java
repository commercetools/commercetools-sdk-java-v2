package com.commercetools.models.CartDiscount;

import com.commercetools.models.CartDiscount.CartDiscountUpdateAction;
import com.commercetools.models.Type.TypeResourceIdentifier;
import java.lang.Object;
import java.lang.String;
import com.commercetools.models.CartDiscount.CartDiscountSetCustomTypeAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CartDiscountSetCustomTypeActionBuilder {
   
   @Nullable
   private java.lang.Object fields;
   
   @Nullable
   private com.commercetools.models.Type.TypeResourceIdentifier type;
   
   public CartDiscountSetCustomTypeActionBuilder fields(@Nullable final java.lang.Object fields) {
      this.fields = fields;
      return this;
   }
   
   public CartDiscountSetCustomTypeActionBuilder type(@Nullable final com.commercetools.models.Type.TypeResourceIdentifier type) {
      this.type = type;
      return this;
   }
   
   @Nullable
   public java.lang.Object getFields(){
      return this.fields;
   }
   
   @Nullable
   public com.commercetools.models.Type.TypeResourceIdentifier getType(){
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