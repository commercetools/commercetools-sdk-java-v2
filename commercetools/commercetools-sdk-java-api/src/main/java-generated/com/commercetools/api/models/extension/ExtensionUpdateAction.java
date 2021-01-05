package com.commercetools.api.models.extension;

import com.commercetools.api.models.extension.ExtensionChangeDestinationAction;
import com.commercetools.api.models.extension.ExtensionChangeTriggersAction;
import com.commercetools.api.models.extension.ExtensionSetKeyAction;
import com.commercetools.api.models.extension.ExtensionSetTimeoutInMsAction;


import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.api.models.extension.ExtensionChangeDestinationActionImpl.class, name = "changeDestination"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.extension.ExtensionChangeTriggersActionImpl.class, name = "changeTriggers"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.extension.ExtensionSetKeyActionImpl.class, name = "setKey"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.extension.ExtensionSetTimeoutInMsActionImpl.class, name = "setTimeoutInMs")
})
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "action",
    defaultImpl = ExtensionUpdateActionImpl.class,
    visible = true
)
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public interface ExtensionUpdateAction extends com.commercetools.api.models.ResourceUpdateAction<ExtensionUpdateAction> {

    
    @NotNull
    @JsonProperty("action")
    public String getAction();





    default <T> T withExtensionUpdateAction(Function<ExtensionUpdateAction, T> helper) {
        return helper.apply(this);
    }
}
