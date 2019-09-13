package com.commercetools.models.me;

import com.commercetools.models.me.MyCustomerUpdateAction;
import java.lang.String;
import com.commercetools.models.me.MyCustomerSetVatIdAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class MyCustomerSetVatIdActionBuilder {
   
   @Nullable
   private java.lang.String vatId;
   
   public MyCustomerSetVatIdActionBuilder vatId(@Nullable final java.lang.String vatId) {
      this.vatId = vatId;
      return this;
   }
   
   @Nullable
   public java.lang.String getVatId(){
      return this.vatId;
   }

   public MyCustomerSetVatIdAction build() {
       return new MyCustomerSetVatIdActionImpl(vatId);
   }
   
   public static MyCustomerSetVatIdActionBuilder of() {
      return new MyCustomerSetVatIdActionBuilder();
   }
   
   public static MyCustomerSetVatIdActionBuilder of(final MyCustomerSetVatIdAction template) {
      MyCustomerSetVatIdActionBuilder builder = new MyCustomerSetVatIdActionBuilder();
      builder.vatId = template.getVatId();
      return builder;
   }
   
}