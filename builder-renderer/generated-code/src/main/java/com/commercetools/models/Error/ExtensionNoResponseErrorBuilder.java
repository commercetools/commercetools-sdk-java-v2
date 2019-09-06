package com.commercetools.models.Error;

import com.commercetools.models.Common.LocalizedString;
import com.commercetools.models.Error.ErrorByExtension;
import com.commercetools.models.Error.ErrorObject;
import java.lang.Object;
import java.lang.String;
import com.commercetools.models.Error.ExtensionNoResponseError;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ExtensionNoResponseErrorBuilder {
   
   
   private java.lang.String message;
   
   @Nullable
   private com.commercetools.models.Common.LocalizedString localizedMessage;
   
   @Nullable
   private java.lang.Object extensionExtraInfo;
   
   
   private com.commercetools.models.Error.ErrorByExtension errorByExtension;
   
   public ExtensionNoResponseErrorBuilder message( final java.lang.String message) {
      this.message = message;
      return this;
   }
   
   public ExtensionNoResponseErrorBuilder localizedMessage(@Nullable final com.commercetools.models.Common.LocalizedString localizedMessage) {
      this.localizedMessage = localizedMessage;
      return this;
   }
   
   public ExtensionNoResponseErrorBuilder extensionExtraInfo(@Nullable final java.lang.Object extensionExtraInfo) {
      this.extensionExtraInfo = extensionExtraInfo;
      return this;
   }
   
   public ExtensionNoResponseErrorBuilder errorByExtension( final com.commercetools.models.Error.ErrorByExtension errorByExtension) {
      this.errorByExtension = errorByExtension;
      return this;
   }
   
   
   public java.lang.String getMessage(){
      return this.message;
   }
   
   @Nullable
   public com.commercetools.models.Common.LocalizedString getLocalizedMessage(){
      return this.localizedMessage;
   }
   
   @Nullable
   public java.lang.Object getExtensionExtraInfo(){
      return this.extensionExtraInfo;
   }
   
   
   public com.commercetools.models.Error.ErrorByExtension getErrorByExtension(){
      return this.errorByExtension;
   }

   public ExtensionNoResponseError build() {
       return new ExtensionNoResponseErrorImpl(message, localizedMessage, extensionExtraInfo, errorByExtension);
   }
   
   public static ExtensionNoResponseErrorBuilder of() {
      return new ExtensionNoResponseErrorBuilder();
   }
   
   public static ExtensionNoResponseErrorBuilder of(final ExtensionNoResponseError template) {
      ExtensionNoResponseErrorBuilder builder = new ExtensionNoResponseErrorBuilder();
      builder.message = template.getMessage();
      builder.localizedMessage = template.getLocalizedMessage();
      builder.extensionExtraInfo = template.getExtensionExtraInfo();
      builder.errorByExtension = template.getErrorByExtension();
      return builder;
   }
   
}