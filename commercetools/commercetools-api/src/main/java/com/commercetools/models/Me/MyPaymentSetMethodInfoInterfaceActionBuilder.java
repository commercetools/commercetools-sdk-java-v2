package com.commercetools.models.Me;

import com.commercetools.models.Me.MyPaymentUpdateAction;
import java.lang.String;
import com.commercetools.models.Me.MyPaymentSetMethodInfoInterfaceAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class MyPaymentSetMethodInfoInterfaceActionBuilder {
   
   
   private java.lang.String _interface;
   
   public MyPaymentSetMethodInfoInterfaceActionBuilder _interface( final java.lang.String _interface) {
      this._interface = _interface;
      return this;
   }
   
   
   public java.lang.String getInterface(){
      return this._interface;
   }

   public MyPaymentSetMethodInfoInterfaceAction build() {
       return new MyPaymentSetMethodInfoInterfaceActionImpl(_interface);
   }
   
   public static MyPaymentSetMethodInfoInterfaceActionBuilder of() {
      return new MyPaymentSetMethodInfoInterfaceActionBuilder();
   }
   
   public static MyPaymentSetMethodInfoInterfaceActionBuilder of(final MyPaymentSetMethodInfoInterfaceAction template) {
      MyPaymentSetMethodInfoInterfaceActionBuilder builder = new MyPaymentSetMethodInfoInterfaceActionBuilder();
      builder._interface = template.getInterface();
      return builder;
   }
   
}