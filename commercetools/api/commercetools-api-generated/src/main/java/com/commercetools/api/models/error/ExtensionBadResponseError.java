package com.commercetools.api.models.error;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.error.ErrorByExtension;
import com.commercetools.api.models.error.ErrorObject;
import com.fasterxml.jackson.databind.JsonNode;
import com.commercetools.api.models.error.ExtensionBadResponseErrorImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ExtensionBadResponseErrorImpl.class)
public interface ExtensionBadResponseError extends ErrorObject {

    
    @Valid
    @JsonProperty("localizedMessage")
    public LocalizedString getLocalizedMessage();
    
    @Valid
    @JsonProperty("extensionExtraInfo")
    public JsonNode getExtensionExtraInfo();
    
    @NotNull
    @Valid
    @JsonProperty("errorByExtension")
    public ErrorByExtension getErrorByExtension();

    public void setLocalizedMessage(final LocalizedString localizedMessage);
    
    public void setExtensionExtraInfo(final JsonNode extensionExtraInfo);
    
    public void setErrorByExtension(final ErrorByExtension errorByExtension);

    public static ExtensionBadResponseErrorImpl of(){
        return new ExtensionBadResponseErrorImpl();
    }
    

    public static ExtensionBadResponseErrorImpl of(final ExtensionBadResponseError template) {
        ExtensionBadResponseErrorImpl instance = new ExtensionBadResponseErrorImpl();
        instance.setMessage(template.getMessage());
        instance.setLocalizedMessage(template.getLocalizedMessage());
        instance.setExtensionExtraInfo(template.getExtensionExtraInfo());
        instance.setErrorByExtension(template.getErrorByExtension());
        return instance;
    }

}
