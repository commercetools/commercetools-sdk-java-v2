package com.commercetools.api.models.error;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.error.ErrorByExtension;
import com.commercetools.api.models.error.ErrorObject;
import com.fasterxml.jackson.databind.JsonNode;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ExtensionBadResponseErrorImpl implements ExtensionBadResponseError {

    private String code;
    
    private String message;
    
    private com.commercetools.api.models.common.LocalizedString localizedMessage;
    
    private com.fasterxml.jackson.databind.JsonNode extensionExtraInfo;
    
    private com.commercetools.api.models.error.ErrorByExtension errorByExtension;

    @JsonCreator
    ExtensionBadResponseErrorImpl(@JsonProperty("message") final String message, @JsonProperty("localizedMessage") final com.commercetools.api.models.common.LocalizedString localizedMessage, @JsonProperty("extensionExtraInfo") final com.fasterxml.jackson.databind.JsonNode extensionExtraInfo, @JsonProperty("errorByExtension") final com.commercetools.api.models.error.ErrorByExtension errorByExtension) {
        this.message = message;
        this.localizedMessage = localizedMessage;
        this.extensionExtraInfo = extensionExtraInfo;
        this.errorByExtension = errorByExtension;
        this.code = "ExtensionBadResponse";
    }
    public ExtensionBadResponseErrorImpl() {
       
    }

    
    public String getCode(){
        return this.code;
    }
    
    
    public String getMessage(){
        return this.message;
    }
    
    
    public com.commercetools.api.models.common.LocalizedString getLocalizedMessage(){
        return this.localizedMessage;
    }
    
    
    public com.fasterxml.jackson.databind.JsonNode getExtensionExtraInfo(){
        return this.extensionExtraInfo;
    }
    
    
    public com.commercetools.api.models.error.ErrorByExtension getErrorByExtension(){
        return this.errorByExtension;
    }

    public void setMessage(final String message){
        this.message = message;
    }
    
    public void setLocalizedMessage(final com.commercetools.api.models.common.LocalizedString localizedMessage){
        this.localizedMessage = localizedMessage;
    }
    
    public void setExtensionExtraInfo(final com.fasterxml.jackson.databind.JsonNode extensionExtraInfo){
        this.extensionExtraInfo = extensionExtraInfo;
    }
    
    public void setErrorByExtension(final com.commercetools.api.models.error.ErrorByExtension errorByExtension){
        this.errorByExtension = errorByExtension;
    }

}
