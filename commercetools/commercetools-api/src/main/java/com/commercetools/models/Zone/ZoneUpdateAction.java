package com.commercetools.models.zone;

import com.commercetools.models.zone.ZoneAddLocationAction;
import com.commercetools.models.zone.ZoneChangeNameAction;
import com.commercetools.models.zone.ZoneRemoveLocationAction;
import com.commercetools.models.zone.ZoneSetDescriptionAction;
import com.commercetools.models.zone.ZoneSetKeyAction;


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
   @JsonSubTypes.Type(value = com.commercetools.models.zone.ZoneAddLocationActionImpl.class, name = "addLocation"),
   @JsonSubTypes.Type(value = com.commercetools.models.zone.ZoneChangeNameActionImpl.class, name = "changeName"),
   @JsonSubTypes.Type(value = com.commercetools.models.zone.ZoneRemoveLocationActionImpl.class, name = "removeLocation"),
   @JsonSubTypes.Type(value = com.commercetools.models.zone.ZoneSetDescriptionActionImpl.class, name = "setDescription"),
   @JsonSubTypes.Type(value = com.commercetools.models.zone.ZoneSetKeyActionImpl.class, name = "setKey")
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
public interface ZoneUpdateAction  {


   


}