package com.commercetools.api.generated.models.me;

import com.commercetools.api.generated.models.me.MyPaymentUpdateAction;
import com.commercetools.api.generated.models.me.MyPaymentSetCustomFieldAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class MyPaymentSetCustomFieldActionBuilder {
   
   
   private String name;
   
   @Nullable
   private Object value;
   
   public MyPaymentSetCustomFieldActionBuilder name( final String name) {
      this.name = name;
      return this;
   }
   
   public MyPaymentSetCustomFieldActionBuilder value(@Nullable final Object value) {
      this.value = value;
      return this;
   }
   
   
   public String getName(){
      return this.name;
   }
   
   @Nullable
   public Object getValue(){
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