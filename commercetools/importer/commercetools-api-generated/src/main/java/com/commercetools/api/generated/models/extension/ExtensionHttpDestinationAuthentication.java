package com.commercetools.api.generated.models.extension;

import com.commercetools.api.generated.models.extension.ExtensionAuthorizationHeaderAuthentication;
import com.commercetools.api.generated.models.extension.ExtensionAzureFunctionsAuthentication;


import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.extension.ExtensionAuthorizationHeaderAuthenticationImpl.class, name = "AuthorizationHeader"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.extension.ExtensionAzureFunctionsAuthenticationImpl.class, name = "AzureFunctions")
})
@JsonTypeInfo(
   use = JsonTypeInfo.Id.NAME,
   include = JsonTypeInfo.As.PROPERTY,
   property = "type",
   defaultImpl = ExtensionHttpDestinationAuthenticationImpl.class
)
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public interface ExtensionHttpDestinationAuthentication  {


   


}