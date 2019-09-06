package com.commercetools.models.CartDiscount;

import com.commercetools.models.CartDiscount.CartDiscountUpdateAction;
import java.lang.Object;
import java.lang.String;
import com.commercetools.models.CartDiscount.CartDiscountSetCustomFieldAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CartDiscountSetCustomFieldActionBuilder {
   
   
   private java.lang.String name;
   
   @Nullable
   private java.lang.Object value;
   
   public CartDiscountSetCustomFieldActionBuilder name( final java.lang.String name) {
      this.name = name;
      return this;
   }
   
   public CartDiscountSetCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
      this.value = value;
      return this;
   }
   
   
   public java.lang.String getName(){
      return this.name;
   }
   
   @Nullable
   public java.lang.Object getValue(){
      return this.value;
   }

   public CartDiscountSetCustomFieldAction build() {
       return new CartDiscountSetCustomFieldActionImpl(name, value);
   }
   
   public static CartDiscountSetCustomFieldActionBuilder of() {
      return new CartDiscountSetCustomFieldActionBuilder();
   }
   
   public static CartDiscountSetCustomFieldActionBuilder of(final CartDiscountSetCustomFieldAction template) {
      CartDiscountSetCustomFieldActionBuilder builder = new CartDiscountSetCustomFieldActionBuilder();
      builder.name = template.getName();
      builder.value = template.getValue();
      return builder;
   }
   
}