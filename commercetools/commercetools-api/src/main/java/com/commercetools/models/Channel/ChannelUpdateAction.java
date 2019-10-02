package com.commercetools.models.channel;

import com.commercetools.models.channel.ChannelAddRolesAction;
import com.commercetools.models.channel.ChannelChangeDescriptionAction;
import com.commercetools.models.channel.ChannelChangeKeyAction;
import com.commercetools.models.channel.ChannelChangeNameAction;
import com.commercetools.models.channel.ChannelRemoveRolesAction;
import com.commercetools.models.channel.ChannelSetAddressAction;
import com.commercetools.models.channel.ChannelSetCustomFieldAction;
import com.commercetools.models.channel.ChannelSetCustomTypeAction;
import com.commercetools.models.channel.ChannelSetGeoLocationAction;
import com.commercetools.models.channel.ChannelSetRolesAction;


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
   @JsonSubTypes.Type(value = com.commercetools.models.channel.ChannelAddRolesActionImpl.class, name = "addRoles"),
   @JsonSubTypes.Type(value = com.commercetools.models.channel.ChannelChangeDescriptionActionImpl.class, name = "changeDescription"),
   @JsonSubTypes.Type(value = com.commercetools.models.channel.ChannelChangeKeyActionImpl.class, name = "changeKey"),
   @JsonSubTypes.Type(value = com.commercetools.models.channel.ChannelChangeNameActionImpl.class, name = "changeName"),
   @JsonSubTypes.Type(value = com.commercetools.models.channel.ChannelRemoveRolesActionImpl.class, name = "removeRoles"),
   @JsonSubTypes.Type(value = com.commercetools.models.channel.ChannelSetAddressActionImpl.class, name = "setAddress"),
   @JsonSubTypes.Type(value = com.commercetools.models.channel.ChannelSetCustomFieldActionImpl.class, name = "setCustomField"),
   @JsonSubTypes.Type(value = com.commercetools.models.channel.ChannelSetCustomTypeActionImpl.class, name = "setCustomType"),
   @JsonSubTypes.Type(value = com.commercetools.models.channel.ChannelSetGeoLocationActionImpl.class, name = "setGeoLocation"),
   @JsonSubTypes.Type(value = com.commercetools.models.channel.ChannelSetRolesActionImpl.class, name = "setRoles")
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