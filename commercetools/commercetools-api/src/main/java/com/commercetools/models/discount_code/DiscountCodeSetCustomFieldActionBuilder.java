package com.commercetools.models.discount_code;

import com.commercetools.models.discount_code.DiscountCodeUpdateAction;
import java.lang.Object;
import java.lang.String;
import com.commercetools.models.discount_code.DiscountCodeSetCustomFieldAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class DiscountCodeSetCustomFieldActionBuilder {
   
   
   private java.lang.String name;
   
   @Nullable
   private java.lang.Object value;
   
   public DiscountCodeSetCustomFieldActionBuilder name( final java.lang.String name) {
      this.name = name;
      return this;
   }
   
   public DiscountCodeSetCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
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

   public DiscountCodeSetCustomFieldAction build() {
       return new DiscountCodeSetCustomFieldActionImpl(name, value);
   }
   
   public static DiscountCodeSetCustomFieldActionBuilder of() {
      return new DiscountCodeSetCustomFieldActionBuilder();
   }
   
   public static DiscountCodeSetCustomFieldActionBuilder of(final DiscountCodeSetCustomFieldAction template) {
      DiscountCodeSetCustomFieldActionBuilder builder = new DiscountCodeSetCustomFieldActionBuilder();
      builder.name = template.getName();
      builder.value = template.getValue();
      return builder;
   }
   
}