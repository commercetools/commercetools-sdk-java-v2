package com.commercetools.api.models.extension;

import com.commercetools.api.models.extension.ExtensionHttpDestinationAuthentication;
import com.commercetools.api.models.extension.ExtensionAzureFunctionsAuthenticationImpl;

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
@JsonDeserialize(as = ExtensionAzureFunctionsAuthenticationImpl.class)
public interface ExtensionAzureFunctionsAuthentication extends ExtensionHttpDestinationAuthentication {

    
    @NotNull
    @JsonProperty("key")
    public String getKey();

    public void setKey(final String key);

    public static ExtensionAzureFunctionsAuthenticationImpl of(){
        return new ExtensionAzureFunctionsAuthenticationImpl();
    }
    

    public static ExtensionAzureFunctionsAuthenticationImpl of(final ExtensionAzureFunctionsAuthentication template) {
        ExtensionAzureFunctionsAuthenticationImpl instance = new ExtensionAzureFunctionsAuthenticationImpl();
        instance.setKey(template.getKey());
        return instance;
    }

}
