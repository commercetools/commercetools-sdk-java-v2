package com.commercetools.api.generated.models.state;

import com.commercetools.api.generated.models.state.StateAddRolesAction;
import com.commercetools.api.generated.models.state.StateChangeInitialAction;
import com.commercetools.api.generated.models.state.StateChangeKeyAction;
import com.commercetools.api.generated.models.state.StateChangeTypeAction;
import com.commercetools.api.generated.models.state.StateRemoveRolesAction;
import com.commercetools.api.generated.models.state.StateSetDescriptionAction;
import com.commercetools.api.generated.models.state.StateSetNameAction;
import com.commercetools.api.generated.models.state.StateSetRolesAction;
import com.commercetools.api.generated.models.state.StateSetTransitionsAction;


import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.state.StateAddRolesActionImpl.class, name = "addRoles"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.state.StateChangeInitialActionImpl.class, name = "changeInitial"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.state.StateChangeKeyActionImpl.class, name = "changeKey"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.state.StateChangeTypeActionImpl.class, name = "changeType"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.state.StateRemoveRolesActionImpl.class, name = "removeRoles"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.state.StateSetDescriptionActionImpl.class, name = "setDescription"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.state.StateSetNameActionImpl.class, name = "setName"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.state.StateSetRolesActionImpl.class, name = "setRoles"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.state.StateSetTransitionsActionImpl.class, name = "setTransitions")
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