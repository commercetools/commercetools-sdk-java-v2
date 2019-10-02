package com.commercetools.models.extension;

import com.commercetools.models.extension.ExtensionUpdateAction;
import com.commercetools.models.extension.ExtensionSetTimeoutInMsAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ExtensionSetTimeoutInMsActionBuilder {
   
   @Nullable
   private Integer timeoutInMs;
   
   public ExtensionSetTimeoutInMsActionBuilder timeoutInMs(@Nullable final Integer timeoutInMs) {
      this.timeoutInMs = timeoutInMs;
      return this;
   }
   
   @Nullable
   public Integer getTimeoutInMs(){
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