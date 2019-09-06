package com.commercetools.models.Error;

import com.commercetools.models.Common.LocalizedString;
import com.commercetools.models.Error.ErrorByExtension;
import com.commercetools.models.Error.ErrorObject;
import java.lang.Object;
import java.lang.String;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import json.CommercetoolsJsonUtils;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ExtensionNoResponseErrorImpl implements ExtensionNoResponseError {

   private java.lang.String code;
   
   private java.lang.String message;
   
   private com.commercetools.models.Common.LocalizedString localizedMessage;
   
   private java.lang.Object extensionExtraInfo;
   
   private com.commercetools.models.Error.ErrorByExtension errorByExtension;

   @JsonCreator
   ExtensionNoResponseErrorImpl(@JsonProperty("message") final java.lang.String message, @JsonProperty("localizedMessage") final com.commercetools.models.Common.LocalizedString localizedMessage, @JsonProperty("extensionExtraInfo") final java.lang.Object extensionExtraInfo, @JsonProperty("errorByExtension") final com.commercetools.models.Error.ErrorByExtension errorByExtension) {
      this.message = message;
      this.localizedMessage = localizedMessage;
      this.extensionExtraInfo = extensionExtraInfo;
      this.errorByExtension = errorByExtension;
      this.code = "ExtensionNoResponse";
   }
   public ExtensionNoResponseErrorImpl() {
      
   }
   
   
   public java.lang.String getCode(){
      return this.code;
   }
   
   
   public java.lang.String getMessage(){
      return this.message;
   }
   
   
   public com.commercetools.models.Common.LocalizedString getLocalizedMessage(){
      return this.localizedMessage;
   }
   
   
   public java.lang.Object getExtensionExtraInfo(){
      return this.extensionExtraInfo;
   }
   
   
   public com.commercetools.models.Error.ErrorByExtension getErrorByExtension(){
      return this.errorByExtension;
   }

   public void setMessage(final java.lang.String message){
      this.message = message;
   }
   
   public void setLocalizedMessage(final com.commercetools.models.Common.LocalizedString localizedMessage){
      this.localizedMessage = localizedMessage;
   }
   
   public void setExtensionExtraInfo(final java.lang.Object extensionExtraInfo){
      this.extensionExtraInfo = extensionExtraInfo;
   }
   
   public void setErrorByExtension(final com.commercetools.models.Error.ErrorByExtension errorByExtension){
      this.errorByExtension = errorByExtension;
   }

}