package com.commercetools.models.me;

import com.commercetools.models.me.MyCustomerUpdateAction;
import java.lang.String;
import com.commercetools.models.me.MyCustomerSetTitleAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class MyCustomerSetTitleActionBuilder {
   
   @Nullable
   private java.lang.String title;
   
   public MyCustomerSetTitleActionBuilder title(@Nullable final java.lang.String title) {
      this.title = title;
      return this;
   }
   
   @Nullable
   public java.lang.String getTitle(){
      return this.title;
   }

   public MyCustomerSetTitleAction build() {
       return new MyCustomerSetTitleActionImpl(title);
   }
   
   public static MyCustomerSetTitleActionBuilder of() {
      return new MyCustomerSetTitleActionBuilder();
   }
   
   public static MyCustomerSetTitleActionBuilder of(final MyCustomerSetTitleAction template) {
      MyCustomerSetTitleActionBuilder builder = new MyCustomerSetTitleActionBuilder();
      builder.title = template.getTitle();
      return builder;
   }
   
}