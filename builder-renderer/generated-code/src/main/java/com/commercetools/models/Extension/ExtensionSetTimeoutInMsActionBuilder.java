package com.commercetools.models.Extension;

import com.commercetools.models.Extension.ExtensionUpdateAction;
import java.lang.Integer;
import java.lang.String;
import com.commercetools.models.Extension.ExtensionSetTimeoutInMsAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ExtensionSetTimeoutInMsActionBuilder {
   
   @Nullable
   private java.lang.Integer timeoutInMs;
   
   public ExtensionSetTimeoutInMsActionBuilder timeoutInMs(@Nullable final java.lang.Integer timeoutInMs) {
      this.timeoutInMs = timeoutInMs;
      return this;
   }
   
   @Nullable
   public java.lang.Integer getTimeoutInMs(){
      return this.timeoutInMs;
   }

   public ExtensionSetTimeoutInMsAction build() {
       return new ExtensionSetTimeoutInMsActionImpl(timeoutInMs);
   }
   
   public static ExtensionSetTimeoutInMsActionBuilder of() {
      return new ExtensionSetTimeoutInMsActionBuilder();
   }
   
   public static ExtensionSetTimeoutInMsActionBuilder of(final ExtensionSetTimeoutInMsAction template) {
      ExtensionSetTimeoutInMsActionBuilder builder = new ExtensionSetTimeoutInMsActionBuilder();
      builder.timeoutInMs = template.getTimeoutInMs();
      return builder;
   }
   
}