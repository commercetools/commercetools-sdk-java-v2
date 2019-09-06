package com.commercetools.models.Zone;

import com.commercetools.models.Zone.ZoneAddLocationAction;
import com.commercetools.models.Zone.ZoneChangeNameAction;
import com.commercetools.models.Zone.ZoneRemoveLocationAction;
import com.commercetools.models.Zone.ZoneSetDescriptionAction;
import com.commercetools.models.Zone.ZoneSetKeyAction;
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
   @JsonSubTypes.Type(value = com.commercetools.models.Zone.ZoneAddLocationActionImpl.class, name = "addLocation"),
   @JsonSubTypes.Type(value = com.commercetools.models.Zone.ZoneChangeNameActionImpl.class, name = "changeName"),
   @JsonSubTypes.Type(value = com.commercetools.models.Zone.ZoneRemoveLocationActionImpl.class, name = "removeLocation"),
   @JsonSubTypes.Type(value = com.commercetools.models.Zone.ZoneSetDescriptionActionImpl.class, name = "setDescription"),
   @JsonSubTypes.Type(value = com.commercetools.models.Zone.ZoneSetKeyActionImpl.class, name = "setKey")
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