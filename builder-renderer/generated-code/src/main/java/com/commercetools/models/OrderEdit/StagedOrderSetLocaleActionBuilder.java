package com.commercetools.models.OrderEdit;

import com.commercetools.models.Order.StagedOrderUpdateAction;
import java.lang.String;
import com.commercetools.models.OrderEdit.StagedOrderSetLocaleAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StagedOrderSetLocaleActionBuilder {
   
   @Nullable
   private java.lang.String locale;
   
   public StagedOrderSetLocaleActionBuilder locale(@Nullable final java.lang.String locale) {
      this.locale = locale;
      return this;
   }
   
   @Nullable
   public java.lang.String getLocale(){
      return this.locale;
   }

   public StagedOrderSetLocaleAction build() {
       return new StagedOrderSetLocaleActionImpl(locale);
   }
   
   public static StagedOrderSetLocaleActionBuilder of() {
      return new StagedOrderSetLocaleActionBuilder();
   }
   
   public static StagedOrderSetLocaleActionBuilder of(final StagedOrderSetLocaleAction template) {
      StagedOrderSetLocaleActionBuilder builder = new StagedOrderSetLocaleActionBuilder();
      builder.locale = template.getLocale();
      return builder;
   }
   
}