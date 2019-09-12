package com.commercetools.models.Channel;

import com.commercetools.models.Channel.ChannelAddRolesAction;
import com.commercetools.models.Channel.ChannelChangeDescriptionAction;
import com.commercetools.models.Channel.ChannelChangeKeyAction;
import com.commercetools.models.Channel.ChannelChangeNameAction;
import com.commercetools.models.Channel.ChannelRemoveRolesAction;
import com.commercetools.models.Channel.ChannelSetAddressAction;
import com.commercetools.models.Channel.ChannelSetCustomFieldAction;
import com.commercetools.models.Channel.ChannelSetCustomTypeAction;
import com.commercetools.models.Channel.ChannelSetGeoLocationAction;
import com.commercetools.models.Channel.ChannelSetRolesAction;
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
   @JsonSubTypes.Type(value = com.commercetools.models.Channel.ChannelAddRolesActionImpl.class, name = "addRoles"),
   @JsonSubTypes.Type(value = com.commercetools.models.Channel.ChannelChangeDescriptionActionImpl.class, name = "changeDescription"),
   @JsonSubTypes.Type(value = com.commercetools.models.Channel.ChannelChangeKeyActionImpl.class, name = "changeKey"),
   @JsonSubTypes.Type(value = com.commercetools.models.Channel.ChannelChangeNameActionImpl.class, name = "changeName"),
   @JsonSubTypes.Type(value = com.commercetools.models.Channel.ChannelRemoveRolesActionImpl.class, name = "removeRoles"),
   @JsonSubTypes.Type(value = com.commercetools.models.Channel.ChannelSetAddressActionImpl.class, name = "setAddress"),
   @JsonSubTypes.Type(value = com.commercetools.models.Channel.ChannelSetCustomFieldActionImpl.class, name = "setCustomField"),
   @JsonSubTypes.Type(value = com.commercetools.models.Channel.ChannelSetCustomTypeActionImpl.class, name = "setCustomType"),
   @JsonSubTypes.Type(value = com.commercetools.models.Channel.ChannelSetGeoLocationActionImpl.class, name = "setGeoLocation"),
   @JsonSubTypes.Type(value = com.commercetools.models.Channel.ChannelSetRolesActionImpl.class, name = "setRoles")
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
public interface ChannelUpdateAction  {


   


}