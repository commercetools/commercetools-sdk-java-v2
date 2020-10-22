package com.commercetools.api.models.zone;

import com.commercetools.api.models.zone.ZoneAddLocationAction;
import com.commercetools.api.models.zone.ZoneChangeNameAction;
import com.commercetools.api.models.zone.ZoneRemoveLocationAction;
import com.commercetools.api.models.zone.ZoneSetDescriptionAction;
import com.commercetools.api.models.zone.ZoneSetKeyAction;


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
   @JsonSubTypes.Type(value = com.commercetools.api.models.zone.ZoneAddLocationActionImpl.class, name = "addLocation"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.zone.ZoneChangeNameActionImpl.class, name = "changeName"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.zone.ZoneRemoveLocationActionImpl.class, name = "removeLocation"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.zone.ZoneSetDescriptionActionImpl.class, name = "setDescription"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.zone.ZoneSetKeyActionImpl.class, name = "setKey")
})
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "action",
    defaultImpl = ZoneUpdateActionImpl.class
)
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public interface ZoneUpdateAction  {





    default <T extends Accessor<ZoneUpdateAction>> T withZoneUpdateAction(Function<ZoneUpdateAction, T> helper) {
        return helper.apply(this);
    }
}
