package com.commercetools.api.generated.models.channel;

import com.commercetools.api.generated.models.channel.ChannelAddRolesAction;
import com.commercetools.api.generated.models.channel.ChannelChangeDescriptionAction;
import com.commercetools.api.generated.models.channel.ChannelChangeKeyAction;
import com.commercetools.api.generated.models.channel.ChannelChangeNameAction;
import com.commercetools.api.generated.models.channel.ChannelRemoveRolesAction;
import com.commercetools.api.generated.models.channel.ChannelSetAddressAction;
import com.commercetools.api.generated.models.channel.ChannelSetCustomFieldAction;
import com.commercetools.api.generated.models.channel.ChannelSetCustomTypeAction;
import com.commercetools.api.generated.models.channel.ChannelSetGeoLocationAction;
import com.commercetools.api.generated.models.channel.ChannelSetRolesAction;


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
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.channel.ChannelAddRolesActionImpl.class, name = "addRoles"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.channel.ChannelChangeDescriptionActionImpl.class, name = "changeDescription"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.channel.ChannelChangeKeyActionImpl.class, name = "changeKey"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.channel.ChannelChangeNameActionImpl.class, name = "changeName"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.channel.ChannelRemoveRolesActionImpl.class, name = "removeRoles"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.channel.ChannelSetAddressActionImpl.class, name = "setAddress"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.channel.ChannelSetCustomFieldActionImpl.class, name = "setCustomField"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.channel.ChannelSetCustomTypeActionImpl.class, name = "setCustomType"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.channel.ChannelSetGeoLocationActionImpl.class, name = "setGeoLocation"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.channel.ChannelSetRolesActionImpl.class, name = "setRoles")
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