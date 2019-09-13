package com.commercetools.models.order;

import com.commercetools.models.order.OrderUpdateAction;
import java.lang.String;
import com.commercetools.models.order.OrderSetLocaleAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class OrderSetLocaleActionBuilder {
   
   @Nullable
   private java.lang.String locale;
   
   public OrderSetLocaleActionBuilder locale(@Nullable final java.lang.String locale) {
      this.locale = locale;
      return this;
   }
   
   @Nullable
   public java.lang.String getLocale(){
      return this.locale;
   }

   public OrderSetLocaleAction build() {
       return new OrderSetLocaleActionImpl(locale);
   }
   
   public static OrderSetLocaleActionBuilder of() {
      return new OrderSetLocaleActionBuilder();
   }
   
   public static OrderSetLocaleActionBuilder of(final OrderSetLocaleAction template) {
      OrderSetLocaleActionBuilder builder = new OrderSetLocaleActionBuilder();
      builder.locale = template.getLocale();
      return builder;
   }
   
}