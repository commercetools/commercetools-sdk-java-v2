package com.commercetools.models.error;

import com.commercetools.models.common.LocalizedString;
import com.commercetools.models.error.ErrorByExtension;
import com.commercetools.models.error.ErrorObject;
import java.lang.Object;
import java.lang.String;
import com.commercetools.models.error.ExtensionUpdateActionsFailedError;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ExtensionUpdateActionsFailedErrorBuilder {
   
   
   private java.lang.String message;
   
   @Nullable
   private com.commercetools.models.common.LocalizedString localizedMessage;
   
   @Nullable
   private java.lang.Object extensionExtraInfo;
   
   
   private com.commercetools.models.error.ErrorByExtension errorByExtension;
   
   public ExtensionUpdateActionsFailedErrorBuilder message( final java.lang.String message) {
      this.message = message;
      return this;
   }
   
   public ExtensionUpdateActionsFailedErrorBuilder localizedMessage(@Nullable final com.commercetools.models.common.LocalizedString localizedMessage) {
      this.localizedMessage = localizedMessage;
      return this;
   }
   
   public ExtensionUpdateActionsFailedErrorBuilder extensionExtraInfo(@Nullable final java.lang.Object extensionExtraInfo) {
      this.extensionExtraInfo = extensionExtraInfo;
      return this;
   }
   
   public ExtensionUpdateActionsFailedErrorBuilder errorByExtension( final com.commercetools.models.error.ErrorByExtension errorByExtension) {
      this.errorByExtension = errorByExtension;
      return this;
   }
   
   
   public java.lang.String getMessage(){
      return this.message;
   }
   
   @Nullable
   public com.commercetools.models.common.LocalizedString getLocalizedMessage(){
      return this.localizedMessage;
   }
   
   @Nullable
   public java.lang.Object getExtensionExtraInfo(){
      return this.extensionExtraInfo;
   }
   
   
   public com.commercetools.models.error.ErrorByExtension getErrorByExtension(){
      return this.errorByExtension;
   }

   public ExtensionUpdateActionsFailedError build() {
       return new ExtensionUpdateActionsFailedErrorImpl(message, localizedMessage, extensionExtraInfo, errorByExtension);
   }
   
   public static ExtensionUpdateActionsFailedErrorBuilder of() {
      return new ExtensionUpdateActionsFailedErrorBuilder();
   }
   
   public static ExtensionUpdateActionsFailedErrorBuilder of(final ExtensionUpdateActionsFailedError template) {
      ExtensionUpdateActionsFailedErrorBuilder builder = new ExtensionUpdateActionsFailedErrorBuilder();
      builder.message = template.getMessage();
      builder.localizedMessage = template.getLocalizedMessage();
      builder.extensionExtraInfo = template.getExtensionExtraInfo();
      builder.errorByExtension = template.getErrorByExtension();
      return builder;
   }
   
}