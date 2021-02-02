
package com.commercetools.api.models.extension;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.api.models.extension.ExtensionChangeDestinationActionImpl.class, name = ExtensionChangeDestinationAction.CHANGE_DESTINATION),
        @JsonSubTypes.Type(value = com.commercetools.api.models.extension.ExtensionChangeTriggersActionImpl.class, name = ExtensionChangeTriggersAction.CHANGE_TRIGGERS),
        @JsonSubTypes.Type(value = com.commercetools.api.models.extension.ExtensionSetKeyActionImpl.class, name = ExtensionSetKeyAction.SET_KEY),
        @JsonSubTypes.Type(value = com.commercetools.api.models.extension.ExtensionSetTimeoutInMsActionImpl.class, name = ExtensionSetTimeoutInMsAction.SET_TIMEOUT_IN_MS) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "action", defaultImpl = ExtensionUpdateActionImpl.class, visible = true)
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface ExtensionUpdateAction
        extends com.commercetools.api.models.ResourceUpdateAction<ExtensionUpdateAction> {

    @NotNull
    @JsonProperty("action")
    public String getAction();

    default <T> T withExtensionUpdateAction(Function<ExtensionUpdateAction, T> helper) {
        return helper.apply(this);
    }
}
