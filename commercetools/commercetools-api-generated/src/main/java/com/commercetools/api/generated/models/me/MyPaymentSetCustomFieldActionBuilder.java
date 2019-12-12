package com.commercetools.api.generated.models.me;

import com.commercetools.api.generated.models.me.MyPaymentUpdateAction;
import com.commercetools.api.generated.models.me.MyPaymentSetCustomFieldAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.databind.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class MyPaymentSetCustomFieldActionBuilder {
   
   
   private String name;
   
   @Nullable
   private JsonNode value;
   
   public MyPaymentSetCustomFieldActionBuilder name( final String name) {
      this.name = name;
      return this;
   }
   
   public MyPaymentSetCustomFieldActionBuilder value(@Nullable final JsonNode value) {
      this.value = value;
      return this;
   }
   
   
   public String getName(){
      return this.name;
   }
   
   @Nullable
   public JsonNode getValue(){
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