package com.commercetools.api.models.me;

import com.commercetools.api.models.me.MyCartUpdateAction;
import com.commercetools.api.models.me.MyCartSetLocaleAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class MyCartSetLocaleActionBuilder {
   
   @Nullable
   private String locale;
   
   public MyCartSetLocaleActionBuilder locale(@Nullable final String locale) {
      this.locale = locale;
      return this;
   }
   
   @Nullable
   public String getLocale(){
      return this.locale;
   }

   public MyCartSetLocaleAction build() {
       return new MyCartSetLocaleActionImpl(locale);
   }
   
   public static MyCartSetLocaleActionBuilder of() {
      return new MyCartSetLocaleActionBuilder();
   }
   
   public static MyCartSetLocaleActionBuilder of(final MyCartSetLocaleAction template) {
      MyCartSetLocaleActionBuilder builder = new MyCartSetLocaleActionBuilder();
      builder.locale = template.getLocale();
      return builder;
   }
   
}
