
package com.commercetools.api.models.extension;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.extension.ExtensionAuthorizationHeaderAuthentication;
import com.commercetools.api.models.extension.ExtensionAzureFunctionsAuthentication;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.api.models.extension.ExtensionAuthorizationHeaderAuthenticationImpl.class, name = "AuthorizationHeader"),
        @JsonSubTypes.Type(value = com.commercetools.api.models.extension.ExtensionAzureFunctionsAuthenticationImpl.class, name = "AzureFunctions") })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", defaultImpl = ExtensionHttpDestinationAuthenticationImpl.class, visible = true)
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface ExtensionHttpDestinationAuthentication {

    @NotNull
    @JsonProperty("type")
    public String getType();

    default <T> T withExtensionHttpDestinationAuthentication(
            Function<ExtensionHttpDestinationAuthentication, T> helper) {
        return helper.apply(this);
    }
}
