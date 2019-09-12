package com.commercetools.models.Me;

import com.commercetools.models.Me.MyPaymentUpdateAction;
import java.lang.Object;
import java.lang.String;
import com.commercetools.models.Me.MyPaymentSetCustomFieldAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class MyPaymentSetCustomFieldActionBuilder {
   
   
   private java.lang.String name;
   
   @Nullable
   private java.lang.Object value;
   
   public MyPaymentSetCustomFieldActionBuilder name( final java.lang.String name) {
      this.name = name;
      return this;
   }
   
   public MyPaymentSetCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
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

   public MyPaymentSetCustomFieldAction build() {
       return new MyPaymentSetCustomFieldActionImpl(name, value);
   }
   
   public static MyPaymentSetCustomFieldActionBuilder of() {
      return new MyPaymentSetCustomFieldActionBuilder();
   }
   
   public static MyPaymentSetCustomFieldActionBuilder of(final MyPaymentSetCustomFieldAction template) {
      MyPaymentSetCustomFieldActionBuilder builder = new MyPaymentSetCustomFieldActionBuilder();
      builder.name = template.getName();
      builder.value = template.getValue();
      return builder;
   }
   
}