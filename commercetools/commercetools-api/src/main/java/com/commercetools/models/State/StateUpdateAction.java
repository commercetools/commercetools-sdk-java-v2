package com.commercetools.models.state;

import com.commercetools.models.state.StateAddRolesAction;
import com.commercetools.models.state.StateChangeInitialAction;
import com.commercetools.models.state.StateChangeKeyAction;
import com.commercetools.models.state.StateChangeTypeAction;
import com.commercetools.models.state.StateRemoveRolesAction;
import com.commercetools.models.state.StateSetDescriptionAction;
import com.commercetools.models.state.StateSetNameAction;
import com.commercetools.models.state.StateSetRolesAction;
import com.commercetools.models.state.StateSetTransitionsAction;
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
   @JsonSubTypes.Type(value = com.commercetools.models.state.StateAddRolesActionImpl.class, name = "addRoles"),
   @JsonSubTypes.Type(value = com.commercetools.models.state.StateChangeInitialActionImpl.class, name = "changeInitial"),
   @JsonSubTypes.Type(value = com.commercetools.models.state.StateChangeKeyActionImpl.class, name = "changeKey"),
   @JsonSubTypes.Type(value = com.commercetools.models.state.StateChangeTypeActionImpl.class, name = "changeType"),
   @JsonSubTypes.Type(value = com.commercetools.models.state.StateRemoveRolesActionImpl.class, name = "removeRoles"),
   @JsonSubTypes.Type(value = com.commercetools.models.state.StateSetDescriptionActionImpl.class, name = "setDescription"),
   @JsonSubTypes.Type(value = com.commercetools.models.state.StateSetNameActionImpl.class, name = "setName"),
   @JsonSubTypes.Type(value = com.commercetools.models.state.StateSetRolesActionImpl.class, name = "setRoles"),
   @JsonSubTypes.Type(value = com.commercetools.models.state.StateSetTransitionsActionImpl.class, name = "setTransitions")
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