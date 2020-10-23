package com.commercetools.api.models.extension;

import com.commercetools.api.models.extension.ExtensionAWSLambdaDestination;
import com.commercetools.api.models.extension.ExtensionHttpDestination;


import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.api.models.extension.ExtensionHttpDestinationImpl.class, name = "HTTP"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.extension.ExtensionAWSLambdaDestinationImpl.class, name = "AWSLambda")
})
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "type",
    defaultImpl = ExtensionDestinationImpl.class
)
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public interface ExtensionDestination  {





    default <T> T withExtensionDestination(Function<ExtensionDestination, T> helper) {
        return helper.apply(this);
    }
}
