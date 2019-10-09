package com.commercetools.models.me;

import com.commercetools.models.common.LocalizedString;
import com.commercetools.models.me.MyPaymentUpdateAction;
import com.commercetools.models.me.MyPaymentSetMethodInfoNameAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class MyPaymentSetMethodInfoNameActionBuilder {
   
   @Nullable
   private com.commercetools.models.common.LocalizedString name;
   
   public MyPaymentSetMethodInfoNameActionBuilder name(@Nullable final com.commercetools.models.common.LocalizedString name) {
      this.name = name;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.common.LocalizedString getName(){
      return this.name;
   }

   public MyPaymentSetMethodInfoNameAction build() {
       return new MyPaymentSetMethodInfoNameActionImpl(name);
   }
   
   public static MyPaymentSetMethodInfoNameActionBuilder of() {
      return new MyPaymentSetMethodInfoNameActionBuilder();
   }
   
   public static MyPaymentSetMethodInfoNameActionBuilder of(final MyPaymentSetMethodInfoNameAction template) {
      MyPaymentSetMethodInfoNameActionBuilder builder = new MyPaymentSetMethodInfoNameActionBuilder();
      builder.name = template.getName();
      return builder;
   }
   
}