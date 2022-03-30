
package com.commercetools.api.models.zone;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.api.models.zone.ZoneAddLocationActionImpl.class, name = ZoneAddLocationAction.ADD_LOCATION),
        @JsonSubTypes.Type(value = com.commercetools.api.models.zone.ZoneChangeNameActionImpl.class, name = ZoneChangeNameAction.CHANGE_NAME),
        @JsonSubTypes.Type(value = com.commercetools.api.models.zone.ZoneRemoveLocationActionImpl.class, name = ZoneRemoveLocationAction.REMOVE_LOCATION),
        @JsonSubTypes.Type(value = com.commercetools.api.models.zone.ZoneSetDescriptionActionImpl.class, name = ZoneSetDescriptionAction.SET_DESCRIPTION),
        @JsonSubTypes.Type(value = com.commercetools.api.models.zone.ZoneSetKeyActionImpl.class, name = ZoneSetKeyAction.SET_KEY) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "action", defaultImpl = ZoneUpdateActionImpl.class, visible = true)
@JsonDeserialize(as = ZoneUpdateActionImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface ZoneUpdateAction extends com.commercetools.api.models.ResourceUpdateAction<ZoneUpdateAction> {

    @NotNull
    @JsonProperty("action")
    public String getAction();

    default <T> T withZoneUpdateAction(Function<ZoneUpdateAction, T> helper) {
        return helper.apply(this);
    }
}
