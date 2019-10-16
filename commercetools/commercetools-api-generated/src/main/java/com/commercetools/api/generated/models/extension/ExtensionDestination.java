package com.commercetools.api.generated.models.extension;

import com.commercetools.api.generated.models.extension.ExtensionAWSLambdaDestination;
import com.commercetools.api.generated.models.extension.ExtensionHttpDestination;


import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.extension.ExtensionHttpDestinationImpl.class, name = "HTTP"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.extension.ExtensionAWSLambdaDestinationImpl.class, name = "AWSLambda")
})
@JsonTypeInfo(
   use = JsonTypeInfo.Id.NAME,
   include = JsonTypeInfo.As.PROPERTY,
   property = "type"
)
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public interface ExtensionDestination  {


   


}