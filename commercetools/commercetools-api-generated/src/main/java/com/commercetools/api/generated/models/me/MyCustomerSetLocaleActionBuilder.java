package com.commercetools.api.generated.models.me;

import com.commercetools.api.generated.models.me.MyCustomerUpdateAction;
import com.commercetools.api.generated.models.me.MyCustomerSetLocaleAction;
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
public final class MyCustomerSetLocaleActionBuilder {
   
   @Nullable
   private String locale;
   
   public MyCustomerSetLocaleActionBuilder locale(@Nullable final String locale) {
      this.locale = locale;
      return this;
   }
   
   @Nullable
   public String getLocale(){
      return this.locale;
   }

   public MyCustomerSetLocaleAction build() {
       return new MyCustomerSetLocaleActionImpl(locale);
   }
   
   public static MyCustomerSetLocaleActionBuilder of() {
      return new MyCustomerSetLocaleActionBuilder();
   }
   
   public static MyCustomerSetLocaleActionBuilder of(final MyCustomerSetLocaleAction template) {
      MyCustomerSetLocaleActionBuilder builder = new MyCustomerSetLocaleActionBuilder();
      builder.locale = template.getLocale();
      return builder;
   }
   
}