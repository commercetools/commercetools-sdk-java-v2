package com.commercetools.models.State;

import com.commercetools.models.State.StateAddRolesAction;
import com.commercetools.models.State.StateChangeInitialAction;
import com.commercetools.models.State.StateChangeKeyAction;
import com.commercetools.models.State.StateChangeTypeAction;
import com.commercetools.models.State.StateRemoveRolesAction;
import com.commercetools.models.State.StateSetDescriptionAction;
import com.commercetools.models.State.StateSetNameAction;
import com.commercetools.models.State.StateSetRolesAction;
import com.commercetools.models.State.StateSetTransitionsAction;
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
   @JsonSubTypes.Type(value = com.commercetools.models.State.StateAddRolesActionImpl.class, name = "addRoles"),
   @JsonSubTypes.Type(value = com.commercetools.models.State.StateChangeInitialActionImpl.class, name = "changeInitial"),
   @JsonSubTypes.Type(value = com.commercetools.models.State.StateChangeKeyActionImpl.class, name = "changeKey"),
   @JsonSubTypes.Type(value = com.commercetools.models.State.StateChangeTypeActionImpl.class, name = "changeType"),
   @JsonSubTypes.Type(value = com.commercetools.models.State.StateRemoveRolesActionImpl.class, name = "removeRoles"),
   @JsonSubTypes.Type(value = com.commercetools.models.State.StateSetDescriptionActionImpl.class, name = "setDescription"),
   @JsonSubTypes.Type(value = com.commercetools.models.State.StateSetNameActionImpl.class, name = "setName"),
   @JsonSubTypes.Type(value = com.commercetools.models.State.StateSetRolesActionImpl.class, name = "setRoles"),
   @JsonSubTypes.Type(value = com.commercetools.models.State.StateSetTransitionsActionImpl.class, name = "setTransitions")
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
public interface StateUpdateAction  {


   


}