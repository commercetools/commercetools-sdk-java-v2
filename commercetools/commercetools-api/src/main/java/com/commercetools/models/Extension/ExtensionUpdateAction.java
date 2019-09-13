package com.commercetools.models.extension;

import com.commercetools.models.extension.ExtensionChangeDestinationAction;
import com.commercetools.models.extension.ExtensionChangeTriggersAction;
import com.commercetools.models.extension.ExtensionSetKeyAction;
import com.commercetools.models.extension.ExtensionSetTimeoutInMsAction;
import java.lang.String;


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
   @JsonSubTypes.Type(value = com.commercetools.models.extension.ExtensionChangeDestinationActionImpl.class, name = "changeDestination"),
   @JsonSubTypes.Type(value = com.commercetools.models.extension.ExtensionChangeTriggersActionImpl.class, name = "changeTriggers"),
   @JsonSubTypes.Type(value = com.commercetools.models.extension.ExtensionSetKeyActionImpl.class, name = "setKey"),
   @JsonSubTypes.Type(value = com.commercetools.models.extension.ExtensionSetTimeoutInMsActionImpl.class, name = "setTimeoutInMs")
})
@JsonTypeInfo(
   use = JsonTypeInfo.Id.NAME,
   include = JsonTypeInfo.As.PROPERTY,
   property = "action"
)
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public interface ExtensionUpdateAction  {


   


}