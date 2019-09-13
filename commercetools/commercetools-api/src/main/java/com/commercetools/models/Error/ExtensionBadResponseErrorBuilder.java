package com.commercetools.models.error;

import com.commercetools.models.common.LocalizedString;
import com.commercetools.models.error.ErrorByExtension;
import com.commercetools.models.error.ErrorObject;
import java.lang.Object;
import java.lang.String;
import com.commercetools.models.error.ExtensionBadResponseError;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ExtensionBadResponseErrorBuilder {
   
   
   private java.lang.String message;
   
   @Nullable
   private com.commercetools.models.common.LocalizedString localizedMessage;
   
   @Nullable
   private java.lang.Object extensionExtraInfo;
   
   
   private com.commercetools.models.error.ErrorByExtension errorByExtension;
   
   public ExtensionBadResponseErrorBuilder message( final java.lang.String message) {
      this.message = message;
      return this;
   }
   
   public ExtensionBadResponseErrorBuilder localizedMessage(@Nullable final com.commercetools.models.common.LocalizedString localizedMessage) {
      this.localizedMessage = localizedMessage;
      return this;
   }
   
   public ExtensionBadResponseErrorBuilder extensionExtraInfo(@Nullable final java.lang.Object extensionExtraInfo) {
      this.extensionExtraInfo = extensionExtraInfo;
      return this;
   }
   
   public ExtensionBadResponseErrorBuilder errorByExtension( final com.commercetools.models.error.ErrorByExtension errorByExtension) {
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

   public ExtensionBadResponseError build() {
       return new ExtensionBadResponseErrorImpl(message, localizedMessage, extensionExtraInfo, errorByExtension);
   }
   
   public static ExtensionBadResponseErrorBuilder of() {
      return new ExtensionBadResponseErrorBuilder();
   }
   
   public static ExtensionBadResponseErrorBuilder of(final ExtensionBadResponseError template) {
      ExtensionBadResponseErrorBuilder builder = new ExtensionBadResponseErrorBuilder();
      builder.message = template.getMessage();
      builder.localizedMessage = template.getLocalizedMessage();
      builder.extensionExtraInfo = template.getExtensionExtraInfo();
      builder.errorByExtension = template.getErrorByExtension();
      return builder;
   }
   
}