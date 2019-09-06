package com.commercetools.models.Extension;

import com.commercetools.models.Extension.ExtensionChangeDestinationAction;
import com.commercetools.models.Extension.ExtensionChangeTriggersAction;
import com.commercetools.models.Extension.ExtensionSetKeyAction;
import com.commercetools.models.Extension.ExtensionSetTimeoutInMsAction;
import java.lang.String;


import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import json.CommercetoolsJsonUtils;
import java.io.IOException;

@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.models.Extension.ExtensionChangeDestinationActionImpl.class, name = "changeDestination"),
   @JsonSubTypes.Type(value = com.commercetools.models.Extension.ExtensionChangeTriggersActionImpl.class, name = "changeTriggers"),
   @JsonSubTypes.Type(value = com.commercetools.models.Extension.ExtensionSetKeyActionImpl.class, name = "setKey"),
   @JsonSubTypes.Type(value = com.commercetools.models.Extension.ExtensionSetTimeoutInMsActionImpl.class, name = "setTimeoutInMs")
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