package com.commercetools.api.models.me;

import com.commercetools.api.models.me.MyPaymentUpdateAction;
import com.fasterxml.jackson.databind.JsonNode;
import com.commercetools.api.models.me.MyPaymentSetCustomFieldAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class MyPaymentSetCustomFieldActionBuilder {
   
   
   private String name;
   
   @Nullable
   private com.fasterxml.jackson.databind.JsonNode value;
   
   public MyPaymentSetCustomFieldActionBuilder name( final String name) {
      this.name = name;
      return this;
   }
   
   public MyPaymentSetCustomFieldActionBuilder value(@Nullable final com.fasterxml.jackson.databind.JsonNode value) {
      this.value = value;
      return this;
   }
   
   
   public String getName(){
      return this.name;
   }
   
   @Nullable
   public com.fasterxml.jackson.databind.JsonNode getValue(){
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
